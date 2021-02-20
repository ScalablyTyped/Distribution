package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomProps[TLength] extends StObject {
  
  val bottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
    ]
  ] = js.native
}
object BottomProps {
  
  @scala.inline
  def apply[TLength](): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomProps[TLength]]
  }
  
  @scala.inline
  implicit class BottomPropsMutableBuilder[Self <: BottomProps[_], TLength] (val x: Self with BottomProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
        ]
    ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setBottomVarargs(value: js.Any*): Self = StObject.set(x, "bottom", js.Array(value :_*))
  }
}
