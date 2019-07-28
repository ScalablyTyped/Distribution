package typings.atUifabricMergeDashStyles.libStylesheetMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  var _createStyleElement: js.Any = js.native
  var _findPlaceholderStyleTag: js.Any = js.native
  var _getStyleElement: js.Any = js.native
  var _keyToClassName: js.Any = js.native
  var _lastStyleElement: js.UndefOr[js.Any] = js.native
  var _onResetCallbacks: js.Any = js.native
  var _preservedRules: js.Any = js.native
  var _rules: js.Any = js.native
  var _rulesToInsert: js.Any = js.native
  var _styleElement: js.UndefOr[js.Any] = js.native
  /**
    * Gets the arguments associated with a given classname which was
    * previously registered using cacheClassName.
    */
  def argsFromClassName(className: String): js.UndefOr[js.Array[IStyle]] = js.native
  /**
    * Used internally to cache information about a class which was
    * registered with the stylesheet.
    */
  def cacheClassName(className: String, key: String, args: js.Array[IStyle], rules: js.Array[String]): Unit = js.native
  /**
    * Gets the appropriate classname given a key which was previously
    * registered using cacheClassName.
    */
  def classNameFromKey(key: String): js.UndefOr[String] = js.native
  /**
    * Generates a unique classname.
    *
    * @param displayName - Optional value to use as a prefix.
    */
  def getClassName(): String = js.native
  def getClassName(displayName: String): String = js.native
  /**
    * Gets all rules registered with the stylesheet; only valid when
    * using InsertionMode.none.
    */
  def getRules(): String = js.native
  def getRules(includePreservedRules: Boolean): String = js.native
  /**
    * Inserts a css rule into the stylesheet.
    * @param preserve - Preserves the rule beyond a reset boundary.
    */
  def insertRule(rule: String): Unit = js.native
  def insertRule(rule: String, preserve: Boolean): Unit = js.native
  /**
    * Gets the arguments associated with a given classname which was
    * previously registered using cacheClassName.
    */
  def insertedRulesFromClassName(className: String): js.UndefOr[js.Array[String]] = js.native
  /**
    * Configures a reset callback.
    *
    * @param callback - A callback which will be called when the Stylesheet is reset.
    */
  def onReset(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Resets the internal state of the stylesheet. Only used in server
    * rendered scenarios where we're using InsertionMode.none.
    */
  def reset(): Unit = js.native
  def resetKeys(): Unit = js.native
  /**
    * Configures the stylesheet.
    */
  def setConfig(): Unit = js.native
  def setConfig(config: IStyleSheetConfig): Unit = js.native
}

/* static members */
@JSImport("@uifabric/merge-styles/lib/Stylesheet", "Stylesheet")
@js.native
object Stylesheet extends js.Object {
  /**
    * Gets the singleton instance.
    */
  def getInstance(): Stylesheet = js.native
}

