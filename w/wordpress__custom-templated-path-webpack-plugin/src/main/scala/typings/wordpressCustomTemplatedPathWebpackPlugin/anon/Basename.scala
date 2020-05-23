package typings.wordpressCustomTemplatedPathWebpackPlugin.anon

import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basename extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var chunk: js.UndefOr[Chunk] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
}

object Basename {
  @scala.inline
  def apply(
    basename: String = null,
    chunk: Chunk = null,
    filename: String = null,
    hash: String = null,
    query: js.Any = null
  ): Basename = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
}

