package typings.atWordpressElement.atWordpressElementMod

import typings.atWordpressElement.Anon_Children
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element", "RawHTML")
@js.native
object RawHTML extends js.Object {
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
  def apply(
    props: Anon_Children with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
  ): Element = js.native
}

