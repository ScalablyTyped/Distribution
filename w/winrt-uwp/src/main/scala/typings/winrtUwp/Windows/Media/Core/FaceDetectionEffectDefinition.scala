package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a face detection video effect. */
trait FaceDetectionEffectDefinition extends js.Object {
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  var activatableClassId: String
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  var detectionMode: FaceDetectionMode
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  var properties: IPropertySet
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  var synchronousDetectionEnabled: Boolean
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
}

