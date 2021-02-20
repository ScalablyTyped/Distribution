package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateRowsProps[TLength] extends StObject {
  
  val gridTemplateRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
    ]
  ] = js.native
}
object GridTemplateRowsProps {
  
  @scala.inline
  def apply[TLength](): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridTemplateRowsPropsMutableBuilder[Self <: GridTemplateRowsProps[_], TLength] (val x: Self with GridTemplateRowsProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridTemplateRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
        ]
    ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    @scala.inline
    def setGridTemplateRowsVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
  }
}
