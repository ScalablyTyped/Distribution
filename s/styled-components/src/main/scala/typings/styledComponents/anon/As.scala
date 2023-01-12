package typings.styledComponents.anon

import typings.styledComponents.nativeDistDistTypesMod.AnyComponent
import typings.styledComponents.nativeDistDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[ActualComponent /* <: StyledTarget */] extends StObject {
  
  @JSName("$as")
  var $as: ActualComponent
  
  var as: js.UndefOr[AnyComponent[Any]] = js.undefined
}
object As {
  
  inline def apply[ActualComponent /* <: StyledTarget */]($as: ActualComponent): As[ActualComponent] = {
    val __obj = js.Dynamic.literal($as = $as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As[ActualComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: As[?], ActualComponent /* <: StyledTarget */] (val x: Self & As[ActualComponent]) extends AnyVal {
    
    inline def set$as(value: ActualComponent): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def setAs(value: AnyComponent[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
