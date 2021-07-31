package typings.webAppManifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webAppManifestStrings {
  
  @js.native
  sealed trait auto
    extends StObject
       with TextDirectionType
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait browser
    extends StObject
       with DisplayModeType
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with DisplayModeType
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait ltr
    extends StObject
       with TextDirectionType
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait `minimal-ui`
    extends StObject
       with DisplayModeType
  @scala.inline
  def `minimal-ui`: `minimal-ui` = "minimal-ui".asInstanceOf[`minimal-ui`]
  
  @js.native
  sealed trait rtl
    extends StObject
       with TextDirectionType
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait standalone
    extends StObject
       with DisplayModeType
  @scala.inline
  def standalone: standalone = "standalone".asInstanceOf[standalone]
}
