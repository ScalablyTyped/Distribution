package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupStore extends js.Object {
  
  def group(config: js.Any): Unit = js.native
  def group(config: js.Any, target: String): Unit = js.native
  
  def ungroup(): Unit = js.native
}
@JSImport("webix", "GroupStore")
@js.native
object GroupStore extends TopLevel[GroupStore]
