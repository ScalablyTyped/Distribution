package typings.winstonTransport.mod

import typings.logform.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransportStreamOptions extends js.Object {
  
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  var format: js.UndefOr[Format_] = js.native
  
  var handleExceptions: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var logv: js.UndefOr[js.Function2[/* info */ js.Any, /* next */ js.Function0[Unit], _]] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object TransportStreamOptions {
  
  @scala.inline
  def apply(): TransportStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportStreamOptions]
  }
  
  @scala.inline
  implicit class TransportStreamOptionsOps[Self <: TransportStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setFormat(value: Format_): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHandleExceptions(value: Boolean): Self = this.set("handleExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleExceptions: Self = this.set("handleExceptions", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setLogv(value: (/* info */ js.Any, /* next */ js.Function0[Unit]) => _): Self = this.set("logv", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLogv: Self = this.set("logv", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
