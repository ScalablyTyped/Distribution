package typings
package atWordpressElementLib.atWordpressElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val render: reactDashDomLib.reactDashDomMod.Renderer = js.native
  val unmountComponentAtNode: js.Function1[/* container */ stdLib.Element, scala.Boolean] = js.native
  /**
    * Component used as equivalent of Fragment with unescaped HTML, in cases where
    * it is desirable to render dangerous HTML without needing a wrapper element.
    * To preserve additional props, a `div` wrapper _will_ be created if any props
    * aside from `children` are passed.
    *
    * @param props.children - HTML to render.
    *
    * @return Dangerously-rendering element.
    */
  def RawHTML(
    props: atWordpressElementLib.Anon_Children with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * Checks if the provided WP element is empty.
    *
    * @param element - WP element to check.
    * @return True when an element is considered empty.
    */
  def isEmptyElement(
    element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  ): scala.Boolean = js.native
  /**
    * Serializes a React element to string.
    *
    * @param element       - Element to serialize.
    * @param context       - Context object.
    * @param legacyContext - Legacy context object.
    *
    * @return Serialized element.
    */
  def renderToString(
    element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  ): java.lang.String = js.native
  def renderToString(
    element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    context: js.Any
  ): java.lang.String = js.native
  def renderToString(
    element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    context: js.Any,
    legacyContext: js.Any
  ): java.lang.String = js.native
}

