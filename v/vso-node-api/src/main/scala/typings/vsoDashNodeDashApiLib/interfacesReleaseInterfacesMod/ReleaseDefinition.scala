package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinition extends js.Object {
  /**
    * Gets links to access the release definition.
    */
  var _links: js.Any
  /**
    * Gets or sets the list of artifacts.
    */
  var artifacts: js.Array[Artifact]
  /**
    * Gets or sets comment.
    */
  var comment: java.lang.String
  /**
    * Gets or sets the identity who created.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets or sets the description.
    */
  var description: java.lang.String
  /**
    * Gets or sets the list of environments.
    */
  var environments: js.Array[ReleaseDefinitionEnvironment]
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Whether release definition is deleted.
    */
  var isDeleted: scala.Boolean
  /**
    * Gets the reference of last release.
    */
  var lastRelease: ReleaseReference
  /**
    * Gets or sets the identity who modified.
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: stdLib.Date
  /**
    * Gets or sets the name.
    */
  var name: java.lang.String
  /**
    * Gets or sets the path.
    */
  var path: java.lang.String
  /**
    * Gets or sets pipeline process.
    */
  var pipelineProcess: PipelineProcess
  /**
    * Gets or sets properties.
    */
  var properties: js.Any
  /**
    * Gets or sets the release name format.
    */
  var releaseNameFormat: java.lang.String
  var retentionPolicy: RetentionPolicy
  /**
    * Gets the revision number.
    */
  var revision: scala.Double
  /**
    * Gets or sets source of release definition.
    */
  var source: ReleaseDefinitionSource
  /**
    * Gets or sets list of tags.
    */
  var tags: js.Array[java.lang.String]
  /**
    * Gets or sets the list of triggers.
    */
  var triggers: js.Array[ReleaseTriggerBase]
  /**
    * Gets url to access the release definition.
    */
  var url: java.lang.String
  /**
    * Gets or sets the list of variable groups.
    */
  var variableGroups: js.Array[scala.Double]
  /**
    * Gets or sets the dictionary of variables.
    */
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
}

object ReleaseDefinition {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    comment: java.lang.String,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    description: java.lang.String,
    environments: js.Array[ReleaseDefinitionEnvironment],
    id: scala.Double,
    isDeleted: scala.Boolean,
    lastRelease: ReleaseReference,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    path: java.lang.String,
    pipelineProcess: PipelineProcess,
    properties: js.Any,
    releaseNameFormat: java.lang.String,
    retentionPolicy: RetentionPolicy,
    revision: scala.Double,
    source: ReleaseDefinitionSource,
    tags: js.Array[java.lang.String],
    triggers: js.Array[ReleaseTriggerBase],
    url: java.lang.String,
    variableGroups: js.Array[scala.Double],
    variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
  ): ReleaseDefinition = {
    val __obj = js.Dynamic.literal(_links = _links, artifacts = artifacts, comment = comment, createdBy = createdBy, createdOn = createdOn, description = description, environments = environments, id = id, isDeleted = isDeleted, lastRelease = lastRelease, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, path = path, pipelineProcess = pipelineProcess, properties = properties, releaseNameFormat = releaseNameFormat, retentionPolicy = retentionPolicy, revision = revision, source = source, tags = tags, triggers = triggers, url = url, variableGroups = variableGroups, variables = variables)
  
    __obj.asInstanceOf[ReleaseDefinition]
  }
}

