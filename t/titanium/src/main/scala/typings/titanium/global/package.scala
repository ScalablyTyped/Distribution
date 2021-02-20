package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  @scala.inline
  def DIST_ADHOC: scala.Boolean = js.Dynamic.global.selectDynamic("DIST_ADHOC").asInstanceOf[scala.Boolean]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value, based on whether build target is `'dist-appstore'` or `'dist-playstore'`.
    */
  @scala.inline
  def DIST_STORE: scala.Boolean = js.Dynamic.global.selectDynamic("DIST_STORE").asInstanceOf[scala.Boolean]
  
  /**
    * Alias for <ENV_DEVELOPMENT>
    */
  @scala.inline
  def ENV_DEV: scala.Boolean = js.Dynamic.global.selectDynamic("ENV_DEV").asInstanceOf[scala.Boolean]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value, based on whether deploy type is `'development'`. Typically true for simulator/emulator builds.
    */
  @scala.inline
  def ENV_DEVELOPMENT: scala.Boolean = js.Dynamic.global.selectDynamic("ENV_DEVELOPMENT").asInstanceOf[scala.Boolean]
  
  /**
    * Alias for <ENV_PRODUCTION>
    */
  @scala.inline
  def ENV_PROD: scala.Boolean = js.Dynamic.global.selectDynamic("ENV_PROD").asInstanceOf[scala.Boolean]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value, based on whether deploy type is `'production'`. Typically true for app store/ad-hoc builds.
    */
  @scala.inline
  def ENV_PRODUCTION: scala.Boolean = js.Dynamic.global.selectDynamic("ENV_PRODUCTION").asInstanceOf[scala.Boolean]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value, based on whether deploy type is `'test'`. Typically true for device builds.
    */
  @scala.inline
  def ENV_TEST: scala.Boolean = js.Dynamic.global.selectDynamic("ENV_TEST").asInstanceOf[scala.Boolean]
  
  /**
    * An alias for [Titanium.Locale.getString](Titanium.Locale.getString).
    */
  @scala.inline
  def L(key: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("L")(key.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def L(key: java.lang.String, hint: java.lang.String): java.lang.String = (js.Dynamic.global.applyDynamic("L")(key.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value.
    */
  @scala.inline
  def OS_ANDROID: scala.Boolean = js.Dynamic.global.selectDynamic("OS_ANDROID").asInstanceOf[scala.Boolean]
  
  /**
    * A special constant that is replaced during the app build with a boolean `true`/`false` value.
    */
  @scala.inline
  def OS_IOS: scala.Boolean = js.Dynamic.global.selectDynamic("OS_IOS").asInstanceOf[scala.Boolean]
  
  /**
    * Displays a pop-up alert dialog with the passed in `message`.
    */
  @scala.inline
  def alert(message: java.lang.String): scala.Unit = js.Dynamic.global.applyDynamic("alert")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Cancels an interval timer.
    */
  @scala.inline
  def clearInterval(): scala.Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[scala.Unit]
  @scala.inline
  def clearInterval(timerId: scala.Double): scala.Unit = js.Dynamic.global.applyDynamic("clearInterval")(timerId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Cancels a one-time timer.
    */
  @scala.inline
  def clearTimeout(): scala.Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[scala.Unit]
  @scala.inline
  def clearTimeout(timerId: scala.Double): scala.Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timerId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Console logging facilities.
    */
  @scala.inline
  def console: typings.titanium.mod.global.Console_ = js.Dynamic.global.selectDynamic("console").asInstanceOf[typings.titanium.mod.global.Console_]
  @scala.inline
  def console_=(x: typings.titanium.mod.global.Console_): scala.Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  /**
    * Replaces each escape sequence in the specified string, created using the `encodedURI`
    * method, with the character that it represents.
    */
  @scala.inline
  def decodeURIComponent(encodedURI: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURIComponent")(encodedURI.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * Replaces each special character in the specified string with the equivalent URI escape
    * sequence. Useful for encoding URIs.
    */
  @scala.inline
  def encodeURIComponent(string: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(string.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def global: typings.titanium.Titanium.Global = js.Dynamic.global.selectDynamic("global").asInstanceOf[typings.titanium.Titanium.Global]
  @scala.inline
  def global_=(x: typings.titanium.Titanium.Global): scala.Unit = js.Dynamic.global.updateDynamic("global")(x.asInstanceOf[js.Any])
  
  /**
    * Loads either a native Titanium module or a CommonJS module.
    */
  @scala.inline
  def require(moduleId: java.lang.String): js.Any = js.Dynamic.global.applyDynamic("require")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Executes a function repeatedly with a fixed time delay between each call to that function.
    */
  @scala.inline
  def setInterval(func: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Double = js.Dynamic.global.applyDynamic("setInterval")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def setInterval(func: js.Function1[/* repeated */ js.Any, scala.Unit], delay: scala.Double): scala.Double = (js.Dynamic.global.applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  /**
    * Executes code or a function after a delay.
    */
  @scala.inline
  def setTimeout(func: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Double = js.Dynamic.global.applyDynamic("setTimeout")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  @scala.inline
  def setTimeout(func: js.Function1[/* repeated */ js.Any, scala.Unit], delay: scala.Double): scala.Double = (js.Dynamic.global.applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
