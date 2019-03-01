package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InformationNode extends js.Object {
  /**
    * Fields of the information node
    */
  var fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Process or person that last modified this node
    */
  var lastModifiedBy: java.lang.String
  /**
    * Date this node was last modified
    */
  var lastModifiedDate: stdLib.Date
  /**
    * Node Id of this information node
    */
  var nodeId: scala.Double
  /**
    * Id of parent node (xml tree)
    */
  var parentId: scala.Double
  /**
    * The type of the information node
    */
  var `type`: java.lang.String
}

object InformationNode {
  @scala.inline
  def apply(
    fields: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    lastModifiedBy: java.lang.String,
    lastModifiedDate: stdLib.Date,
    nodeId: scala.Double,
    parentId: scala.Double,
    `type`: java.lang.String
  ): InformationNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.updateDynamic("nodeId")(nodeId)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[InformationNode]
  }
}

