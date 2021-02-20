package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionEndpoint extends StObject {
  
  /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
  var connectionId: String = js.native
  
  /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with "jsonpath:". KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named 'ServiceName'.  endpoint.KeySelector = "jsonpath://ServiceName";
    */
  var keySelector: String = js.native
  
  /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
  var scope: String = js.native
  
  /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string "xpath:". A Json based selector must be prefixed with "jsonpath:".  The following selector defines an XPath for extracting nodes named 'ServiceName'.  endpoint.Selector = "xpath://ServiceName";
    */
  var selector: String = js.native
  
  /**
    * TaskId that this endpoint belongs to.
    */
  var taskId: String = js.native
  
  /**
    * URL to GET.
    */
  var url: String = js.native
}
object TaskDefinitionEndpoint {
  
  @scala.inline
  def apply(
    connectionId: String,
    keySelector: String,
    scope: String,
    selector: String,
    taskId: String,
    url: String
  ): TaskDefinitionEndpoint = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionEndpoint]
  }
  
  @scala.inline
  implicit class TaskDefinitionEndpointMutableBuilder[Self <: TaskDefinitionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
