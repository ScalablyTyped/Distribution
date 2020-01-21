package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.bevel
  - typings.weappApi.weappApiStrings.round
  - typings.weappApi.weappApiStrings.miter
*/
trait LineJoinType extends js.Object

object LineJoinType {
  @scala.inline
  def bevel: typings.weappApi.weappApiStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def miter: typings.weappApi.weappApiStrings.miter = this.cast("miter")
  @scala.inline
  def round: typings.weappApi.weappApiStrings.round = this.cast("round")
}

