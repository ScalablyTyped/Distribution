package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledNativeOptions[Props] extends StObject {
  
  var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
}
object StyledNativeOptions {
  
  inline def apply[Props](): StyledNativeOptions[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledNativeOptions[Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyledNativeOptions[?], Props] (val x: Self & StyledNativeOptions[Props]) extends AnyVal {
    
    inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setShouldForwardProp(
      value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
    ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
    
    inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
  }
}
