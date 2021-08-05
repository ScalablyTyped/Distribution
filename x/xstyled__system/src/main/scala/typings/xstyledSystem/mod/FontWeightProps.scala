package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightProps extends StObject {
  
  val fontWeight: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any) | AliasKey
    ]
  ] = js.undefined
}
object FontWeightProps {
  
  inline def apply(): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps]
  }
  
  extension [Self <: FontWeightProps](x: Self) {
    
    inline def setFontWeight(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any) | AliasKey
        ]
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFontWeightVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any) | AliasKey)*
    ): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
  }
}
