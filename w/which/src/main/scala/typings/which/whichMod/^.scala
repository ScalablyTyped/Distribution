package typings.which.whichMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("which", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(cmd: String, cb: js.Function2[/* err */ Error | Null, /* path */ js.UndefOr[String], Unit]): Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(
    cmd: String,
    options: (AsyncOptions with (OptionsAll | OptionsFirst)) | AsyncOptions,
    cb: js.Function2[Error | Null, js.UndefOr[js.Array[String] | String], Unit]
  ): Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def sync(cmd: String): String = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  def sync(cmd: String, options: Options with OptionsAll with OptionsThrow): js.Array[String] = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSName("sync")
  def sync_String(cmd: String, options: Options with OptionsFirst with OptionsThrow): String = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSName("sync")
  def sync_Union(cmd: String, options: (Options with (OptionsAll | OptionsFirst) with OptionsNoThrow) | Options): js.Array[String] | Null = js.native
}

