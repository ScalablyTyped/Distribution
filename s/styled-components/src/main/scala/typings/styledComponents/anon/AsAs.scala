package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.Runtime
import typings.styledComponents.nativeDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsAs[ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */] extends StObject {
  
  @JSName("$as")
  var $as: ActualComponent
  
  var as: js.UndefOr[scala.Nothing] = js.undefined
}
object AsAs {
  
  inline def apply[ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */]($as: ActualComponent): AsAs[ActualComponent, R] = {
    val __obj = js.Dynamic.literal($as = $as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsAs[ActualComponent, R]]
  }
  
  extension [Self <: AsAs[?, ?], ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */](x: Self & (AsAs[ActualComponent, R])) {
    
    inline def set$as(value: ActualComponent): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
  }
}
