package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Undo extends js.Object {
  def ignoreUndo(functor: webixLib.WebixCallback): scala.Unit
  def removeUndo(id: java.lang.String): scala.Unit
  def undo(id: java.lang.String): scala.Unit
}

object Undo {
  @scala.inline
  def apply(
    ignoreUndo: js.Function1[webixLib.WebixCallback, scala.Unit],
    removeUndo: js.Function1[java.lang.String, scala.Unit],
    undo: js.Function1[java.lang.String, scala.Unit]
  ): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = ignoreUndo, removeUndo = removeUndo, undo = undo)
  
    __obj.asInstanceOf[Undo]
  }
}

