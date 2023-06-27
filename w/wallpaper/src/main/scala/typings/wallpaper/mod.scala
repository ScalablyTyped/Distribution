package typings.wallpaper

import typings.wallpaper.wallpaperStrings.all
import typings.wallpaper.wallpaperStrings.auto
import typings.wallpaper.wallpaperStrings.center
import typings.wallpaper.wallpaperStrings.fill
import typings.wallpaper.wallpaperStrings.fit
import typings.wallpaper.wallpaperStrings.main
import typings.wallpaper.wallpaperStrings.span
import typings.wallpaper.wallpaperStrings.stretch
import typings.wallpaper.wallpaperStrings.tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wallpaper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWallpaper(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWallpaper")().asInstanceOf[js.Promise[String]]
  inline def getWallpaper(options: GetOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWallpaper")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def screens(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("screens")().asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def setSolidColorWallpaper(rgbHexColor: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSolidColorWallpaper")(rgbHexColor.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setSolidColorWallpaper(rgbHexColor: String, options: SetOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSolidColorWallpaper")(rgbHexColor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setWallpaper(imagePath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setWallpaper")(imagePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setWallpaper(imagePath: String, options: SetOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWallpaper")(imagePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait GetOptions extends StObject {
    
    /**
    	__macOS only.__
    	The screen to get the wallpaper from.
    	Values: `all`, `main`, or the index of a screen from `.screens()`.
    	@default 'main'
    	*/
    val screen: js.UndefOr[all | main | Double] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      inline def setScreen(value: all | main | Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
  
  trait SetOptions extends StObject {
    
    /**
    	__macOS & Windows__
    	Scaling method.
    	macOS Values: `auto` `fill` `fit` `stretch` `center`.
    	Windows Values: `stretch` `center` `tile` `span` `max` `crop-to-fit` `keep-aspect-ratio`.
    	@default 'auto' for macOS
    	@default 'span' for Windows
    	*/
    val scale: js.UndefOr[auto | fill | fit | stretch | center | tile | span] = js.undefined
    
    /**
    	__macOS only.__
    	The screen to set the wallpaper on.
    	Values: `all`, `main`, or the index of a screen from `.screens()`.
    	*On Linux and Windows it's hard-coded to `main`.*
    	@default 'all'
    	*/
    val screen: js.UndefOr[all | main | Double] = js.undefined
  }
  object SetOptions {
    
    inline def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      inline def setScale(value: auto | fill | fit | stretch | center | tile | span): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScreen(value: all | main | Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
}
