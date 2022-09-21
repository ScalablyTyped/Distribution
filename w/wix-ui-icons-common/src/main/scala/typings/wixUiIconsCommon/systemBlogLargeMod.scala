package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.blogLargeMod.BlogLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemBlogLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/BlogLarge", JSImport.Default)
  @js.native
  val default: FC[BlogLargeProps] = js.native
  
  type _To = FC[BlogLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemBlogLargeMod.foo` */
  override def _to: FC[BlogLargeProps] = default
}
