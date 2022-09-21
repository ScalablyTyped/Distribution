package typings.styledComponents.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledOptions[Props] extends StObject {
  
  var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
  
  var componentId: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var parentComponentId: js.UndefOr[String] = js.undefined
  
  var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
}
object StyledOptions {
  
  inline def apply[Props](): StyledOptions[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledOptions[Props]]
  }
  
  extension [Self <: StyledOptions[?], Props](x: Self & StyledOptions[Props]) {
    
    inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParentComponentId(value: String): Self = StObject.set(x, "parentComponentId", value.asInstanceOf[js.Any])
    
    inline def setParentComponentIdUndefined: Self = StObject.set(x, "parentComponentId", js.undefined)
    
    inline def setShouldForwardProp(
      value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
    ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
    
    inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
  }
}
