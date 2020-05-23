package typings.wordpressBlockEditor.alignmentToolbarMod

import typings.wordpressBlockEditor.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/alignment-toolbar", "AlignmentToolbar")
@js.native
object AlignmentToolbar extends js.Object {
  @js.native
  trait Props extends js.Object {
    var alignmentControls: js.UndefOr[js.Array[Align]] = js.native
    var value: js.UndefOr[String] = js.native
    def onChange(): Unit = js.native
    def onChange(newValue: String): Unit = js.native
  }
  
}

