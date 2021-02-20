package typings.tsLoader

import typings.tsLoader.anon.Compiler
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerSetupMod {
  
  @JSImport("ts-loader/dist/compilerSetup", "getCompiler")
  @js.native
  def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = js.native
  
  @JSImport("ts-loader/dist/compilerSetup", "getCompilerOptions")
  @js.native
  def getCompilerOptions(configParseResult: ParsedCommandLine): CompilerOptions = js.native
}
