package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorProps[TLength] extends StObject {
  
  val backgroundColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
    ]
  ] = js.native
  
  val bg: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
    ]
  ] = js.native
}
object BackgroundColorProps {
  
  @scala.inline
  def apply[TLength](): BackgroundColorProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[TLength]]
  }
  
  @scala.inline
  implicit class BackgroundColorPropsMutableBuilder[Self <: BackgroundColorProps[_], TLength] (val x: Self with BackgroundColorProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
        ]
    ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: js.Any*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBg(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
        ]
    ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setBgVarargs(value: js.Any*): Self = StObject.set(x, "bg", js.Array(value :_*))
  }
}
