package typings.webgme.anon

import typings.webgme.GmeCommon.DefIntegerObject
import typings.webgme.GmeCommon.DefStringObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var level: DefIntegerObject = js.native
  var name: DefStringObject = js.native
}

object Level {
  @scala.inline
  def apply(level: DefIntegerObject, name: DefStringObject): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
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
    def setLevel(value: DefIntegerObject): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DefStringObject): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

