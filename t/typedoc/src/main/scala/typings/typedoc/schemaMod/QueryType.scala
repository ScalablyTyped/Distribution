package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.QueryType, 'type' | 'queryType'> */
trait QueryType extends js.Object {
  var queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType
  var `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
}

object QueryType {
  @scala.inline
  def apply(
    queryType: ModelToObject[typings.typedoc.modelsTypesReferenceMod.ReferenceType] | typings.typedoc.modelsTypesReferenceMod.ReferenceType,
    `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
  ): QueryType = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
}

