package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAutoColumnsProps[TLength] extends StObject {
  
  val gridAutoColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ js.Any
    ]
  ] = js.undefined
}
object GridAutoColumnsProps {
  
  @scala.inline
  def apply[TLength](): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridAutoColumnsPropsMutableBuilder[Self <: GridAutoColumnsProps[?], TLength] (val x: Self & GridAutoColumnsProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridAutoColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
    
    @scala.inline
    def setGridAutoColumnsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ js.Any)*
    ): Self = StObject.set(x, "gridAutoColumns", js.Array(value :_*))
  }
}
