package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorProps[TLength] extends StObject {
  
  val backgroundColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val bg: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BackgroundColorProps {
  
  inline def apply[TLength](): BackgroundColorProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[TLength]]
  }
  
  extension [Self <: BackgroundColorProps[?], TLength](x: Self & BackgroundColorProps[TLength]) {
    
    inline def setBackgroundColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any)*
    ): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBg(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBgVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ js.Any)*
    ): Self = StObject.set(x, "bg", js.Array(value :_*))
  }
}
