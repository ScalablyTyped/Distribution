package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundSizeProps[TLength] extends StObject {
  
  val backgroundSize: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BackgroundSizeProps {
  
  inline def apply[TLength](): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
  
  extension [Self <: BackgroundSizeProps[?], TLength](x: Self & BackgroundSizeProps[TLength]) {
    
    inline def setBackgroundSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    inline def setBackgroundSizeVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ js.Any)*
    ): Self = StObject.set(x, "backgroundSize", js.Array(value :_*))
  }
}
