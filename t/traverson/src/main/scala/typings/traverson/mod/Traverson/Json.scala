package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  def parseJson(): js.Any = js.native
}

object Json {
  @scala.inline
  def apply(parseJson: () => js.Any): Json = {
    val __obj = js.Dynamic.literal(parseJson = js.Any.fromFunction0(parseJson))
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
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
    def setParseJson(value: () => js.Any): Self = this.set("parseJson", js.Any.fromFunction0(value))
  }
  
}

