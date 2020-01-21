package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typings.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream): typings.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}

