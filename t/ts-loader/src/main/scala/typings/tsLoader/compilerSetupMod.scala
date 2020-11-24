package typings.tsLoader

import typings.tsLoader.anon.Compiler
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/compilerSetup", JSImport.Namespace)
@js.native
object compilerSetupMod extends js.Object {
  
  def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = js.native
  
  def getCompilerOptions(configParseResult: ParsedCommandLine): CompilerOptions = js.native
}
