package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayLike
import typings.std.Extract
import typings.std.Omit
import typings.std.Pick
import typings.std.ReadonlySet
import typings.std.Record
import typings.std.Set
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("vega-lite/build/src/util", "accessPathDepth")
  @js.native
  def accessPathDepth(path: String): Double = js.native
  
  @JSImport("vega-lite/build/src/util", "accessPathWithDatum")
  @js.native
  def accessPathWithDatum(path: String): String = js.native
  @JSImport("vega-lite/build/src/util", "accessPathWithDatum")
  @js.native
  def accessPathWithDatum(path: String, datum: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "contains")
  @js.native
  def contains[T](array: js.Array[T], item: T): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "deepEqual")
  @js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "deleteNestedProperty")
  @js.native
  def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "duplicate")
  @js.native
  val duplicate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof clone_ */ js.Any = js.native
  
  @JSImport("vega-lite/build/src/util", "entries")
  @js.native
  def entries(o: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  @JSImport("vega-lite/build/src/util", "entries")
  @js.native
  def entries[T](o: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  @JSImport("vega-lite/build/src/util", "entries")
  @js.native
  def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  @JSImport("vega-lite/build/src/util", "every")
  @js.native
  def every[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "fieldIntersection")
  @js.native
  def fieldIntersection(a: ReadonlySet[String], b: ReadonlySet[String]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum(path: String): String = js.native
  @JSImport("vega-lite/build/src/util", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_datum(path: String, datum: datum): String = js.native
  @JSImport("vega-lite/build/src/util", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_datumdatum(path: String, datum: datumDotdatum): String = js.native
  @JSImport("vega-lite/build/src/util", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_parent(path: String, datum: parent): String = js.native
  
  @JSImport("vega-lite/build/src/util", "getFirstDefined")
  @js.native
  def getFirstDefined[T](args: T*): js.UndefOr[T] = js.native
  
  @JSImport("vega-lite/build/src/util", "hasIntersection")
  @js.native
  def hasIntersection[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "hash")
  @js.native
  def hash(a: js.Any): String | Double = js.native
  
  @JSImport("vega-lite/build/src/util", "internalField")
  @js.native
  def internalField(name: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "isBoolean")
  @js.native
  def isBoolean(b: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "isEqual")
  @js.native
  def isEqual[T](dict: Dict[T], other: Dict[T]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "isInternalField")
  @js.native
  def isInternalField(name: String): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "isNullOrFalse")
  @js.native
  def isNullOrFalse(x: js.Any): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "isNumeric")
  @js.native
  def isNumeric(value: String): Boolean = js.native
  @JSImport("vega-lite/build/src/util", "isNumeric")
  @js.native
  def isNumeric(value: Double): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "keys")
  @js.native
  def keys[T](o: T): js.Array[Extract[/* keyof T */ String, String]] = js.native
  
  @JSImport("vega-lite/build/src/util", "logicalExpr")
  @js.native
  def logicalExpr[T](op: LogicalComposition[T], cb: js.Function1[/* repeated */ js.Any, String]): String = js.native
  
  @JSImport("vega-lite/build/src/util", "mergeDeep")
  @js.native
  def mergeDeep[T](dest: T, src: DeepPartial[T]*): T = js.native
  
  @JSImport("vega-lite/build/src/util", "normalizeAngle")
  @js.native
  def normalizeAngle(angle: Double): Double = js.native
  
  @JSImport("vega-lite/build/src/util", "omit")
  @js.native
  def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Omit[T, K] = js.native
  
  @JSImport("vega-lite/build/src/util", "pick")
  @js.native
  def pick[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Pick[T, K] = js.native
  
  @JSImport("vega-lite/build/src/util", "prefixGenerator")
  @js.native
  def prefixGenerator(a: ReadonlySet[String]): ReadonlySet[String] = js.native
  
  @JSImport("vega-lite/build/src/util", "removePathFromField")
  @js.native
  def removePathFromField(path: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "replaceAll")
  @js.native
  def replaceAll(string: String, find: String, replacement: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "replacePathInField")
  @js.native
  def replacePathInField(path: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "resetIdCounter")
  @js.native
  def resetIdCounter(): Unit = js.native
  
  @JSImport("vega-lite/build/src/util", "setEqual")
  @js.native
  def setEqual[T](a: Set[T], b: Set[T]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "some")
  @js.native
  def some[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  
  @JSImport("vega-lite/build/src/util", "stringify")
  @js.native
  val stringify: js.Function1[/* obj */ js.Any, String] = js.native
  
  @JSImport("vega-lite/build/src/util", "titleCase")
  @js.native
  def titleCase(s: String): String = js.native
  
  @JSImport("vega-lite/build/src/util", "unique")
  @js.native
  def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = js.native
  
  @JSImport("vega-lite/build/src/util", "uniqueId")
  @js.native
  def uniqueId(): String | Double = js.native
  @JSImport("vega-lite/build/src/util", "uniqueId")
  @js.native
  def uniqueId(prefix: String): String | Double = js.native
  
  @JSImport("vega-lite/build/src/util", "vals")
  @js.native
  def vals(o: js.Object): js.Array[_] = js.native
  @JSImport("vega-lite/build/src/util", "vals")
  @js.native
  def vals[T](o: StringDictionary[T]): js.Array[T] = js.native
  @JSImport("vega-lite/build/src/util", "vals")
  @js.native
  def vals[T](o: ArrayLike[T]): js.Array[T] = js.native
  
  @JSImport("vega-lite/build/src/util", "varName")
  @js.native
  def varName(s: String): String = js.native
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-lite.vega-lite/build/src/util.DeepPartial<T[P]> * / object}
    */ typings.vegaLite.vegaLiteStrings.DeepPartial with TopLevel[js.Any]
  
  type Dict[T] = Record[String, T]
  
  type Flag[S /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in S ]: 1}
    */ typings.vegaLite.vegaLiteStrings.Flag with TopLevel[js.Any]
}
