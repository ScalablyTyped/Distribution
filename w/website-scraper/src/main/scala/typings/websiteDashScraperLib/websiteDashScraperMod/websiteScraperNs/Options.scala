package typings
package websiteDashScraperLib.websiteDashScraperMod.websiteScraperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultFilename: js.UndefOr[java.lang.String] = js.undefined
  var directory: java.lang.String
  var filenameGenerator: js.UndefOr[java.lang.String] = js.undefined
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var prettifyUrls: js.UndefOr[scala.Boolean] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[RequestOptions] = js.undefined
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  var subdirectories: js.UndefOr[js.Array[SubDirectory] | scala.Null] = js.undefined
  var urlFilter: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Boolean]] = js.undefined
  var urls: js.Array[java.lang.String | Url]
}

