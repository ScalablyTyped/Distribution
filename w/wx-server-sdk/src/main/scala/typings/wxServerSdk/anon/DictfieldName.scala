package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictfieldName
  extends /* fieldName */ StringDictionary[js.Any] {
  var _id: js.Any = js.native
}

object DictfieldName {
  @scala.inline
  def apply(_id: js.Any): DictfieldName = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictfieldName]
  }
  @scala.inline
  implicit class DictfieldNameOps[Self <: DictfieldName] (val x: Self) extends AnyVal {
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
    def set_id(value: js.Any): Self = this.set("_id", value.asInstanceOf[js.Any])
  }
  
}

