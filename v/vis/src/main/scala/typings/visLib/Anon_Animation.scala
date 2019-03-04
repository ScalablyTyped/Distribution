package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: visLib.visMod.TimelineAnimationOptions
  var focus: scala.Boolean
}

object Anon_Animation {
  @scala.inline
  def apply(animation: visLib.visMod.TimelineAnimationOptions, focus: scala.Boolean): Anon_Animation = {
    val __obj = js.Dynamic.literal(animation = animation, focus = focus)
  
    __obj.asInstanceOf[Anon_Animation]
  }
}

