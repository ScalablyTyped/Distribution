package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a face detection video effect. */
@JSGlobal("Windows.Media.Core.FaceDetectionEffectDefinition")
@js.native
/** Initializes a new instance of the FaceDetectionEffectDefinition class. */
class FaceDetectionEffectDefinition () extends js.Object {
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  var activatableClassId: String = js.native
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  var detectionMode: FaceDetectionMode = js.native
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  var properties: IPropertySet = js.native
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  var synchronousDetectionEnabled: Boolean = js.native
}

