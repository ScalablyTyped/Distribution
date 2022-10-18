package typings.victoryCore.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collection {
  
  @JSImport("victory-core/lib", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsDates(collection: js.Array[Double | js.Date]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsDates")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containsNumbers(collection: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsNumbers")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containsOnlyStrings(collection: js.Array[String]): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsOnlyStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  inline def containsOnlyStrings(collection: Any): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsOnlyStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  inline def containsStrings[T](collection: js.Array[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsStrings")(collection.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getMaxValue(arr: js.Array[Double | js.Date], values: (Double | js.Date)*): Double | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxValue")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double | js.Date]
  
  inline def getMinValue(arr: js.Array[Double | js.Date], values: (Double | js.Date)*): Double | js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinValue")(scala.List(arr.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double | js.Date]
  
  inline def isArrayOfArrays[T](collection: js.Array[js.Array[T] | T]): /* is std.Array<std.Array<T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<T>> */ Boolean]
  inline def isArrayOfArrays[T](collection: Any): /* is std.Array<std.Array<T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(collection.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<T>> */ Boolean]
  
  inline def removeUndefined(arr: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
}
