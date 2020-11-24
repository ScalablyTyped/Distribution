package typings.unzipper.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.unzipper.anon.CompressedSize
import typings.unzipper.anon.Disknum
import typings.unzipper.anon.Path
import typings.unzipper.anon.TransformpromisePromisevo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends Transform {
  
  def autodrain(): TransformpromisePromisevo = js.native
  
  def buffer(): js.Promise[Buffer] = js.native
  
  var extra: Disknum = js.native
  
  var path: String = js.native
  
  var props: Path = js.native
  
  var `type`: String = js.native
  
  var vars: CompressedSize = js.native
}
