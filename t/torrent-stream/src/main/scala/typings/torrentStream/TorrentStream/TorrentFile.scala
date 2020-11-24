package typings.torrentStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TorrentFile extends js.Object {
  
  def createReadStream(): js.Any = js.native
  def createReadStream(options: ReadStreamOptions): js.Any = js.native
  
  def deselect(): Unit = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  def select(): Unit = js.native
}
