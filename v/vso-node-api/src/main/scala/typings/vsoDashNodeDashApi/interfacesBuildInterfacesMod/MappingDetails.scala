package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingDetails extends js.Object {
  /**
    * The local path.
    */
  var localPath: String
  /**
    * The mapping type.
    */
  var mappingType: String
  /**
    * The server path.
    */
  var serverPath: String
}

object MappingDetails {
  @scala.inline
  def apply(localPath: String, mappingType: String, serverPath: String): MappingDetails = {
    val __obj = js.Dynamic.literal(localPath = localPath, mappingType = mappingType, serverPath = serverPath)
  
    __obj.asInstanceOf[MappingDetails]
  }
}

