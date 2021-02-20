package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexGrowProps extends StObject {
  
  val flexGrow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
    ]
  ] = js.native
}
object FlexGrowProps {
  
  @scala.inline
  def apply(): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps]
  }
  
  @scala.inline
  implicit class FlexGrowPropsMutableBuilder[Self <: FlexGrowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexGrow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
        ]
    ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexGrowVarargs(value: js.Any*): Self = StObject.set(x, "flexGrow", js.Array(value :_*))
  }
}
