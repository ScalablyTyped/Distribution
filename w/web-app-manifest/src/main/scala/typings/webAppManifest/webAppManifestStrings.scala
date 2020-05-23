package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webAppManifestStrings {
  @js.native
  sealed trait auto extends TextDirectionType
  
  @js.native
  sealed trait browser extends DisplayModeType
  
  @js.native
  sealed trait fullscreen extends DisplayModeType
  
  @js.native
  sealed trait ltr extends TextDirectionType
  
  @js.native
  sealed trait `minimal-ui` extends DisplayModeType
  
  @js.native
  sealed trait rtl extends TextDirectionType
  
  @js.native
  sealed trait standalone extends DisplayModeType
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def `minimal-ui`: `minimal-ui` = "minimal-ui".asInstanceOf[`minimal-ui`]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  @scala.inline
  def standalone: standalone = "standalone".asInstanceOf[standalone]
}

