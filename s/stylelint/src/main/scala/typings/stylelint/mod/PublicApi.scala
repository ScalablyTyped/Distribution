package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.PluginCreator
import typings.stylelint.anon.PickLinterOptionscwdconfi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicApi
  extends StObject
     with PluginCreator[PostcssPluginOptions] {
  
  /**
  	 * The Stylelint "internal API" is passed among functions
  	 * so that methods on a Stylelint instance can invoke
  	 * each other while sharing options and caches.
  	 *
  	 * @internal
  	 */
  def _createLinter(options: LinterOptions): InternalApi = js.native
  
  /**
  	 * Creates a Stylelint plugin.
  	 */
  def createPlugin(ruleName: String, rule: Rule[Any, Any]): Plugin = js.native
  
  /**
  	 * Result report formatters by name.
  	 */
  var formatters: StringDictionary[Formatter] = js.native
  
  /**
  	 * Runs Stylelint with the given options and returns a Promise that
  	 * resolves to the results.
  	 *
  	 * @param options - A lint options object
  	 * @returns A lint result
  	 */
  def lint(options: LinterOptions): js.Promise[LinterResult] = js.native
  
  /**
  	 * Reference objects.
  	 */
  var reference: typings.stylelint.anon.LonghandSubPropertiesOfShorthandProperties = js.native
  
  /**
  	 * Resolves the effective configuration for a given file. Resolves to
  	 * `undefined` if no config is found.
  	 *
  	 * @param filePath - The path to the file to get the config for.
  	 * @param options - The options to use when creating the Stylelint instance.
  	 * @returns A resolved config or `undefined`.
  	 */
  def resolveConfig(filePath: String): js.Promise[js.UndefOr[Config]] = js.native
  def resolveConfig(filePath: String, options: PickLinterOptionscwdconfi): js.Promise[js.UndefOr[Config]] = js.native
  
  /**
  	 * Available rules.
  	 */
  var rules: StringDictionary[Rule[Any, Any]] = js.native
  
  /**
  	 * Utility functions.
  	 */
  var utils: Utils = js.native
}
