package typings.wallpaper

import typings.wallpaper.wallpaperMod.GetOptions
import typings.wallpaper.wallpaperMod.SetOptions
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
  var screens: js.UndefOr[js.Function0[js.Promise[js.Array[String]]]] = js.native
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
  def get(): js.Promise[String] = js.native
  def get(options: GetOptions): js.Promise[String] = js.native
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
  def set(imagePath: String): js.Promise[Unit] = js.native
  def set(imagePath: String, options: SetOptions): js.Promise[Unit] = js.native
}

