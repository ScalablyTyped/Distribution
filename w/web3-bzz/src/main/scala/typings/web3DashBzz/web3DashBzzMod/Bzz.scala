package typings.web3DashBzz.web3DashBzzMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-bzz", "Bzz")
@js.native
class Bzz protected () extends js.Object {
  def this(provider: js.Any) = this()
  var BatchRequest: Instantiable0[js.Any] = js.native
  val currentProvider: js.Any = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  val givenProvider: js.Any = js.native
  var pick: Pick = js.native
  def download(bzzHash: String): js.Promise[_] = js.native
  def download(bzzHash: String, localPath: String): js.Promise[_] = js.native
  def setProvider(provider: js.Any): Boolean = js.native
  def upload(data: js.Any): js.Promise[String] = js.native
}

/* static members */
@JSImport("web3-bzz", "Bzz")
@js.native
object Bzz extends js.Object {
  val providers: js.Any = js.native
}

