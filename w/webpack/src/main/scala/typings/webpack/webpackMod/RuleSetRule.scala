package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackStrings.javascriptSlashauto
import typings.webpack.webpackStrings.javascriptSlashdynamic
import typings.webpack.webpackStrings.javascriptSlashesm
import typings.webpack.webpackStrings.json
import typings.webpack.webpackStrings.post
import typings.webpack.webpackStrings.pre
import typings.webpack.webpackStrings.webassemblySlashexperimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleSetRule extends js.Object {
  /**
    * Match the child compiler name
    */
  var compiler: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Enforce this rule as pre or post step
    */
  var enforce: js.UndefOr[pre | post] = js.undefined
  /**
    * Shortcut for resource.exclude
    */
  var exclude: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Shortcut for resource.include
    */
  var include: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Match the issuer of the module (The module pointing to this module)
    */
  var issuer: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Shortcut for use.loader
    */
  var loader: js.UndefOr[RuleSetUse] = js.undefined
  /**
    * Shortcut for use.loader
    */
  var loaders: js.UndefOr[RuleSetUse] = js.undefined
  /**
    * Only execute the first matching rule in this array
    */
  var oneOf: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /**
    * Shortcut for use.options
    */
  var options: js.UndefOr[RuleSetQuery] = js.undefined
  /**
    * Options for parsing
    */
  var parser: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Shortcut for use.query
    */
  var query: js.UndefOr[RuleSetQuery] = js.undefined
  /**
    * Options for the resolver
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  /**
    * Match the resource path of the module
    */
  var resource: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Match the resource query of the module
    */
  var resourceQuery: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Match and execute these rules when this rule is matched
    */
  var rules: js.UndefOr[js.Array[RuleSetRule]] = js.undefined
  /**
    * Flags a module as with or without side effects
    */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  /**
    * Shortcut for resource.test
    */
  var test: js.UndefOr[RuleSetCondition] = js.undefined
  /**
    * Module type to use for the module
    */
  var `type`: js.UndefOr[
    javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental
  ] = js.undefined
  /**
    * Modifiers applied to the module when rule is matched
    */
  var use: js.UndefOr[RuleSetUse] = js.undefined
}

object RuleSetRule {
  @scala.inline
  def apply(
    compiler: RuleSetCondition = null,
    enforce: pre | post = null,
    exclude: RuleSetCondition = null,
    include: RuleSetCondition = null,
    issuer: RuleSetCondition = null,
    loader: RuleSetUse = null,
    loaders: RuleSetUse = null,
    oneOf: js.Array[RuleSetRule] = null,
    options: RuleSetQuery = null,
    parser: StringDictionary[js.Any] = null,
    query: RuleSetQuery = null,
    resolve: Resolve = null,
    resource: RuleSetCondition = null,
    resourceQuery: RuleSetCondition = null,
    rules: js.Array[RuleSetRule] = null,
    sideEffects: js.UndefOr[Boolean] = js.undefined,
    test: RuleSetCondition = null,
    `type`: javascriptSlashauto | javascriptSlashdynamic | javascriptSlashesm | json | webassemblySlashexperimental = null,
    use: RuleSetUse = null
  ): RuleSetRule = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (enforce != null) __obj.updateDynamic("enforce")(enforce.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loaders != null) __obj.updateDynamic("loaders")(loaders.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (!js.isUndefined(sideEffects)) __obj.updateDynamic("sideEffects")(sideEffects.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSetRule]
  }
}

