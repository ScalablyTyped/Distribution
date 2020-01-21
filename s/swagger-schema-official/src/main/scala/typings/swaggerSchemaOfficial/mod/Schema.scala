package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends BaseSchema {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var additionalProperties: js.UndefOr[Schema | Boolean] = js.native
  var allOf: js.UndefOr[js.Array[Schema]] = js.native
  var discriminator: js.UndefOr[String] = js.native
  var example: js.UndefOr[js.Any] = js.native
  var externalDocs: js.UndefOr[ExternalDocs] = js.native
  var properties: js.UndefOr[StringDictionary[Schema]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var xml: js.UndefOr[XML] = js.native
}

