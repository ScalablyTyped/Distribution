package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexShrinkProps extends StObject {
  
  val flexShrink: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
    ]
  ] = js.native
}
object FlexShrinkProps {
  
  @scala.inline
  def apply(): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps]
  }
  
  @scala.inline
  implicit class FlexShrinkPropsMutableBuilder[Self <: FlexShrinkProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexShrink(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
        ]
    ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setFlexShrinkVarargs(value: js.Any*): Self = StObject.set(x, "flexShrink", js.Array(value :_*))
  }
}
