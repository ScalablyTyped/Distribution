package typings.styledDashComponents

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ConsumerProps
import typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object styledDashComponentsComponents extends styledDashComponentsProps {
  @scala.inline
  def StyleSheetManager: ComponentType[typings.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps] = js.constructorOf[typings.styledDashComponents.macroMod.StyleSheetManager].asInstanceOf[typings.react.reactMod.ComponentType[typings.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps]]
  @scala.inline
  def ThemeConsumer: ComponentType[ConsumerProps[AnyIfEmpty[DefaultTheme]]] = typings.styledDashComponents.macroMod.ThemeConsumer.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ConsumerProps[
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
  ]]]
  @scala.inline
  def ThemeProvider: ComponentType[
    typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = js.constructorOf[typings.styledDashComponents.macroMod.ThemeProvider].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps[
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ], 
    typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ]
  ]]]
}

