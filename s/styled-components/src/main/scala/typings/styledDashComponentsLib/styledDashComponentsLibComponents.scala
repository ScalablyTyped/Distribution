package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object styledDashComponentsLibComponents {
  @scala.inline
  def StyleSheetManager: reactLib.reactMod.ComponentType[StyleSheetManagerProps] = js.constructorOf[styledDashComponentsLib.macroMod.StyleSheetManager].asInstanceOf[reactLib.reactMod.ComponentType[styledDashComponentsLib.StyleSheetManagerProps]]
  @scala.inline
  def ThemeProvider: reactLib.reactMod.ComponentType[
    styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[
      AnyIfEmpty[AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]], 
      AnyIfEmpty[AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]]
    ]
  ] = js.constructorOf[styledDashComponentsLib.macroMod.ThemeProvider].asInstanceOf[reactLib.reactMod.ComponentType[
  styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[
    styledDashComponentsLib.AnyIfEmpty[
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ], 
    styledDashComponentsLib.AnyIfEmpty[
      styledDashComponentsLib.AnyIfEmpty[styledDashComponentsLib.styledDashComponentsMod.DefaultTheme]
    ]
  ]]]
  type StyleSheetManagerProps = styledDashComponentsLib.StyleSheetManagerProps
  @scala.inline
  def ThemeProviderProps: styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps.type = styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps
  type ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] = styledDashComponentsLib.styledDashComponentsMod.ThemeProviderProps[T, U]
}

