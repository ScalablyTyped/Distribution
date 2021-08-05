package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignContentProps extends StObject {
  
  val alignContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any
    ]
  ] = js.undefined
}
object AlignContentProps {
  
  inline def apply(): AlignContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps]
  }
  
  extension [Self <: AlignContentProps](x: Self) {
    
    inline def setAlignContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any
        ]
    ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    inline def setAlignContentVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any)*
    ): Self = StObject.set(x, "alignContent", js.Array(value :_*))
  }
}
