package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsGithubMod.GithubProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object githubMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Github", JSImport.Default)
  @js.native
  val default: FC[GithubProps] = js.native
  
  type _To = FC[GithubProps]
  
  /* This means you don't have to write `default`, but can instead just say `githubMod.foo` */
  override def _to: FC[GithubProps] = default
}
