package typings.typeorm.anon

import typings.typeorm.typeormStrings.ASC
import typings.typeorm.typeormStrings.DESC
import typings.typeorm.typeormStrings.`NULLS FIRST`
import typings.typeorm.typeormStrings.`NULLS LAST`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nulls extends js.Object {
  
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
  implicit class NullsOps[Self <: Nulls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrder(value: ASC | DESC): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNulls(value: (`NULLS FIRST`) | (`NULLS LAST`)): Self = this.set("nulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNulls: Self = this.set("nulls", js.undefined)
  }
}
