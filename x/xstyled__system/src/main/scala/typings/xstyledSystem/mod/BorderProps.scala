package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderProps[TLength] extends StObject {
  
  val border: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderProps {
  
  inline def apply[TLength](): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[TLength]]
  }
  
  extension [Self <: BorderProps[?], TLength](x: Self & BorderProps[TLength]) {
    
    inline def setBorder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any)*
    ): Self = StObject.set(x, "border", js.Array(value :_*))
  }
}
