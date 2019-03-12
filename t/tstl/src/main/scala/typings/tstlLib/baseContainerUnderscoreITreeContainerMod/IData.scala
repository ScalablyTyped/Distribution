package typings
package tstlLib.baseContainerUnderscoreITreeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait IData[T, Iterator] extends js.Object {
  def insert(pos: Iterator, `val`: T): Iterator
}

object IData {
  @scala.inline
  def apply[T, Iterator](insert: (Iterator, T) => Iterator): IData[T, Iterator] = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction2(insert))
  
    __obj.asInstanceOf[IData[T, Iterator]]
  }
}

