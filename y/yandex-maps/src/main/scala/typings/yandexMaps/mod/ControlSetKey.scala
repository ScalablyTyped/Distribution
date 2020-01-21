package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yandexMaps.yandexMapsStrings.smallMapDefaultSet
  - typings.yandexMaps.yandexMapsStrings.mediumMapDefaultSet
  - typings.yandexMaps.yandexMapsStrings.largeMapDefaultSet
  - typings.yandexMaps.yandexMapsStrings.default
*/
trait ControlSetKey extends js.Object

object ControlSetKey {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.yandexMaps.yandexMapsStrings.default = this.cast("default")
  @scala.inline
  def largeMapDefaultSet: typings.yandexMaps.yandexMapsStrings.largeMapDefaultSet = this.cast("largeMapDefaultSet")
  @scala.inline
  def mediumMapDefaultSet: typings.yandexMaps.yandexMapsStrings.mediumMapDefaultSet = this.cast("mediumMapDefaultSet")
  @scala.inline
  def smallMapDefaultSet: typings.yandexMaps.yandexMapsStrings.smallMapDefaultSet = this.cast("smallMapDefaultSet")
}

