package typings.wallpaper

import typings.wallpaper.wallpaperStrings.all
import typings.wallpaper.wallpaperStrings.auto
import typings.wallpaper.wallpaperStrings.center
import typings.wallpaper.wallpaperStrings.fill
import typings.wallpaper.wallpaperStrings.fit
import typings.wallpaper.wallpaperStrings.main
import typings.wallpaper.wallpaperStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wallpaper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  // when removed, each of the methods in this interface can be refactored to an explicit function export
  // and `wallpaper` namespace may be removed completely along with the `export = wallpaper` export.
  @JSImport("wallpaper", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof wallpaper */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof wallpaper */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Get the path to the wallpaper image currently set.
  	@returns The path of the current desktop wallpaper.
  	@example
  	```
  	import wallpaper = require('wallpaper');
  	(async () => {
  		await wallpaper.get();
  		//=> '/Users/sindresorhus/unicorn.jpg'
  	})();
  	```
  	*/
  inline def get(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[String]]
  inline def get(options: GetOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  /**
  	__macOS only.__
  	@returns The available screens.
  	@example
  	```
  	import wallpaper from 'wallpaper';
  	(async () => {
  		await wallpaper.screens();
  		//=> ['Color LCD']
  	})();
  	```
  	*/
  @JSImport("wallpaper", "screens")
  @js.native
  def screens: js.UndefOr[js.Function0[js.Promise[js.Array[String]]]] = js.native
  inline def screens_=(x: js.UndefOr[js.Function0[js.Promise[js.Array[String]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screens")(x.asInstanceOf[js.Any])
  
  /**
  	Set a new wallpaper.
  	@param imagePath - The path to the image to set as the desktop wallpaper.
  	@example
  	```
  	import wallpaper = require('wallpaper');
  	(async () => {
  		await wallpaper.set('unicorn.jpg');
  	})();
  	```
  	*/
  inline def set(imagePath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(imagePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def set(imagePath: String, options: SetOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(imagePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
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
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setScreen(value: all | main | Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
  
  trait SetOptions extends StObject {
    
    /**
    		__macOS only.__
    		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
    		@default 'auto'
    		*/
    val scale: js.UndefOr[auto | fill | fit | stretch | center] = js.undefined
    
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
    
    extension [Self <: SetOptions](x: Self) {
      
      inline def setScale(value: auto | fill | fit | stretch | center): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScreen(value: all | main | Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
}
