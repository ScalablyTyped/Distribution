package typings.wordpressBlockEditor.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor", "createCustomColorsHOC")
@js.native
object createCustomColorsHOC extends js.Object {
  def apply[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ComponentType[_], ComponentType[_]]
  ] = js.native
}

