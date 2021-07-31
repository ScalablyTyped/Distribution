package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderProps[TLength] extends StObject {
  
  val border: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderProps {
  
  @scala.inline
  def apply[TLength](): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderPropsMutableBuilder[Self <: BorderProps[?], TLength] (val x: Self & BorderProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setBorderVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ js.Any)*
    ): Self = StObject.set(x, "border", js.Array(value :_*))
  }
}
