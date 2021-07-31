package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthProps[TLength] extends StObject {
  
  val width: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ js.Any
    ]
  ] = js.undefined
}
object WidthProps {
  
  @scala.inline
  def apply[TLength](): WidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProps[TLength]]
  }
  
  @scala.inline
  implicit class WidthPropsMutableBuilder[Self <: WidthProps[?], TLength] (val x: Self & WidthProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ js.Any)*
    ): Self = StObject.set(x, "width", js.Array(value :_*))
  }
}
