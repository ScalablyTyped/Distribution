package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  def allowMapEvent(): scala.Unit
  def callMethod(name: java.lang.String): scala.Unit
  def get(name: java.lang.String): js.Object
  def getSourceEvent(): IEvent | scala.Null
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isMapEventAllowed(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Boolean
  def stopImmediatePropagation(): scala.Boolean
  def stopPropagation(): scala.Boolean
}

