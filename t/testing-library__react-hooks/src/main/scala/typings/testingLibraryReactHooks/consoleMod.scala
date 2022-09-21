package typings.testingLibraryReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleMod {
  
  @JSImport("@testing-library/react-hooks/lib/core/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableErrorOutputSuppression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableErrorOutputSuppression")().asInstanceOf[Unit]
  
  inline def suppressErrorOutput(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrorOutput")().asInstanceOf[js.Function0[Unit]]
}
