package typings
package wallpaperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
  var screens: js.UndefOr[js.Function0[js.Promise[js.Array[java.lang.String]]]] = js.native
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
  def get(): js.Promise[java.lang.String] = js.native
  def get(options: wallpaperLib.wallpaperMod.GetOptions): js.Promise[java.lang.String] = js.native
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
  def set(imagePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(imagePath: java.lang.String, options: wallpaperLib.wallpaperMod.SetOptions): js.Promise[scala.Unit] = js.native
}

