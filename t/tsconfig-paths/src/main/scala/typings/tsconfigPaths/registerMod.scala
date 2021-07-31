package typings.tsconfigPaths

import typings.tsconfigPaths.configLoaderMod.ExplicitParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("tsconfig-paths/lib/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def register(explicitParams: ExplicitParams): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(explicitParams.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
