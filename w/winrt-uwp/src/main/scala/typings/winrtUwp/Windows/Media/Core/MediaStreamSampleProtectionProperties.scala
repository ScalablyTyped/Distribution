package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
@js.native
trait MediaStreamSampleProtectionProperties extends StObject {
  
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
object MediaStreamSampleProtectionProperties {
  
  @scala.inline
  def apply(
    getInitializationVector: () => js.Array[Double],
    getKeyIdentifier: () => js.Array[Double],
    getSubSampleMapping: () => js.Array[Double],
    setInitializationVector: js.Array[Double] => Unit,
    setKeyIdentifier: js.Array[Double] => Unit,
    setSubSampleMapping: js.Array[Double] => Unit
  ): MediaStreamSampleProtectionProperties = {
    val __obj = js.Dynamic.literal(getInitializationVector = js.Any.fromFunction0(getInitializationVector), getKeyIdentifier = js.Any.fromFunction0(getKeyIdentifier), getSubSampleMapping = js.Any.fromFunction0(getSubSampleMapping), setInitializationVector = js.Any.fromFunction1(setInitializationVector), setKeyIdentifier = js.Any.fromFunction1(setKeyIdentifier), setSubSampleMapping = js.Any.fromFunction1(setSubSampleMapping))
    __obj.asInstanceOf[MediaStreamSampleProtectionProperties]
  }
  
  @scala.inline
  implicit class MediaStreamSampleProtectionPropertiesMutableBuilder[Self <: MediaStreamSampleProtectionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitializationVector(value: () => js.Array[Double]): Self = StObject.set(x, "getInitializationVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyIdentifier(value: () => js.Array[Double]): Self = StObject.set(x, "getKeyIdentifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubSampleMapping(value: () => js.Array[Double]): Self = StObject.set(x, "getSubSampleMapping", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetInitializationVector(value: js.Array[Double] => Unit): Self = StObject.set(x, "setInitializationVector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKeyIdentifier(value: js.Array[Double] => Unit): Self = StObject.set(x, "setKeyIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubSampleMapping(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSubSampleMapping", js.Any.fromFunction1(value))
  }
}
