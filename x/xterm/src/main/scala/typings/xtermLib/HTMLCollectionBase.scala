package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollectionBase
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Element] {
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: scala.Double
  /**
    * Retrieves an object from various collections.
    */
  def item(index: scala.Double): Element | scala.Null
}

object HTMLCollectionBase {
  @scala.inline
  def apply(
    item: js.Function1[scala.Double, Element | scala.Null],
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Element] = null
  ): HTMLCollectionBase = {
    val __obj = js.Dynamic.literal(item = item, length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[HTMLCollectionBase]
  }
}

