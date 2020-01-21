package typings.theming

import typings.react.mod.ComponentType
import typings.theming.mod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object themingComponents extends themingProps {
  @scala.inline
  def ThemeProvider: ComponentType[ThemeProviderProps[DefaultTheme]] = js.constructorOf[typings.theming.mod.ThemeProvider].asInstanceOf[typings.react.mod.ComponentType[ThemeProviderProps[typings.theming.mod.DefaultTheme]]]
}

