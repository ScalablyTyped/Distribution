package typings.vsoNodeApi.buildInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.coreInterfacesMod.WebApiConnectedServiceRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentDefinition extends StObject {
  
  /**
    * The connected service associated with the continuous deployment
    */
  var connectedService: WebApiConnectedServiceRef
  
  /**
    * The definition associated with the continuous deployment
    */
  var definition: XamlDefinitionReference
  
  var gitBranch: String
  
  var hostedServiceName: String
  
  var project: TeamProjectReference
  
  var repositoryId: String
  
  var storageAccountName: String
  
  var subscriptionId: String
  
  var website: String
  
  var webspace: String
}
object ContinuousDeploymentDefinition {
  
  @scala.inline
  def apply(
    connectedService: WebApiConnectedServiceRef,
    definition: XamlDefinitionReference,
    gitBranch: String,
    hostedServiceName: String,
    project: TeamProjectReference,
    repositoryId: String,
    storageAccountName: String,
    subscriptionId: String,
    website: String,
    webspace: String
  ): ContinuousDeploymentDefinition = {
    val __obj = js.Dynamic.literal(connectedService = connectedService.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], gitBranch = gitBranch.asInstanceOf[js.Any], hostedServiceName = hostedServiceName.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], storageAccountName = storageAccountName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], webspace = webspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentDefinition]
  }
  
  @scala.inline
  implicit class ContinuousDeploymentDefinitionMutableBuilder[Self <: ContinuousDeploymentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectedService(value: WebApiConnectedServiceRef): Self = StObject.set(x, "connectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: XamlDefinitionReference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitBranch(value: String): Self = StObject.set(x, "gitBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedServiceName(value: String): Self = StObject.set(x, "hostedServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAccountName(value: String): Self = StObject.set(x, "storageAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebspace(value: String): Self = StObject.set(x, "webspace", value.asInstanceOf[js.Any])
  }
}
