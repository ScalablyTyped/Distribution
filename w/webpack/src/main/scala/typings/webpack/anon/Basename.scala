package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basename extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var chunk: js.UndefOr[js.Any] = js.undefined
  var contentHash: js.UndefOr[String] = js.undefined
  var contentHashType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
}

object Basename {
  @scala.inline
  def apply(
    basename: String = null,
    chunk: js.Any = null,
    contentHash: String = null,
    contentHashType: String = null,
    filename: String = null,
    hash: js.Any = null,
    query: js.Any = null
  ): Basename = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (contentHashType != null) __obj.updateDynamic("contentHashType")(contentHashType.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
}

