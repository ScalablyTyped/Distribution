package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginProps[TLength] extends StObject {
  
  val m: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
    ]
  ] = js.undefined
  
  val margin: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginProps {
  
  @scala.inline
  def apply[TLength](): MarginProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginPropsMutableBuilder[Self <: MarginProps[?], TLength] (val x: Self & MarginProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setM(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    @scala.inline
    def setMVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "m", js.Array(value :_*))
    
    @scala.inline
    def setMargin(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "margin", js.Array(value :_*))
  }
}
