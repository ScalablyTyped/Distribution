package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video frame that includes a list of faces detected by the FaceDetectionEffect . */
trait FaceDetectionEffectFrame extends StObject {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /** Gets the list of objects representing the faces detected in the frame. */
  var detectedFaces: IVectorView[DetectedFace]
  
  /** Gets or sets the duration of the face detection effect frame. */
  var duration: Double
  
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet
  
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean
  
  /** Gets a value indicating whether the frame is read-only. */
  var isReadOnly: Boolean
  
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double
  
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double
  
  /** Gets a string indicating the type of data the frame contains. */
  var `type`: String
}
object FaceDetectionEffectFrame {
  
  inline def apply(
    close: () => Unit,
    detectedFaces: IVectorView[DetectedFace],
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    systemRelativeTime: Double,
    `type`: String
  ): FaceDetectionEffectFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detectedFaces = detectedFaces.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectionEffectFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceDetectionEffectFrame] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDetectedFaces(value: IVectorView[DetectedFace]): Self = StObject.set(x, "detectedFaces", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExtendedProperties(value: IPropertySet): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    inline def setIsDiscontinuous(value: Boolean): Self = StObject.set(x, "isDiscontinuous", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setSystemRelativeTime(value: Double): Self = StObject.set(x, "systemRelativeTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
