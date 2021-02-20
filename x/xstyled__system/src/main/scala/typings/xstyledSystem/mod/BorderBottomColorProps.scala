package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomColorProps extends StObject {
  
  val borderBottomColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
    ]
  ] = js.native
}
object BorderBottomColorProps {
  
  @scala.inline
  def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  
  @scala.inline
  implicit class BorderBottomColorPropsMutableBuilder[Self <: BorderBottomColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]
    ): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    @scala.inline
    def setBorderBottomColorVarargs(value: js.Any*): Self = StObject.set(x, "borderBottomColor", js.Array(value :_*))
  }
}
