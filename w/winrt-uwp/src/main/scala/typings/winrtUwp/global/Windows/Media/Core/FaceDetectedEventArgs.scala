package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the FaceDetected event. */
@JSGlobal("Windows.Media.Core.FaceDetectedEventArgs")
@js.native
abstract class FaceDetectedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.FaceDetectedEventArgs {
  
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  /* CompleteClass */
  var resultFrame: typings.winrtUwp.Windows.Media.Core.FaceDetectionEffectFrame = js.native
}
