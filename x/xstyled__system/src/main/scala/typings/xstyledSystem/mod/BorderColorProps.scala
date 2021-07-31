package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorProps extends StObject {
  
  val borderColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
    ]
  ] = js.undefined
}
object BorderColorProps {
  
  @scala.inline
  def apply(): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps]
  }
  
  @scala.inline
  implicit class BorderColorPropsMutableBuilder[Self <: BorderColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
        ]
    ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any)*
    ): Self = StObject.set(x, "borderColor", js.Array(value :_*))
  }
}
