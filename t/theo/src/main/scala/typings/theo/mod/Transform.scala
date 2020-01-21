package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.theo.theoStrings.raw
  - typings.theo.theoStrings.ios
  - typings.theo.theoStrings.android
  - typings.theo.theoStrings.web
*/
trait Transform extends js.Object

object Transform {
  @scala.inline
  def android: typings.theo.theoStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typings.theo.theoStrings.ios = this.cast("ios")
  @scala.inline
  def raw: typings.theo.theoStrings.raw = this.cast("raw")
  @scala.inline
  def web: typings.theo.theoStrings.web = this.cast("web")
}

