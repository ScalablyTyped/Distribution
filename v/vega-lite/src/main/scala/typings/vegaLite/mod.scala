package typings.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import typings.std.Extract
import typings.std.Omit
import typings.std.Pick
import typings.std.ReadonlySet
import typings.std.Set
import typings.vegaLite.anon.Normalized
import typings.vegaLite.compileMod.CompileOptions
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.specMod.TopLevelSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.toplevelMod.TopLevel
import typings.vegaLite.utilMod.DeepPartial
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.parent
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-lite", "accessPathDepth")
  @js.native
  def accessPathDepth(path: String): Double = js.native
  
  @JSImport("vega-lite", "accessPathWithDatum")
  @js.native
  def accessPathWithDatum(path: String): String = js.native
  @JSImport("vega-lite", "accessPathWithDatum")
  @js.native
  def accessPathWithDatum(path: String, datum: String): String = js.native
  
  @JSImport("vega-lite", "compile")
  @js.native
  def compile(inputSpec: TopLevelSpec): Normalized = js.native
  @JSImport("vega-lite", "compile")
  @js.native
  def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = js.native
  
  @JSImport("vega-lite", "contains")
  @js.native
  def contains[T](array: js.Array[T], item: T): Boolean = js.native
  
  @JSImport("vega-lite", "deepEqual")
  @js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("vega-lite", "deleteNestedProperty")
  @js.native
  def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = js.native
  
  @JSImport("vega-lite", "duplicate")
  @js.native
  val duplicate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof clone_ */ js.Any = js.native
  
  @JSImport("vega-lite", "entries")
  @js.native
  def entries(o: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  @JSImport("vega-lite", "entries")
  @js.native
  def entries[T](o: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  @JSImport("vega-lite", "entries")
  @js.native
  def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  @JSImport("vega-lite", "every")
  @js.native
  def every[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  
  @JSImport("vega-lite", "fieldIntersection")
  @js.native
  def fieldIntersection(a: ReadonlySet[String], b: ReadonlySet[String]): Boolean = js.native
  
  @JSImport("vega-lite", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum(path: String): String = js.native
  @JSImport("vega-lite", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_datum(path: String, datum: datum): String = js.native
  @JSImport("vega-lite", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_datumdatum(path: String, datum: datumDotdatum): String = js.native
  @JSImport("vega-lite", "flatAccessWithDatum")
  @js.native
  def flatAccessWithDatum_parent(path: String, datum: parent): String = js.native
  
  @JSImport("vega-lite", "getFirstDefined")
  @js.native
  def getFirstDefined[T](args: T*): js.UndefOr[T] = js.native
  
  @JSImport("vega-lite", "hasIntersection")
  @js.native
  def hasIntersection[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = js.native
  
  @JSImport("vega-lite", "hash")
  @js.native
  def hash(a: js.Any): String | Double = js.native
  
  @JSImport("vega-lite", "internalField")
  @js.native
  def internalField(name: String): String = js.native
  
  @JSImport("vega-lite", "isBoolean")
  @js.native
  def isBoolean(b: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vega-lite", "isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSImport("vega-lite", "isEqual")
  @js.native
  def isEqual[T](dict: Dict[T], other: Dict[T]): Boolean = js.native
  
  @JSImport("vega-lite", "isInternalField")
  @js.native
  def isInternalField(name: String): Boolean = js.native
  
  @JSImport("vega-lite", "isNullOrFalse")
  @js.native
  def isNullOrFalse(x: js.Any): Boolean = js.native
  
  @JSImport("vega-lite", "isNumeric")
  @js.native
  def isNumeric(value: String): Boolean = js.native
  @JSImport("vega-lite", "isNumeric")
  @js.native
  def isNumeric(value: Double): Boolean = js.native
  
  @JSImport("vega-lite", "keys")
  @js.native
  def keys[T](o: T): js.Array[Extract[/* keyof T */ String, String]] = js.native
  
  @JSImport("vega-lite", "logicalExpr")
  @js.native
  def logicalExpr[T](op: LogicalComposition[T], cb: js.Function1[/* repeated */ js.Any, String]): String = js.native
  
  @JSImport("vega-lite", "mergeDeep")
  @js.native
  def mergeDeep[T](dest: T, src: DeepPartial[T]*): T = js.native
  
  @JSImport("vega-lite", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  @JSImport("vega-lite", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  
  @JSImport("vega-lite", "normalizeAngle")
  @js.native
  def normalizeAngle(angle: Double): Double = js.native
  
  @JSImport("vega-lite", "omit")
  @js.native
  def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Omit[T, K] = js.native
  
  @JSImport("vega-lite", "pick")
  @js.native
  def pick[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Pick[T, K] = js.native
  
  @JSImport("vega-lite", "prefixGenerator")
  @js.native
  def prefixGenerator(a: ReadonlySet[String]): ReadonlySet[String] = js.native
  
  @JSImport("vega-lite", "removePathFromField")
  @js.native
  def removePathFromField(path: String): String = js.native
  
  @JSImport("vega-lite", "replaceAll")
  @js.native
  def replaceAll(string: String, find: String, replacement: String): String = js.native
  
  @JSImport("vega-lite", "replacePathInField")
  @js.native
  def replacePathInField(path: String): String = js.native
  
  @JSImport("vega-lite", "resetIdCounter")
  @js.native
  def resetIdCounter(): Unit = js.native
  
  @JSImport("vega-lite", "setEqual")
  @js.native
  def setEqual[T](a: Set[T], b: Set[T]): Boolean = js.native
  
  @JSImport("vega-lite", "some")
  @js.native
  def some[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  
  @JSImport("vega-lite", "stringify")
  @js.native
  val stringify: js.Function1[/* obj */ js.Any, String] = js.native
  
  @JSImport("vega-lite", "titleCase")
  @js.native
  def titleCase(s: String): String = js.native
  
  @JSImport("vega-lite", "unique")
  @js.native
  def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = js.native
  
  @JSImport("vega-lite", "uniqueId")
  @js.native
  def uniqueId(): String | Double = js.native
  @JSImport("vega-lite", "uniqueId")
  @js.native
  def uniqueId(prefix: String): String | Double = js.native
  
  @JSImport("vega-lite", "vals")
  @js.native
  def vals(o: js.Object): js.Array[_] = js.native
  @JSImport("vega-lite", "vals")
  @js.native
  def vals[T](o: StringDictionary[T]): js.Array[T] = js.native
  @JSImport("vega-lite", "vals")
  @js.native
  def vals[T](o: ArrayLike[T]): js.Array[T] = js.native
  
  @JSImport("vega-lite", "varName")
  @js.native
  def varName(s: String): String = js.native
}
