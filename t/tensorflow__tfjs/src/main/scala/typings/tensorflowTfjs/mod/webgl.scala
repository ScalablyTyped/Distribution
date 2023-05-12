package typings.tensorflowTfjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgl {
  
  @JSImport("@tensorflow/tfjs", "webgl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forceHalfFloat(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceHalfFloat")().asInstanceOf[Unit]
  @JSImport("@tensorflow/tfjs", "webgl.forceHalfFloat")
  @js.native
  def forceHalfFloat_Fwebgl: js.Function0[Unit] = js.native
  
  inline def forceHalfFloat_Fwebgl_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceHalfFloat")(x.asInstanceOf[js.Any])
}
