package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinHeightProps[TLength] extends StObject {
  
  val minHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
    ]
  ] = js.native
}
object MinHeightProps {
  
  @scala.inline
  def apply[TLength](): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
  
  @scala.inline
  implicit class MinHeightPropsMutableBuilder[Self <: MinHeightProps[_], TLength] (val x: Self with MinHeightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMinHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
        ]
    ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinHeightVarargs(value: js.Any*): Self = StObject.set(x, "minHeight", js.Array(value :_*))
  }
}
