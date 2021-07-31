package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a face detection video effect. */
@JSGlobal("Windows.Media.Core.FaceDetectionEffectDefinition")
@js.native
/** Initializes a new instance of the FaceDetectionEffectDefinition class. */
class FaceDetectionEffectDefinition ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.FaceDetectionEffectDefinition {
  
  /** Gets a string containing the activatable class ID of the face detection effect definition. */
  /* CompleteClass */
  var activatableClassId: String = js.native
  
  /** Gets or sets a value that prioritizes the speed of face detection and the quality of detection results. */
  /* CompleteClass */
  var detectionMode: typings.winrtUwp.Windows.Media.Core.FaceDetectionMode = js.native
  
  /** Gets the set of properties for configuring the FaceDetectionEffectDefinition object. */
  /* CompleteClass */
  var properties: IPropertySet = js.native
  
  /** Gets or sets a value indicating whether synchronous face detection is enabled. */
  /* CompleteClass */
  var synchronousDetectionEnabled: Boolean = js.native
}
