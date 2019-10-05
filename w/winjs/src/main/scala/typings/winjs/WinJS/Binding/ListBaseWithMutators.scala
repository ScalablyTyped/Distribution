package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for normal list modifying operations.
  **/
@js.native
trait ListBaseWithMutators[T] extends ListBase[T] {
  //#region Methods
  /**
    * Removes the last element from a list and returns it.
    * @returns The last element from the list.
    **/
  def pop(): T = js.native
  /**
    * Appends new element(s) to a list, and returns the new length of the list.
    * @param value The element to insert at the end of the list.
    * @returns The new length of the list.
    **/
  def push(value: T): Double = js.native
  def push(values: T*): Double = js.native
  /**
    * Removes the first element from a list and returns it.
    * @returns The first element from the list.
    **/
  def shift(): T = js.native
  /**
    * Appends new element(s) to a list, and returns the new length of the list.
    * @param value The element to insert at the start of the list.
    * @returns The new length of the list.
    **/
  def unshift(value: T): Double = js.native
  def unshift(values: T*): Double = js.native
}

