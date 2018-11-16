package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a face detection video effect. */
@JSGlobal("Windows.Media.Core.FaceDetectionEffectDefinition")
@js.native
class FaceDetectionEffectDefinition () extends js.Object {
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  var activatableClassId: java.lang.String = js.native
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  var detectionMode: FaceDetectionMode = js.native
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  var synchronousDetectionEnabled: scala.Boolean = js.native
}

