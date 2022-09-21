package typings.tsLoader

import typings.tsLoader.interfacesMod.TSInstance
import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterCompileMod {
  
  @JSImport("ts-loader/dist/after-compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeAfterCompile(instance: TSInstance): js.Function2[/* compilation */ Compilation, /* callback */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAfterCompile")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* compilation */ Compilation, /* callback */ js.Function0[Unit], Unit]]
  inline def makeAfterCompile(instance: TSInstance, configFilePath: String): js.Function2[/* compilation */ Compilation, /* callback */ js.Function0[Unit], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAfterCompile")(instance.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* compilation */ Compilation, /* callback */ js.Function0[Unit], Unit]]
}
