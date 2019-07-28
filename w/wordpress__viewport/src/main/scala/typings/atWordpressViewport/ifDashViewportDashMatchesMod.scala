package typings.atWordpressViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/viewport/if-viewport-matches", JSImport.Namespace)
@js.native
object ifDashViewportDashMatchesMod extends js.Object {
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
  def default(query: String): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
}

