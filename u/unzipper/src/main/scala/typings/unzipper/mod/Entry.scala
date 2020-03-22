package typings.unzipper.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.unzipper.AnonCompressedSize
import typings.unzipper.AnonDisknum
import typings.unzipper.AnonPath
import typings.unzipper.TransformpromisePromisevo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends Transform {
  var extra: AnonDisknum = js.native
  var path: String = js.native
  var props: AnonPath = js.native
  var `type`: String = js.native
  var vars: AnonCompressedSize = js.native
  def autodrain(): TransformpromisePromisevo = js.native
  def buffer(): js.Promise[Buffer] = js.native
}

