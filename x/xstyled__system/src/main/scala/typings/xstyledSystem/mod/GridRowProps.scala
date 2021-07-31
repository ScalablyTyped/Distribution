package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRowProps extends StObject {
  
  val gridRow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any
    ]
  ] = js.undefined
}
object GridRowProps {
  
  @scala.inline
  def apply(): GridRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps]
  }
  
  @scala.inline
  implicit class GridRowPropsMutableBuilder[Self <: GridRowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridRow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any
        ]
    ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    
    @scala.inline
    def setGridRowVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ js.Any)*
    ): Self = StObject.set(x, "gridRow", js.Array(value :_*))
  }
}
