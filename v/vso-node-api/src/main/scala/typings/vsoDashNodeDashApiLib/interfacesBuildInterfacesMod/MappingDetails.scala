package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingDetails extends js.Object {
  /**
    * The local path.
    */
  var localPath: java.lang.String
  /**
    * The mapping type.
    */
  var mappingType: java.lang.String
  /**
    * The server path.
    */
  var serverPath: java.lang.String
}

object MappingDetails {
  @scala.inline
  def apply(localPath: java.lang.String, mappingType: java.lang.String, serverPath: java.lang.String): MappingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localPath")(localPath)
    __obj.updateDynamic("mappingType")(mappingType)
    __obj.updateDynamic("serverPath")(serverPath)
    __obj.asInstanceOf[MappingDetails]
  }
}

