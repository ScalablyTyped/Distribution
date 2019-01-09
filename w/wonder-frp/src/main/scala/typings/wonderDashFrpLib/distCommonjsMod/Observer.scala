package typings
package wonderDashFrpLib.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "Observer")
@js.native
abstract class Observer protected ()
  extends wonderDashFrpLib.distCommonjsCoreObserverMod.Observer {
  def this(observer: wonderDashFrpLib.distCommonjsObserverIObserverMod.IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}

