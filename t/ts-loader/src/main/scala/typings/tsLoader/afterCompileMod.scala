package typings.tsLoader

import typings.tsLoader.interfacesMod.TSInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterCompileMod {
  
  @JSImport("ts-loader/dist/after-compile", "makeAfterCompile")
  @js.native
  def makeAfterCompile(instance: TSInstance): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ /* compilation */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = js.native
  @JSImport("ts-loader/dist/after-compile", "makeAfterCompile")
  @js.native
  def makeAfterCompile(instance: TSInstance, configFilePath: String): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ /* compilation */ js.Any, 
    /* callback */ js.Function0[Unit], 
    Unit
  ] = js.native
}
