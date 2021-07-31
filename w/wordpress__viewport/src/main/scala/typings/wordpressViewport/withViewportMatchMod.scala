package typings.wordpressViewport

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withViewportMatchMod {
  
  @JSImport("@wordpress/viewport/with-viewport-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  def default[T /* <: Record[String, String] */](queries: T): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof T */ String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof T */ String]]
  ]]
}
