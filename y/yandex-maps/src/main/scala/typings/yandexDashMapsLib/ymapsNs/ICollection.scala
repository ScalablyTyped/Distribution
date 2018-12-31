package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends IEventEmitter {
  def add(`object`: js.Object): this.type
  def getIterator(): IIterator
  def remove(`object`: js.Object): this.type
}

