package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var files: js.UndefOr[js.Array[File]] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Document {
  @scala.inline
  def apply(files: js.Array[File] = null, query: Query = null, timeout: scala.Int | scala.Double = null): Document = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (query != null) __obj.updateDynamic("query")(query)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

