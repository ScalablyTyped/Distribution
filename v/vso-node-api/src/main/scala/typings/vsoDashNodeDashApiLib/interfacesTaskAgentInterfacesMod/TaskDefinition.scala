package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinition extends js.Object {
  var agentExecution: TaskExecution
  var author: java.lang.String
  var category: java.lang.String
  var contentsUploaded: scala.Boolean
  var contributionIdentifier: java.lang.String
  var contributionVersion: java.lang.String
  var dataSourceBindings: js.Array[DataSourceBinding]
  var definitionType: java.lang.String
  var demands: js.Array[_]
  var description: java.lang.String
  var disabled: scala.Boolean
  var execution: org.scalablytyped.runtime.StringDictionary[js.Any]
  var friendlyName: java.lang.String
  var groups: js.Array[TaskGroupDefinition]
  var helpMarkDown: java.lang.String
  var hostType: java.lang.String
  var iconUrl: java.lang.String
  var id: java.lang.String
  var inputs: js.Array[TaskInputDefinition]
  var instanceNameFormat: java.lang.String
  var minimumAgentVersion: java.lang.String
  var name: java.lang.String
  var packageLocation: java.lang.String
  var packageType: java.lang.String
  var preview: scala.Boolean
  var releaseNotes: java.lang.String
  var runsOn: js.Array[java.lang.String]
  var serverOwned: scala.Boolean
  var sourceDefinitions: js.Array[TaskSourceDefinition]
  var sourceLocation: java.lang.String
  var version: TaskVersion
  var visibility: js.Array[java.lang.String]
}

