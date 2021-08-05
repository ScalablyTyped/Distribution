package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/browser_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nextFrame(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextFrame")().asInstanceOf[js.Promise[Unit]]
}
