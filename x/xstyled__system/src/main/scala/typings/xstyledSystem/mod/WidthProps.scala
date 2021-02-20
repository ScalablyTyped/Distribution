package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidthProps[TLength] extends StObject {
  
  val width: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
    ]
  ] = js.native
}
object WidthProps {
  
  @scala.inline
  def apply[TLength](): WidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidthProps[TLength]]
  }
  
  @scala.inline
  implicit class WidthPropsMutableBuilder[Self <: WidthProps[_], TLength] (val x: Self with WidthProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
        ]
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: js.Any*): Self = StObject.set(x, "width", js.Array(value :_*))
  }
}
