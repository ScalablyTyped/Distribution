package typings.timsort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timsort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sort(array: js.Array[Any], lo: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort(array: js.Array[Any], lo: Double, hi: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double, hi: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Unit, hi: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: Unit, lo: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: Unit, lo: Double, hi: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sort[T](array: js.Array[T], compare: Unit, lo: Unit, hi: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
