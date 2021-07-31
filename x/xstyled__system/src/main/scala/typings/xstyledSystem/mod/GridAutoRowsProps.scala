package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoRowsProps[TLength] extends StObject {
  
  val gridAutoRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridAutoRowsProps {
  
  @scala.inline
  def apply[TLength](): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridAutoRowsPropsMutableBuilder[Self <: GridAutoRowsProps[?], TLength] (val x: Self & GridAutoRowsProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridAutoRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    @scala.inline
    def setGridAutoRowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridAutoRows", js.Array(value :_*))
  }
}
