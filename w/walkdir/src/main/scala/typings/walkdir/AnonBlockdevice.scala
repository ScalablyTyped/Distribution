package typings.walkdir

import typings.node.fsMod.Stats
import typings.std.Error
import typings.walkdir.walkdirStrings.blockdevice
import typings.walkdir.walkdirStrings.characterdevice
import typings.walkdir.walkdirStrings.directory
import typings.walkdir.walkdirStrings.empty
import typings.walkdir.walkdirStrings.error
import typings.walkdir.walkdirStrings.fail
import typings.walkdir.walkdirStrings.fifo
import typings.walkdir.walkdirStrings.file
import typings.walkdir.walkdirStrings.link
import typings.walkdir.walkdirStrings.path
import typings.walkdir.walkdirStrings.socket
import typings.walkdir.walkdirStrings.targetdirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockdevice extends js.Object {
  /**
    * cancel a walk in progress 
    */
  def end(): Unit = js.native
  /**
    * pass paths to ignore for the remainder of the walk. directories ignored will not have events emitted for any of their children.
    * @param paths string|string[]
    */
  def ignore(paths: String): Unit = js.native
  def ignore(paths: js.Array[String]): Unit = js.native
  /**
    * found a block device / disk
    */
  @JSName("on")
  def on_blockdevice(
    event: blockdevice,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a character device / tty / terminal
    */
  @JSName("on")
  def on_characterdevice(
    event: characterdevice,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a directory
    */
  @JSName("on")
  def on_directory(
    event: directory,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * helpful event that lets you know if a directory is empty
    */
  @JSName("on")
  def on_empty(
    event: empty,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * emitted if there is an error from the file system reading the initial or target directory
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    *  emitted when there is an error from the filesystem reading as nested path.
    */
  @JSName("on")
  def on_fail(event: fail, listener: js.Function2[/* path */ String, /* error */ Error, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a fifo
    */
  @JSName("on")
  def on_fifo(event: fifo, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a file
    */
  @JSName("on")
  def on_file(event: file, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a symlink
    */
  @JSName("on")
  def on_link(event: link, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a path. this is the expected use case. every path for everything inside target directory is emitted here.
    */
  @JSName("on")
  def on_path(
    event: path,
    listener: js.ThisFunction3[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ /* this */ js.Object, 
      /* path */ String, 
      /* stat */ Stats, 
      /* depth */ Double, 
      Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a socket
    */
  @JSName("on")
  def on_socket(
    event: socket,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * the stat of the target directory. not emitted through any other event.
    */
  @JSName("on")
  def on_targetdirectory(
    event: targetdirectory,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * pause the walk
    */
  def pause(): Unit = js.native
  /**
    * resume the walk
    */
  def resume(): Unit = js.native
}

