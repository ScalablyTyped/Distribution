package typings.styledComponents

import typings.react.mod.ComponentType
import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object styledComponentsComponents extends styledComponentsProps {
  @scala.inline
  def StyleSheetManager: ComponentType[StyleSheetManagerProps] = js.constructorOf[typings.styledComponents.styledComponentsMod.StyleSheetManager].asInstanceOf[ComponentType[StyleSheetManagerProps]]
  @scala.inline
  def ThemeConsumer: ComponentType[ThemeConsumerProps[AnyIfEmpty[DefaultTheme]]] = typings.styledComponents.styledComponentsMod.ThemeConsumer.asInstanceOf[ComponentType[ThemeConsumerProps[AnyIfEmpty[DefaultTheme]]]]
  @scala.inline
  def ThemeProvider: ComponentType[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = js.constructorOf[typings.styledComponents.styledComponentsMod.ThemeProvider].asInstanceOf[ComponentType[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ]]
}

