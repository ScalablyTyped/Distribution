package typings
package atUifabricMergeDashStylesLib.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleSheetConfig extends js.Object {
  /**
    * Default 'displayName' to use for a className.
    * @defaultvalue 'css'
    */
  var defaultPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Injection mode for how rules are inserted.
    */
  var injectionMode: js.UndefOr[InjectionMode] = js.undefined
  /**
    * Default 'namespace' to attach before the className.
    */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback executed when a rule is inserted.
    */
  var onInsertRule: js.UndefOr[js.Function1[/* rule */ java.lang.String, scala.Unit]] = js.undefined
}

object IStyleSheetConfig {
  @scala.inline
  def apply(
    defaultPrefix: java.lang.String = null,
    injectionMode: InjectionMode = null,
    namespace: java.lang.String = null,
    onInsertRule: /* rule */ java.lang.String => scala.Unit = null
  ): IStyleSheetConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultPrefix != null) __obj.updateDynamic("defaultPrefix")(defaultPrefix)
    if (injectionMode != null) __obj.updateDynamic("injectionMode")(injectionMode)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (onInsertRule != null) __obj.updateDynamic("onInsertRule")(js.Any.fromFunction1(onInsertRule))
    __obj.asInstanceOf[IStyleSheetConfig]
  }
}

