package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightColorProps extends StObject {
  
  val borderRightColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
    ]
  ] = js.undefined
}
object BorderRightColorProps {
  
  @scala.inline
  def apply(): BorderRightColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightColorProps]
  }
  
  @scala.inline
  implicit class BorderRightColorPropsMutableBuilder[Self <: BorderRightColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRightColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any
        ]
    ): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    @scala.inline
    def setBorderRightColorVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ js.Any)*
    ): Self = StObject.set(x, "borderRightColor", js.Array(value :_*))
  }
}
