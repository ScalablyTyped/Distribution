package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`-1`
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`0`
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/generic_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assert(`val`: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def assert(`val`: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(`val`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assertPositiveInteger(value: js.Array[Double], name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPositiveInteger")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assertPositiveInteger(value: Double, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPositiveInteger")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkArrayTypeAndLength(x: js.Any, expectedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayTypeAndLength")(x.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayTypeAndLength")(x.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double, maxLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayTypeAndLength")(x.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Unit, maxLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayTypeAndLength")(x.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def checkStringTypeUnionValue(values: js.Array[String], label: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStringTypeUnionValue")(values.asInstanceOf[js.Any], label.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def count[T](array: js.Array[T], refernce: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(array.asInstanceOf[js.Any], refernce.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def debounce[T](f: js.Function1[/* repeated */ js.Object, T], waitMs: Double): js.Function1[/* repeated */ js.Object, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(f.asInstanceOf[js.Any], waitMs.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Object, T]]
  
  @scala.inline
  def deserializeKerasObject(identifier: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: String, moduleObjects: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: String, moduleObjects: Unit, customObjects: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: String, moduleObjects: Unit, customObjects: Unit, printableModuleName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: Unit,
    customObjects: Unit,
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: Unit,
    customObjects: Unit,
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: ConfigDict): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: ConfigDict, moduleObjects: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: Unit,
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: ConfigDict, moduleObjects: Unit, customObjects: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: Unit,
    customObjects: StringDictionary[js.Any],
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(identifier: ConfigDict, moduleObjects: Unit, customObjects: Unit, printableModuleName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: Unit,
    customObjects: Unit,
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: Unit,
    customObjects: Unit,
    printableModuleName: Unit,
    fastWeightInit: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeKerasObject")(identifier.asInstanceOf[js.Any], moduleObjects.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], printableModuleName.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def formatAsFriendlyString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAsFriendlyString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getCartesianProductOfValues(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arrayOfValues because its type PossibleValues is not an array type */ arrayOfValues: PossibleValues
  ): PossibleValues = ^.asInstanceOf[js.Dynamic].applyDynamic("getCartesianProductOfValues")(arrayOfValues.asInstanceOf[js.Any]).asInstanceOf[PossibleValues]
  
  @scala.inline
  def isObjectEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mapActivationToFusedKernel(activationName: String): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("mapActivationToFusedKernel")(activationName.asInstanceOf[js.Any]).asInstanceOf[Activation]
  
  @scala.inline
  def numberCompare(a: Double, b: Double): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  @scala.inline
  def objectListUid(objs: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectListUid")(objs.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def objectListUid(objs: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectListUid")(objs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def pyListRepeat(value: js.Any, numValues: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pyListRepeat")(value.asInstanceOf[js.Any], numValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def reverseNumberCompare(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseNumberCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def serializeKerasObject(instance: Serializable): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeKerasObject")(instance.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]
  
  @scala.inline
  def singletonOrArray[T](xs: js.Array[T]): T | js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("singletonOrArray")(xs.asInstanceOf[js.Any]).asInstanceOf[T | js.Array[T]]
  
  @scala.inline
  def stringToDType(dtype: String): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToDType")(dtype.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  @scala.inline
  def stringsEqual(xs: js.Array[String], ys: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringsEqual")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toCamelCase(identifier: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelCase")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toList(x: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toList")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def toSnakeCase(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSnakeCase")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unique[T](xs: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type PossibleValues = js.Array[js.Array[Boolean | String | Double]]
}
