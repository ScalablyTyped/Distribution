package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MVCArray[T]
  extends StObject
     with MVCObject {
  
  /**
    * Removes all elements from the array.
    */
  def clear(): Unit = js.native
  
  /**
    * Iterate over each element, calling the provided callback. The callback is called for each element like: callback(element, index).
    */
  def forEach(callback: js.Function2[/* element */ T, /* index */ Double, Unit]): Unit = js.native
  
  def getArray(): js.Array[T] = js.native
  
  /**
    * Get the element at the specified index.
    */
  def getAt(i: Double): T = js.native
  
  /**
    * Get the number of elements in this array.
    */
  def getLength(): Double = js.native
  
  /**
    * Returns the index of a given element.
    */
  def indexOf(elem: T): Double = js.native
  
  /**
    * Inserts an element at the specified index.
    */
  def insertAt(i: Double, elem: T): Unit = js.native
  
  /**
    * Removes the last element of the array and returns that element.
    */
  def pop(): T = js.native
  
  /**
    * Adds one element to the end of the array and returns the new length of the array.
    */
  def push(elem: T): Double = js.native
  
  /**
    * Removes an element from the specified index.
    */
  def removeAt(i: Double): T = js.native
  
  /**
    * Sets an element at the specified index.
    */
  def setAt(i: Double, elem: T): Unit = js.native
}
