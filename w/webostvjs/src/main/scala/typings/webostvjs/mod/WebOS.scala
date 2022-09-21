package typings.webostvjs.mod

import typings.webostvjs.anon.IsShowing
import typings.webostvjs.anon.Request
import typings.webostvjs.anon.Tv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebOS extends StObject {
  
  /**
    * Returns the device-specific information regarding the TV model,
    * OS version, SDK version, screen size, and resolution
    *
    * @returns JSON object containing the device information details
    */
  def deviceInfo(callback: js.Function1[/* deviceInfo */ DeviceInfo, Unit]): Unit = js.native
  
  /**
    * Returns an app ID of an app calling this method
    */
  def fetchAppId(): String = js.native
  
  /**
    * Returns the appinfo.json data of the caller app with a saved cache
    *
    * @param path An optional relative file path to read appinfo.json.
    * The file name (appinfo.json) must be included in the file path
    * - If your app is packaged into an IPK file, get the path using `fetchAppRootPath` method
    * - If your app is hosted by a server, the path will be the URL of the server
    * @returns The JSON object read from the app's appinfo.json file. If it is not found, undefined is returned.
    */
  def fetchAppInfo(): Unit = js.native
  def fetchAppInfo(callback: js.Function1[/* appInfo */ js.UndefOr[AppInfo], Unit]): Unit = js.native
  def fetchAppInfo(callback: js.Function1[/* appInfo */ js.UndefOr[AppInfo], Unit], path: String): Unit = js.native
  def fetchAppInfo(callback: Unit, path: String): Unit = js.native
  
  /**
    * Returns the full URI path of the caller app
    *
    * @returns The app's URI path where the app is located
    */
  def fetchAppRootPath(): String = js.native
  
  val keyboard: IsShowing = js.native
  
  /**
    * A member representing the build version of the webOSTV.js library
    */
  val libVersion: String = js.native
  
  /**
    * A member representing the platform identification of webOS variants
    */
  val platform: Tv = js.native
  
  /**
    * Emulates the back key of the remote controller to move backward 1 level
    */
  def platformBack(): Unit = js.native
  
  val service: Request = js.native
  
  /**
    * Returns the system-specific information regarding country, service country, and timezone
    */
  def systemInfo(): SystemInfo = js.native
}
