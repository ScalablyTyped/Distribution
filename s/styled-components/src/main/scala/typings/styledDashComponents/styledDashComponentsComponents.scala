package typings.styledDashComponents

import typings.react.reactMod.ComponentType
import typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object styledDashComponentsComponents extends styledDashComponentsProps {
  @scala.inline
  def StyleSheetManager: ComponentType[StyleSheetManagerProps] = js.constructorOf[typings.styledDashComponents.styledDashComponentsMod.StyleSheetManager].asInstanceOf[typings.react.reactMod.ComponentType[StyleSheetManagerProps]]
  @scala.inline
  def ThemeConsumer: ComponentType[ThemeConsumerProps[AnyIfEmpty[DefaultTheme]]] = typings.styledDashComponents.styledDashComponentsMod.ThemeConsumer.asInstanceOf[typings.react.reactMod.ComponentType[
  ThemeConsumerProps[
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
  ]]]
  @scala.inline
  def ThemeProvider: ComponentType[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = js.constructorOf[typings.styledDashComponents.styledDashComponentsMod.ThemeProvider].asInstanceOf[typings.react.reactMod.ComponentType[
  ThemeProviderProps[
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ], 
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ]
  ]]]
}

