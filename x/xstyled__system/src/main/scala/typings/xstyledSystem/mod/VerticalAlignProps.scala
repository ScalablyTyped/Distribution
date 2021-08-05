package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalAlignProps[TLength] extends StObject {
  
  val verticalAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ js.Any
    ]
  ] = js.undefined
}
object VerticalAlignProps {
  
  inline def apply[TLength](): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
  
  extension [Self <: VerticalAlignProps[?], TLength](x: Self & VerticalAlignProps[TLength]) {
    
    inline def setVerticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setVerticalAlignVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ js.Any)*
    ): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
  }
}
