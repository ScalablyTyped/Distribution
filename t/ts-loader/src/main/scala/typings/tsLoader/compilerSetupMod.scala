package typings.tsLoader

import typings.tsLoader.anon.Compiler
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerSetupMod {
  
  @JSImport("ts-loader/dist/compilerSetup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompiler")(loaderOptions.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Compiler]
  
  @scala.inline
  def getCompilerOptions(configParseResult: ParsedCommandLine): CompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerOptions")(configParseResult.asInstanceOf[js.Any]).asInstanceOf[CompilerOptions]
}
