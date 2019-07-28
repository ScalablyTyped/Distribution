package typings.atUifabricMergeDashStyles.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleSheetConfig extends js.Object {
  /**
    * CSP settings
    */
  var cspSettings: js.UndefOr[ICSPSettings] = js.undefined
  /**
    * Default 'displayName' to use for a className.
    * @defaultvalue 'css'
    */
  var defaultPrefix: js.UndefOr[String] = js.undefined
  /**
    * Injection mode for how rules are inserted.
    */
  var injectionMode: js.UndefOr[InjectionMode] = js.undefined
  /**
    * Default 'namespace' to attach before the className.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * Callback executed when a rule is inserted.
    */
  var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.undefined
}

object IStyleSheetConfig {
  @scala.inline
  def apply(
    cspSettings: ICSPSettings = null,
    defaultPrefix: String = null,
    injectionMode: InjectionMode = null,
    namespace: String = null,
    onInsertRule: /* rule */ String => Unit = null
  ): IStyleSheetConfig = {
    val __obj = js.Dynamic.literal()
    if (cspSettings != null) __obj.updateDynamic("cspSettings")(cspSettings)
    if (defaultPrefix != null) __obj.updateDynamic("defaultPrefix")(defaultPrefix)
    if (injectionMode != null) __obj.updateDynamic("injectionMode")(injectionMode)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (onInsertRule != null) __obj.updateDynamic("onInsertRule")(js.Any.fromFunction1(onInsertRule))
    __obj.asInstanceOf[IStyleSheetConfig]
  }
}

