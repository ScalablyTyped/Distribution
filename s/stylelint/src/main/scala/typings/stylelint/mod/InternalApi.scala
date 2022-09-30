package typings.stylelint.mod

import typings.postcss.mod.Result
import typings.std.Map
import typings.std.ReturnType
import typings.stylelint.anon.FnCall
import typings.stylelint.anon.LinterOptionscwdstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalApi extends StObject {
  
  def _createStylelintResult(postcssResult: PostcssResult): js.Promise[LintResult] = js.native
  def _createStylelintResult(postcssResult: PostcssResult, filePath: String): js.Promise[LintResult] = js.native
  
  var _extendExplorer: ReturnType[FnCall] = js.native
  
  var _fileCache: FileCache = js.native
  
  def _getPostcssResult(): js.Promise[Result] = js.native
  def _getPostcssResult(options: GetPostcssOptions): js.Promise[Result] = js.native
  
  def _lintSource(options: GetLintSourceOptions): js.Promise[PostcssResult] = js.native
  
  var _options: LinterOptionscwdstring = js.native
  
  var _postcssResultCache: Map[String, Result] = js.native
  
  var _specifiedConfigCache: Map[Config, js.Promise[CosmiconfigResult]] = js.native
  
  def getConfigForFile(): js.Promise[CosmiconfigResult] = js.native
  def getConfigForFile(searchPath: String): js.Promise[CosmiconfigResult] = js.native
  def getConfigForFile(searchPath: String, filePath: String): js.Promise[CosmiconfigResult] = js.native
  def getConfigForFile(searchPath: Unit, filePath: String): js.Promise[CosmiconfigResult] = js.native
  
  def isPathIgnored(): js.Promise[Boolean] = js.native
  def isPathIgnored(s: String): js.Promise[Boolean] = js.native
}
