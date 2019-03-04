package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeTablePaste extends js.Object {
  def insert(data: js.Array[_]): scala.Unit
}

object TreeTablePaste {
  @scala.inline
  def apply(insert: js.Function1[js.Array[_], scala.Unit]): TreeTablePaste = {
    val __obj = js.Dynamic.literal(insert = insert)
  
    __obj.asInstanceOf[TreeTablePaste]
  }
}

