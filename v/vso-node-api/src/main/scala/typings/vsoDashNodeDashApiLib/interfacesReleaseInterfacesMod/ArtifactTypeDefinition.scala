package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactTypeDefinition extends js.Object {
  var displayName: java.lang.String
  var inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor]
  var name: java.lang.String
  var uniqueSourceIdentifier: java.lang.String
}

object ArtifactTypeDefinition {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    inputDescriptors: js.Array[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputDescriptor],
    name: java.lang.String,
    uniqueSourceIdentifier: java.lang.String
  ): ArtifactTypeDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName, inputDescriptors = inputDescriptors, name = name, uniqueSourceIdentifier = uniqueSourceIdentifier)
  
    __obj.asInstanceOf[ArtifactTypeDefinition]
  }
}

