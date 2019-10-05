package typings.atWordpressViewport.atWordpressViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/viewport", "ifViewportMatches")
@js.native
object ifViewportMatches extends js.Object {
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
  def apply(query: String): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<any> */ /* component */ js.Any, 
    _
  ] = js.native
}

