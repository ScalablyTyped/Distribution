package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wallpaper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: remove this in the next major version
  // when removed, each of the methods in this interface can be refactored to an explicit function export
  // and `wallpaper` namespace may be removed completely along with the `export = wallpaper` export.
  var default: wallpaperLib.Anon_Default = js.native
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
  def get(options: GetOptions): js.Promise[java.lang.String] = js.native
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
  def set(imagePath: java.lang.String, options: SetOptions): js.Promise[scala.Unit] = js.native
}

