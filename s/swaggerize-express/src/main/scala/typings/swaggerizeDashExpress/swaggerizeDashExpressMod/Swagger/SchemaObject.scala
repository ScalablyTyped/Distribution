package typings.swaggerizeDashExpress.swaggerizeDashExpressMod.Swagger

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerizeDashExpress.swaggerizeDashExpressMod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaObject
  extends IJsonSchema
     with /* index */ StringDictionary[js.Any] {
  var discriminator: js.UndefOr[String] = js.native
  var example: js.Any = js.native
  var externalDocs: ExternalDocumentationObject = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var xml: js.UndefOr[XMLObject] = js.native
}

