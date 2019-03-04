package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvnWorkspace extends js.Object {
  var mappings: js.Array[SvnMappingDetails]
}

object SvnWorkspace {
  @scala.inline
  def apply(mappings: js.Array[SvnMappingDetails]): SvnWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings)
  
    __obj.asInstanceOf[SvnWorkspace]
  }
}

