package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingYProps[TLength] extends StObject {
  
  val py: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
    ]
  ] = js.undefined
}
object PaddingYProps {
  
  @scala.inline
  def apply[TLength](): PaddingYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingYProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingYPropsMutableBuilder[Self <: PaddingYProps[?], TLength] (val x: Self & PaddingYProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setPy(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
    
    @scala.inline
    def setPyVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ js.Any)*
    ): Self = StObject.set(x, "py", js.Array(value :_*))
  }
}
