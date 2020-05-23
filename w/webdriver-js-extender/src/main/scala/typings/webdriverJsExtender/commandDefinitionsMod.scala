package typings.webdriverJsExtender

import org.scalablytyped.runtime.StringDictionary
import typings.webdriverJsExtender.anon.Altitude
import typings.webdriverJsExtender.commandDefinitionMod.CommandDefinition
import typings.webdriverJsExtender.webdriverJsExtenderStrings.LANDSCAPE
import typings.webdriverJsExtender.webdriverJsExtenderStrings.PORTRAIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender/built/lib/command_definitions", JSImport.Namespace)
@js.native
object commandDefinitionsMod extends js.Object {
  var closeApp: CommandDefinition[Unit] = js.native
  var fullscreen: CommandDefinition[Unit] = js.native
  var getAppStrings: CommandDefinition[js.Array[String]] = js.native
  var getAppiumSettings: CommandDefinition[StringDictionary[js.Any]] = js.native
  var getCurrentContext: CommandDefinition[String] = js.native
  var getCurrentDeviceActivity: CommandDefinition[String] = js.native
  var getDeviceTime: CommandDefinition[String] = js.native
  var getGeolocation: CommandDefinition[Altitude] = js.native
  var getNetworkConnection: CommandDefinition[Double] = js.native
  var getScreenOrientation: CommandDefinition[LANDSCAPE | PORTRAIT] = js.native
  var hideSoftKeyboard: CommandDefinition[Unit] = js.native
  var installApp: CommandDefinition[Unit] = js.native
  var isAppInstalled: CommandDefinition[Boolean] = js.native
  var isDeviceLocked: CommandDefinition[Boolean] = js.native
  var launchSession: CommandDefinition[Unit] = js.native
  var listContexts: CommandDefinition[js.Array[String]] = js.native
  var lockDevice: CommandDefinition[Unit] = js.native
  var openDeviceNotifications: CommandDefinition[Unit] = js.native
  var pullFileFromDevice: CommandDefinition[String] = js.native
  var pullFolderFromDevice: CommandDefinition[js.Any] = js.native
  var pushFileToDevice: CommandDefinition[Unit] = js.native
  var removeApp: CommandDefinition[Unit] = js.native
  var resetApp: CommandDefinition[Unit] = js.native
  var rotationGesture: CommandDefinition[js.Object] = js.native
  var selectContext: CommandDefinition[Unit] = js.native
  var sendAppToBackground: CommandDefinition[Unit] = js.native
  var sendChromiumCommand: CommandDefinition[Unit] = js.native
  var sendChromiumCommandAndGetResult: CommandDefinition[js.Object] = js.native
  var setAppiumSettings: CommandDefinition[Unit] = js.native
  var setGeolocation: CommandDefinition[Unit] = js.native
  var setNetworkConnection: CommandDefinition[Unit] = js.native
  var setScreenOrientation: CommandDefinition[Unit] = js.native
  var shakeDevice: CommandDefinition[Unit] = js.native
  var startDeviceActivity: CommandDefinition[Unit] = js.native
  var switchToParentFrame: CommandDefinition[Unit] = js.native
  var toggleAirplaneMode: CommandDefinition[Unit] = js.native
  var toggleData: CommandDefinition[Unit] = js.native
  var toggleLocationServices: CommandDefinition[Unit] = js.native
  var toggleWiFi: CommandDefinition[Unit] = js.native
  var unlockDevice: CommandDefinition[Unit] = js.native
  var uploadFile: CommandDefinition[Unit] = js.native
}

