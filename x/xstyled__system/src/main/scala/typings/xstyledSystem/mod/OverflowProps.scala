package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowProps extends StObject {
  
  val overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any
    ]
  ] = js.undefined
}
object OverflowProps {
  
  inline def apply(): OverflowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps]
  }
  
  extension [Self <: OverflowProps](x: Self) {
    
    inline def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any
        ]
    ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setOverflowVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any)*
    ): Self = StObject.set(x, "overflow", js.Array(value :_*))
  }
}
