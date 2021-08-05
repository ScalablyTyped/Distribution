package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidthProps[TLength] extends StObject {
  
  val borderWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderWidthProps {
  
  inline def apply[TLength](): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
  
  extension [Self <: BorderWidthProps[?], TLength](x: Self & BorderWidthProps[TLength]) {
    
    inline def setBorderWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBorderWidthVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderWidth", js.Array(value :_*))
  }
}
