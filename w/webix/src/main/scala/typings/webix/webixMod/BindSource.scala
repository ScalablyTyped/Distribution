package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindSource extends js.Object {
  def addBind(source: js.Any, rule: String, format: String): Unit = js.native
  def getBindData(key: String, update: Boolean): Unit = js.native
  def getBindData(key: Double, update: Boolean): Unit = js.native
  def removeBind(source: js.Any): Unit = js.native
  def saveBatch(handler: WebixCallback): Unit = js.native
  def setBindData(data: js.Any, key: String): Unit = js.native
  def setBindData(data: js.Any, key: Double): Unit = js.native
}

@JSImport("webix", "BindSource")
@js.native
object BindSource extends TopLevel[BindSource]

