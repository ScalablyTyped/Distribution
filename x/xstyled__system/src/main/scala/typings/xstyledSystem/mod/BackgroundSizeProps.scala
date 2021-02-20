package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundSizeProps[TLength] extends StObject {
  
  val backgroundSize: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
    ]
  ] = js.native
}
object BackgroundSizeProps {
  
  @scala.inline
  def apply[TLength](): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
  
  @scala.inline
  implicit class BackgroundSizePropsMutableBuilder[Self <: BackgroundSizeProps[_], TLength] (val x: Self with BackgroundSizeProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBackgroundSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
        ]
    ): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    @scala.inline
    def setBackgroundSizeVarargs(value: js.Any*): Self = StObject.set(x, "backgroundSize", js.Array(value :_*))
  }
}
