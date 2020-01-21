package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
@JSGlobal("Windows.Media.Core.MediaStreamSampleProtectionProperties")
@js.native
abstract class MediaStreamSampleProtectionProperties () extends js.Object {
  /**
    * Gets the Digital Rights Management (DRM) initialization vector from the MediaStreamSample .
    * @return The initialization vector.
    */
  def getInitializationVector(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) key identifier from the MediaStreamSample .
    * @return Receives the key identifier used to decrypt the data.
    */
  def getKeyIdentifier(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) sub-sample mapping from the MediaStreamSample .
    * @return Receives the sub-sample mapping.
    */
  def getSubSampleMapping(): js.Array[Double] = js.native
  /**
    * Sets the Digital Rights Management (DRM) initialization vector for the MediaStreamSample .
    * @param value The value to set the DRM initialization vector to.
    */
  def setInitializationVector(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) key identifier for the MediaStreamSample .
    * @param value The value to set the DRM key identifier to.
    */
  def setKeyIdentifier(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) sub-sample mapping for the MediaStreamSample .
    * @param value The value to set the DRM sub-sample mapping to.
    */
  def setSubSampleMapping(value: js.Array[Double]): Unit = js.native
}

