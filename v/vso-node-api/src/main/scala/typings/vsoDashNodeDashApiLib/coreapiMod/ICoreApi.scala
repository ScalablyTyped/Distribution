package typings
package vsoDashNodeDashApiLib.coreapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createConnectedService(
    connectedServiceCreationData: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedServiceDetails,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedService] = js.native
  def createIdentityMru(mruData: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.IdentityData, mruName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def createOrUpdateProxy(proxy: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Proxy): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Proxy] = js.native
  def createTeam(team: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam, projectId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam] = js.native
  def deleteIdentityMru(mruData: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.IdentityData, mruName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteProxy(proxyUrl: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteProxy(proxyUrl: java.lang.String, site: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteTeam(projectId: java.lang.String, teamId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def getAllTeams(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getAllTeams(mine: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getAllTeams(mine: scala.Boolean, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getAllTeams(mine: scala.Boolean, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getConnectedServiceDetails(projectId: java.lang.String, name: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedServiceDetails] = js.native
  def getConnectedServices(projectId: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedService]
  ] = js.native
  def getConnectedServices(
    projectId: java.lang.String,
    kind: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ConnectedServiceKind
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiConnectedService]
  ] = js.native
  def getIdentityMru(mruName: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getProcessById(processId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Process] = js.native
  def getProcesses(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Process]] = js.native
  def getProject(projectId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProject] = js.native
  def getProject(projectId: java.lang.String, includeCapabilities: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProject] = js.native
  def getProject(projectId: java.lang.String, includeCapabilities: scala.Boolean, includeHistory: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProject] = js.native
  def getProjectCollection(collectionId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollection] = js.native
  def getProjectCollections(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollectionReference]
  ] = js.native
  def getProjectCollections(top: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollectionReference]
  ] = js.native
  def getProjectCollections(top: scala.Double, skip: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollectionReference]
  ] = js.native
  def getProjectHistoryEntries(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectInfo]] = js.native
  def getProjectHistoryEntries(minRevision: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectInfo]] = js.native
  def getProjectProperties(projectId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectProperty]] = js.native
  def getProjectProperties(projectId: java.lang.String, keys: js.Array[java.lang.String]): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectProperty]] = js.native
  def getProjects(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference]] = js.native
  def getProjects(stateFilter: js.Any): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference]] = js.native
  def getProjects(stateFilter: js.Any, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference]] = js.native
  def getProjects(stateFilter: js.Any, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference]] = js.native
  def getProjects(stateFilter: js.Any, top: scala.Double, skip: scala.Double, continuationToken: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference]] = js.native
  def getProxies(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Proxy]] = js.native
  def getProxies(proxyUrl: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.Proxy]] = js.native
  def getTeam(projectId: java.lang.String, teamId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam] = js.native
  def getTeamMembersWithExtendedProperties(projectId: java.lang.String, teamId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.TeamMember]] = js.native
  def getTeamMembersWithExtendedProperties(projectId: java.lang.String, teamId: java.lang.String, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.TeamMember]] = js.native
  def getTeamMembersWithExtendedProperties(projectId: java.lang.String, teamId: java.lang.String, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.TeamMember]] = js.native
  def getTeams(projectId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getTeams(projectId: java.lang.String, mine: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getTeams(projectId: java.lang.String, mine: scala.Boolean, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def getTeams(projectId: java.lang.String, mine: scala.Boolean, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam]] = js.native
  def queueCreateProject(projectToCreate: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProject): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationReference] = js.native
  def queueDeleteProject(projectId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationReference] = js.native
  def setProjectProperties(
    customHeaders: js.Any,
    projectId: java.lang.String,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument
  ): stdLib.Promise[scala.Unit] = js.native
  def updateIdentityMru(mruData: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.IdentityData, mruName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def updateProject(
    projectUpdate: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProject,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCommonOperationsInterfacesMod.OperationReference] = js.native
  def updateTeam(
    teamData: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam,
    projectId: java.lang.String,
    teamId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTeam] = js.native
}

