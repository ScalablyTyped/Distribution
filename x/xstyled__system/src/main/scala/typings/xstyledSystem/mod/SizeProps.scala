package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeProps[TLength] extends StObject {
  
  val size: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any
    ]
  ] = js.undefined
}
object SizeProps {
  
  inline def apply[TLength](): SizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeProps[TLength]]
  }
  
  extension [Self <: SizeProps[?], TLength](x: Self & SizeProps[TLength]) {
    
    inline def setSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any)*
    ): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
