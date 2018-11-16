package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayout extends IEventEmitter {
  // new (data: object);
  def destroy(): scala.Unit = js.native
  def getData(): js.Object = js.native
  def getParentElement(): stdLib.HTMLElement = js.native
  def getShape(): IShape | scala.Null = js.native
  def isEmpty(): scala.Boolean = js.native
  def setData(data: js.Object): scala.Unit = js.native
  def setParentElement(): scala.Unit = js.native
  def setParentElement(parent: stdLib.HTMLElement): scala.Unit = js.native
}

