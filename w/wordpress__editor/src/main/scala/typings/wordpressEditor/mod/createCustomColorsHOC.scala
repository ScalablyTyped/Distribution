package typings.wordpressEditor.mod

import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor", "createCustomColorsHOC")
@js.native
object createCustomColorsHOC extends js.Object {
  def apply[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
}

