package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InformationNode extends js.Object {
  /**
    * Fields of the information node
    */
  var fields: StringDictionary[String]
  /**
    * Process or person that last modified this node
    */
  var lastModifiedBy: String
  /**
    * Date this node was last modified
    */
  var lastModifiedDate: Date
  /**
    * Node Id of this information node
    */
  var nodeId: Double
  /**
    * Id of parent node (xml tree)
    */
  var parentId: Double
  /**
    * The type of the information node
    */
  var `type`: String
}

object InformationNode {
  @scala.inline
  def apply(
    fields: StringDictionary[String],
    lastModifiedBy: String,
    lastModifiedDate: Date,
    nodeId: Double,
    parentId: Double,
    `type`: String
  ): InformationNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InformationNode]
  }
}

