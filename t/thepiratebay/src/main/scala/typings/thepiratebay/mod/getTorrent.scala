package typings.thepiratebay.mod

import typings.thepiratebay.anon.DictpropName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thepiratebay", "getTorrent")
@js.native
object getTorrent extends js.Object {
  
  def apply(id: String): js.Promise[TorrentDetails] = js.native
  def apply(id: Double): js.Promise[TorrentDetails] = js.native
  def apply(id: DictpropName): js.Promise[TorrentDetails] = js.native
}
