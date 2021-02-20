package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalAlignProps[TLength] extends StObject {
  
  val verticalAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
    ]
  ] = js.native
}
object VerticalAlignProps {
  
  @scala.inline
  def apply[TLength](): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
  
  @scala.inline
  implicit class VerticalAlignPropsMutableBuilder[Self <: VerticalAlignProps[_], TLength] (val x: Self with VerticalAlignProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setVerticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
        ]
    ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlignVarargs(value: js.Any*): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
  }
}
