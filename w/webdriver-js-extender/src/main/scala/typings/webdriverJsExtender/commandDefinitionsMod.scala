package typings.webdriverJsExtender

import org.scalablytyped.runtime.StringDictionary
import typings.webdriverJsExtender.anon.Altitude
import typings.webdriverJsExtender.commandDefinitionMod.CommandDefinition
import typings.webdriverJsExtender.webdriverJsExtenderStrings.LANDSCAPE
import typings.webdriverJsExtender.webdriverJsExtenderStrings.PORTRAIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandDefinitionsMod {
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "closeApp")
  @js.native
  def closeApp: CommandDefinition[Unit] = js.native
  inline def closeApp_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeApp")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "fullscreen")
  @js.native
  def fullscreen: CommandDefinition[Unit] = js.native
  inline def fullscreen_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getAppStrings")
  @js.native
  def getAppStrings: CommandDefinition[js.Array[String]] = js.native
  inline def getAppStrings_=(x: CommandDefinition[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAppStrings")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getAppiumSettings")
  @js.native
  def getAppiumSettings: CommandDefinition[StringDictionary[js.Any]] = js.native
  inline def getAppiumSettings_=(x: CommandDefinition[StringDictionary[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAppiumSettings")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getCurrentContext")
  @js.native
  def getCurrentContext: CommandDefinition[String] = js.native
  inline def getCurrentContext_=(x: CommandDefinition[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCurrentContext")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getCurrentDeviceActivity")
  @js.native
  def getCurrentDeviceActivity: CommandDefinition[String] = js.native
  inline def getCurrentDeviceActivity_=(x: CommandDefinition[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDeviceActivity")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getDeviceTime")
  @js.native
  def getDeviceTime: CommandDefinition[String] = js.native
  inline def getDeviceTime_=(x: CommandDefinition[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDeviceTime")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getGeolocation")
  @js.native
  def getGeolocation: CommandDefinition[Altitude] = js.native
  inline def getGeolocation_=(x: CommandDefinition[Altitude]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getGeolocation")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getNetworkConnection")
  @js.native
  def getNetworkConnection: CommandDefinition[Double] = js.native
  inline def getNetworkConnection_=(x: CommandDefinition[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNetworkConnection")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "getScreenOrientation")
  @js.native
  def getScreenOrientation: CommandDefinition[LANDSCAPE | PORTRAIT] = js.native
  inline def getScreenOrientation_=(x: CommandDefinition[LANDSCAPE | PORTRAIT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getScreenOrientation")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "hideSoftKeyboard")
  @js.native
  def hideSoftKeyboard: CommandDefinition[Unit] = js.native
  inline def hideSoftKeyboard_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideSoftKeyboard")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "installApp")
  @js.native
  def installApp: CommandDefinition[Unit] = js.native
  inline def installApp_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installApp")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "isAppInstalled")
  @js.native
  def isAppInstalled: CommandDefinition[Boolean] = js.native
  inline def isAppInstalled_=(x: CommandDefinition[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAppInstalled")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "isDeviceLocked")
  @js.native
  def isDeviceLocked: CommandDefinition[Boolean] = js.native
  inline def isDeviceLocked_=(x: CommandDefinition[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDeviceLocked")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "launchSession")
  @js.native
  def launchSession: CommandDefinition[Unit] = js.native
  inline def launchSession_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("launchSession")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "listContexts")
  @js.native
  def listContexts: CommandDefinition[js.Array[String]] = js.native
  inline def listContexts_=(x: CommandDefinition[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listContexts")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "lockDevice")
  @js.native
  def lockDevice: CommandDefinition[Unit] = js.native
  inline def lockDevice_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "openDeviceNotifications")
  @js.native
  def openDeviceNotifications: CommandDefinition[Unit] = js.native
  inline def openDeviceNotifications_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDeviceNotifications")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "pullFileFromDevice")
  @js.native
  def pullFileFromDevice: CommandDefinition[String] = js.native
  inline def pullFileFromDevice_=(x: CommandDefinition[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pullFileFromDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "pullFolderFromDevice")
  @js.native
  def pullFolderFromDevice: CommandDefinition[js.Any] = js.native
  inline def pullFolderFromDevice_=(x: CommandDefinition[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pullFolderFromDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "pushFileToDevice")
  @js.native
  def pushFileToDevice: CommandDefinition[Unit] = js.native
  inline def pushFileToDevice_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pushFileToDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "removeApp")
  @js.native
  def removeApp: CommandDefinition[Unit] = js.native
  inline def removeApp_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeApp")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "resetApp")
  @js.native
  def resetApp: CommandDefinition[Unit] = js.native
  inline def resetApp_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetApp")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "rotationGesture")
  @js.native
  def rotationGesture: CommandDefinition[js.Object] = js.native
  inline def rotationGesture_=(x: CommandDefinition[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotationGesture")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "selectContext")
  @js.native
  def selectContext: CommandDefinition[Unit] = js.native
  inline def selectContext_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectContext")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "sendAppToBackground")
  @js.native
  def sendAppToBackground: CommandDefinition[Unit] = js.native
  inline def sendAppToBackground_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendAppToBackground")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "sendChromiumCommand")
  @js.native
  def sendChromiumCommand: CommandDefinition[Unit] = js.native
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "sendChromiumCommandAndGetResult")
  @js.native
  def sendChromiumCommandAndGetResult: CommandDefinition[js.Object] = js.native
  inline def sendChromiumCommandAndGetResult_=(x: CommandDefinition[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendChromiumCommandAndGetResult")(x.asInstanceOf[js.Any])
  
  inline def sendChromiumCommand_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendChromiumCommand")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "setAppiumSettings")
  @js.native
  def setAppiumSettings: CommandDefinition[Unit] = js.native
  inline def setAppiumSettings_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setAppiumSettings")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "setGeolocation")
  @js.native
  def setGeolocation: CommandDefinition[Unit] = js.native
  inline def setGeolocation_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setGeolocation")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "setNetworkConnection")
  @js.native
  def setNetworkConnection: CommandDefinition[Unit] = js.native
  inline def setNetworkConnection_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setNetworkConnection")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "setScreenOrientation")
  @js.native
  def setScreenOrientation: CommandDefinition[Unit] = js.native
  inline def setScreenOrientation_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setScreenOrientation")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "shakeDevice")
  @js.native
  def shakeDevice: CommandDefinition[Unit] = js.native
  inline def shakeDevice_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shakeDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "startDeviceActivity")
  @js.native
  def startDeviceActivity: CommandDefinition[Unit] = js.native
  inline def startDeviceActivity_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startDeviceActivity")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "switchToParentFrame")
  @js.native
  def switchToParentFrame: CommandDefinition[Unit] = js.native
  inline def switchToParentFrame_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("switchToParentFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "toggleAirplaneMode")
  @js.native
  def toggleAirplaneMode: CommandDefinition[Unit] = js.native
  inline def toggleAirplaneMode_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleAirplaneMode")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "toggleData")
  @js.native
  def toggleData: CommandDefinition[Unit] = js.native
  inline def toggleData_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleData")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "toggleLocationServices")
  @js.native
  def toggleLocationServices: CommandDefinition[Unit] = js.native
  inline def toggleLocationServices_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleLocationServices")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "toggleWiFi")
  @js.native
  def toggleWiFi: CommandDefinition[Unit] = js.native
  inline def toggleWiFi_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleWiFi")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "unlockDevice")
  @js.native
  def unlockDevice: CommandDefinition[Unit] = js.native
  inline def unlockDevice_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unlockDevice")(x.asInstanceOf[js.Any])
  
  @JSImport("webdriver-js-extender/built/lib/command_definitions", "uploadFile")
  @js.native
  def uploadFile: CommandDefinition[Unit] = js.native
  inline def uploadFile_=(x: CommandDefinition[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uploadFile")(x.asInstanceOf[js.Any])
}
