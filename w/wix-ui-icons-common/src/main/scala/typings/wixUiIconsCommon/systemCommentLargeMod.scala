package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.commentLargeMod.CommentLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCommentLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/CommentLarge", JSImport.Default)
  @js.native
  val default: FC[CommentLargeProps] = js.native
  
  type _To = FC[CommentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCommentLargeMod.foo` */
  override def _to: FC[CommentLargeProps] = default
}
