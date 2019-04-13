package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocumentationObject
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ExternalDocumentationObject {
  @scala.inline
  def apply(
    url: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    description: java.lang.String = null
  ): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
}

