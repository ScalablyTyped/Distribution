package typings.uiBox

import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.uiBox.boxTypesMod.BoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/src/box", JSImport.Namespace)
@js.native
object boxMod extends js.Object {
  def default[E /* <: ElementType[_] */](props: BoxProps[E]): Element = js.native
}

