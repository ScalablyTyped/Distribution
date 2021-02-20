package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopColorProps extends StObject {
  
  val borderTopColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
    ]
  ] = js.native
}
object BorderTopColorProps {
  
  @scala.inline
  def apply(): BorderTopColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopColorProps]
  }
  
  @scala.inline
  implicit class BorderTopColorPropsMutableBuilder[Self <: BorderTopColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderTopColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]
    ): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopColorVarargs(value: js.Any*): Self = StObject.set(x, "borderTopColor", js.Array(value :_*))
  }
}
