package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.WebApi.online API
  * Execute and ExecuteMultiple are only available when online, not offline.
  */
@js.native
trait WebApiOnline extends WebApiOffline {
  /**
    * Execute a single action, function, or CRUD operation.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/execute External Link: execute (Client API reference)}
    * @param request Object that will be passed to the Web API endpoint to execute an action, function, or CRUD request.
    * @remarks The object exposes a getMetadata method that lets you define the metadata for the action, function or CRUD request you want to execute.<BR>
    * **The getMetadata method has the following parameters**:
    *   - boundParameter: (Optional) String. The name of the bound parameter for the action or function to execute.
    *       * Specify undefined if you are executing a CRUD request.
    *       * Specify null if the action or function to execute is not bound to any entity.
    *       * Specify entity logical name or entity set name in case the action or function to execute is bound to one.
    *   - operationName: (Optional). String. Name of the action, function, or one of the following values if you are executing a CRUD request: "Create", "Retrieve", "RetrieveMultiple", "Update", or "Delete".
    *   - operationType: (Optional). Number. Indicates the type of operation you are executing; specify one of the following values:
    *       * 0: Action
    *       * 1: Function
    *       * 2: CRUD
    *   - parameterTypes: Object. The metadata for parameter types. The object has the following attributes:
    *   - enumProperties: (Optional) Object. The metadata for enum types. The object has two string attributes: name and value
    *   - structuralProperty: Number. The category of the parameter type. Specify one of the following values:
    *       * 0: Unknown
    *       * 1: PrimitiveType
    *       * 2: ComplexType
    *       * 3: EnumerationType
    *       * 4: Collection
    *       * 5: EntityType
    *   - typeName: String. The fully qualified name of the parameter type.
    */
  def execute(request: js.Any): xrmLib.XrmNs.AsyncNs.PromiseLike[ExecuteResponse] = js.native
  /**
    * Execute a collection of action, function, or CRUD operations.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/executemultiple External Link: executeMultiple (Client API reference)}
    * @param request   An array of one of one of the following types:
    *    -objects where each object is an action, function, or CRUD request that you want to execute
    *        * against the Web API endpoint. Each object exposes a getMetadata method that lets you define
    *        the metadata for the action, function or CRUD request you want to execute. This is the same
    *        object that you pass in the execute method. For information about the object, see execute.
    *    -change set (an array of objects), where each object in the change set is as defined above.
    *        * In this case, all the request objects specified in the change set will get executed in a
    *        transaction.
    */
  def executeMultiple(request: js.Array[_]): xrmLib.XrmNs.AsyncNs.PromiseLike[js.Array[ExecuteResponse]] = js.native
}

