package typings.styledComponents.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[C /* <: String | ComponentType[js.Any] */] extends StObject {
  
  var as: js.UndefOr[C] = js.undefined
  
  var forwardedAs: js.UndefOr[C] = js.undefined
}
object As {
  
  @scala.inline
  def apply[C /* <: String | ComponentType[js.Any] */](): As[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[C]]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As[?], C /* <: String | ComponentType[js.Any] */] (val x: Self & As[C]) extends AnyVal {
    
    @scala.inline
    def setAs(value: C): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setForwardedAs(value: C): Self = StObject.set(x, "forwardedAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedAsUndefined: Self = StObject.set(x, "forwardedAs", js.undefined)
  }
}
