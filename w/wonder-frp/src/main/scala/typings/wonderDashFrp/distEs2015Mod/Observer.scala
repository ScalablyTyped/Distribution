package typings.wonderDashFrp.distEs2015Mod

import typings.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "Observer")
@js.native
abstract class Observer protected ()
  extends typings.wonderDashFrp.distEs2015CoreObserverMod.Observer {
  def this(observer: IObserver) = this()
  def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
}

