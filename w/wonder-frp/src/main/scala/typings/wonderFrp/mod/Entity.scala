package typings.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Entity")
@js.native
abstract class Entity protected ()
  extends typings.wonderFrp.entityMod.Entity {
  def this(uidPre: String) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "Entity")
@js.native
object Entity extends js.Object {
  var UID: Double = js.native
}

