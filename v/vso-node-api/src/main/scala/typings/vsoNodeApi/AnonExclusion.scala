package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclusion extends js.Object {
  var exclusion: Double
  var inclusion: Double
}

object AnonExclusion {
  @scala.inline
  def apply(exclusion: Double, inclusion: Double): AnonExclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExclusion]
  }
}

