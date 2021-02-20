package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextShadowProps extends StObject {
  
  val textShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
    ]
  ] = js.native
}
object TextShadowProps {
  
  @scala.inline
  def apply(): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps]
  }
  
  @scala.inline
  implicit class TextShadowPropsMutableBuilder[Self <: TextShadowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
        ]
    ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    @scala.inline
    def setTextShadowVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "textShadow", js.Array(value :_*))
  }
}
