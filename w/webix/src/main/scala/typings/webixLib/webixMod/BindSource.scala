package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindSource extends js.Object {
  def addBind(source: js.Any, rule: java.lang.String, format: java.lang.String): scala.Unit = js.native
  def getBindData(key: java.lang.String, update: scala.Boolean): scala.Unit = js.native
  def getBindData(key: scala.Double, update: scala.Boolean): scala.Unit = js.native
  def removeBind(source: js.Any): scala.Unit = js.native
  def saveBatch(handler: webixLib.WebixCallback): scala.Unit = js.native
  def setBindData(data: js.Any, key: java.lang.String): scala.Unit = js.native
  def setBindData(data: js.Any, key: scala.Double): scala.Unit = js.native
}

