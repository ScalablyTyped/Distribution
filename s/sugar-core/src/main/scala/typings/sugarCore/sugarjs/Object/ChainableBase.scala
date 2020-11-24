package typings.sugarCore.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainableBase[RawValue] extends js.Object {
  
  var raw: RawValue = js.native
}
object ChainableBase {
  
  @scala.inline
  def apply[RawValue](raw: RawValue): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
  
  @scala.inline
  implicit class ChainableBaseOps[Self <: ChainableBase[_], RawValue] (val x: Self with ChainableBase[RawValue]) extends AnyVal {
    
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
    def setRaw(value: RawValue): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
}
