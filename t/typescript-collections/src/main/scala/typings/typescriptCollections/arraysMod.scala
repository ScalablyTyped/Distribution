package typings.typescriptCollections

import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arraysMod {
  
  @JSImport("typescript-collections/dist/lib/arrays", "contains")
  @js.native
  def contains[T](array: js.Array[T], item: T): Boolean = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "contains")
  @js.native
  def contains[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "copy")
  @js.native
  def copy[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "equals")
  @js.native
  def equals_[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "equals")
  @js.native
  def equals_[T](array1: js.Array[T], array2: js.Array[T], equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "forEach")
  @js.native
  def forEach[T](array: js.Array[T], callback: ILoopFunction[T]): Unit = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "frequency")
  @js.native
  def frequency[T](array: js.Array[T], item: T): Double = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "frequency")
  @js.native
  def frequency[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], item: T): Double = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "indexOf")
  @js.native
  def indexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "lastIndexOf")
  @js.native
  def lastIndexOf[T](array: js.Array[T], item: T): Double = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "lastIndexOf")
  @js.native
  def lastIndexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "remove")
  @js.native
  def remove[T](array: js.Array[T], item: T): Boolean = js.native
  @JSImport("typescript-collections/dist/lib/arrays", "remove")
  @js.native
  def remove[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "swap")
  @js.native
  def swap[T](array: js.Array[T], i: Double, j: Double): Boolean = js.native
  
  @JSImport("typescript-collections/dist/lib/arrays", "toString")
  @js.native
  def toString_[T](array: js.Array[T]): String = js.native
}
