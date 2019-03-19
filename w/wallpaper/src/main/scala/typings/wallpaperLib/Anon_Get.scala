package typings
package wallpaperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Get extends js.Object {
  /**
  	 * **macOS only.**
  	 *
  	 * @returns The available screens.
  	 *
  	 * @example
  	 *
  	 * import wallpaper from 'wallpaper'l
  	 *
  	 * (async () => {
  	 * 	await wallpaper.screens();
  	 * 	//=> ['Color LCD']
  	 * })();
  	 */
  var screens: js.UndefOr[js.Function0[js.Promise[js.Array[java.lang.String]]]] = js.native
  /**
  	 * Get the path to the wallpaper image currently set.
  	 *
  	 * @returns The path of the current desktop wallpaper.
  	 */
  def get(): js.Promise[java.lang.String] = js.native
  def get(options: wallpaperLib.wallpaperMod.GetOptions): js.Promise[java.lang.String] = js.native
  /**
  	 * Set a new wallpaper.
  	 *
  	 * @param imagePath - The path to the image to set as the desktop wallpaper.
  	 */
  def set(imagePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(imagePath: java.lang.String, options: wallpaperLib.wallpaperMod.SetOptions): js.Promise[scala.Unit] = js.native
}

