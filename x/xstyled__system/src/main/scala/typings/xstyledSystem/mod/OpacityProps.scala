package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProps extends StObject {
  
  val opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any
    ]
  ] = js.undefined
}
object OpacityProps {
  
  inline def apply(): OpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps]
  }
  
  extension [Self <: OpacityProps](x: Self) {
    
    inline def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any
        ]
    ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ js.Any)*
    ): Self = StObject.set(x, "opacity", js.Array(value :_*))
  }
}
