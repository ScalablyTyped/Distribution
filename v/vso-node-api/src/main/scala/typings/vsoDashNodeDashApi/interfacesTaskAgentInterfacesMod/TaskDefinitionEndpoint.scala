package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionEndpoint extends js.Object {
  /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
  var connectionId: String
  /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with "jsonpath:". KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named 'ServiceName'.  endpoint.KeySelector = "jsonpath://ServiceName";
    */
  var keySelector: String
  /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
  var scope: String
  /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string "xpath:". A Json based selector must be prefixed with "jsonpath:".  The following selector defines an XPath for extracting nodes named 'ServiceName'.  endpoint.Selector = "xpath://ServiceName";
    */
  var selector: String
  /**
    * TaskId that this endpoint belongs to.
    */
  var taskId: String
  /**
    * URL to GET.
    */
  var url: String
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
    val __obj = js.Dynamic.literal(connectionId = connectionId, keySelector = keySelector, scope = scope, selector = selector, taskId = taskId, url = url)
  
    __obj.asInstanceOf[TaskDefinitionEndpoint]
  }
}

