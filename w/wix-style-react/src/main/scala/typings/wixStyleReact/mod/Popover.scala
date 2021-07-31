package typings.wixStyleReact.mod

import typings.react.mod.SFC
import typings.wixStyleReact.anon.Children
import typings.wixStyleReact.popoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "Popover")
@js.native
class Popover () extends default
/* static members */
object Popover {
  
  @JSImport("wix-style-react", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Popover.Content")
  @js.native
  def Content: SFC[Children] = js.native
  @scala.inline
  def Content_=(x: SFC[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Popover.Element")
  @js.native
  def Element: SFC[Children] = js.native
  @scala.inline
  def Element_=(x: SFC[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
}
