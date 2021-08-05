package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeProps[TLength] extends StObject {
  
  val fontSize: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ js.Any
    ]
  ] = js.undefined
}
object FontSizeProps {
  
  inline def apply[TLength](): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
  
  extension [Self <: FontSizeProps[?], TLength](x: Self & FontSizeProps[TLength]) {
    
    inline def setFontSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontSizeVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ js.Any)*
    ): Self = StObject.set(x, "fontSize", js.Array(value :_*))
  }
}
