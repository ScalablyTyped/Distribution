package typings.tempDashFs.tempDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Remove all tracked files and directories asynchronously.
    */
  def clear(): js.Any = js.native
  def clear(callback: js.Function0[_]): js.Any = js.native
  /**
    * Remove all tracked files and directories synchronously.
    */
  def clearSync(): js.Any = js.native
  /**
    * Return the path of a system-provided tempdir as
    * <code>require('os').tmpdir()</code> does.
    *
    * You should not make any assumption about whether the path contains a
    * trailing path separator, or it is a real path. On most system it is not a
    * fixed path, and it can be changed by the user environment. When in doubt,
    * check it first.
    */
  def dir(): String = js.native
  /**
    * Try to create a new tempdir asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>dir</code>. If <code>error</code> is
    *                 <code>null</code>, <code>dir</code> has the properties of
    *                 {@link dir}.
    */
  def mkdir(): js.Any = js.native
  def mkdir(options: options): js.Any = js.native
  def mkdir(options: options, callback: js.Function2[/* err */ js.Any, /* dir */ dir, _]): js.Any = js.native
  /**
    * The synchronous version of {@link mkdir}.
    *
    * @throws when an error happens.
    */
  def mkdirSync(): dir = js.native
  def mkdirSync(options: options): dir = js.native
  /**
    * Return a customized/random filename/dirname.
    */
  def name(): String = js.native
  def name(options: options): String = js.native
  /**
    * Try to open a unique tempfile asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>file</code>. If <code>error</code> is
    *                 <code>null</code>, <code>file</code> has the properties
    *                 of {@link file}.
    */
  def open(): js.Any = js.native
  def open(callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  def open(options: options): js.Any = js.native
  def open(options: options, callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  /**
    * The synchronous version of {@link open}.
    *
    * @throws when an error happens.
    */
  def openSync(): file = js.native
  def openSync(options: options): file = js.native
  /**
    * Use it to switch global files/directories tracking on or off.
    *
    * Turn it on if you don't want to manually delete everything. When it is
    * turned off, all recorded files and directories will not be removed but
    * still kept in case it is turned on again before the program exits.
    *
    * This switch does not affect manually tracked files through
    * {@link options#track}. They will be removed automatically on exit.
    *
    * <b>Note: When an uncaught exception occurs, all tracked temporary files
    * and directories will be removed no matter it is on or off.</b>
    */
  def track(): Unit = js.native
  def track(on: Boolean): Unit = js.native
}

