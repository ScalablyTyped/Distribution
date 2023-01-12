package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.Runtime
import typings.styledComponents.nativeDistTypesMod.StyledTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `176`[ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */] extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[scala.Nothing] = js.undefined
  
  var as: js.UndefOr[ActualComponent] = js.undefined
}
object `176` {
  
  inline def apply[ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */](): `176`[ActualComponent, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`176`[ActualComponent, R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `176`[?, ?], ActualComponent /* <: StyledTarget[R] */, R /* <: Runtime */] (val x: Self & (`176`[ActualComponent, R])) extends AnyVal {
    
    inline def setAs(value: ActualComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
