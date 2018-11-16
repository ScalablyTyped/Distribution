package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wallpaper", JSImport.Namespace)
@js.native
object wallpaperModMembers extends js.Object {
  def get(): stdLib.Promise[java.lang.String] = js.native
  def set(imagePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def set(imagePath: java.lang.String, options: WallpaperOptions): stdLib.Promise[scala.Unit] = js.native
}

