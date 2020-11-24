package typings.wordpressViewport

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/viewport/with-viewport-match", JSImport.Namespace)
@js.native
object withViewportMatchMod extends js.Object {
  
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
  def default[T /* <: Record[String, String] */](queries: T): js.Function1[/* component */ ComponentType[_], ComponentType[Omit[_, /* keyof T */ String]]] = js.native
}
