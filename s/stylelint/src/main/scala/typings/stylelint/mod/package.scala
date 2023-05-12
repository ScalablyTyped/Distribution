package typings.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cosmiconfig.mod.TransformSync
import typings.postcss.mod.Root_
import typings.postcss.mod.Syntax
import typings.std.NonNullable
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ConfigExtends = String | js.Array[String]

type ConfigIgnoreFiles = String | js.Array[String]

type ConfigPlugins = String | Plugin | (js.Array[String | Plugin])

/** @internal */
type ConfigRuleSettings[T, O /* <: js.Object */] = js.UndefOr[
Null | NonNullable[T] | js.Array[NonNullable[T]] | (js.Tuple2[NonNullable[T], O])]

type ConfigRules = StringDictionary[ConfigRuleSettings[Any, js.Object]]

/** @internal */
type CosmiconfigResult = (ReturnType[TransformSync] & typings.stylelint.anon.Config) | Null

/** @internal */
type CustomSyntax = String | Syntax

type DisableOptionsReport = js.Array[DisableReportEntry]

/** @internal */
type DisablePropertyName = PropertyNamesOfType[Config, DisableSettings]

type DisableSettings = ConfigRuleSettings[Boolean, DisableOptions]

/** @internal */
type DisabledRangeObject = StringDictionary[js.Array[DisabledRange]]

/** @internal */
type Formatter = js.Function2[/* results */ js.Array[LintResult], /* returnValue */ LinterResult, String]

/** @internal */
type LonghandSubPropertiesOfShorthandProperties = ReadonlyMap[ShorthandProperties, ReadonlySet[String]]

// A meta-type that returns a union over all properties of `T` whose values
// have type `U`.
type PropertyNamesOfType[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends U? K : never}[keyof T] */ js.Any

/** @internal */
type RuleBase[P, S] = js.Function3[
/* primaryOption */ P, 
/* secondaryOptions */ Record[String, S], 
/* context */ RuleContext, 
js.Function2[/* root */ Root_, /* result */ PostcssResult, js.Promise[Unit] | Unit]]

/** @internal */
type RuleMessage = String | RuleMessageFunc

/** @internal */
type RuleMessages = StringDictionary[RuleMessage]

/** @internal */
type RuleOptionsPossible = Boolean | Double | String | RuleOptionsPossibleFunc

type RuleOptionsPossibleFunc = js.Function1[/* value */ Any, Boolean]
