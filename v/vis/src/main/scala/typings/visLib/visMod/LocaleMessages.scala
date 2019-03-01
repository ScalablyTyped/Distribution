package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleMessages extends js.Object {
  var addDescription: java.lang.String
  var addEdge: java.lang.String
  var addNode: java.lang.String
  var back: java.lang.String
  var createEdgeError: java.lang.String
  var del: java.lang.String
  var deleteClusterError: java.lang.String
  var edgeDescription: java.lang.String
  var edit: java.lang.String
  var editClusterError: java.lang.String
  var editEdge: java.lang.String
  var editEdgeDescription: java.lang.String
  var editNode: java.lang.String
}

object LocaleMessages {
  @scala.inline
  def apply(
    addDescription: java.lang.String,
    addEdge: java.lang.String,
    addNode: java.lang.String,
    back: java.lang.String,
    createEdgeError: java.lang.String,
    del: java.lang.String,
    deleteClusterError: java.lang.String,
    edgeDescription: java.lang.String,
    edit: java.lang.String,
    editClusterError: java.lang.String,
    editEdge: java.lang.String,
    editEdgeDescription: java.lang.String,
    editNode: java.lang.String
  ): LocaleMessages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDescription")(addDescription)
    __obj.updateDynamic("addEdge")(addEdge)
    __obj.updateDynamic("addNode")(addNode)
    __obj.updateDynamic("back")(back)
    __obj.updateDynamic("createEdgeError")(createEdgeError)
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("deleteClusterError")(deleteClusterError)
    __obj.updateDynamic("edgeDescription")(edgeDescription)
    __obj.updateDynamic("edit")(edit)
    __obj.updateDynamic("editClusterError")(editClusterError)
    __obj.updateDynamic("editEdge")(editEdge)
    __obj.updateDynamic("editEdgeDescription")(editEdgeDescription)
    __obj.updateDynamic("editNode")(editNode)
    __obj.asInstanceOf[LocaleMessages]
  }
}

