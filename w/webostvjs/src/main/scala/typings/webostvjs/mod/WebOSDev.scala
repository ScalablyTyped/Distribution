package typings.webostvjs.mod

import typings.std.Record
import typings.webostvjs.anon.BROWSER
import typings.webostvjs.anon.Error
import typings.webostvjs.anon.GetStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebOSDev extends StObject {
  
  /**
    * A member representing the list of built-in apps on the webOS TV opened to external developers.
    */
  val APP: BROWSER
  
  /**
    * An object containing properties that represent the DRM error number and the DRM type.
    */
  val DRM: Error
  
  /**
    * Returns a device ID provided by the webOS TV since webOS TV 3.0.
    */
  def LGUDID(parameters: LGUDIDParameters): Unit
  
  val connection: GetStatus
  
  /**
    * Returns DRMAgent instance of a specific DRM type.
    * @param type The DRM type to be set to the DRMAgent instance.
    * The value of the DRM type must be taken from `DRM.Type` field (`DRM.Type.PLAYREADY` or `DRM.Type.WIDEVINE`)
    *
    * @example
    * const drmAgent = webOSDevPromised.drmAgent(webOSDevPromised.DRM.Type.PLAYREADY);
    */
  def drmAgent(`type`: DrmType): DRMAgent
  
  /**
    * Launches an application with parameters.
    * @param parameters The JSON object containing an app ID, parameters
    */
  def launch(parameters: LaunchParameters): Unit
  
  /**
    * Passes parameters of an app launched by the webOSDev.launch method.
    */
  def launchParams(): Record[String, Any]
}
object WebOSDev {
  
  inline def apply(
    APP: BROWSER,
    DRM: Error,
    LGUDID: LGUDIDParameters => Unit,
    connection: GetStatus,
    drmAgent: DrmType => DRMAgent,
    launch: LaunchParameters => Unit,
    launchParams: () => Record[String, Any]
  ): WebOSDev = {
    val __obj = js.Dynamic.literal(APP = APP.asInstanceOf[js.Any], DRM = DRM.asInstanceOf[js.Any], LGUDID = js.Any.fromFunction1(LGUDID), connection = connection.asInstanceOf[js.Any], drmAgent = js.Any.fromFunction1(drmAgent), launch = js.Any.fromFunction1(launch), launchParams = js.Any.fromFunction0(launchParams))
    __obj.asInstanceOf[WebOSDev]
  }
  
  extension [Self <: WebOSDev](x: Self) {
    
    inline def setAPP(value: BROWSER): Self = StObject.set(x, "APP", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: GetStatus): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setDRM(value: Error): Self = StObject.set(x, "DRM", value.asInstanceOf[js.Any])
    
    inline def setDrmAgent(value: DrmType => DRMAgent): Self = StObject.set(x, "drmAgent", js.Any.fromFunction1(value))
    
    inline def setLGUDID(value: LGUDIDParameters => Unit): Self = StObject.set(x, "LGUDID", js.Any.fromFunction1(value))
    
    inline def setLaunch(value: LaunchParameters => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
    
    inline def setLaunchParams(value: () => Record[String, Any]): Self = StObject.set(x, "launchParams", js.Any.fromFunction0(value))
  }
}
