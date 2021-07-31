package typings.wixStyleReact

import typings.wixStyleReact.themeProviderMod.ThemeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorXMod {
  
  @JSImport("wix-style-react/dist/es/src/Themes/editorX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def theme(): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")().asInstanceOf[ThemeInterface]
}
