package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Undo extends js.Object {
  def ignoreUndo(functor: WebixCallback): Unit
  def removeUndo(id: String): Unit
  def undo(id: String): Unit
}

@JSImport("webix", "Undo")
@js.native
object Undo extends TopLevel[Undo]

