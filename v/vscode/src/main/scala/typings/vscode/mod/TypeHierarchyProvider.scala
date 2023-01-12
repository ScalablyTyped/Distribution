package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeHierarchyProvider extends StObject {
  
  /**
    * Bootstraps type hierarchy by returning the item that is denoted by the given document
    * and position. This item will be used as entry into the type graph. Providers should
    * return `undefined` or `null` when there is no item at the given location.
    *
    * @param document The document in which the command was invoked.
    * @param position The position at which the command was invoked.
    * @param token A cancellation token.
    * @returns One or multiple type hierarchy items or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined`, `null`, or an empty array.
    */
  def prepareTypeHierarchy(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[TypeHierarchyItem | js.Array[TypeHierarchyItem]]
  
  /**
    * Provide all subtypes for an item, e.g all types which are derived/inherited from the given item. In
    * graph terms this describes directed and annotated edges inside the type graph, e.g the given item is the starting
    * node and the result is the nodes that can be reached.
    *
    * @param item The hierarchy item for which subtypes should be computed.
    * @param token A cancellation token.
    * @returns A set of direct subtypes or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideTypeHierarchySubtypes(item: TypeHierarchyItem, token: CancellationToken): ProviderResult[js.Array[TypeHierarchyItem]]
  
  /**
    * Provide all supertypes for an item, e.g all types from which a type is derived/inherited. In graph terms this describes directed
    * and annotated edges inside the type graph, e.g the given item is the starting node and the result is the nodes
    * that can be reached.
    *
    * @param item The hierarchy item for which super types should be computed.
    * @param token A cancellation token.
    * @returns A set of direct supertypes or a thenable that resolves to such. The lack of a result can be
    * signaled by returning `undefined` or `null`.
    */
  def provideTypeHierarchySupertypes(item: TypeHierarchyItem, token: CancellationToken): ProviderResult[js.Array[TypeHierarchyItem]]
}
object TypeHierarchyProvider {
  
  inline def apply(
    prepareTypeHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[TypeHierarchyItem | js.Array[TypeHierarchyItem]],
    provideTypeHierarchySubtypes: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]],
    provideTypeHierarchySupertypes: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]]
  ): TypeHierarchyProvider = {
    val __obj = js.Dynamic.literal(prepareTypeHierarchy = js.Any.fromFunction3(prepareTypeHierarchy), provideTypeHierarchySubtypes = js.Any.fromFunction2(provideTypeHierarchySubtypes), provideTypeHierarchySupertypes = js.Any.fromFunction2(provideTypeHierarchySupertypes))
    __obj.asInstanceOf[TypeHierarchyProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeHierarchyProvider] (val x: Self) extends AnyVal {
    
    inline def setPrepareTypeHierarchy(
      value: (TextDocument, Position, CancellationToken) => ProviderResult[TypeHierarchyItem | js.Array[TypeHierarchyItem]]
    ): Self = StObject.set(x, "prepareTypeHierarchy", js.Any.fromFunction3(value))
    
    inline def setProvideTypeHierarchySubtypes(value: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]]): Self = StObject.set(x, "provideTypeHierarchySubtypes", js.Any.fromFunction2(value))
    
    inline def setProvideTypeHierarchySupertypes(value: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]]): Self = StObject.set(x, "provideTypeHierarchySupertypes", js.Any.fromFunction2(value))
  }
}
