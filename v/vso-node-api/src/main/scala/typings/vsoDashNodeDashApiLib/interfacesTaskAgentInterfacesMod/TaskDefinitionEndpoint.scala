package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionEndpoint extends js.Object {
  /**
    * An ID that identifies a service connection to be used for authenticating endpoint requests.
    */
  var connectionId: java.lang.String
  /**
    * An Json based keyselector to filter response returned by fetching the endpoint Url.A Json based keyselector must be prefixed with "jsonpath:". KeySelector can be used to specify the filter to get the keys for the values specified with Selector.  The following keyselector defines an Json for extracting nodes named 'ServiceName'.  endpoint.KeySelector = "jsonpath://ServiceName";
    */
  var keySelector: java.lang.String
  /**
    * The scope as understood by Connected Services. Essentialy, a project-id for now.
    */
  var scope: java.lang.String
  /**
    * An XPath/Json based selector to filter response returned by fetching the endpoint Url. An XPath based selector must be prefixed with the string "xpath:". A Json based selector must be prefixed with "jsonpath:".  The following selector defines an XPath for extracting nodes named 'ServiceName'.  endpoint.Selector = "xpath://ServiceName";
    */
  var selector: java.lang.String
  /**
    * TaskId that this endpoint belongs to.
    */
  var taskId: java.lang.String
  /**
    * URL to GET.
    */
  var url: java.lang.String
}

object TaskDefinitionEndpoint {
  @scala.inline
  def apply(
    connectionId: java.lang.String,
    keySelector: java.lang.String,
    scope: java.lang.String,
    selector: java.lang.String,
    taskId: java.lang.String,
    url: java.lang.String
  ): TaskDefinitionEndpoint = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, keySelector = keySelector, scope = scope, selector = selector, taskId = taskId, url = url)
  
    __obj.asInstanceOf[TaskDefinitionEndpoint]
  }
}

