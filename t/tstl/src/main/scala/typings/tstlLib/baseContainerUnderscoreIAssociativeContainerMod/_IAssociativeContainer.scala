package typings
package tstlLib.baseContainerUnderscoreIAssociativeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _IAssociativeContainer[Key, Iterator] extends js.Object {
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  def count(key: Key): scala.Double
  /**
    * Erase elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of erased elements.
    */
  def erase(key: Key): scala.Double
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  def find(key: Key): Iterator
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  def has(key: Key): scala.Boolean
}

