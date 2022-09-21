package typings.styledComponents.anon

import typings.styledComponents.primitivesDistTypesMod.AnyComponent
import typings.styledComponents.primitivesDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsActualComponentAs[ActualComponent /* <: StyledTarget */] extends StObject {
  
  @JSName("$as")
  var $as: ActualComponent
  
  var as: js.UndefOr[AnyComponent[Any]] = js.undefined
}
object AsActualComponentAs {
  
  inline def apply[ActualComponent /* <: StyledTarget */]($as: ActualComponent): AsActualComponentAs[ActualComponent] = {
    val __obj = js.Dynamic.literal($as = $as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsActualComponentAs[ActualComponent]]
  }
  
  extension [Self <: AsActualComponentAs[?], ActualComponent /* <: StyledTarget */](x: Self & AsActualComponentAs[ActualComponent]) {
    
    inline def set$as(value: ActualComponent): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def setAs(value: AnyComponent[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
