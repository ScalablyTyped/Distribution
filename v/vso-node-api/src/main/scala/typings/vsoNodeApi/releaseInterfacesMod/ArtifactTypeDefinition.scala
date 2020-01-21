package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactTypeDefinition extends js.Object {
  var displayName: String
  var inputDescriptors: js.Array[InputDescriptor]
  var name: String
  var uniqueSourceIdentifier: String
}

object ArtifactTypeDefinition {
  @scala.inline
  def apply(
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactTypeDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactTypeDefinition]
  }
}

