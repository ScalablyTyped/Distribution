package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Root_
import typings.postcss.mod.Syntax
import typings.std.NonNullable
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Record
import typings.stylelint.stylelintStrings.`border-block-end`
import typings.stylelint.stylelintStrings.`border-block-start`
import typings.stylelint.stylelintStrings.`border-bottom`
import typings.stylelint.stylelintStrings.`border-color`
import typings.stylelint.stylelintStrings.`border-image`
import typings.stylelint.stylelintStrings.`border-inline-end`
import typings.stylelint.stylelintStrings.`border-inline-start`
import typings.stylelint.stylelintStrings.`border-left`
import typings.stylelint.stylelintStrings.`border-radius`
import typings.stylelint.stylelintStrings.`border-right`
import typings.stylelint.stylelintStrings.`border-style`
import typings.stylelint.stylelintStrings.`border-top`
import typings.stylelint.stylelintStrings.`border-width`
import typings.stylelint.stylelintStrings.`column-rule`
import typings.stylelint.stylelintStrings.`flex-flow`
import typings.stylelint.stylelintStrings.`grid-area`
import typings.stylelint.stylelintStrings.`grid-column`
import typings.stylelint.stylelintStrings.`grid-gap`
import typings.stylelint.stylelintStrings.`grid-row`
import typings.stylelint.stylelintStrings.`grid-template`
import typings.stylelint.stylelintStrings.`list-style`
import typings.stylelint.stylelintStrings.`text-decoration`
import typings.stylelint.stylelintStrings.`text-emphasis`
import typings.stylelint.stylelintStrings.animation
import typings.stylelint.stylelintStrings.background
import typings.stylelint.stylelintStrings.border
import typings.stylelint.stylelintStrings.columns
import typings.stylelint.stylelintStrings.flex
import typings.stylelint.stylelintStrings.font
import typings.stylelint.stylelintStrings.grid
import typings.stylelint.stylelintStrings.margin
import typings.stylelint.stylelintStrings.mask
import typings.stylelint.stylelintStrings.outline
import typings.stylelint.stylelintStrings.padding
import typings.stylelint.stylelintStrings.transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CodeProcessor = js.Function2[/* code */ String, /* file */ js.UndefOr[String], String]

type ConfigExtends = String | js.Array[String]

type ConfigIgnoreFiles = String | js.Array[String]

type ConfigPlugins = String | js.Array[String]

type ConfigProcessor = String | (js.Tuple2[String, js.Object])

type ConfigProcessors = String | js.Array[ConfigProcessor]

type ConfigRuleSettings[T, O /* <: js.Object */] = js.UndefOr[
Null | NonNullable[T] | js.Array[NonNullable[T]] | (js.Tuple2[NonNullable[T], O])]

type ConfigRules = StringDictionary[ConfigRuleSettings[Any, js.Object]]

type CosmiconfigResult = typings.stylelint.anon.Config | Null

type CustomSyntax = String | Syntax

type DisableOptionsReport = js.Array[DisableReportEntry]

type DisablePropertyName = PropertyNamesOfType[Config, DisableSettings]

type DisableSettings = ConfigRuleSettings[Boolean, DisableOptions]

type DisabledRangeObject = StringDictionary[js.Array[DisabledRange]]

type Formatter = js.Function2[/* results */ js.Array[LintResult], /* returnValue */ LinterResult, String]

type LonghandSubPropertiesOfShorthandProperties = ReadonlyMap[
animation | background | border | `border-block-end` | `border-block-start` | `border-bottom` | `border-color` | `border-image` | `border-inline-end` | `border-inline-start` | `border-left` | `border-radius` | `border-right` | `border-style` | `border-top` | `border-width` | `column-rule` | columns | flex | `flex-flow` | font | grid | `grid-area` | `grid-column` | `grid-gap` | `grid-row` | `grid-template` | `list-style` | margin | mask | outline | padding | `text-decoration` | `text-emphasis` | transition, 
ReadonlySet[String]]

type Plugin = RuleBase[Any, Any]

type PluginContext = RuleContext

// A meta-type that returns a union over all properties of `T` whose values
// have type `U`.
type PropertyNamesOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends U? K : never}[keyof T] */ js.Any

type ResultProcessor = js.Function2[/* result */ LintResult, /* file */ js.UndefOr[String], LintResult]

type RuleBase[P, S] = js.Function3[
/* primaryOption */ P, 
/* secondaryOptions */ Record[String, S], 
/* context */ RuleContext, 
js.Function2[/* root */ Root_, /* result */ PostcssResult, js.Promise[Unit] | Unit]]

type RuleMessage = String | RuleMessageFunc

type RuleMessages = StringDictionary[RuleMessage]

type RuleOptionsPossible = Boolean | Double | String | RuleOptionsPossibleFunc

type RuleOptionsPossibleFunc = js.Function1[/* value */ Any, Boolean]
