package typings.tsLoader

import typings.tsLoader.interfacesMod.TSInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/after-compile", JSImport.Namespace)
@js.native
object afterCompileMod extends js.Object {
  
  def makeAfterCompile(instance: TSInstance): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ /* compilation */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = js.native
  def makeAfterCompile(instance: TSInstance, configFilePath: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ /* compilation */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = js.native
}
