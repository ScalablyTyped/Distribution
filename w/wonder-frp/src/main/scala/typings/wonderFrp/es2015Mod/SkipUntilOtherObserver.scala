package typings.wonderFrp.es2015Mod

import typings.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typings.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ): typings.wonderFrp.observerSkipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}

