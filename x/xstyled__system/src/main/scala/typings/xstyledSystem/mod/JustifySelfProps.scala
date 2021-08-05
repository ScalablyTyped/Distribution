package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifySelfProps extends StObject {
  
  val justifySelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ js.Any
    ]
  ] = js.undefined
}
object JustifySelfProps {
  
  inline def apply(): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps]
  }
  
  extension [Self <: JustifySelfProps](x: Self) {
    
    inline def setJustifySelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ js.Any
        ]
    ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    inline def setJustifySelfVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ js.Any)*
    ): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
  }
}
