package typings.webAppManifest

import typings.webAppManifest.mod.DisplayModeType
import typings.webAppManifest.mod.TextDirectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webAppManifestStrings {
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait auto
    extends StObject
       with TextDirectionType
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait browser
    extends StObject
       with DisplayModeType
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with DisplayModeType
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait landscape extends StObject
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait `landscape-primary` extends StObject
  inline def `landscape-primary`: `landscape-primary` = "landscape-primary".asInstanceOf[`landscape-primary`]
  
  @js.native
  sealed trait `landscape-secondary` extends StObject
  inline def `landscape-secondary`: `landscape-secondary` = "landscape-secondary".asInstanceOf[`landscape-secondary`]
  
  @js.native
  sealed trait ltr
    extends StObject
       with TextDirectionType
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait `minimal-ui`
    extends StObject
       with DisplayModeType
  inline def `minimal-ui`: `minimal-ui` = "minimal-ui".asInstanceOf[`minimal-ui`]
  
  @js.native
  sealed trait natural extends StObject
  inline def natural: natural = "natural".asInstanceOf[natural]
  
  @js.native
  sealed trait portrait extends StObject
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait `portrait-primary` extends StObject
  inline def `portrait-primary`: `portrait-primary` = "portrait-primary".asInstanceOf[`portrait-primary`]
  
  @js.native
  sealed trait `portrait-secondary` extends StObject
  inline def `portrait-secondary`: `portrait-secondary` = "portrait-secondary".asInstanceOf[`portrait-secondary`]
  
  @js.native
  sealed trait rtl
    extends StObject
       with TextDirectionType
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait standalone
    extends StObject
       with DisplayModeType
  inline def standalone: standalone = "standalone".asInstanceOf[standalone]
}
