package typings
package vinylDashFsLib.vinylDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", JSImport.Namespace)
@js.native
object vinylDashFsModMembers extends js.Object {
  def dest(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def dest(folder: java.lang.String, opt: DestOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def dest(getFolderPath: js.Function1[/* file */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: java.lang.String, opt: SrcOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: js.Array[java.lang.String], opt: SrcOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(folder: java.lang.String, opts: vinylDashFsLib.Anon_Cwd): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(
    getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String],
    opts: vinylDashFsLib.Anon_CwdDirMode
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def watch(globs: java.lang.String): eventsLib.eventsMod.EventEmitter = js.native
  def watch(globs: java.lang.String, cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Type, scala.Unit]): eventsLib.eventsMod.EventEmitter = js.native
  def watch(globs: java.lang.String, opt: vinylDashFsLib.Anon_DebounceDelay): eventsLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: java.lang.String,
    opt: vinylDashFsLib.Anon_DebounceDelay,
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Type, scala.Unit]
  ): eventsLib.eventsMod.EventEmitter = js.native
  def watch(globs: js.Array[java.lang.String]): eventsLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: js.Array[java.lang.String],
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Type, scala.Unit]
  ): eventsLib.eventsMod.EventEmitter = js.native
  def watch(globs: js.Array[java.lang.String], opt: vinylDashFsLib.Anon_DebounceDelay): eventsLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: js.Array[java.lang.String],
    opt: vinylDashFsLib.Anon_DebounceDelay,
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Type, scala.Unit]
  ): eventsLib.eventsMod.EventEmitter = js.native
}

