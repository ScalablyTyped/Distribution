package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Stream")
@js.native
abstract class Stream protected ()
  extends typings.wonderFrp.streamMod.Stream {
  def this(subscribeFunc: js.Any) = this()
}

