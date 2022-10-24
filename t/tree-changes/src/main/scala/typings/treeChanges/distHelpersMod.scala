package typings.treeChanges

import typings.treeChanges.distTypesMod.CompareValuesOptions
import typings.treeChanges.distTypesMod.Data
import typings.treeChanges.distTypesMod.Options
import typings.treeChanges.distTypesMod.ValidTypes
import typings.treeChanges.distTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("tree-changes/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canHaveLength(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments_ because its type any is not an array type */ arguments_ : Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHaveLength")(arguments_.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkEquality(left: Data, right: Data, value: Value): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquality")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def compareNumbers[K](previousData: Data, data: Data, options: Options[K]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNumbers")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareValues[K](previousData: Data, data: Data, options: CompareValuesOptions[K]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compareValues")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getIterables[K](previousData: Data, data: Data): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIterables")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getIterables[K](previousData: Data, data: Data, param2: Options[K]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIterables")(previousData.asInstanceOf[js.Any], data.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def hasEntry(input: Value): js.Function1[/* param0 */ js.Tuple2[String, Value], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEntry")(input.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ js.Tuple2[String, Value], Boolean]]
  
  inline def hasExtraKeys(left: js.Array[String], right: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasExtraKeys")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasValue(input: Value): js.Function1[/* value */ Value, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(input.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Value, Boolean]]
  
  inline def includesOrEqualsTo[T](previousValue: T, value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includesOrEqualsTo")(previousValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includesOrEqualsTo[T](previousValue: js.Array[T], value: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includesOrEqualsTo")(previousValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEqualPredicate(data: js.Array[Any]): js.Function1[/* value */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEqualPredicate")(data.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, Boolean]]
  
  inline def isSameType(arguments_ : ValidTypes*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSameType")(arguments_.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def nested[T /* <: Data */, K](data: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nested")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nested[T /* <: Data */, K](data: T, property: K): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("nested")(data.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
}
