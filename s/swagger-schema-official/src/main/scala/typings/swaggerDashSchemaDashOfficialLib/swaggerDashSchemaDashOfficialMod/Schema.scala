package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Schema extends BaseSchema {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  var additionalProperties: js.UndefOr[Schema] = js.undefined
  var allOf: js.UndefOr[js.Array[Schema]] = js.undefined
  var discriminator: js.UndefOr[java.lang.String] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[Schema]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xml: js.UndefOr[XML] = js.undefined
}

