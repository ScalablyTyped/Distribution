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

