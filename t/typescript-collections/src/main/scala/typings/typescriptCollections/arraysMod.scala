package typings.typescriptCollections

import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-collections/dist/lib/arrays", JSImport.Namespace)
@js.native
object arraysMod extends js.Object {
  
  def contains[T](array: js.Array[T], item: T): Boolean = js.native
  def contains[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  def copy[T](array: js.Array[T]): js.Array[T] = js.native
  
  def equals[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  def equals[T](array1: js.Array[T], array2: js.Array[T], equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  def forEach[T](array: js.Array[T], callback: ILoopFunction[T]): Unit = js.native
  
  def frequency[T](array: js.Array[T], item: T): Double = js.native
  def frequency[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  def indexOf[T](array: js.Array[T], item: T): Double = js.native
  def indexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  def lastIndexOf[T](array: js.Array[T], item: T): Double = js.native
  def lastIndexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  def remove[T](array: js.Array[T], item: T): Boolean = js.native
  def remove[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  def swap[T](array: js.Array[T], i: Double, j: Double): Boolean = js.native
  
  def toString[T](array: js.Array[T]): String = js.native
}
