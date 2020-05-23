package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
@JSGlobal("Windows.Media.Core.MediaStreamSampleProtectionProperties")
@js.native
abstract class MediaStreamSampleProtectionProperties ()
  extends typings.winrtUwp.Windows.Media.Core.MediaStreamSampleProtectionProperties {
  /**
    * Gets the Digital Rights Management (DRM) initialization vector from the MediaStreamSample .
    * @return The initialization vector.
    */
  /* CompleteClass */
  override def getInitializationVector(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) key identifier from the MediaStreamSample .
    * @return Receives the key identifier used to decrypt the data.
    */
  /* CompleteClass */
  override def getKeyIdentifier(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) sub-sample mapping from the MediaStreamSample .
    * @return Receives the sub-sample mapping.
    */
  /* CompleteClass */
  override def getSubSampleMapping(): js.Array[Double] = js.native
  /**
    * Sets the Digital Rights Management (DRM) initialization vector for the MediaStreamSample .
    * @param value The value to set the DRM initialization vector to.
    */
  /* CompleteClass */
  override def setInitializationVector(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) key identifier for the MediaStreamSample .
    * @param value The value to set the DRM key identifier to.
    */
  /* CompleteClass */
  override def setKeyIdentifier(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) sub-sample mapping for the MediaStreamSample .
    * @param value The value to set the DRM sub-sample mapping to.
    */
  /* CompleteClass */
  override def setSubSampleMapping(value: js.Array[Double]): Unit = js.native
}

