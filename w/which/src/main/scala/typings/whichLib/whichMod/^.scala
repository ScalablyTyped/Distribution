package typings
package whichLib.whichMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("which", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(
    cmd: java.lang.String,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def apply(
    cmd: java.lang.String,
    options: (AsyncOptions with (OptionsAll | OptionsFirst)) | AsyncOptions,
    cb: js.Function2[
      stdLib.Error | scala.Null, 
      js.UndefOr[js.Array[java.lang.String] | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  def sync(cmd: java.lang.String): java.lang.String = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  def sync(cmd: java.lang.String, options: Options with OptionsAll with OptionsThrow): js.Array[java.lang.String] = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSName("sync")
  def `sync_<union>`(
    cmd: java.lang.String,
    options: (Options with (OptionsAll | OptionsFirst) with OptionsNoThrow) | Options
  ): js.Array[java.lang.String] | scala.Null = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSName("sync")
  def sync_String(cmd: java.lang.String, options: Options with OptionsFirst with OptionsThrow): java.lang.String = js.native
}

