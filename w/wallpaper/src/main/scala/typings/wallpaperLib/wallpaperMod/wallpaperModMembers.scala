package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wallpaper", JSImport.Namespace)
@js.native
object wallpaperModMembers extends js.Object {
  def get(): js.Promise[java.lang.String] = js.native
  def set(imagePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def set(imagePath: java.lang.String, options: WallpaperOptions): js.Promise[scala.Unit] = js.native
}

