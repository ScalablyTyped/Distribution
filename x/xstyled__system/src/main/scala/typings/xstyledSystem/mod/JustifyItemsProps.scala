package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyItemsProps extends StObject {
  
  val justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any
    ]
  ] = js.undefined
}
object JustifyItemsProps {
  
  inline def apply(): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps]
  }
  
  extension [Self <: JustifyItemsProps](x: Self) {
    
    inline def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any
        ]
    ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    inline def setJustifyItemsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ js.Any)*
    ): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
  }
}
