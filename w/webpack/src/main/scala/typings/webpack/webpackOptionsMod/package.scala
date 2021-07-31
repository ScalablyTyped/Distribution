package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayOfStringOrStringArrayValues = js.Array[java.lang.String | js.Array[java.lang.String]]

type ArrayOfStringValues = js.Array[java.lang.String]

type Entry = typings.webpack.webpackOptionsMod.EntryDynamic | typings.webpack.webpackOptionsMod.EntryStatic

type EntryDynamic = js.Function0[
typings.webpack.webpackOptionsMod.EntryStatic | js.Promise[typings.webpack.webpackOptionsMod.EntryStatic]]

type EntryItem = java.lang.String | typings.webpack.webpackOptionsMod.NonEmptyArrayOfUniqueStringValues

type EntryObject = /**
	 * An entry point with name
	 */
org.scalablytyped.runtime.StringDictionary[
java.lang.String | typings.webpack.webpackOptionsMod.NonEmptyArrayOfUniqueStringValues]

type EntryStatic = typings.webpack.webpackOptionsMod.EntryObject | typings.webpack.webpackOptionsMod.EntryItem

type ExternalItem = java.lang.String | (/**
			 * The dependency used for the external
			 */
org.scalablytyped.runtime.StringDictionary[
java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] | typings.webpack.webpackOptionsMod.ArrayOfStringValues | scala.Boolean]) | typings.std.RegExp

type Externals = (js.Function3[
/* context */ java.lang.String, 
/* request */ java.lang.String, 
/* callback */ js.Function2[
  /* err */ js.UndefOr[typings.std.Error], 
  /* result */ js.UndefOr[java.lang.String], 
  scala.Unit
], 
scala.Unit]) | typings.webpack.webpackOptionsMod.ExternalItem | (js.Array[
(js.Function3[
  /* context */ java.lang.String, 
  /* request */ java.lang.String, 
  /* callback */ js.Function2[
    /* err */ js.UndefOr[typings.std.Error], 
    /* result */ js.UndefOr[java.lang.String], 
    scala.Unit
  ], 
  scala.Unit
]) | typings.webpack.webpackOptionsMod.ExternalItem])

type FilterItemTypes = typings.std.RegExp | java.lang.String | (js.Function1[/* value */ java.lang.String, scala.Boolean])

type FilterTypes = typings.webpack.webpackOptionsMod.FilterItemTypes | js.Array[typings.webpack.webpackOptionsMod.FilterItemTypes]

type NonEmptyArrayOfUniqueStringValues = js.Array[java.lang.String]

/* Rewritten from type alias, can be one of: 
  - typings.std.RegExp
  - java.lang.String
  - js.Function1[/ * value * / java.lang.String, scala.Boolean]
  - typings.webpack.webpackOptionsMod.RuleSetConditions
  - typings.webpack.anon.And
*/
type RuleSetCondition = typings.webpack.webpackOptionsMod._RuleSetCondition | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.std.RegExp
  - java.lang.String
  - js.Function1[/ * value * / java.lang.String, scala.Boolean]
  - typings.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
  - typings.webpack.anon.Exclude
*/
type RuleSetConditionAbsolute = typings.webpack.webpackOptionsMod._RuleSetConditionAbsolute | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.webpack.webpackOptionsMod.RuleSetCondition
  - typings.webpack.webpackOptionsMod.RuleSetConditions
*/
type RuleSetConditionOrConditions = typings.webpack.webpackOptionsMod._RuleSetConditionOrConditions | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.webpack.webpackOptionsMod.RuleSetConditionAbsolute
  - typings.webpack.webpackOptionsMod.RuleSetConditionsAbsolute
*/
type RuleSetConditionOrConditionsAbsolute = typings.webpack.webpackOptionsMod._RuleSetConditionOrConditionsAbsolute | (js.Function1[/* value */ java.lang.String, scala.Boolean]) | typings.std.RegExp | java.lang.String

type RuleSetLoader = java.lang.String

type RuleSetQuery = org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String

type RuleSetRules = js.Array[typings.webpack.webpackOptionsMod.RuleSetRule]

type RuleSetUse = typings.webpack.webpackOptionsMod.RuleSetUseItem | js.Function | js.Array[typings.webpack.webpackOptionsMod.RuleSetUseItem]

type RuleSetUseItem = typings.webpack.webpackOptionsMod.RuleSetLoader | js.Function | typings.webpack.anon.Ident

type WebpackPluginFunction = js.ThisFunction1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* this */ js.Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any, 
scala.Unit]
