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
    ignoreUndo: webixLib.WebixCallback => scala.Unit,
    removeUndo: java.lang.String => scala.Unit,
    undo: java.lang.String => scala.Unit
  ): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = js.Any.fromFunction1(ignoreUndo), removeUndo = js.Any.fromFunction1(removeUndo), undo = js.Any.fromFunction1(undo))
  
    __obj.asInstanceOf[Undo]
  }
}

