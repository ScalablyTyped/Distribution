package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.MediaProtectionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a media session and binds license acquisition to that media session. */
@js.native
trait PlayReadyLicenseSession extends js.Object {
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
  implicit class PlayReadyLicenseSessionOps[Self <: PlayReadyLicenseSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigureMediaProtectionManager(value: MediaProtectionManager => Unit): Self = this.set("configureMediaProtectionManager", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateLAServiceRequest(value: () => IPlayReadyLicenseAcquisitionServiceRequest): Self = this.set("createLAServiceRequest", js.Any.fromFunction0(value))
  }
  
}

