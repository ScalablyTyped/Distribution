package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopProps[TLength] extends StObject {
  
  val borderTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
    ]
  ] = js.native
}
object BorderTopProps {
  
  @scala.inline
  def apply[TLength](): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderTopPropsMutableBuilder[Self <: BorderTopProps[_], TLength] (val x: Self with BorderTopProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
        ]
    ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    @scala.inline
    def setBorderTopVarargs(value: js.Any*): Self = StObject.set(x, "borderTop", js.Array(value :_*))
  }
}
