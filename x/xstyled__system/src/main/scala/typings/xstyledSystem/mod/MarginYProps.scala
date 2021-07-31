package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginYProps[TLength] extends StObject {
  
  val my: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
    ]
  ] = js.undefined
}
object MarginYProps {
  
  @scala.inline
  def apply[TLength](): MarginYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginYProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginYPropsMutableBuilder[Self <: MarginYProps[?], TLength] (val x: Self & MarginYProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setMy(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    @scala.inline
    def setMyVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "my", js.Array(value :_*))
  }
}
