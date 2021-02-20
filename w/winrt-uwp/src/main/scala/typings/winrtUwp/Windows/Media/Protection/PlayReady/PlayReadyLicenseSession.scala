package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.MediaProtectionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a media session and binds license acquisition to that media session. */
@js.native
trait PlayReadyLicenseSession extends StObject {
  
  /**
    * Updates the media protection manger with the appropriate settings so the media foundation can be used for playback.
    * @param mpm The media protection manager to be updated.
    */
  def configureMediaProtectionManager(mpm: MediaProtectionManager): Unit = js.native
  
  /**
    * Creates a license acquisition service request whose license will be tied to the media session.
    * @return The license acquisition service request.
    */
  def createLAServiceRequest(): IPlayReadyLicenseAcquisitionServiceRequest = js.native
}
object PlayReadyLicenseSession {
  
  @scala.inline
  def apply(
    configureMediaProtectionManager: MediaProtectionManager => Unit,
    createLAServiceRequest: () => IPlayReadyLicenseAcquisitionServiceRequest
  ): PlayReadyLicenseSession = {
    val __obj = js.Dynamic.literal(configureMediaProtectionManager = js.Any.fromFunction1(configureMediaProtectionManager), createLAServiceRequest = js.Any.fromFunction0(createLAServiceRequest))
    __obj.asInstanceOf[PlayReadyLicenseSession]
  }
  
  @scala.inline
  implicit class PlayReadyLicenseSessionMutableBuilder[Self <: PlayReadyLicenseSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigureMediaProtectionManager(value: MediaProtectionManager => Unit): Self = StObject.set(x, "configureMediaProtectionManager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLAServiceRequest(value: () => IPlayReadyLicenseAcquisitionServiceRequest): Self = StObject.set(x, "createLAServiceRequest", js.Any.fromFunction0(value))
  }
}
