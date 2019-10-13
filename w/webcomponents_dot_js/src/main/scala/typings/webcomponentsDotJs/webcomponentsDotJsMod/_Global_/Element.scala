package typings.webcomponentsDotJs.webcomponentsDotJsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  val shadowRoot: ShadowRoot | Null
  def createShadowRoot(): ShadowRoot
}

object Element {
  @scala.inline
  def apply(createShadowRoot: () => ShadowRoot, shadowRoot: ShadowRoot = null): Element = {
    val __obj = js.Dynamic.literal(createShadowRoot = js.Any.fromFunction0(createShadowRoot))
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot)
    __obj.asInstanceOf[Element]
  }
}

