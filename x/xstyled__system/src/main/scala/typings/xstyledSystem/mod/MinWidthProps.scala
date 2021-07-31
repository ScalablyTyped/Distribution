package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinWidthProps[TLength] extends StObject {
  
  val minWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MinWidthProps {
  
  @scala.inline
  def apply[TLength](): MinWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinWidthProps[TLength]]
  }
  
  @scala.inline
  implicit class MinWidthPropsMutableBuilder[Self <: MinWidthProps[?], TLength] (val x: Self & MinWidthProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMinWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMinWidthVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ js.Any)*
    ): Self = StObject.set(x, "minWidth", js.Array(value :_*))
  }
}
