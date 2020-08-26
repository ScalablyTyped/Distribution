package typings.textract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cmd extends js.Object {
  /**
    * `tesseract.lang` allows a quick means to provide the most popular tesseract option,
    * but if you need to configure more options, you can simply pass `cmd`.
    * `cmd` is the string that matches the command-line options you want to pass to tesseract.
    * For instance, to provide language and psm,
    * you would pass `{ tesseract: { cmd:"-l chi_sim -psm 10" } }`
    */
  var cmd: String = js.native
}

object Cmd {
  @scala.inline
  def apply(cmd: String): Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmd]
  }
  @scala.inline
  implicit class CmdOps[Self <: Cmd] (val x: Self) extends AnyVal {
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
  }
  
}

