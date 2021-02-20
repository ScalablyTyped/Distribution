package typings.wordpressViewport

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Record
import typings.wordpressViewport.anon.TypeofimportedActions
import typings.wordpressViewport.anon.TypeofimportedSelectors
import typings.wordpressViewport.wordpressViewportStrings.coreSlashviewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Higher-order component creator, creating a new component which renders if
    * the viewport query is satisfied.
    *
    * @param query - Viewport query.
    *
    * @example
    * ```jsx
    * function MyMobileComponent() {
    *     return <div>I'm only rendered on mobile viewports!</div>;
    * }
    *
    * MyMobileComponent = ifViewportMatches( '< small' )( MyMobileComponent );
    * ```
    */
  // prettier-ignore
  @JSImport("@wordpress/viewport", "ifViewportMatches")
  @js.native
  def ifViewportMatches(query: String): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
  
  /**
    * Higher-order component creator, creating a new component which renders with the given prop names,
    * where the value passed to the underlying component is the result of the query assigned as the
    * object's value.
    *
    * @param queries - Object of prop name to viewport query.
    *
    * @example
    *
    * ```jsx
    * function MyComponent( { isMobile } ) {
    *     return (
    *         <div>Currently: { isMobile ? 'Mobile' : 'Not Mobile' }</div>
    *     );
    * }
    *
    * MyComponent = withViewportMatch( { isMobile: '< small' } )( MyComponent );
    * ```
    */
  // prettier-ignore
  @JSImport("@wordpress/viewport", "withViewportMatch")
  @js.native
  def withViewportMatch[T /* <: Record[String, String] */](queries: T): js.Function1[/* component */ ComponentType[_], ComponentType[Omit[_, /* keyof T */ String]]] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_coreviewport(key: coreSlashviewport): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_coreviewport(key: coreSlashviewport): TypeofimportedSelectors = js.native
  }
}
