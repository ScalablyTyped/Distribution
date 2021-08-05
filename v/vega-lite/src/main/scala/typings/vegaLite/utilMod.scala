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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("vega-lite/build/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accessPathDepth(path: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("accessPathDepth")(path.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def accessPathWithDatum(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessPathWithDatum")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def accessPathWithDatum(path: String, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("accessPathWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def contains[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteNestedProperty")(obj.asInstanceOf[js.Any], orderedProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("vega-lite/build/src/util", "duplicate")
  @js.native
  val duplicate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof clone_ */ js.Any = js.native
  
  inline def entries(o: js.Object): js.Array[js.Tuple2[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, js.Any]]]
  inline def entries[T](o: StringDictionary[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
  inline def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, T]]]
  
  inline def every[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fieldIntersection(a: ReadonlySet[String], b: ReadonlySet[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flatAccessWithDatum(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flatAccessWithDatum_datum(path: String, datum: datum): String = (^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def flatAccessWithDatum_datumdatum(path: String, datum: datumDotdatum): String = (^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def flatAccessWithDatum_parent(path: String, datum: parent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("flatAccessWithDatum")(path.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFirstDefined[T](args: T*): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDefined")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def hasIntersection[T](a: ReadonlySet[T], b: ReadonlySet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hash(a: js.Any): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(a.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def internalField(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("internalField")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBoolean(b: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(b.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual[T](dict: Dict[T], other: Dict[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(dict.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInternalField(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalField")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrFalse(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrFalse")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumeric(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys[T](o: T): js.Array[Extract[/* keyof T */ String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[Extract[/* keyof T */ String, String]]]
  
  inline def logicalExpr[T](op: LogicalComposition[T], cb: js.Function1[/* repeated */ js.Any, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalExpr")(op.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeDeep[T](dest: T, src: DeepPartial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def normalizeAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Omit[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Omit[T, K]]
  
  inline def pick[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, props: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
  
  inline def prefixGenerator(a: ReadonlySet[String]): ReadonlySet[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixGenerator")(a.asInstanceOf[js.Any]).asInstanceOf[ReadonlySet[String]]
  
  inline def removePathFromField(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removePathFromField")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def replaceAll(string: String, find: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(string.asInstanceOf[js.Any], find.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replacePathInField(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replacePathInField")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resetIdCounter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIdCounter")().asInstanceOf[Unit]
  
  inline def setEqual[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def some[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("vega-lite/build/src/util", "stringify")
  @js.native
  val stringify: js.Function1[/* obj */ js.Any, String] = js.native
  
  inline def titleCase(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(values.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def uniqueId(): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String | Double]
  inline def uniqueId(prefix: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def vals(o: js.Object): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def vals[T](o: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def vals[T](o: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("vals")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def varName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("varName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias vega-lite.vega-lite/build/src/util.DeepPartial<T[P]> * / object}
    */ typings.vegaLite.vegaLiteStrings.DeepPartial & TopLevel[js.Any]
  
  type Dict[T] = Record[String, T]
  
  type Flag[S /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in S ]: 1}
    */ typings.vegaLite.vegaLiteStrings.Flag & TopLevel[js.Any]
}
