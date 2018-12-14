package typings
package webpackLib.webpackMod.webpackNs

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
  var enforce: js.UndefOr[webpackLib.webpackLibStrings.pre | webpackLib.webpackLibStrings.post] = js.undefined
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
  var parser: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
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
  var sideEffects: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shortcut for resource.test
           */
  var test: js.UndefOr[RuleSetCondition] = js.undefined
  /**
           * Module type to use for the module
           */
  var `type`: js.UndefOr[
    webpackLib.webpackLibStrings.`javascript/auto` | webpackLib.webpackLibStrings.`javascript/dynamic` | webpackLib.webpackLibStrings.`javascript/esm` | webpackLib.webpackLibStrings.json | webpackLib.webpackLibStrings.`webassembly/experimental`
  ] = js.undefined
  /**
           * Modifiers applied to the module when rule is matched
           */
  var use: js.UndefOr[RuleSetUse] = js.undefined
}

