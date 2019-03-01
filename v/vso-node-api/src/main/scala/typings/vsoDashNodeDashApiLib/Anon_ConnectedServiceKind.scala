package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectedServiceKind extends js.Object {
  var ConnectedServiceKind: Anon_EnumValuesAnonAzureSubscription
  var Process: js.Any
  var ProcessType: Anon_EnumValuesAnonCustomInherited
  var ProjectChangeType: Anon_EnumValuesAnonAdded
  var ProjectInfo: js.Any
  var ProjectMessage: js.Any
  var ProjectVisibility: Anon_EnumValuesAnonOrganization
  var SourceControlTypes: Anon_EnumValuesAnonGit
  var TeamProject: js.Any
  var TeamProjectReference: js.Any
  var TemporaryDataCreatedDTO: js.Any
  var WebApiConnectedService: js.Any
  var WebApiConnectedServiceDetails: js.Any
  var WebApiProject: js.Any
}

object Anon_ConnectedServiceKind {
  @scala.inline
  def apply(
    ConnectedServiceKind: Anon_EnumValuesAnonAzureSubscription,
    Process: js.Any,
    ProcessType: Anon_EnumValuesAnonCustomInherited,
    ProjectChangeType: Anon_EnumValuesAnonAdded,
    ProjectInfo: js.Any,
    ProjectMessage: js.Any,
    ProjectVisibility: Anon_EnumValuesAnonOrganization,
    SourceControlTypes: Anon_EnumValuesAnonGit,
    TeamProject: js.Any,
    TeamProjectReference: js.Any,
    TemporaryDataCreatedDTO: js.Any,
    WebApiConnectedService: js.Any,
    WebApiConnectedServiceDetails: js.Any,
    WebApiProject: js.Any
  ): Anon_ConnectedServiceKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConnectedServiceKind")(ConnectedServiceKind)
    __obj.updateDynamic("Process")(Process)
    __obj.updateDynamic("ProcessType")(ProcessType)
    __obj.updateDynamic("ProjectChangeType")(ProjectChangeType)
    __obj.updateDynamic("ProjectInfo")(ProjectInfo)
    __obj.updateDynamic("ProjectMessage")(ProjectMessage)
    __obj.updateDynamic("ProjectVisibility")(ProjectVisibility)
    __obj.updateDynamic("SourceControlTypes")(SourceControlTypes)
    __obj.updateDynamic("TeamProject")(TeamProject)
    __obj.updateDynamic("TeamProjectReference")(TeamProjectReference)
    __obj.updateDynamic("TemporaryDataCreatedDTO")(TemporaryDataCreatedDTO)
    __obj.updateDynamic("WebApiConnectedService")(WebApiConnectedService)
    __obj.updateDynamic("WebApiConnectedServiceDetails")(WebApiConnectedServiceDetails)
    __obj.updateDynamic("WebApiProject")(WebApiProject)
    __obj.asInstanceOf[Anon_ConnectedServiceKind]
  }
}

