package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DRMAgent extends StObject {
  
  /**
    * Returns a client ID of DRM.
    */
  def getClientId(): String = js.native
  
  /**
    * Returns a DRM type to be set.
    */
  def getDrmType(): DrmType = js.native
  
  /**
    * Returns an error code from the DRM service.
    */
  def getErrorCode(): Double = js.native
  
  /**
    * Returns a text represented by an error from the DRM service.
    */
  def getErrorText(): String = js.native
  
  /**
    * Returns error information when an error of the DRM license occurs during content playback.
    * This method is supported in the following DRM type only:
    * - PlayReady
    */
  def getRightsError(params: GetRightsErrorParameters): Unit = js.native
  
  /**
    * Checks whether a DRM client that corresponds to given application ID exists.
    */
  def isLoaded(params: IsLoadedParameters): Unit = js.native
  
  /**
    * Creates a client instance for a certain type of DRM.
    * The DRM type is specified when a DRM agent is created.
    */
  def load(params: LoadParameters): Unit = js.native
  
  /**
    * Sends a DRM message to a DRM service.
    * After receiving the message, the DRM service starts to parse the message and perform the DRM operation.
    */
  def sendDrmMessage(): Unit = js.native
  def sendDrmMessage(params: SendDrmMessageParameters): Unit = js.native
  
  /**
    * Removes a DRM client instance and deallocates relevant resources.
    */
  def unload(params: UnloadParameters): Unit = js.native
}
