package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineHeightProps[TLength] extends StObject {
  
  val lineHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
    ]
  ] = js.native
}
object LineHeightProps {
  
  @scala.inline
  def apply[TLength](): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
  
  @scala.inline
  implicit class LineHeightPropsMutableBuilder[Self <: LineHeightProps[_], TLength] (val x: Self with LineHeightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setLineHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
        ]
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightVarargs(value: js.Any*): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
  }
}
