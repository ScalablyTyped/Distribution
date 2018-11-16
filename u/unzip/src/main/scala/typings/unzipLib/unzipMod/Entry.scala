package typings
package unzipLib.unzipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry
  extends nodeLib.streamMod.PassThrough {
  var path: java.lang.String = js.native
  var size: scala.Double = js.native
  var `type`: unzipLib.unzipLibStrings.Directory | unzipLib.unzipLibStrings.File = js.native
  def autodrain(): scala.Unit = js.native
}

