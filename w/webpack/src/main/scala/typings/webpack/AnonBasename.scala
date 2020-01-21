package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBasename extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var chunk: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[js.Any] = js.undefined
}

object AnonBasename {
  @scala.inline
  def apply(
    basename: String = null,
    chunk: js.Any = null,
    filename: String = null,
    hash: js.Any = null,
    query: js.Any = null
  ): AnonBasename = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasename]
  }
}

