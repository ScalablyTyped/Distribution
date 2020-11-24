package typings.typeorm.anon

import typings.typeorm.typeormStrings.dirty_read
import typings.typeorm.typeormStrings.pessimistic_partial_write
import typings.typeorm.typeormStrings.pessimistic_read
import typings.typeorm.typeormStrings.pessimistic_write
import typings.typeorm.typeormStrings.pessimistic_write_or_fail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  var mode: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    mode: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail
  ): `2` = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setMode(
      value: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail
    ): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
