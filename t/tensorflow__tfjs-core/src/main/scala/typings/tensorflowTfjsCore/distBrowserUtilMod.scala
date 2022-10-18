package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/browser_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a promise that resolves when a requestAnimationFrame has completed.
    *
    * On Node.js this uses setImmediate instead of requestAnimationFrame.
    *
    * This is simply a sugar method so that users can do the following:
    * `await tf.nextFrame();`
    *
    * @doc {heading: 'Performance', subheading: 'Timing'}
    */
  inline def nextFrame(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextFrame")().asInstanceOf[js.Promise[Unit]]
}
