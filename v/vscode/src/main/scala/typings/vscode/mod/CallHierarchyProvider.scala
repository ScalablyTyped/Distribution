package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def prepareCallHierarchy(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]] = js.native
  
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
  def provideCallHierarchyIncomingCalls(item: CallHierarchyItem, token: CancellationToken): ProviderResult[js.Array[CallHierarchyIncomingCall]] = js.native
  
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
  def provideCallHierarchyOutgoingCalls(item: CallHierarchyItem, token: CancellationToken): ProviderResult[js.Array[CallHierarchyOutgoingCall]] = js.native
}
object CallHierarchyProvider {
  
  @scala.inline
  def apply(
    prepareCallHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]],
    provideCallHierarchyIncomingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]],
    provideCallHierarchyOutgoingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
  ): CallHierarchyProvider = {
    val __obj = js.Dynamic.literal(prepareCallHierarchy = js.Any.fromFunction3(prepareCallHierarchy), provideCallHierarchyIncomingCalls = js.Any.fromFunction2(provideCallHierarchyIncomingCalls), provideCallHierarchyOutgoingCalls = js.Any.fromFunction2(provideCallHierarchyOutgoingCalls))
    __obj.asInstanceOf[CallHierarchyProvider]
  }
  
  @scala.inline
  implicit class CallHierarchyProviderOps[Self <: CallHierarchyProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrepareCallHierarchy(
      value: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]]
    ): Self = this.set("prepareCallHierarchy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProvideCallHierarchyIncomingCalls(
      value: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]]
    ): Self = this.set("provideCallHierarchyIncomingCalls", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProvideCallHierarchyOutgoingCalls(
      value: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
    ): Self = this.set("provideCallHierarchyOutgoingCalls", js.Any.fromFunction2(value))
  }
}
