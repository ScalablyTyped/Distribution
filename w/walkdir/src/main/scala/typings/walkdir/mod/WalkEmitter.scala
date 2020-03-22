package typings.walkdir.mod

import typings.node.eventsMod.EventEmitterOptions
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

/* Inlined node.events.EventEmitter & {end (): void, pause (): void, resume (): void, ignore (paths : string | std.Array<string>): void, on (event : 'error', listener : (error : std.Error): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'fail', listener : (path : string, error : std.Error): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'targetdirectory', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'empty', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'path', listener : (this : walkdir.walkdir/walkdir.WalkEmitter, path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'directory', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'file', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'link', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'socket', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'fifo', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'blockdevice', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter, on (event : 'characterdevice', listener : (path : string, stat : node.fs.Stats, depth : number): void): walkdir.walkdir/walkdir.WalkEmitter} */
@js.native
trait WalkEmitter extends js.Object {
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /**
    * cancel a walk in progress 
    */
  def end(): Unit = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  /**
    * pass paths to ignore for the remainder of the walk. directories ignored will not have events emitted for any of their children.
    * @param paths string|string[]
    */
  def ignore(paths: String): Unit = js.native
  def ignore(paths: js.Array[String]): Unit = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * found a block device / disk
    */
  @JSName("on")
  def on_blockdevice(
    event: blockdevice,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * found a character device / tty / terminal
    */
  @JSName("on")
  def on_characterdevice(
    event: characterdevice,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * found a directory
    */
  @JSName("on")
  def on_directory(
    event: directory,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * helpful event that lets you know if a directory is empty
    */
  @JSName("on")
  def on_empty(
    event: empty,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * emitted if there is an error from the file system reading the initial or target directory
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): WalkEmitter = js.native
  /**
    *  emitted when there is an error from the filesystem reading as nested path.
    */
  @JSName("on")
  def on_fail(event: fail, listener: js.Function2[/* path */ String, /* error */ Error, Unit]): WalkEmitter = js.native
  /**
    * found a fifo
    */
  @JSName("on")
  def on_fifo(event: fifo, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
  /**
    * found a file
    */
  @JSName("on")
  def on_file(event: file, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
  /**
    * found a symlink
    */
  @JSName("on")
  def on_link(event: link, listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]): WalkEmitter = js.native
  /**
    * found a path. this is the expected use case. every path for everything inside target directory is emitted here.
    */
  @JSName("on")
  def on_path(
    event: path,
    listener: js.ThisFunction3[/* this */ this.type, /* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * found a socket
    */
  @JSName("on")
  def on_socket(
    event: socket,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  /**
    * the stat of the target directory. not emitted through any other event.
    */
  @JSName("on")
  def on_targetdirectory(
    event: targetdirectory,
    listener: js.Function3[/* path */ String, /* stat */ Stats, /* depth */ Double, Unit]
  ): WalkEmitter = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * pause the walk
    */
  def pause(): Unit = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * resume the walk
    */
  def resume(): Unit = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

