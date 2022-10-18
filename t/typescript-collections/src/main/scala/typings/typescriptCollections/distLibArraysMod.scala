package typings.typescriptCollections

import typings.typescriptCollections.distLibUtilMod.IEqualsFunction
import typings.typescriptCollections.distLibUtilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibArraysMod {
  
  @JSImport("typescript-collections/dist/lib/arrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def copy[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def equals_[T](array1: js.Array[T], array2: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_[T](array1: js.Array[T], array2: js.Array[T], equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def forEach[T](array: js.Array[T], callback: ILoopFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def frequency[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def frequency[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def indexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lastIndexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def remove[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def swap[T](array: js.Array[T], i: Double, j: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(array.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toString_[T](array: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
}
