package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxHeightProps[TLength] extends StObject {
  
  val maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
    ]
  ] = js.native
}
object MaxHeightProps {
  
  @scala.inline
  def apply[TLength](): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
  
  @scala.inline
  implicit class MaxHeightPropsMutableBuilder[Self <: MaxHeightProps[_], TLength] (val x: Self with MaxHeightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
        ]
    ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxHeightVarargs(value: js.Any*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
  }
}
