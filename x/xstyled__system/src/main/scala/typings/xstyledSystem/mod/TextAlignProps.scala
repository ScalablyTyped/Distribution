package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAlignProps extends StObject {
  
  val textAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
    ]
  ] = js.native
}
object TextAlignProps {
  
  @scala.inline
  def apply(): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps]
  }
  
  @scala.inline
  implicit class TextAlignPropsMutableBuilder[Self <: TextAlignProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
        ]
    ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextAlignVarargs(value: js.Any*): Self = StObject.set(x, "textAlign", js.Array(value :_*))
  }
}
