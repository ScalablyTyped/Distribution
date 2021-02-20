package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitHubMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GitHub", JSImport.Default)
  @js.native
  val default: SFC[GitHubProps] = js.native
  
  @js.native
  trait GitHubProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GitHubProps {
    
    @scala.inline
    def apply(): GitHubProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitHubProps]
    }
    
    @scala.inline
    implicit class GitHubPropsMutableBuilder[Self <: GitHubProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[GitHubProps]
  
  /* This means you don't have to write `default`, but can instead just say `gitHubMod.foo` */
  override def _to: SFC[GitHubProps] = default
}
