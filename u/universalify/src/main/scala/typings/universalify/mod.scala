package typings.universalify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("universalify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCallback(fn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Promise[js.Any] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[js.Any] | Unit]]
  
  inline def fromPromise(fn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Promise[js.Any] | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[js.Any] | Unit]]
}
