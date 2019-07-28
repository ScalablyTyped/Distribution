package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderDashFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}

