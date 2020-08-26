package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Key-value pairs detected across cell boundaries. */
@js.native
trait KeyValuePair extends js.Object {
  /** A key in a key-value pair. */
  var key: js.UndefOr[Key] = js.native
  /** A value in a key-value pair. */
  var value: js.UndefOr[Value] = js.native
}

object KeyValuePair {
  @scala.inline
  def apply(): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuePair]
  }
  @scala.inline
  implicit class KeyValuePairOps[Self <: KeyValuePair] (val x: Self) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

