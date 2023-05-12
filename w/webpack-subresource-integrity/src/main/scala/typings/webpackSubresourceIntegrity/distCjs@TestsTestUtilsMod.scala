package typings.webpackSubresourceIntegrity

import typings.webpack.mod.Configuration
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCjs@TestsTestUtilsMod` {
  
  @JSImport("webpack-subresource-integrity/dist/cjs/@/tests/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runWebpack(options: Configuration): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
}
