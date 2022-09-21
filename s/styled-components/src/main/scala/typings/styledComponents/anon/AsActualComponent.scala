package typings.styledComponents.anon

import typings.styledComponents.distDistTypesMod.AnyComponent
import typings.styledComponents.distDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsActualComponent[ActualComponent /* <: StyledTarget */] extends StObject {
  
  @JSName("$as")
  var $as: ActualComponent
  
  var as: js.UndefOr[AnyComponent[Any]] = js.undefined
}
object AsActualComponent {
  
  inline def apply[ActualComponent /* <: StyledTarget */]($as: ActualComponent): AsActualComponent[ActualComponent] = {
    val __obj = js.Dynamic.literal($as = $as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsActualComponent[ActualComponent]]
  }
  
  extension [Self <: AsActualComponent[?], ActualComponent /* <: StyledTarget */](x: Self & AsActualComponent[ActualComponent]) {
    
    inline def set$as(value: ActualComponent): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def setAs(value: AnyComponent[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
