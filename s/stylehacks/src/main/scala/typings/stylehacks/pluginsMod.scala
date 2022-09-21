package typings.stylehacks

import typings.std.IterableIterator
import typings.stylehacks.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("stylehacks/types/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(items: (js.Array[Instantiable] | Instantiable)*): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Instantiable]]
  
  inline def copyWithin(target: Double, start: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  inline def copyWithin(target: Double, start: Double, end: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyWithin")(target.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  
  inline def entries(): IterableIterator[js.Tuple2[Double, Instantiable]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[Double, Instantiable]]]
  
  inline def every(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def every(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def every_S_Instantiable[S /* <: Instantiable */](
    predicate: js.Function3[
      /* value */ Instantiable, 
      /* index */ Double, 
      /* array */ js.Array[Instantiable], 
      /* is S */ Boolean
    ]
  ): /* is std.Array<S> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<S> */ Boolean]
  inline def every_S_Instantiable[S /* <: Instantiable */](
    predicate: js.Function3[
      /* value */ Instantiable, 
      /* index */ Double, 
      /* array */ js.Array[Instantiable], 
      /* is S */ Boolean
    ],
    thisArg: Any
  ): /* is std.Array<S> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[/* is std.Array<S> */ Boolean]
  
  inline def fill(value: Instantiable): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Instantiable]]
  inline def fill(value: Instantiable, start: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  inline def fill(value: Instantiable, start: Double, end: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  inline def fill(value: Instantiable, start: Unit, end: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  
  inline def filter(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any]
  ): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[Instantiable]]
  inline def filter(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any],
    thisArg: Any
  ): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  
  inline def filter_S_1_Instantiable[S_1 /* <: Instantiable */](
    predicate: js.Function3[
      /* value */ Instantiable, 
      /* index */ Double, 
      /* array */ js.Array[Instantiable], 
      /* is S_1 */ Boolean
    ]
  ): js.Array[S_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Array[S_1]]
  inline def filter_S_1_Instantiable[S_1 /* <: Instantiable */](
    predicate: js.Function3[
      /* value */ Instantiable, 
      /* index */ Double, 
      /* array */ js.Array[Instantiable], 
      /* is S_1 */ Boolean
    ],
    thisArg: Any
  ): js.Array[S_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[S_1]]
  
  inline def find(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* obj */ js.Array[Instantiable], Any]
  ): js.UndefOr[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Instantiable]]
  inline def find(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* obj */ js.Array[Instantiable], Any],
    thisArg: Any
  ): js.UndefOr[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Instantiable]]
  inline def find[S_2 /* <: Instantiable */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Instantiable, 
      /* index */ Double, 
      /* obj */ js.Array[Instantiable], 
      /* is S_2 */ Boolean
    ]
  ): js.UndefOr[S_2] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S_2]]
  inline def find[S_2 /* <: Instantiable */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Instantiable, 
      /* index */ Double, 
      /* obj */ js.Array[Instantiable], 
      /* is S_2 */ Boolean
    ],
    thisArg: Any
  ): js.UndefOr[S_2] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S_2]]
  
  inline def findIndex(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* obj */ js.Array[Instantiable], Any]
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def findIndex(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* obj */ js.Array[Instantiable], Any],
    thisArg: Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def forEach(
    callbackfn: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def includes(searchElement: Instantiable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def includes(searchElement: Instantiable, fromIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf(searchElement: Instantiable): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def indexOf(searchElement: Instantiable, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def join(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[String]
  inline def join(separator: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keys(): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[Double]]
  
  inline def lastIndexOf(searchElement: Instantiable): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def lastIndexOf(searchElement: Instantiable, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("stylehacks/types/plugins", "length")
  @js.native
  def length: Double = js.native
  inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  inline def map[U](
    callbackfn: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], U]
  ): js.Array[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[js.Array[U]]
  inline def map[U](
    callbackfn: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], U],
    thisArg: Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def pop(): js.UndefOr[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[js.UndefOr[Instantiable]]
  
  inline def push(items: Instantiable*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Instantiable, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      Instantiable
    ]
  ): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  inline def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Instantiable, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      Instantiable
    ],
    initialValue: Instantiable
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def reduce[U_1](
    callbackfn: js.Function4[
      /* previousValue */ U_1, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      U_1
    ],
    initialValue: U_1
  ): U_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_1]
  
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Instantiable, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      Instantiable
    ]
  ): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  inline def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Instantiable, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      Instantiable
    ],
    initialValue: Instantiable
  ): Instantiable = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Instantiable]
  inline def reduceRight[U_2](
    callbackfn: js.Function4[
      /* previousValue */ U_2, 
      /* currentValue */ Instantiable, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Instantiable], 
      U_2
    ],
    initialValue: U_2
  ): U_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(callbackfn.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[U_2]
  
  inline def reverse(): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[Instantiable]]
  
  inline def shift(): js.UndefOr[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.UndefOr[Instantiable]]
  
  inline def slice(): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")().asInstanceOf[js.Array[Instantiable]]
  inline def slice(start: Double): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Instantiable]]
  inline def slice(start: Double, end: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  inline def slice(start: Unit, end: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  
  inline def some(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def some(
    predicate: js.Function3[/* value */ Instantiable, /* index */ Double, /* array */ js.Array[Instantiable], Any],
    thisArg: Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sort(): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[js.Array[Instantiable]]
  inline def sort(compareFn: js.Function2[/* a */ Instantiable, /* b */ Instantiable, Double]): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(compareFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Instantiable]]
  
  inline def splice(start: Double): js.Array[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Instantiable]]
  inline def splice(start: Double, deleteCount: Double): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Instantiable]]
  inline def splice(start: Double, deleteCount: Double, items: Instantiable*): js.Array[Instantiable] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((List(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Instantiable]]
  
  inline def toLocaleString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocaleString")().asInstanceOf[String]
  
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  inline def unshift(items: Instantiable*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def values(): IterableIterator[Instantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[Instantiable]]
}
