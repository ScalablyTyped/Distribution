package typings.wordpressViewport

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Record
import typings.wordpressViewport.anon.TypeofimportedActions
import typings.wordpressViewport.anon.TypeofimportedSelectors
import typings.wordpressViewport.wordpressViewportStrings.coreSlashviewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def ifViewportMatches(query: String): js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifViewportMatches")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]]
  
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
  @scala.inline
  def withViewportMatch[T /* <: Record[String, String] */](queries: T): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof T */ String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withViewportMatch")(queries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof T */ String]]
  ]]
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def dispatch_coreviewport(key: coreSlashviewport): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    @scala.inline
    def select_coreviewport(key: coreSlashviewport): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
}
