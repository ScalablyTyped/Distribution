package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumnGapProps[TLength] extends StObject {
  
  val gridColumnGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
    ]
  ] = js.native
}
object GridColumnGapProps {
  
  @scala.inline
  def apply[TLength](): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
  
  @scala.inline
  implicit class GridColumnGapPropsMutableBuilder[Self <: GridColumnGapProps[_], TLength] (val x: Self with GridColumnGapProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridColumnGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
        ]
    ): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    @scala.inline
    def setGridColumnGapVarargs(value: js.Any*): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
  }
}
