package typings.tdweb.mod

import typings.tdweb.tdwebStrings.asmjs
import typings.tdweb.tdwebStrings.auto
import typings.tdweb.tdwebStrings.debug
import typings.tdweb.tdwebStrings.error
import typings.tdweb.tdwebStrings.info
import typings.tdweb.tdwebStrings.log
import typings.tdweb.tdwebStrings.warning
import typings.tdweb.tdwebStrings.wasm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdOptions extends js.Object {
  /**
    * Name of the TDLib instance. Currently only one instance of TdClient with a given name is allowed.
    * All but one instances with the same name will be automatically closed. Usually, the newest non-background instance is kept alive.
    * Files will be stored in an IndexedDb table with the same name.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * Pass true, if the instance is opened from the background.
    */
  var isBackground: js.UndefOr[Boolean] = js.native
  /**
    * The initial verbosity level of the JavaScript part of the code (one of 'error', 'warning', 'info', 'log', 'debug').
    */
  var jsLogVerbosityLevel: js.UndefOr[error | warning | info | log | debug] = js.native
  /**
    * The initial verbosity level for the TDLib internal logging (0-1023).
    */
  var logVerbosityLevel: js.UndefOr[Double] = js.native
  /**
    * For debug only. The type of the TDLib build to use. 'asmjs' for asm.js and 'wasm' for WebAssembly.
    * If mode == 'auto' WebAbassembly will be used if supported by browser, asm.js otherwise.
    */
  var mode: js.UndefOr[auto | asmjs | wasm] = js.native
  /**
    * Callback for all incoming updates.
    */
  var onUpdate: js.UndefOr[js.Function1[/* update */ TdObject, _]] = js.native
  /**
    * For debug only. PaPass false to use TDLib without database and secret chats.
    * It will significantly improve loading time, but some functionality will be unavailable.ss true
    * to open TDLib database in read-only mode
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Pass false to use TDLib without database and secret chats. It will significantly improve loading time, but some functionality will be unavailable.
    */
  var useDatabase: js.UndefOr[Boolean] = js.native
}

object TdOptions {
  @scala.inline
  def apply(): TdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdOptions]
  }
  @scala.inline
  implicit class TdOptionsOps[Self <: TdOptions] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: String): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    @scala.inline
    def setIsBackground(value: Boolean): Self = this.set("isBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBackground: Self = this.set("isBackground", js.undefined)
    @scala.inline
    def setJsLogVerbosityLevel(value: error | warning | info | log | debug): Self = this.set("jsLogVerbosityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsLogVerbosityLevel: Self = this.set("jsLogVerbosityLevel", js.undefined)
    @scala.inline
    def setLogVerbosityLevel(value: Double): Self = this.set("logVerbosityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogVerbosityLevel: Self = this.set("logVerbosityLevel", js.undefined)
    @scala.inline
    def setMode(value: auto | asmjs | wasm): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* update */ TdObject => _): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setUseDatabase(value: Boolean): Self = this.set("useDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDatabase: Self = this.set("useDatabase", js.undefined)
  }
  
}

