package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadiusProps[TLength] extends StObject {
  
  val borderRadius: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
    ]
  ] = js.native
}
object BorderRadiusProps {
  
  @scala.inline
  def apply[TLength](): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderRadiusPropsMutableBuilder[Self <: BorderRadiusProps[_], TLength] (val x: Self with BorderRadiusProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
        ]
    ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderRadiusVarargs(value: js.Any*): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
  }
}
