package typings.atTypescriptDashEslintTypescriptDashEstree

import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.Extra
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SemanticDiagnosticsBuilderProgram
import typings.typescript.typescriptMod.WatchOfConfigFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/typescript-estree/dist/create-program/createWatchProgram", JSImport.Namespace)
@js.native
object distCreateDashProgramCreateWatchProgramMod extends js.Object {
  /**
    * Clear all of the parser caches.
    * This should only be used in testing to ensure the parser is clean between tests.
    */
  def clearCaches(): Unit = js.native
  def createWatchProgram(tsconfigPath: String, extra: Extra): WatchOfConfigFile[SemanticDiagnosticsBuilderProgram] = js.native
  /**
    * Calculate project environments using options provided by consumer and paths from config
    * @param code The code being linted
    * @param filePath The path of the file being parsed
    * @param extra.tsconfigRootDir The root directory for relative tsconfig paths
    * @param extra.projects Provided tsconfig paths
    * @returns The programs corresponding to the supplied tsconfig paths
    */
  def getProgramsForProjects(code: String, filePath: String, extra: Extra): js.Array[Program] = js.native
}

