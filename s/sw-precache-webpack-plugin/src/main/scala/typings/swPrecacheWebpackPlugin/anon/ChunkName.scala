package typings.swPrecacheWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkName extends js.Object {
  var chunkName: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object ChunkName {
  @scala.inline
  def apply(chunkName: String = null, filename: String = null): ChunkName = {
    val __obj = js.Dynamic.literal()
    if (chunkName != null) __obj.updateDynamic("chunkName")(chunkName.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkName]
  }
}

