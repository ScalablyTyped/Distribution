package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InformationNode extends StObject {
  
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
  var lastModifiedDate: js.Date
  
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
  
  inline def apply(
    fields: StringDictionary[String],
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    nodeId: Double,
    parentId: Double,
    `type`: String
  ): InformationNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InformationNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InformationNode] (val x: Self) extends AnyVal {
    
    inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
