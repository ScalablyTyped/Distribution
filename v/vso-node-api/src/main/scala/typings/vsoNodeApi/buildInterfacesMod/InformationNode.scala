package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InformationNode extends js.Object {
  /**
    * Fields of the information node
    */
  var fields: StringDictionary[String] = js.native
  /**
    * Process or person that last modified this node
    */
  var lastModifiedBy: String = js.native
  /**
    * Date this node was last modified
    */
  var lastModifiedDate: Date = js.native
  /**
    * Node Id of this information node
    */
  var nodeId: Double = js.native
  /**
    * Id of parent node (xml tree)
    */
  var parentId: Double = js.native
  /**
    * The type of the information node
    */
  var `type`: String = js.native
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
  @scala.inline
  implicit class InformationNodeOps[Self <: InformationNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: Double): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: Double): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

