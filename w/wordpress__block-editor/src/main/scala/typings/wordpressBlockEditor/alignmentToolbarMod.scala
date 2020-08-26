package typings.wordpressBlockEditor

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typings.wordpressBlockEditor.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/alignment-toolbar", JSImport.Namespace)
@js.native
object alignmentToolbarMod extends js.Object {
  @js.native
  object AlignmentToolbar extends js.Object {
    @js.native
    trait Props extends js.Object {
      var alignmentControls: js.UndefOr[js.Array[Align]] = js.native
      var children: js.UndefOr[scala.Nothing] = js.native
      var value: js.UndefOr[String] = js.native
      def onChange(): Unit = js.native
      def onChange(newValue: String): Unit = js.native
    }
    
  }
  
  @js.native
  object default extends TopLevel[ComponentType[Props]]
  
}

