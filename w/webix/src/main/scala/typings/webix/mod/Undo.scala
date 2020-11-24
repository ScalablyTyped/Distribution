package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Undo extends js.Object {
  
  def ignoreUndo(functor: WebixCallback): Unit = js.native
  
  def removeUndo(id: String): Unit = js.native
  
  def undo(id: String): Unit = js.native
}
@JSImport("webix", "Undo")
@js.native
object Undo extends TopLevel[Undo]
