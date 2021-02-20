package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderProps extends StObject {
  
  val order: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
    ]
  ] = js.native
}
object OrderProps {
  
  @scala.inline
  def apply(): OrderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps]
  }
  
  @scala.inline
  implicit class OrderPropsMutableBuilder[Self <: OrderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
        ]
    ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: js.Any*): Self = StObject.set(x, "order", js.Array(value :_*))
  }
}
