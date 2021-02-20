package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderLeftColorProps extends StObject {
  
  val borderLeftColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
    ]
  ] = js.native
}
object BorderLeftColorProps {
  
  @scala.inline
  def apply(): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftColorProps]
  }
  
  @scala.inline
  implicit class BorderLeftColorPropsMutableBuilder[Self <: BorderLeftColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderLeftColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]
    ): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    @scala.inline
    def setBorderLeftColorVarargs(value: js.Any*): Self = StObject.set(x, "borderLeftColor", js.Array(value :_*))
  }
}
