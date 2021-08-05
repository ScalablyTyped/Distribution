package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignSelfProps extends StObject {
  
  val alignSelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any
    ]
  ] = js.undefined
}
object AlignSelfProps {
  
  inline def apply(): AlignSelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignSelfProps]
  }
  
  extension [Self <: AlignSelfProps](x: Self) {
    
    inline def setAlignSelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any
        ]
    ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAlignSelfVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ js.Any)*
    ): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
  }
}
