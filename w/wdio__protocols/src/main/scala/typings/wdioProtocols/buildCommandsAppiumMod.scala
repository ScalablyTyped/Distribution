package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.ProtocolCommandResponse
import typings.wdioProtocols.buildTypesMod.SettingsReturn
import typings.wdioProtocols.buildTypesMod.StringsReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsAppiumMod {
  
  @js.native
  trait AppiumCommands extends StObject {
    
    /**
      * Appium Protocol Command
      *
      * Activate the given app onto the device
      * @ref http://appium.io/docs/en/commands/device/app/activate-app/
      *
      */
    def activateApp(appId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Send the currently running app for this session to the background. iOS tests with XCUITest can also use the `mobile: terminateApp` method to terminate the current app (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-terminateapp)), and the `mobile: activateApp` to activate an existing application on the device under test and moves it to the foreground (see detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-activateapp)).
      * @ref http://appium.io/docs/en/commands/device/app/background-app/
      *
      */
    def background(): Unit = js.native
    def background(seconds: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Close an app on device.
      * @ref http://appium.io/docs/en/commands/device/app/close-app/
      *
      */
    def closeApp(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Performs images comparison using OpenCV framework features. It is expected that both OpenCV framework and opencv4nodejs module are installed on the machine where Appium server is running.
      * @ref http://appium.io/docs/en/writing-running-appium/image-comparison/
      *
      */
    def compareImages(mode: String, firstImage: String, secondImage: String, options: js.Object): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * This command allows you to define a webdriverio script in a string and send it to the Appium server to be executed locally to the server itself, thus reducing latency that might otherwise occur along with each command.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/execute-driver.md
      *
      */
    def driverScript(script: String): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: String): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: String, timeout: Double): ProtocolCommandResponse = js.native
    def driverScript(script: String, `type`: Unit, timeout: Double): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get test coverage data.
      * @ref http://appium.io/docs/en/commands/device/app/end-test-coverage/
      *
      */
    def endCoverage(intent: String, path: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Authenticate users by using their finger print scans on supported emulators.
      * @ref http://appium.io/docs/en/commands/device/authentication/finger-print/
      *
      */
    def fingerPrint(fingerprintId: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the content of the system clipboard
      * @ref http://appium.io/docs/en/commands/device/clipboard/get-clipboard/
      *
      */
    def getClipboard(): String = js.native
    def getClipboard(contentType: String): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the name of the current Android activity.
      * @ref http://appium.io/docs/en/commands/device/activity/current-activity/
      *
      */
    def getCurrentActivity(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the name of the current Android package.
      * @ref http://appium.io/docs/en/commands/device/activity/current-package/
      *
      */
    def getCurrentPackage(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the time on the device.
      * @ref http://appium.io/docs/en/commands/device/system/system-time/
      *
      */
    def getDeviceTime(): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get display density from device.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def getDisplayDensity(): Any = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get events stored in appium server.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/events/get-events.md
      *
      */
    def getEvents(`type`: js.Array[String]): ProtocolCommandResponse = js.native
    
    /**
      * Appium Protocol Command
      *
      * Returns the information of the system state which is supported to read as like cpu, memory, network traffic, and battery.
      * @ref http://appium.io/docs/en/commands/device/performance-data/get-performance-data/
      *
      */
    def getPerformanceData(packageName: String, dataType: String): js.Array[String] = js.native
    def getPerformanceData(packageName: String, dataType: String, dataReadTimeout: Double): js.Array[String] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Returns the information types of the system state which is supported to read as like cpu, memory, network traffic, and battery.
      * @ref http://appium.io/docs/en/commands/device/performance-data/performance-data-types/
      *
      */
    def getPerformanceDataTypes(): js.Array[String] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve the current settings on the device.
      * @ref http://appium.io/docs/en/commands/session/settings/get-settings/
      *
      */
    def getSettings(): SettingsReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get app strings.
      * @ref http://appium.io/docs/en/commands/device/app/get-app-strings/
      *
      */
    def getStrings(): StringsReturn = js.native
    def getStrings(language: String): StringsReturn = js.native
    def getStrings(language: String, stringFile: String): StringsReturn = js.native
    def getStrings(language: Unit, stringFile: String): StringsReturn = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve visibility and bounds information of the status and navigation bars.
      * @ref http://appium.io/docs/en/commands/device/system/system-bars/
      *
      */
    def getSystemBars(): js.Array[js.Object] = js.native
    
    /**
      * Appium Protocol Command
      *
      * Make GSM call (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-call/
      *
      */
    def gsmCall(phoneNumber: String, action: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set GSM signal strength (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-signal/
      *
      */
    def gsmSignal(signalStrength: String): Unit = js.native
    def gsmSignal(signalStrength: String, signalStrengh: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set GSM voice state (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/gsm-voice/
      *
      */
    def gsmVoice(state: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Hide soft keyboard.
      * @ref http://appium.io/docs/en/commands/device/keys/hide-keyboard/
      *
      */
    def hideKeyboard(): Unit = js.native
    def hideKeyboard(strategy: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: String, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: String, key: Unit, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: String, keyCode: Unit, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: String, keyName: String): Unit = js.native
    def hideKeyboard(strategy: Unit, key: Unit, keyCode: Unit, keyName: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Install the given app onto the device.
      * @ref http://appium.io/docs/en/commands/device/app/install-app/
      *
      */
    def installApp(appPath: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Check whether the specified app is installed on the device.
      * @ref http://appium.io/docs/en/commands/device/app/is-app-installed/
      *
      */
    def isAppInstalled(appId: String): Boolean = js.native
    
    /**
      * Appium Protocol Command
      *
      * Whether or not the soft keyboard is shown.
      * @ref http://appium.io/docs/en/commands/device/keys/is-keyboard-shown/
      *
      */
    def isKeyboardShown(): Boolean = js.native
    
    /**
      * Appium Protocol Command
      *
      * Check whether the device is locked or not.
      * @ref http://appium.io/docs/en/commands/device/interactions/is-locked/
      *
      */
    def isLocked(): Boolean = js.native
    
    /**
      * Appium Protocol Command
      *
      * Launch an app on device. iOS tests with XCUITest can also use the `mobile: launchApp` method. See detailed [documentation](http://appium.io/docs/en/writing-running-appium/ios/ios-xctest-mobile-apps-management/index.html#mobile-launchapp).
      * @ref http://appium.io/docs/en/commands/device/app/launch-app/
      *
      */
    def launchApp(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Lock the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/lock/
      *
      */
    def lock(): Unit = js.native
    def lock(seconds: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Store a custom event.
      * @ref https://github.com/appium/appium/blob/master/docs/en/commands/session/events/log-event.md
      *
      */
    def logEvent(vendor: String, event: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Press and hold a particular key code on the device.
      * @ref http://appium.io/docs/en/commands/device/keys/long-press-keycode/
      *
      */
    def longPressKeyCode(keycode: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
    def longPressKeyCode(keycode: Double, metastate: Unit, flags: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * This functionality is only available from within a native context. Perform a multi touch action sequence.
      * @ref http://appium.io/docs/en/commands/interactions/touch/multi-touch-perform/
      *
      */
    def multiTouchPerform(actions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Open Android notifications (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/system/open-notifications/
      *
      */
    def openNotifications(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the state of the battery charger to connected or not (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/emulator/power_ac/
      *
      */
    def powerAC(state: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the battery percentage (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/emulator/power_capacity/
      *
      */
    def powerCapacity(percent: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Press a particular key on the device.
      * @ref http://appium.io/docs/en/commands/device/keys/press-keycode/
      *
      */
    def pressKeyCode(keycode: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Double, flags: Double): Unit = js.native
    def pressKeyCode(keycode: Double, metastate: Unit, flags: Double): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve a file from the device's file system.
      * @ref http://appium.io/docs/en/commands/device/files/pull-file/
      *
      */
    def pullFile(path: String): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Retrieve a folder from the device's file system.
      * @ref http://appium.io/docs/en/commands/device/files/pull-folder/
      *
      */
    def pullFolder(path: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Place a file onto the device in a particular place.
      * @ref http://appium.io/docs/en/commands/device/files/push-file/
      *
      */
    def pushFile(path: String, data: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Get the given app status on the device
      * @ref http://appium.io/docs/en/commands/device/app/app-state/
      *
      */
    def queryAppState(appId: String): Double = js.native
    
    /**
      * Appium Protocol Command
      *
      * Callback url for asynchronous execution of JavaScript.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def receiveAsyncResponse(response: js.Object): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Remove an app from the device.
      * @ref http://appium.io/docs/en/commands/device/app/remove-app/
      *
      */
    def removeApp(appId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Replace the value to element directly.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def replaceValue(elementId: String, value: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * <b>Deprecated</b> This command will be removed with the upcoming major version release.
      * @ref http://appium.io/docs/en/commands/device/app/reset-app/
      *
      */
    def reset(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Rotate the device in three dimensions.
      * @ref http://appium.io/docs/en/commands/device/interactions/rotate/
      *
      */
    def rotateDevice(x: Double, y: Double, radius: Double, rotation: Double, touchCount: Double, duration: Double): Unit = js.native
    def rotateDevice(
      x: Double,
      y: Double,
      radius: Double,
      rotation: Double,
      touchCount: Double,
      duration: Double,
      element: String
    ): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Send a key code to the device.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def sendKeyEvent(keycode: String): Unit = js.native
    def sendKeyEvent(keycode: String, metastate: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Simulate an SMS message (Emulator only).
      * @ref http://appium.io/docs/en/commands/device/network/send-sms/
      *
      */
    def sendSms(phoneNumber: String, message: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set the content of the system clipboard
      * @ref http://appium.io/docs/en/commands/device/clipboard/set-clipboard/
      *
      */
    def setClipboard(content: String): String = js.native
    def setClipboard(content: String, contentType: String): String = js.native
    def setClipboard(content: String, contentType: String, label: String): String = js.native
    def setClipboard(content: String, contentType: Unit, label: String): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#appium-extension-endpoints
      *
      */
    def setValueImmediate(elementId: String, value: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Perform a shake action on the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/shake/
      *
      */
    def shake(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Start an Android activity by providing package name and activity name.
      * @ref http://appium.io/docs/en/commands/device/activity/start-activity/
      *
      */
    def startActivity(
      appPackage: String,
      appActivity: String,
      appWaitPackage: js.UndefOr[String],
      appWaitActivity: js.UndefOr[String],
      intentAction: js.UndefOr[String],
      intentCategory: js.UndefOr[String],
      intentFlags: js.UndefOr[String],
      optionalIntentArguments: js.UndefOr[String],
      dontStopAppOnReset: js.UndefOr[String]
    ): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Start recording the screen.
      * @ref http://appium.io/docs/en/commands/device/recording-screen/start-recording-screen/
      *
      */
    def startRecordingScreen(): Unit = js.native
    def startRecordingScreen(options: js.Object): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Stop recording screen
      * @ref http://appium.io/docs/en/commands/device/recording-screen/stop-recording-screen/
      *
      */
    def stopRecordingScreen(): String = js.native
    def stopRecordingScreen(remotePath: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: String, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: String, username: Unit, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: String, password: Unit, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: String, method: String): String = js.native
    def stopRecordingScreen(remotePath: Unit, username: Unit, password: Unit, method: String): String = js.native
    
    /**
      * Appium Protocol Command
      *
      * Terminate the given app on the device
      * @ref http://appium.io/docs/en/commands/device/app/terminate-app/
      *
      */
    def terminateApp(appId: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Toggle airplane mode on device.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-airplane-mode/
      *
      */
    def toggleAirplaneMode(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of data service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-data/
      *
      */
    def toggleData(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Toggle the simulator being [enrolled](https://support.apple.com/en-ca/ht201371) to accept touchId (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true. When `allowTouchIdEnroll` is set to true the Simulator will be enrolled by default, and the 'Toggle Touch ID Enrollment' changes the enrollment state. This call will only work if the Appium process or its parent application (e.g., Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
      * @ref http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/
      *
      */
    def toggleEnrollTouchId(): Unit = js.native
    def toggleEnrollTouchId(enabled: Boolean): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of the location service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-location-services/
      *
      */
    def toggleLocationServices(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Set network speed (Emulator only)
      * @ref http://appium.io/docs/en/commands/device/network/network-speed/
      *
      */
    def toggleNetworkSpeed(netspeed: String): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Switch the state of the wifi service.
      * @ref http://appium.io/docs/en/commands/device/network/toggle-wifi/
      *
      */
    def toggleWiFi(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Simulate a [touch id](https://support.apple.com/en-ca/ht201371) event (iOS Simulator only). To enable this feature, the `allowTouchIdEnroll` desired capability must be set to true and the Simulator must be [enrolled](https://support.apple.com/en-ca/ht201371). When you set allowTouchIdEnroll to true, it will set the Simulator to be enrolled by default. The enrollment state can be [toggled](http://appium.io/docs/en/commands/device/simulator/toggle-touch-id-enrollment/index.html). This call will only work if Appium process or its parent application (e.g. Terminal.app or Appium.app) has access to Mac OS accessibility in System Preferences > Security & Privacy > Privacy > Accessibility list.
      * @ref http://appium.io/docs/en/commands/device/simulator/touch-id/
      *
      */
    def touchId(`match`: Boolean): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * This functionality is only available from within a native context. 'Touch Perform' works similarly to the other singular touch interactions, except that this allows you to chain together more than one touch action as one command. This is useful because Appium commands are sent over the network and there's latency between commands. This latency can make certain touch interactions impossible because some interactions need to be performed in one sequence. Vertical, for example, requires pressing down, moving to a different y coordinate, and then releasing. For it to work, there can't be a delay between the interactions.
      * @ref http://appium.io/docs/en/commands/interactions/touch/touch-perform/
      *
      * @example
      * ```js
      * // do a horizontal swipe by percentage
      * const startPercentage = 10;
      * const endPercentage = 90;
      * const anchorPercentage = 50;
      *
      * const { width, height } = driver.getWindowSize();
      * const anchor = height// anchorPercentage / 100;
      * const startPoint = width// startPercentage / 100;
      * const endPoint = width// endPercentage / 100;
      * driver.touchPerform([
      *   {
      *     action: 'press',
      *     options: {
      *       x: startPoint,
      *       y: anchor,
      *     },
      *   },
      *   {
      *     action: 'wait',
      *     options: {
      *       ms: 100,
      *     },
      *   },
      *   {
      *     action: 'moveTo',
      *     options: {
      *       x: endPoint,
      *       y: anchor,
      *     },
      *   },
      *   {
      *     action: 'release',
      *     options: {},
      *   },
      * ]);
      * ```
      */
    def touchPerform(actions: js.Array[js.Object]): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Unlock the device.
      * @ref http://appium.io/docs/en/commands/device/interactions/unlock/
      *
      */
    def unlock(): Unit = js.native
    
    /**
      * Appium Protocol Command
      *
      * Update the current setting on the device.
      * @ref http://appium.io/docs/en/commands/session/settings/update-settings/
      *
      */
    def updateSettings(settings: js.Object): Unit = js.native
  }
}
