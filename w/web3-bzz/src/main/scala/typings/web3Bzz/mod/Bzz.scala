package typings.web3Bzz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-bzz", "Bzz")
@js.native
class Bzz () extends js.Object {
  def this(provider: js.Any) = this()
  
  val currentProvider: js.Any = js.native
  
  def download(bzzHash: String): js.Promise[_] = js.native
  def download(bzzHash: String, localPath: String): js.Promise[_] = js.native
  
  val givenProvider: js.Any = js.native
  
  var pick: Pick = js.native
  
  def setProvider(provider: js.Any): Boolean = js.native
  
  def upload(data: js.Any): js.Promise[String] = js.native
}
/* static members */
@JSImport("web3-bzz", "Bzz")
@js.native
object Bzz extends js.Object {
  
  val givenProvider: js.Any = js.native
}
