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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/utils/generic_utils", JSImport.Namespace)
@js.native
object genericUtilsMod extends js.Object {
  
  def assert(`val`: Boolean): Unit = js.native
  def assert(`val`: Boolean, message: String): Unit = js.native
  
  def assertPositiveInteger(value: js.Array[Double], name: String): Unit = js.native
  def assertPositiveInteger(value: Double, name: String): Unit = js.native
  
  def checkArrayTypeAndLength(x: js.Any, expectedType: String): Boolean = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: js.UndefOr[scala.Nothing], maxLength: Double): Boolean = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double): Boolean = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double, maxLength: Double): Boolean = js.native
  
  def checkStringTypeUnionValue(values: js.Array[String], label: String, value: String): Unit = js.native
  
  def count[T](array: js.Array[T], refernce: T): Double = js.native
  
  def debounce[T](f: js.Function1[/* repeated */ js.Object, T], waitMs: Double): js.Function1[/* repeated */ js.Object, T] = js.native
  
  def deserializeKerasObject(identifier: String): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(identifier: String, moduleObjects: StringDictionary[js.Any]): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(identifier: ConfigDict): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: js.UndefOr[scala.Nothing],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(identifier: ConfigDict, moduleObjects: StringDictionary[js.Any]): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: js.UndefOr[scala.Nothing],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: js.UndefOr[scala.Nothing],
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  
  def formatAsFriendlyString(value: js.Any): String = js.native
  
  def getCartesianProductOfValues(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arrayOfValues because its type PossibleValues is not an array type */ arrayOfValues: PossibleValues
  ): PossibleValues = js.native
  
  def isObjectEmpty(obj: js.Object): Boolean = js.native
  
  def mapActivationToFusedKernel(activationName: String): Activation = js.native
  
  def numberCompare(a: Double, b: Double): `1` | `0` | `-1` = js.native
  
  def objectListUid(objs: js.Any): String = js.native
  def objectListUid(objs: js.Array[_]): String = js.native
  
  def pyListRepeat(value: js.Any, numValues: Double): js.Array[_] = js.native
  
  def reverseNumberCompare(a: Double, b: Double): Double = js.native
  
  def serializeKerasObject(instance: Serializable): ConfigDictValue = js.native
  
  def singletonOrArray[T](xs: js.Array[T]): T | js.Array[T] = js.native
  
  def stringToDType(dtype: String): DataType = js.native
  
  def stringsEqual(xs: js.Array[String], ys: js.Array[String]): Boolean = js.native
  
  def toCamelCase(identifier: String): String = js.native
  
  def toList(x: js.Any): js.Array[_] = js.native
  
  def toSnakeCase(name: String): String = js.native
  
  def unique[T](xs: js.Array[T]): js.Array[T] = js.native
  
  type PossibleValues = js.Array[js.Array[Boolean | String | Double]]
}
