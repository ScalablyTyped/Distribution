package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidthProps[TLength] extends StObject {
  
  val maxWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MaxWidthProps {
  
  @scala.inline
  def apply[TLength](): MaxWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidthProps[TLength]]
  }
  
  @scala.inline
  implicit class MaxWidthPropsMutableBuilder[Self <: MaxWidthProps[?], TLength] (val x: Self & MaxWidthProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMaxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ js.Any)*
    ): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
  }
}
