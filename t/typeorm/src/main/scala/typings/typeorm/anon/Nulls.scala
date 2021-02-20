package typings.typeorm.anon

import typings.typeorm.typeormStrings.ASC
import typings.typeorm.typeormStrings.DESC
import typings.typeorm.typeormStrings.`NULLS FIRST`
import typings.typeorm.typeormStrings.`NULLS LAST`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nulls extends StObject {
  
  var nulls: js.UndefOr[(`NULLS FIRST`) | (`NULLS LAST`)] = js.native
  
  var order: ASC | DESC = js.native
}
object Nulls {
  
  @scala.inline
  def apply(order: ASC | DESC): Nulls = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nulls]
  }
  
  @scala.inline
  implicit class NullsMutableBuilder[Self <: Nulls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNulls(value: (`NULLS FIRST`) | (`NULLS LAST`)): Self = StObject.set(x, "nulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullsUndefined: Self = StObject.set(x, "nulls", js.undefined)
    
    @scala.inline
    def setOrder(value: ASC | DESC): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
