package typings.styledComponents.anon

import typings.styledComponents.distDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `708`[ActualComponent /* <: StyledTarget */] extends StObject {
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `708` {
  
  inline def apply[ActualComponent /* <: StyledTarget */](): `708`[ActualComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`708`[ActualComponent]]
  }
  
  extension [Self <: `708`[?], ActualComponent /* <: StyledTarget */](x: Self & `708`[ActualComponent]) {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
