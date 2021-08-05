package typings.tsLoader

import typings.tsLoader.interfacesMod.TSInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchRunMod {
  
  @JSImport("ts-loader/dist/watch-run", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeWatchRun(instance: TSInstance): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchRun")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ]]
}
