package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridGapProps[TLength] extends StObject {
  
  val gridGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
    ]
  ] = js.native
}
object GridGapProps {
  
  @scala.inline
  def apply[TLength](): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
  
  @scala.inline
  implicit class GridGapPropsMutableBuilder[Self <: GridGapProps[_], TLength] (val x: Self with GridGapProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setGridGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
        ]
    ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
    
    @scala.inline
    def setGridGapVarargs(value: js.Any*): Self = StObject.set(x, "gridGap", js.Array(value :_*))
  }
}
