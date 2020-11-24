package typings.tsLoader

import typings.tsLoader.interfacesMod.TSInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/watch-run", JSImport.Namespace)
@js.native
object watchRunMod extends js.Object {
  
  def makeWatchRun(instance: TSInstance): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = js.native
}
