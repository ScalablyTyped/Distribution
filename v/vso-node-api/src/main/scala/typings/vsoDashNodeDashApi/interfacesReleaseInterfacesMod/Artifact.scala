package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  /**
    * Gets or sets alias.
    */
  var alias: String
  /**
    * Gets or sets definition reference. e.g. {"project":{"id":"fed755ea-49c5-4399-acea-fd5b5aa90a6c","name":"myProject"},"definition":{"id":"1","name":"mybuildDefinition"},"connection":{"id":"1","name":"myConnection"}}
    */
  var definitionReference: StringDictionary[ArtifactSourceReference]
  /**
    * Gets or sets as artifact is primary or not.
    */
  var isPrimary: Boolean
  var sourceId: String
  /**
    * Gets or sets type. It can have value as 'Build', 'Jenkins', 'GitHub', 'Nuget', 'Team Build (external)', 'ExternalTFSBuild', 'Git', 'TFVC', 'ExternalTfsXamlBuild'.
    */
  var `type`: String
}

object Artifact {
  @scala.inline
  def apply(
    alias: String,
    definitionReference: StringDictionary[ArtifactSourceReference],
    isPrimary: Boolean,
    sourceId: String,
    `type`: String
  ): Artifact = {
    val __obj = js.Dynamic.literal(alias = alias, definitionReference = definitionReference, isPrimary = isPrimary, sourceId = sourceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Artifact]
  }
}

