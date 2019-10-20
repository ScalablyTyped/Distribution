package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of dialog nodes. */
trait DialogNodeCollection extends js.Object {
  /** An array of objects describing the dialog nodes defined for the workspace. */
  var dialog_nodes: js.Array[DialogNode]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object DialogNodeCollection {
  @scala.inline
  def apply(dialog_nodes: js.Array[DialogNode], pagination: Pagination): DialogNodeCollection = {
    val __obj = js.Dynamic.literal(dialog_nodes = dialog_nodes, pagination = pagination)
  
    __obj.asInstanceOf[DialogNodeCollection]
  }
}

