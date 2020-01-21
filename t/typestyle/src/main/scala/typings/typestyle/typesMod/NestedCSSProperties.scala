package typings.typestyle.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedCSSProperties extends CSSProperties {
  /**
    * A debug only (stripped in process.env.NODE_ENV !== 'production') name
    * Helps you figure out where the class is coming from if you care
    **/
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.native
  @JSName("$nest")
  var $nest: js.UndefOr[NestedCSSSelectors] = js.native
}

