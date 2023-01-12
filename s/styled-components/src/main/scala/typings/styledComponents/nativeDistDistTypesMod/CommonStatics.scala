package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonStatics[Props] extends StObject {
  
  var attrs: js.Array[Attrs[Props]]
  
  var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
  
  var target: StyledTarget
  
  var withComponent: Any
}
object CommonStatics {
  
  inline def apply[Props](attrs: js.Array[Attrs[Props]], target: StyledTarget, withComponent: Any): CommonStatics[Props] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = withComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonStatics[Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonStatics[?], Props] (val x: Self & CommonStatics[Props]) extends AnyVal {
    
    inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setShouldForwardProp(
      value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
    ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
    
    inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    
    inline def setTarget(value: StyledTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWithComponent(value: Any): Self = StObject.set(x, "withComponent", value.asInstanceOf[js.Any])
  }
}
