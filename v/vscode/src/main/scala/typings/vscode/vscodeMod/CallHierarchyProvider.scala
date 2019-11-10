package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyProvider extends js.Object {
  /**
  		 * Bootstraps call hierarchy by returning the item that is denoted by the given document
  		 * and position. This item will be used as entry into the call graph. Providers should
  		 * return `undefined` or `null` when there is no item at the given location.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @returns A call hierarchy item or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def prepareCallHierarchy(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[CallHierarchyItem]
  /**
  		 * Provide all incoming calls for an item, e.g all callers for a method. In graph terms this describes directed
  		 * and annotated edges inside the call graph, e.g the given item is the starting node and the result is the nodes
  		 * that can be reached.
  		 *
  		 * @param item The hierarchy item for which incoming calls should be computed.
  		 * @param token A cancellation token.
  		 * @returns A set of incoming calls or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideCallHierarchyIncomingCalls(item: CallHierarchyItem, token: CancellationToken): ProviderResult[js.Array[CallHierarchyIncomingCall]]
  /**
  		 * Provide all outgoing calls for an item, e.g call calls to functions, methods, or constructors from the given item. In
  		 * graph terms this describes directed and annotated edges inside the call graph, e.g the given item is the starting
  		 * node and the result is the nodes that can be reached.
  		 *
  		 * @param item The hierarchy item for which outgoing calls should be computed.
  		 * @param token A cancellation token.
  		 * @returns A set of outgoing calls or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideCallHierarchyOutgoingCalls(item: CallHierarchyItem, token: CancellationToken): ProviderResult[js.Array[CallHierarchyOutgoingCall]]
}

object CallHierarchyProvider {
  @scala.inline
  def apply(
    prepareCallHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem],
    provideCallHierarchyIncomingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]],
    provideCallHierarchyOutgoingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
  ): CallHierarchyProvider = {
    val __obj = js.Dynamic.literal(prepareCallHierarchy = js.Any.fromFunction3(prepareCallHierarchy), provideCallHierarchyIncomingCalls = js.Any.fromFunction2(provideCallHierarchyIncomingCalls), provideCallHierarchyOutgoingCalls = js.Any.fromFunction2(provideCallHierarchyOutgoingCalls))
  
    __obj.asInstanceOf[CallHierarchyProvider]
  }
}

