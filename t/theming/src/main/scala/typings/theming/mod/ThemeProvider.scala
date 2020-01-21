package typings.theming.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theming", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[ThemeProviderProps[DefaultTheme], ComponentState, js.Any] {
  def this(props: ThemeProviderProps[DefaultTheme]) = this()
  def this(props: ThemeProviderProps[DefaultTheme], context: js.Any) = this()
}

@JSImport("theming", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderFactory[DefaultTheme]]

