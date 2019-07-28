package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Observer")
@js.native
abstract class Observer protected ()
  extends typings.wonderDashFrp.distCommonjsCoreObserverMod.Observer {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}

