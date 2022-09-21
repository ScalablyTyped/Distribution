package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.AnyComponent
import typings.styledComponents.nativeDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsAs[ActualComponent /* <: StyledTarget */] extends StObject {
  
  @JSName("$as")
  var $as: ActualComponent
  
  var as: js.UndefOr[AnyComponent[Any]] = js.undefined
}
object AsAs {
  
  inline def apply[ActualComponent /* <: StyledTarget */]($as: ActualComponent): AsAs[ActualComponent] = {
    val __obj = js.Dynamic.literal($as = $as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsAs[ActualComponent]]
  }
  
  extension [Self <: AsAs[?], ActualComponent /* <: StyledTarget */](x: Self & AsAs[ActualComponent]) {
    
    inline def set$as(value: ActualComponent): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def setAs(value: AnyComponent[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
