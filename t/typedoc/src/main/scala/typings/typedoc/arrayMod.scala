package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.typedoc.anon.Order
import typings.typedoc.anon.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("typedoc/dist/lib/utils/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryFindPartition")(arr.asInstanceOf[js.Any], partition.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def filterMap[T, U](iter: js.Iterable[T], fn: js.Function1[/* item */ T, js.UndefOr[U]]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(iter.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def insertOrderSorted[T /* <: Order */](arr: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertOrderSorted")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPrioritySorted")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def partition[T](iter: js.Iterable[T], predicate: js.Function1[/* item */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(iter.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def removeIf[T](arr: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIf")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeIfPresent[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeIfPresent[T](arr: Unit, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unique[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[js.Array[T]]
  inline def unique[T](arr: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def zip[T /* <: js.Array[js.Iterable[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): js.Iterable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends std.Iterable<infer U>? any : T[K]}
    */ typings.typedoc.typedocStrings.zip & TopLevel[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(args.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends std.Iterable<infer U>? any : T[K]}
    */ typings.typedoc.typedocStrings.zip & TopLevel[Any]
  ]]
}
