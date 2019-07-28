package typings.unzip.unzipMod

import typings.node.streamMod.PassThrough
import typings.unzip.unzipStrings.Directory
import typings.unzip.unzipStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends PassThrough {
  var path: String = js.native
  var size: Double = js.native
  var `type`: Directory | File = js.native
  def autodrain(): Unit = js.native
}

