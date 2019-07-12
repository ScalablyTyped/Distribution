package typings
package atWordpressViewportLib.atWordpressViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/viewport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Higher-order component creator, creating a new component which renders if
    * the viewport query is satisfied.
    *
    * @param query - Viewport query.
    *
    * @example
    * ```jsx
    * function MyMobileComponent() {
    * 	return <div>I'm only rendered on mobile viewports!</div>;
    * }
    *
    * MyMobileComponent = ifViewportMatches( '< small' )( MyMobileComponent );
    * ```
    */
  // prettier-ignore
  def ifViewportMatches(query: java.lang.String): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
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
    * 	return (
    * 		<div>Currently: { isMobile ? 'Mobile' : 'Not Mobile' }</div>
    * 	);
    * }
    *
    * MyComponent = withViewportMatch( { isMobile: '< small' } )( MyComponent );
    * ```
    */
  // prettier-ignore
  def withViewportMatch[T /* <: stdLib.Record[java.lang.String, java.lang.String] */](queries: T): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
}

