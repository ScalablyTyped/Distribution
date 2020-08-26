package typings.winston.transportsMod

import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleTransportOptions extends TransportStreamOptions {
  var consoleWarnLevels: js.UndefOr[js.Array[String]] = js.native
  var debugStdout: js.UndefOr[Boolean] = js.native
  var eol: js.UndefOr[String] = js.native
  var stderrLevels: js.UndefOr[js.Array[String]] = js.native
}

object ConsoleTransportOptions {
  @scala.inline
  def apply(): ConsoleTransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleTransportOptions]
  }
  @scala.inline
  implicit class ConsoleTransportOptionsOps[Self <: ConsoleTransportOptions] (val x: Self) extends AnyVal {
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
    def setConsoleWarnLevelsVarargs(value: String*): Self = this.set("consoleWarnLevels", js.Array(value :_*))
    @scala.inline
    def setConsoleWarnLevels(value: js.Array[String]): Self = this.set("consoleWarnLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleWarnLevels: Self = this.set("consoleWarnLevels", js.undefined)
    @scala.inline
    def setDebugStdout(value: Boolean): Self = this.set("debugStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugStdout: Self = this.set("debugStdout", js.undefined)
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setStderrLevelsVarargs(value: String*): Self = this.set("stderrLevels", js.Array(value :_*))
    @scala.inline
    def setStderrLevels(value: js.Array[String]): Self = this.set("stderrLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderrLevels: Self = this.set("stderrLevels", js.undefined)
  }
  
}

