package typings
package yaddaLib.libFileSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSearch extends js.Object {
  def each(fn: js.Function1[/* file */ java.lang.String, scala.Unit]): scala.Unit
  def list(): js.Array[java.lang.String]
}

object FileSearch {
  @scala.inline
  def apply(
    each: js.Function1[/* file */ java.lang.String, scala.Unit] => scala.Unit,
    list: () => js.Array[java.lang.String]
  ): FileSearch = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[FileSearch]
  }
}

