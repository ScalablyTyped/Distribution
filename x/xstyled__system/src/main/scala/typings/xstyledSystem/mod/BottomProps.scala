package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomProps[TLength] extends StObject {
  
  val bottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BottomProps {
  
  inline def apply[TLength](): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomProps[TLength]]
  }
  
  extension [Self <: BottomProps[?], TLength](x: Self & BottomProps[TLength]) {
    
    inline def setBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setBottomVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ js.Any)*
    ): Self = StObject.set(x, "bottom", js.Array(value :_*))
  }
}
