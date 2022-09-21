package typings.styledComponents.anon

import typings.styledComponents.primitivesDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `710`[ActualComponent /* <: StyledTarget */] extends StObject {
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `710` {
  
  inline def apply[ActualComponent /* <: StyledTarget */](): `710`[ActualComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`710`[ActualComponent]]
  }
  
  extension [Self <: `710`[?], ActualComponent /* <: StyledTarget */](x: Self & `710`[ActualComponent]) {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
