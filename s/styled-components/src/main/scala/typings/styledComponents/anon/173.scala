package typings.styledComponents.anon

import typings.styledComponents.nativeDistDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173`[ActualComponent /* <: StyledTarget */] extends StObject {
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `173` {
  
  inline def apply[ActualComponent /* <: StyledTarget */](): `173`[ActualComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`173`[ActualComponent]]
  }
  
  extension [Self <: `173`[?], ActualComponent /* <: StyledTarget */](x: Self & `173`[ActualComponent]) {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
