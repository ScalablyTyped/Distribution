package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeTEventType[TEventType /* <: String */] extends js.Object {
  var `type`: TEventType = js.native
}

object TypeTEventType {
  @scala.inline
  def apply[/* <: java.lang.String */ TEventType](`type`: TEventType): TypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTEventType[TEventType]]
  }
  @scala.inline
  implicit class TypeTEventTypeOps[Self <: TypeTEventType[_], /* <: java.lang.String */ TEventType] (val x: Self with TypeTEventType[TEventType]) extends AnyVal {
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
    def setType(value: TEventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

