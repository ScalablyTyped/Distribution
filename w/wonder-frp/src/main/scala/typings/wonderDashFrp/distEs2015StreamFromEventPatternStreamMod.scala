package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015StreamBaseStreamMod.BaseStream
import typings.wonderDashFrp.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromEventPatternStream", JSImport.Namespace)
@js.native
object distEs2015StreamFromEventPatternStreamMod extends js.Object {
  @js.native
  class FromEventPatternStream protected () extends BaseStream {
    def this(addHandler: js.Function, removeHandler: js.Function) = this()
    var _addHandler: js.Any = js.native
    var _removeHandler: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FromEventPatternStream extends js.Object {
    def create(addHandler: js.Function, removeHandler: js.Function): FromEventPatternStream = js.native
  }
  
}

