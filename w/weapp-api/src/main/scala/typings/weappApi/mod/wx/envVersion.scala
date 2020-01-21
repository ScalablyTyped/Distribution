package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappApi.weappApiStrings.develop
  - typings.weappApi.weappApiStrings.trial
  - typings.weappApi.weappApiStrings.release
*/
trait envVersion extends js.Object

object envVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typings.weappApi.weappApiStrings.develop = this.cast("develop")
  @scala.inline
  def release: typings.weappApi.weappApiStrings.release = this.cast("release")
  @scala.inline
  def trial: typings.weappApi.weappApiStrings.trial = this.cast("trial")
}

