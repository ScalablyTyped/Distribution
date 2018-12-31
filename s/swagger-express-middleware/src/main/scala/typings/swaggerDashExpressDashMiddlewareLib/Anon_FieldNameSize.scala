package typings
package swaggerDashExpressDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldNameSize extends js.Object {
  /** Max field name size (Default: 100 bytes) */
  var fieldNameSize: js.UndefOr[scala.Double] = js.undefined
  /** Max field value size (Default: 1MB) */
  var fieldSize: js.UndefOr[scala.Double] = js.undefined
  /** Max number of non- file fields (Default: Infinity) */
  var fields: js.UndefOr[scala.Double] = js.undefined
  /** For multipart forms, the max file size (in bytes)(Default: Infinity) */
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  /** For multipart forms, the max number of file fields (Default: Infinity) */
  var files: js.UndefOr[scala.Double] = js.undefined
  /** For multipart forms, the max number of header key=> value pairs to parse Default: 2000(same as node's http). */
  var headerPairs: js.UndefOr[scala.Double] = js.undefined
  /** For multipart forms, the max number of parts (fields + files)(Default: Infinity) */
  var parts: js.UndefOr[scala.Double] = js.undefined
}

