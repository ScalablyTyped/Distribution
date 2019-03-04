package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollectionOf[T /* <: Element */] extends HTMLCollectionBase {
  def namedItem(name: java.lang.String): T | scala.Null
}

object HTMLCollectionOf {
  @scala.inline
  def apply[T /* <: Element */](
    item: js.Function1[scala.Double, T | scala.Null],
    length: scala.Double,
    namedItem: js.Function1[java.lang.String, T | scala.Null]
  ): HTMLCollectionOf[T] = {
    val __obj = js.Dynamic.literal(item = item, length = length, namedItem = namedItem)
  
    __obj.asInstanceOf[HTMLCollectionOf[T]]
  }
}

