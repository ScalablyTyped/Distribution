package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  var name: String
}

object Tag {
  @scala.inline
  def apply(name: String, description: String = null, externalDocs: ExternalDocs = null): Tag = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    __obj.asInstanceOf[Tag]
  }
}

