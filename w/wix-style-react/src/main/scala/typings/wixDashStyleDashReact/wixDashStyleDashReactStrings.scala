package typings.wixDashStyleDashReact

import typings.wixDashStyleDashReact.buttonMod.ButtonPriority
import typings.wixDashStyleDashReact.buttonMod.ButtonSize
import typings.wixDashStyleDashReact.buttonMod.ButtonSkin
import typings.wixDashStyleDashReact.loaderMod.LoaderColor
import typings.wixDashStyleDashReact.loaderMod.LoaderSize
import typings.wixDashStyleDashReact.loaderMod.LoaderStatus
import typings.wixDashStyleDashReact.textMod.TextSize
import typings.wixDashStyleDashReact.textMod.TextSkin
import typings.wixDashStyleDashReact.textMod.TextWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wixDashStyleDashReactStrings {
  @js.native
  sealed trait blue extends LoaderColor
  
  @js.native
  sealed trait bold extends TextWeight
  
  @js.native
  sealed trait dark extends ButtonSkin
  
  @js.native
  sealed trait destructive extends ButtonSkin
  
  @js.native
  sealed trait disabled extends TextSkin
  
  @js.native
  sealed trait error
    extends LoaderStatus
       with TextSkin
  
  @js.native
  sealed trait inverted extends ButtonSkin
  
  @js.native
  sealed trait large
    extends ButtonSize
       with LoaderSize
  
  @js.native
  sealed trait light extends ButtonSkin
  
  @js.native
  sealed trait loading extends LoaderStatus
  
  @js.native
  sealed trait medium
    extends ButtonSize
       with LoaderSize
       with TextSize
  
  @js.native
  sealed trait normal extends TextWeight
  
  @js.native
  sealed trait premium
    extends ButtonSkin
       with TextSkin
  
  @js.native
  sealed trait `premium-light` extends ButtonSkin
  
  @js.native
  sealed trait primary extends ButtonPriority
  
  @js.native
  sealed trait secondary extends ButtonPriority
  
  @js.native
  sealed trait small
    extends ButtonSize
       with LoaderSize
       with TextSize
  
  @js.native
  sealed trait standard
    extends ButtonSkin
       with TextSkin
  
  @js.native
  sealed trait success
    extends LoaderStatus
       with TextSkin
  
  @js.native
  sealed trait thin extends TextWeight
  
  @js.native
  sealed trait tiny
    extends ButtonSize
       with LoaderSize
       with TextSize
  
  @js.native
  sealed trait transparent extends ButtonSkin
  
  @js.native
  sealed trait white extends LoaderColor
  
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def destructive: destructive = "destructive".asInstanceOf[destructive]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def inverted: inverted = "inverted".asInstanceOf[inverted]
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def premium: premium = "premium".asInstanceOf[premium]
  @scala.inline
  def `premium-light`: `premium-light` = "premium-light".asInstanceOf[`premium-light`]
  @scala.inline
  def primary: primary = "primary".asInstanceOf[primary]
  @scala.inline
  def secondary: secondary = "secondary".asInstanceOf[secondary]
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def thin: thin = "thin".asInstanceOf[thin]
  @scala.inline
  def tiny: tiny = "tiny".asInstanceOf[tiny]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
}

