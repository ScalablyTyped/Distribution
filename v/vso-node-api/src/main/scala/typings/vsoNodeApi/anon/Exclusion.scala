package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclusion extends js.Object {
  var exclusion: scala.Double
  var inclusion: scala.Double
}

object Exclusion {
  @scala.inline
  def apply(exclusion: scala.Double, inclusion: scala.Double): Exclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
}

