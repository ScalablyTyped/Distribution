package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextHelper extends js.Object {
  
  def attachTo(view: js.Any): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def setContext(context: js.Any): Unit = js.native
}
@JSImport("webix", "ContextHelper")
@js.native
object ContextHelper extends TopLevel[ContextHelper]
