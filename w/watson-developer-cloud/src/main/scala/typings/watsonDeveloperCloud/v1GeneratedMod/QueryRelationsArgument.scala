package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsArgument. */
trait QueryRelationsArgument extends js.Object {
  /** Array of query entities. */
  var entities: js.UndefOr[js.Array[QueryEntitiesEntity]] = js.undefined
}

object QueryRelationsArgument {
  @scala.inline
  def apply(entities: js.Array[QueryEntitiesEntity] = null): QueryRelationsArgument = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRelationsArgument]
  }
}

