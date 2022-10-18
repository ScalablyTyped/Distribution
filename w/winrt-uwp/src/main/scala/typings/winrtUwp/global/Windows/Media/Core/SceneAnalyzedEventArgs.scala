package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.SceneAnalyzedEventArgs")
@js.native
open class SceneAnalyzedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.SceneAnalyzedEventArgs {
  
  /** Gets the result frame from the scene analysis operation. */
  /* CompleteClass */
  var resultFrame: typings.winrtUwp.Windows.Media.Core.SceneAnalysisEffectFrame = js.native
}
