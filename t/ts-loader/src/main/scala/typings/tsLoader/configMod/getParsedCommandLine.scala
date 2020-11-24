package typings.tsLoader.configMod

import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/config", "getParsedCommandLine")
@js.native
object getParsedCommandLine extends js.Object {
  
  def apply(compiler: Typeoftypescript, loaderOptions: LoaderOptions, configFilePath: String): js.UndefOr[ParsedCommandLine] = js.native
}
