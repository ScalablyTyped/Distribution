package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Media.Protection.MediaProtectionManager
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyLicenseAcquisitionServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a media session and binds license acquisition to that media session. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseSession")
@js.native
class PlayReadyLicenseSession protected ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseSession {
  /**
    * Initializes a new instance of the PlayReadyLicenseSession class.
    * @param configuration The configuration data for the license session.
    */
  def this(configuration: IPropertySet) = this()
  /**
    * Updates the media protection manger with the appropriate settings so the media foundation can be used for playback.
    * @param mpm The media protection manager to be updated.
    */
  /* CompleteClass */
  override def configureMediaProtectionManager(mpm: MediaProtectionManager): Unit = js.native
  /**
    * Creates a license acquisition service request whose license will be tied to the media session.
    * @return The license acquisition service request.
    */
  /* CompleteClass */
  override def createLAServiceRequest(): IPlayReadyLicenseAcquisitionServiceRequest = js.native
}

