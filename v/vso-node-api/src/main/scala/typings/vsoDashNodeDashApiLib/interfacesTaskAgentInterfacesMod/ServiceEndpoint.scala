package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpoint extends js.Object {
  var administratorsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
  var authorization: EndpointAuthorization
  /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Gets or Sets description of endpoint
    */
  var description: java.lang.String
  var groupScopeId: java.lang.String
  /**
    * Gets or sets the identifier of this endpoint.
    */
  var id: java.lang.String
  /**
    * EndPoint state indictor
    */
  var isReady: scala.Boolean
  /**
    * Gets or sets the friendly name of the endpoint.
    */
  var name: java.lang.String
  /**
    * Error message during creation/deletion of endpoint
    */
  var operationStatus: js.Any
  var readersGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets or sets the type of the endpoint.
    */
  var `type`: java.lang.String
  /**
    * Gets or sets the url of the endpoint.
    */
  var url: java.lang.String
}

object ServiceEndpoint {
  @scala.inline
  def apply(
    administratorsGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    authorization: EndpointAuthorization,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    description: java.lang.String,
    groupScopeId: java.lang.String,
    id: java.lang.String,
    isReady: scala.Boolean,
    name: java.lang.String,
    operationStatus: js.Any,
    readersGroup: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    `type`: java.lang.String,
    url: java.lang.String
  ): ServiceEndpoint = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup, authorization = authorization, createdBy = createdBy, data = data, description = description, groupScopeId = groupScopeId, id = id, isReady = isReady, name = name, operationStatus = operationStatus, readersGroup = readersGroup, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceEndpoint]
  }
}

