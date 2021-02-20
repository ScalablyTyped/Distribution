package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnProps extends StObject {
  
  val gridColumn: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
    ]
  ] = js.native
}
object GridColumnProps {
  
  @scala.inline
  def apply(): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps]
  }
  
  @scala.inline
  implicit class GridColumnPropsMutableBuilder[Self <: GridColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridColumn(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
        ]
    ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
    
    @scala.inline
    def setGridColumnVarargs(value: js.Any*): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
  }
}
