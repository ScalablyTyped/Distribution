package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IIterator[T] extends js.Object {
  var current: T
  var hasCurrent: scala.Boolean
  def getMany(): winrtLib.Anon_ItemsReturnValueArrayT[T]
  def moveNext(): scala.Boolean
}

