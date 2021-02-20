package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundPositionProps[TLength] extends StObject {
  
  val backgroundPosition: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
    ]
  ] = js.native
}
object BackgroundPositionProps {
  
  @scala.inline
  def apply[TLength](): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
  
  @scala.inline
  implicit class BackgroundPositionPropsMutableBuilder[Self <: BackgroundPositionProps[_], TLength] (val x: Self with BackgroundPositionProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBackgroundPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
        ]
    ): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundPositionVarargs(value: js.Any*): Self = StObject.set(x, "backgroundPosition", js.Array(value :_*))
  }
}
