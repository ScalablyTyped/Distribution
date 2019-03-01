package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQueryResult extends js.Object {
  /** The documentation string of the definition or value, if any. */
  var doc: js.UndefOr[java.lang.String] = js.undefined
  /** The origin of the definition or value, if any. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** The url of the definition or value, if any. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentationQueryResult {
  @scala.inline
  def apply(doc: java.lang.String = null, origin: java.lang.String = null, url: java.lang.String = null): DocumentationQueryResult = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DocumentationQueryResult]
  }
}

