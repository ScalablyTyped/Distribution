package typings.wonderFrp.mod

import typings.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typings.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(prevObserver: IObserver, skipUntilStream: typings.wonderFrp.skipUntilStreamMod.SkipUntilStream): typings.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}

