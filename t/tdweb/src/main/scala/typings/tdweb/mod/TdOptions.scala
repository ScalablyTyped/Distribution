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

trait TdOptions extends js.Object {
  /**
    * Name of the TDLib instance. Currently only one instance of TdClient with a given name is allowed.
    * All but one instances with the same name will be automatically closed. Usually, the newest non-background instance is kept alive.
    * Files will be stored in an IndexedDb table with the same name.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  /**
    * Pass true, if the instance is opened from the background.
    */
  var isBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial verbosity level of the JavaScript part of the code (one of 'error', 'warning', 'info', 'log', 'debug').
    */
  var jsLogVerbosityLevel: js.UndefOr[error | warning | info | log | debug] = js.undefined
  /**
    * The initial verbosity level for the TDLib internal logging (0-1023).
    */
  var logVerbosityLevel: js.UndefOr[Double] = js.undefined
  /**
    * For debug only. The type of the TDLib build to use. 'asmjs' for asm.js and 'wasm' for WebAssembly.
    * If mode == 'auto' WebAbassembly will be used if supported by browser, asm.js otherwise.
    */
  var mode: js.UndefOr[auto | asmjs | wasm] = js.undefined
  /**
    * Callback for all incoming updates.
    */
  var onUpdate: js.UndefOr[js.Function1[/* update */ TdObject, _]] = js.undefined
  /**
    * For debug only. PaPass false to use TDLib without database and secret chats.
    * It will significantly improve loading time, but some functionality will be unavailable.ss true
    * to open TDLib database in read-only mode
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Pass false to use TDLib without database and secret chats. It will significantly improve loading time, but some functionality will be unavailable.
    */
  var useDatabase: js.UndefOr[Boolean] = js.undefined
}

object TdOptions {
  @scala.inline
  def apply(
    instanceName: String = null,
    isBackground: js.UndefOr[Boolean] = js.undefined,
    jsLogVerbosityLevel: error | warning | info | log | debug = null,
    logVerbosityLevel: Int | Double = null,
    mode: auto | asmjs | wasm = null,
    onUpdate: /* update */ TdObject => _ = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    useDatabase: js.UndefOr[Boolean] = js.undefined
  ): TdOptions = {
    val __obj = js.Dynamic.literal()
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(isBackground)) __obj.updateDynamic("isBackground")(isBackground.asInstanceOf[js.Any])
    if (jsLogVerbosityLevel != null) __obj.updateDynamic("jsLogVerbosityLevel")(jsLogVerbosityLevel.asInstanceOf[js.Any])
    if (logVerbosityLevel != null) __obj.updateDynamic("logVerbosityLevel")(logVerbosityLevel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(useDatabase)) __obj.updateDynamic("useDatabase")(useDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdOptions]
  }
}

