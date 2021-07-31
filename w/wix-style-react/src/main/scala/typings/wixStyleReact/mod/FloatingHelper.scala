package typings.wixStyleReact.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.wixStyleReact.floatingHelperContentMod.FloatingHelperContentProps
import typings.wixStyleReact.floatingHelperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "FloatingHelper")
@js.native
class FloatingHelper () extends default
/* static members */
object FloatingHelper {
  
  @JSImport("wix-style-react", "FloatingHelper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "FloatingHelper.Content")
  @js.native
  def Content: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
  @scala.inline
  def Content_=(x: ComponentClass[FloatingHelperContentProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
}
