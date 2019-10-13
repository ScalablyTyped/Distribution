package typings.atWordpressElement.atWordpressElementMod

import typings.atWordpressElement.Anon_Children
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactPortal
import typings.reactDashDom.reactDashDomMod.Renderer
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  object React extends js.Object {
    val render: Renderer = js.native
    val unmountComponentAtNode: js.Function1[/* container */ Element, Boolean] = js.native
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
      props: Anon_Children with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
    ): typings.react.reactMod._Global_.JSX.Element = js.native
    /**
      * Checks if the provided WP element is empty.
      *
      * @param element - WP element to check.
      * @return True when an element is considered empty.
      */
    def isEmptyElement(
      element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any
    ): Boolean = js.native
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
    ): String = js.native
    def renderToString(
      element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
      context: js.Any
    ): String = js.native
    def renderToString(
      element: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
      context: js.Any,
      legacyContext: js.Any
    ): String = js.native
    //
    // ReactDOM re-exports
    //
    @js.native
    object createPortal extends js.Object {
      def apply(children: ReactNode, container: Element): ReactPortal = js.native
      def apply(children: ReactNode, container: Element, key: String): ReactPortal = js.native
    }
    
    @js.native
    object findDOMNode extends js.Object {
      def apply(): Element | Null | Text = js.native
      def apply(instance: ReactInstance): Element | Null | Text = js.native
    }
    
  }
  
}

