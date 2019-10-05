package typings.wonderDashFrp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/core/Entity", JSImport.Namespace)
@js.native
object distCommonjsCoreEntityMod extends js.Object {
  @js.native
  abstract class Entity protected () extends js.Object {
    def this(uidPre: String) = this()
    var _uid: js.Any = js.native
    var uid: String = js.native
  }
  
  /* static members */
  @js.native
  object Entity extends js.Object {
    var UID: Double = js.native
  }
  
}

