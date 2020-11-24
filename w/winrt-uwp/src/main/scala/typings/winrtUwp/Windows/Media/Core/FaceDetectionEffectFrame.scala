package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video frame that includes a list of faces detected by the FaceDetectionEffect . */
@js.native
trait FaceDetectionEffectFrame extends js.Object {
  
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  
  /** Gets the list of objects representing the faces detected in the frame. */
  var detectedFaces: IVectorView[DetectedFace] = js.native
  
  /** Gets or sets the duration of the face detection effect frame. */
  var duration: Double = js.native
  
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
  
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  
  /** Gets a value indicating whether the frame is read-only. */
  var isReadOnly: Boolean = js.native
  
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double = js.native
  
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  
  /** Gets a string indicating the type of data the frame contains. */
  var `type`: String = js.native
}
object FaceDetectionEffectFrame {
  
  @scala.inline
  def apply(
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
  implicit class FaceDetectionEffectFrameOps[Self <: FaceDetectionEffectFrame] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetectedFaces(value: IVectorView[DetectedFace]): Self = this.set("detectedFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedProperties(value: IPropertySet): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDiscontinuous(value: Boolean): Self = this.set("isDiscontinuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeTime(value: Double): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemRelativeTime(value: Double): Self = this.set("systemRelativeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
