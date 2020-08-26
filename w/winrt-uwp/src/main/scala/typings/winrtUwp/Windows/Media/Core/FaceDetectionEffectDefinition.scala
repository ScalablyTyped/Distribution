package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a face detection video effect. */
@js.native
trait FaceDetectionEffectDefinition extends js.Object {
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  var activatableClassId: String = js.native
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  var detectionMode: FaceDetectionMode = js.native
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  var properties: IPropertySet = js.native
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  var synchronousDetectionEnabled: Boolean = js.native
}

object FaceDetectionEffectDefinition {
  @scala.inline
  def apply(
    activatableClassId: String,
    detectionMode: FaceDetectionMode,
    properties: IPropertySet,
    synchronousDetectionEnabled: Boolean
  ): FaceDetectionEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], detectionMode = detectionMode.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], synchronousDetectionEnabled = synchronousDetectionEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectionEffectDefinition]
  }
  @scala.inline
  implicit class FaceDetectionEffectDefinitionOps[Self <: FaceDetectionEffectDefinition] (val x: Self) extends AnyVal {
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
    def setActivatableClassId(value: String): Self = this.set("activatableClassId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectionMode(value: FaceDetectionMode): Self = this.set("detectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSynchronousDetectionEnabled(value: Boolean): Self = this.set("synchronousDetectionEnabled", value.asInstanceOf[js.Any])
  }
  
}

