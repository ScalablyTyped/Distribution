package typings.styledComponents.anon

import typings.styledComponents.distTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172`[ActualComponent /* <: StyledTarget */] extends StObject {
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `172` {
  
  inline def apply[ActualComponent /* <: StyledTarget */](): `172`[ActualComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`172`[ActualComponent]]
  }
  
  extension [Self <: `172`[?], ActualComponent /* <: StyledTarget */](x: Self & `172`[ActualComponent]) {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
