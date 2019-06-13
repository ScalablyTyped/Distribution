package typings
package atUifabricMergeDashStylesLib.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/merge-styles/lib/Stylesheet", "Stylesheet")
@js.native
class Stylesheet () extends js.Object {
  def this(config: IStyleSheetConfig) = this()
  var _classNameToArgs: js.Any = js.native
  var _config: js.Any = js.native
  var _counter: js.Any = js.native
  var _keyToClassName: js.Any = js.native
  var _lastStyleElement: js.UndefOr[js.Any] = js.native
  var _onResetCallbacks: js.Any = js.native
  var _preservedRules: js.Any = js.native
  var _rules: js.Any = js.native
  var _rulesToInsert: js.Any = js.native
  var _styleElement: js.UndefOr[js.Any] = js.native
  /* private */ def _createStyleElement(): js.Any = js.native
  /* private */ def _getStyleElement(): js.Any = js.native
  /**
    * Gets the arguments associated with a given classname which was
    * previously registered using cacheClassName.
    */
  def argsFromClassName(className: java.lang.String): js.UndefOr[js.Array[atUifabricMergeDashStylesLib.libIStyleMod.IStyle]] = js.native
  /**
    * Used internally to cache information about a class which was
    * registered with the stylesheet.
    */
  def cacheClassName(
    className: java.lang.String,
    key: java.lang.String,
    args: js.Array[atUifabricMergeDashStylesLib.libIStyleMod.IStyle],
    rules: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
    * Gets the appropriate classname given a key which was previously
    * registered using cacheClassName.
    */
  def classNameFromKey(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Generates a unique classname.
    *
    * @param displayName - Optional value to use as a prefix.
    */
  def getClassName(): java.lang.String = js.native
  def getClassName(displayName: java.lang.String): java.lang.String = js.native
  /**
    * Gets all rules registered with the stylesheet; only valid when
    * using InsertionMode.none.
    */
  def getRules(): java.lang.String = js.native
  def getRules(includePreservedRules: scala.Boolean): java.lang.String = js.native
  /**
    * Inserts a css rule into the stylesheet.
    * @param preserve - Preserves the rule beyond a reset boundary.
    */
  def insertRule(rule: java.lang.String): scala.Unit = js.native
  def insertRule(rule: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  /**
    * Gets the arguments associated with a given classname which was
    * previously registered using cacheClassName.
    */
  def insertedRulesFromClassName(className: java.lang.String): js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Configures a reset callback.
    *
    * @param callback - A callback which will be called when the Stylesheet is reset.
    */
  def onReset(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Resets the internal state of the stylesheet. Only used in server
    * rendered scenarios where we're using InsertionMode.none.
    */
  def reset(): scala.Unit = js.native
  def resetKeys(): scala.Unit = js.native
  /**
    * Configures the stylesheet.
    */
  def setConfig(): scala.Unit = js.native
  def setConfig(config: IStyleSheetConfig): scala.Unit = js.native
}

/* static members */
@JSImport("@uifabric/merge-styles/lib/Stylesheet", "Stylesheet")
@js.native
object Stylesheet extends js.Object {
  /**
    * Gets the singleton instance.
    */
  def getInstance(): atUifabricMergeDashStylesLib.libStylesheetMod.Stylesheet = js.native
}

