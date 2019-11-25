package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.weappDashApi.weappDashApiStrings.develop
  - typings.weappDashApi.weappDashApiStrings.trial
  - typings.weappDashApi.weappDashApiStrings.release
*/
trait envVersion extends js.Object

object envVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def develop: typings.weappDashApi.weappDashApiStrings.develop = this.cast("develop")
  @scala.inline
  def release: typings.weappDashApi.weappDashApiStrings.release = this.cast("release")
  @scala.inline
  def trial: typings.weappDashApi.weappDashApiStrings.trial = this.cast("trial")
}

