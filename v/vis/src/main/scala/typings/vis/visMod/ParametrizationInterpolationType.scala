package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.centripetal
  - typings.vis.visStrings.chordal
  - typings.vis.visStrings.uniform
  - typings.vis.visStrings.disabled
*/
trait ParametrizationInterpolationType extends js.Object

object ParametrizationInterpolationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def centripetal: typings.vis.visStrings.centripetal = this.cast("centripetal")
  @scala.inline
  def chordal: typings.vis.visStrings.chordal = this.cast("chordal")
  @scala.inline
  def disabled: typings.vis.visStrings.disabled = this.cast("disabled")
  @scala.inline
  def uniform: typings.vis.visStrings.uniform = this.cast("uniform")
}

