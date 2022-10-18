package typings.tsLoader

import typings.tsLoader.distInterfacesMod.LoaderOptions
import typings.tsLoader.distInterfacesMod.TSInstance
import typings.webpack.mod.Compiler
import typings.webpack.mod.LoaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWatchRunMod {
  
  @JSImport("ts-loader/dist/watch-run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeWatchRun(instance: TSInstance, loader: LoaderContext[LoaderOptions]): js.Function2[
    /* compiler */ Compiler, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchRun")(instance.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* compiler */ Compiler, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ]]
}
