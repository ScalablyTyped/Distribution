package typings.swDashPrecacheDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChunkName extends js.Object {
  var chunkName: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object Anon_ChunkName {
  @scala.inline
  def apply(chunkName: String = null, filename: String = null): Anon_ChunkName = {
    val __obj = js.Dynamic.literal()
    if (chunkName != null) __obj.updateDynamic("chunkName")(chunkName)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Anon_ChunkName]
  }
}

