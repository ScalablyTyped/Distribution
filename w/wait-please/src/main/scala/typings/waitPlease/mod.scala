package typings.waitPlease

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wait-please", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frame(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("frame")().asInstanceOf[js.Promise[Unit]]
  inline def frame(n: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("frame")(n.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def idle(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("idle")().asInstanceOf[js.Promise[Unit]]
  inline def idle(n: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("idle")(n.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def tick(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")().asInstanceOf[js.Promise[Unit]]
  inline def tick(n: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("tick")(n.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def time(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[js.Promise[Unit]]
  inline def time(n: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(n.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
