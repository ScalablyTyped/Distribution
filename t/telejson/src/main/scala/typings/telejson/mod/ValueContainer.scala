package typings.telejson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueContainer
  extends /* keys */ StringDictionary[js.Any] {
  var `_constructor-name_`: String = js.native
}

object ValueContainer {
  @scala.inline
  def apply(`_constructor-name_`: String): ValueContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_constructor-name_")(`_constructor-name_`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueContainer]
  }
  @scala.inline
  implicit class ValueContainerOps[Self <: ValueContainer] (val x: Self) extends AnyVal {
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
    def `set_constructor-name_`(value: String): Self = this.set("_constructor-name_", value.asInstanceOf[js.Any])
  }
  
}

