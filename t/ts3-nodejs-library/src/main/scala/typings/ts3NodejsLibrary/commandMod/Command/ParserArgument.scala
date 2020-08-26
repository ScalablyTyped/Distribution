package typings.ts3NodejsLibrary.commandMod.Command

import typings.ts3NodejsLibrary.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserArgument extends js.Object {
  var cmd: Instantiable = js.native
  var raw: String = js.native
}

object ParserArgument {
  @scala.inline
  def apply(cmd: Instantiable, raw: String): ParserArgument = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserArgument]
  }
  @scala.inline
  implicit class ParserArgumentOps[Self <: ParserArgument] (val x: Self) extends AnyVal {
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
    def setCmd(value: Instantiable): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
  
}

