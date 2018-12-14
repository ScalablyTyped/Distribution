package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Release extends js.Object {
  /**
       * Gets links to access the release.
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
       * Gets revision number of definition snapshot.
       */
  var definitionSnapshotRevision: scala.Double
  /**
       * Gets or sets description of release.
       */
  var description: java.lang.String
  /**
       * Gets list of environments.
       */
  var environments: js.Array[ReleaseEnvironment]
  /**
       * Gets the unique identifier of this field.
       */
  var id: scala.Double
  /**
       * Whether to exclude the release from retention policies.
       */
  var keepForever: scala.Boolean
  /**
       * Gets logs container url.
       */
  var logsContainerUrl: java.lang.String
  /**
       * Gets or sets the identity who modified.
       */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Gets date on which it got modified.
       */
  var modifiedOn: stdLib.Date
  /**
       * Gets name.
       */
  var name: java.lang.String
  /**
       * Gets pool name.
       */
  var poolName: java.lang.String
  /**
       * Gets or sets project reference.
       */
  var projectReference: ProjectReference
  var properties: js.Any
  /**
       * Gets reason of release.
       */
  var reason: ReleaseReason
  /**
       * Gets releaseDefinitionReference which specifies the reference of the release definition to which this release is associated.
       */
  var releaseDefinition: ReleaseDefinitionShallowReference
  /**
       * Gets release name format.
       */
  var releaseNameFormat: java.lang.String
  /**
       * Gets status.
       */
  var status: ReleaseStatus
  /**
       * Gets or sets list of tags.
       */
  var tags: js.Array[java.lang.String]
  var triggeringArtifactAlias: java.lang.String
  var url: java.lang.String
  /**
       * Gets the list of variable groups.
       */
  var variableGroups: js.Array[VariableGroup]
  /**
       * Gets or sets the dictionary of variables.
       */
  var variables: org.scalablytyped.runtime.StringDictionary[ConfigurationVariableValue]
}

