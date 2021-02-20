package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateColumnsProps[TLength] extends StObject {
  
  val gridTemplateColumns: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
    ]
  ] = js.native
}
object GridTemplateColumnsProps {
  
  @scala.inline
  def apply[TLength](): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
  
  @scala.inline
  implicit class GridTemplateColumnsPropsMutableBuilder[Self <: GridTemplateColumnsProps[_], TLength] (val x: Self with GridTemplateColumnsProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridTemplateColumns(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
        ]
    ): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
    
    @scala.inline
    def setGridTemplateColumnsVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value :_*))
  }
}
