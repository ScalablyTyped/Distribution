package typings
package vinylDashFsLib.vinylDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vinyl-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def dest(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def dest(folder: java.lang.String, opt: vinylDashFsLib.vinylDashFsMod.DestOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def dest(getFolderPath: js.Function1[/* file */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: java.lang.String, opt: vinylDashFsLib.vinylDashFsMod.SrcOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def src(globs: js.Array[java.lang.String], opt: vinylDashFsLib.vinylDashFsMod.SrcOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(folder: java.lang.String, opts: vinylDashFsLib.Anon_CwdDirMode): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def symlink(
    getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String],
    opts: vinylDashFsLib.Anon_CwdDirModeNumber
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def watch(globs: java.lang.String): nodeLib.eventsMod.EventEmitter = js.native
  def watch(globs: java.lang.String, cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Old, scala.Unit]): nodeLib.eventsMod.EventEmitter = js.native
  def watch(globs: java.lang.String, opt: vinylDashFsLib.Anon_Cwd): nodeLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: java.lang.String,
    opt: vinylDashFsLib.Anon_Cwd,
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Old, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def watch(globs: js.Array[java.lang.String]): nodeLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: js.Array[java.lang.String],
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Old, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def watch(globs: js.Array[java.lang.String], opt: vinylDashFsLib.Anon_Cwd): nodeLib.eventsMod.EventEmitter = js.native
  def watch(
    globs: js.Array[java.lang.String],
    opt: vinylDashFsLib.Anon_Cwd,
    cb: js.Function1[/* outEvt */ vinylDashFsLib.Anon_Old, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
}

