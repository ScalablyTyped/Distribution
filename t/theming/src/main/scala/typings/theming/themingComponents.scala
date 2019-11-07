package typings.theming

import typings.react.reactMod.ComponentType
import typings.theming.themingMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object themingComponents extends themingProps {
  @scala.inline
  def ThemeProvider: ComponentType[ThemeProviderProps[DefaultTheme]] = js.constructorOf[typings.theming.themingMod.ThemeProvider].asInstanceOf[typings.react.reactMod.ComponentType[ThemeProviderProps[typings.theming.themingMod.DefaultTheme]]]
}

