package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTransformProps extends StObject {
  
  val textTransform: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
    ]
  ] = js.native
}
object TextTransformProps {
  
  @scala.inline
  def apply(): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTransformProps]
  }
  
  @scala.inline
  implicit class TextTransformPropsMutableBuilder[Self <: TextTransformProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextTransform(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
        ]
    ): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    @scala.inline
    def setTextTransformVarargs(value: js.Any*): Self = StObject.set(x, "textTransform", js.Array(value :_*))
  }
}
