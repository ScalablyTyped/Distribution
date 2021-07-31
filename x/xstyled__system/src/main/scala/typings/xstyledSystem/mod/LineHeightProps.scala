package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightProps[TLength] extends StObject {
  
  val lineHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any
    ]
  ] = js.undefined
}
object LineHeightProps {
  
  @scala.inline
  def apply[TLength](): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
  
  @scala.inline
  implicit class LineHeightPropsMutableBuilder[Self <: LineHeightProps[?], TLength] (val x: Self & LineHeightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setLineHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setLineHeightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
  }
}
