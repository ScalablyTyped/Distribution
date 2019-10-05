package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typings.wonderDashFrp.distCommonjsDisposableInnerSubscriptionGroupMod.InnerSubscriptionGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/InnerSubscriptionGroup", JSImport.Namespace)
@js.native
object distCommonjsDisposableInnerSubscriptionGroupMod extends js.Object {
  @js.native
  class InnerSubscriptionGroup () extends IDisposable {
    var _container: js.Any = js.native
    def addChild(child: IDisposable): Unit = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object InnerSubscriptionGroup extends js.Object {
    def create(): InnerSubscriptionGroup = js.native
  }
  
}

