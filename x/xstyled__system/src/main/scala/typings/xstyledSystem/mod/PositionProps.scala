package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionProps extends StObject {
  
  val position: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ js.Any
    ]
  ] = js.undefined
}
object PositionProps {
  
  inline def apply(): PositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps]
  }
  
  extension [Self <: PositionProps](x: Self) {
    
    inline def setPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ js.Any
        ]
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ js.Any)*
    ): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
