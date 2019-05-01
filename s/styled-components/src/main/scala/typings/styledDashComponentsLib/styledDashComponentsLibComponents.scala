package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object styledDashComponentsLibComponents {
  @scala.inline
  def StyleSheetManager: reactLib.reactMod.ComponentType[styledDashComponentsLib.styledDashComponentsMod.StyleSheetManagerProps] = js.constructorOf[styledDashComponentsLib.macroMod.StyleSheetManager].asInstanceOf[reactLib.reactMod.ComponentType[styledDashComponentsLib.styledDashComponentsMod.StyleSheetManagerProps]]
  @scala.inline
  def ThemeConsumer: reactLib.reactMod.ComponentType[
    reactLib.reactMod.ConsumerProps[
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ]
  ] = styledDashComponentsLib.macroMod.^.ThemeConsumer.asInstanceOf[reactLib.reactMod.ComponentType[
  reactLib.reactMod.ConsumerProps[
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
  ]]]
  @scala.inline
  def ThemeProvider: reactLib.reactMod.ComponentType[
    styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
      ], 
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[
        styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
      ]
    ]
  ] = js.constructorOf[styledDashComponentsLib.macroMod.ThemeProvider].asInstanceOf[reactLib.reactMod.ComponentType[
  styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ], 
    styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[
      styledDashComponentsLib.styledDashComponentsMod.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ]
  ]]]
  @scala.inline
  def ConsumerProps: reactLib.reactMod.ConsumerProps.type = reactLib.reactMod.ConsumerProps
  type ConsumerProps[T] = reactLib.reactMod.ConsumerProps[T]
  type StyleSheetManagerProps = styledDashComponentsLib.styledDashComponentsMod.StyleSheetManagerProps
  @scala.inline
  def ThemeProviderProps: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps.type = styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps
  type ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] = styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[T, U]
}

