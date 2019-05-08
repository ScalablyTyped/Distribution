package typings
package walkdirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Blockdevice extends js.Object {
  /**
    * cancel a walk in progress 
    */
  def end(): scala.Unit = js.native
  /**
    * pass paths to ignore for the remainder of the walk. directories ignored will not have events emitted for any of their children.
    * @param paths string|string[]
    */
  def ignore(paths: java.lang.String): scala.Unit = js.native
  def ignore(paths: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * found a block device / disk
    */
  @JSName("on")
  def on_blockdevice(
    event: walkdirLib.walkdirLibStrings.blockdevice,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a character device / tty / terminal
    */
  @JSName("on")
  def on_characterdevice(
    event: walkdirLib.walkdirLibStrings.characterdevice,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a directory
    */
  @JSName("on")
  def on_directory(
    event: walkdirLib.walkdirLibStrings.directory,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * helpful event that lets you know if a directory is empty
    */
  @JSName("on")
  def on_empty(
    event: walkdirLib.walkdirLibStrings.empty,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * emitted if there is an error from the file system reading the initial or target directory
    */
  @JSName("on")
  def on_error(
    event: walkdirLib.walkdirLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    *  emitted when there is an error from the filesystem reading as nested path.
    */
  @JSName("on")
  def on_fail(
    event: walkdirLib.walkdirLibStrings.fail,
    listener: js.Function2[/* path */ java.lang.String, /* error */ stdLib.Error, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a fifo
    */
  @JSName("on")
  def on_fifo(
    event: walkdirLib.walkdirLibStrings.fifo,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a file
    */
  @JSName("on")
  def on_file(
    event: walkdirLib.walkdirLibStrings.file,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a symlink
    */
  @JSName("on")
  def on_link(
    event: walkdirLib.walkdirLibStrings.link,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a path. this is the expected use case. every path for everything inside target directory is emitted here.
    */
  @JSName("on")
  def on_path(
    event: walkdirLib.walkdirLibStrings.path,
    listener: js.ThisFunction3[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ /* this */ js.Object, 
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * found a socket
    */
  @JSName("on")
  def on_socket(
    event: walkdirLib.walkdirLibStrings.socket,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * the stat of the target directory. not emitted through any other event.
    */
  @JSName("on")
  def on_targetdirectory(
    event: walkdirLib.walkdirLibStrings.targetdirectory,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      /* depth */ scala.Double, 
      scala.Unit
    ]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias walkdir.walkdir/walkdir.WalkEmitter */ js.Object = js.native
  /**
    * pause the walk
    */
  def pause(): scala.Unit = js.native
  /**
    * resume the walk
    */
  def resume(): scala.Unit = js.native
}

