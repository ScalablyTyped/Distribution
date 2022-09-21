package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `350`[ActualComponent /* <: StyledTarget */] extends StObject {
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `350` {
  
  inline def apply[ActualComponent /* <: StyledTarget */](): `350`[ActualComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`350`[ActualComponent]]
  }
  
  extension [Self <: `350`[?], ActualComponent /* <: StyledTarget */](x: Self & `350`[ActualComponent]) {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
