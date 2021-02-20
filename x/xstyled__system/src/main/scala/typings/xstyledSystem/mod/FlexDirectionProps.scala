package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexDirectionProps extends StObject {
  
  val flexDirection: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
    ]
  ] = js.native
}
object FlexDirectionProps {
  
  @scala.inline
  def apply(): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps]
  }
  
  @scala.inline
  implicit class FlexDirectionPropsMutableBuilder[Self <: FlexDirectionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
        ]
    ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    @scala.inline
    def setFlexDirectionVarargs(value: js.Any*): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
  }
}
