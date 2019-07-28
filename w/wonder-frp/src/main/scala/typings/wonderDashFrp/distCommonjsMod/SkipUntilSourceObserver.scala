package typings.wonderDashFrp.distCommonjsMod

import typings.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typings.wonderDashFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderDashFrp.distCommonjsObserverSkipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}

