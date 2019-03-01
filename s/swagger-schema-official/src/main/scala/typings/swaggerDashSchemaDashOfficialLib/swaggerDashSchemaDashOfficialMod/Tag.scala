package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var name: java.lang.String
}

object Tag {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null, externalDocs: ExternalDocs = null): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    __obj.asInstanceOf[Tag]
  }
}

