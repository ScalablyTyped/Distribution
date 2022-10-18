package typings.walkSync.anon

import org.scalablytyped.runtime.Instantiable0
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.EncodingFlag
import typings.node.anon.EncodingWithFileTypes
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.StatSyncOptionsbigintbool
import typings.node.anon.StatSyncOptionsbigintfals
import typings.node.anon.StatSyncOptionsbigintfalsBigint
import typings.node.anon.StatSyncOptionsbiginttrue
import typings.node.anon.StatSyncOptionsbiginttrueBigint
import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.WithFileTypes
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.CopyOptions
import typings.node.fsMod.CopySyncOptions
import typings.node.fsMod.Dir
import typings.node.fsMod.Dirent
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadPosition
import typings.node.fsMod.ReadStream
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatSyncOptions
import typings.node.fsMod.StatWatcher
import typings.node.fsMod.Stats
import typings.node.fsMod.StreamOptions
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WatchListener
import typings.node.fsMod.WatchOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.WriteStream
import typings.node.fsMod.symlink.Type
import typings.node.nodeColonurlMod.URL
import typings.walkSync.walkSyncStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoffsNode extends StObject {
  
  var Dir: Instantiable0[typings.node.fsMod.Dir] = js.native
  
  var Dirent: Instantiable0[typings.node.fsMod.Dirent] = js.native
  
  var ReadStream: Instantiable0[typings.node.fsMod.ReadStream] = js.native
  
  var Stats: Instantiable0[typings.node.fsMod.Stats] = js.native
  
  var WriteStream: Instantiable0[typings.node.fsMod.WriteStream] = js.native
  
  val access: Typeofaccess = js.native
  
  def accessSync(path: PathLike): Unit = js.native
  def accessSync(path: PathLike, mode: Double): Unit = js.native
  
  val appendFile: TypeofappendFile = js.native
  
  def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = js.native
  def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
  def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = js.native
  def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
  
  val chmod: Typeofchmod = js.native
  
  def chmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  val chown: Typeofchown = js.native
  
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  val close: Typeofclose = js.native
  
  def closeSync(fd: Double): Unit = js.native
  
  val constants: Typeofconstants = js.native
  
  val copyFile: TypeofcopyFile = js.native
  
  def copyFileSync(src: PathLike, dest: PathLike): Unit = js.native
  def copyFileSync(src: PathLike, dest: PathLike, mode: Double): Unit = js.native
  
  def cp(source: String, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def cp(
    source: String,
    destination: String,
    opts: CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def cp(source: String, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def cp(
    source: String,
    destination: URL,
    opts: CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def cp(source: URL, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def cp(
    source: URL,
    destination: String,
    opts: CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def cp(source: URL, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def cp(
    source: URL,
    destination: URL,
    opts: CopyOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  
  def cpSync(source: String, destination: String): Unit = js.native
  def cpSync(source: String, destination: String, opts: CopySyncOptions): Unit = js.native
  def cpSync(source: String, destination: URL): Unit = js.native
  def cpSync(source: String, destination: URL, opts: CopySyncOptions): Unit = js.native
  def cpSync(source: URL, destination: String): Unit = js.native
  def cpSync(source: URL, destination: String, opts: CopySyncOptions): Unit = js.native
  def cpSync(source: URL, destination: URL): Unit = js.native
  def cpSync(source: URL, destination: URL, opts: CopySyncOptions): Unit = js.native
  
  def createReadStream(path: PathLike): ReadStream = js.native
  def createReadStream(path: PathLike, options: BufferEncoding): ReadStream = js.native
  def createReadStream(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  
  def createWriteStream(path: PathLike): WriteStream = js.native
  def createWriteStream(path: PathLike, options: BufferEncoding): WriteStream = js.native
  def createWriteStream(path: PathLike, options: StreamOptions): WriteStream = js.native
  
  val exists: Typeofexists = js.native
  
  def existsSync(path: PathLike): Boolean = js.native
  
  val fchmod: Typeoffchmod = js.native
  
  def fchmodSync(fd: Double, mode: Mode): Unit = js.native
  
  val fchown: Typeoffchown = js.native
  
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  val fdatasync: Typeoffdatasync = js.native
  
  def fdatasyncSync(fd: Double): Unit = js.native
  
  val fstat: Typeoffstat = js.native
  
  def fstatSync(fd: Double): Stats | BigIntStats = js.native
  def fstatSync(fd: Double, options: StatOptionsbigintfalseund): Stats = js.native
  def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = js.native
  def fstatSync(fd: Double, options: StatOptions): Stats | BigIntStats = js.native
  @JSName("fstatSync")
  def fstatSync_Stats(fd: Double): Stats = js.native
  
  val fsync: Typeoffsync = js.native
  
  def fsyncSync(fd: Double): Unit = js.native
  
  val ftruncate: Typeofftruncate = js.native
  
  def ftruncateSync(fd: Double): Unit = js.native
  def ftruncateSync(fd: Double, len: Double): Unit = js.native
  
  val futimes: Typeoffutimes = js.native
  
  def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = js.native
  
  val lchmod: Typeoflchmod = js.native
  
  def lchmodSync(path: PathLike, mode: Mode): Unit = js.native
  
  val lchown: Typeoflchown = js.native
  
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = js.native
  
  val link: Typeoflink = js.native
  
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = js.native
  
  val lstat: Typeoflstat = js.native
  
  def lstatSync(path: PathLike): js.UndefOr[Stats] = js.native
  def lstatSync(path: PathLike, options: Unit): Stats = js.native
  def lstatSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
  def lstatSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
  def lstatSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
  def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
  def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
  def lstatSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
  @JSName("lstatSync")
  val lstatSync_Original: StatSyncFn = js.native
  @JSName("lstatSync")
  def lstatSync_Stats(path: PathLike): Stats = js.native
  
  val lutimes: Typeoflutimes = js.native
  
  def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = js.native
  
  val mkdir: Typeofmkdir = js.native
  
  def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike): Unit = js.native
  @JSName("mkdirSync")
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
  
  val mkdtemp: Typeofmkdtemp = js.native
  
  def mkdtempSync(prefix: String): String = js.native
  def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = js.native
  def mkdtempSync(prefix: String, options: EncodingOption): String = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String): String | Buffer = js.native
  @JSName("mkdtempSync")
  def mkdtempSync_Union(prefix: String, options: EncodingOption): String | Buffer = js.native
  
  val open: Typeofopen = js.native
  
  def openSync(path: PathLike, flags: OpenMode): Double = js.native
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  
  val opendir: Typeofopendir = js.native
  
  def opendirSync(path: PathLike): Dir = js.native
  def opendirSync(path: PathLike, options: OpenDirOptions): Dir = js.native
  
  val promises: Typeofpromises = js.native
  
  val read: Typeofread = js.native
  
  val readFile: TypeofreadFile = js.native
  
  def readFileSync(path: PathOrFileDescriptor): String | Buffer = js.native
  def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
  def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
  def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
  def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = js.native
  
  def readSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = js.native
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
  
  val readdir: Typeofreaddir = js.native
  
  def readdirSync(path: PathLike): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: EncodingWithFileTypes): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: WithFileTypes): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  
  val readlink: Typeofreadlink = js.native
  
  def readlinkSync(path: PathLike): String = js.native
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def readlinkSync(path: PathLike, options: EncodingOption): String = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike): String | Buffer = js.native
  @JSName("readlinkSync")
  def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = js.native
  
  val readv: Typeofreadv = js.native
  
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
  
  val realpath: Typeofrealpath = js.native
  
  val realpathSync: TypeofrealpathSync = js.native
  
  val rename: Typeofrename = js.native
  
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  
  val rm: Typeofrm = js.native
  
  def rmSync(path: PathLike): Unit = js.native
  def rmSync(path: PathLike, options: RmOptions): Unit = js.native
  
  val rmdir: Typeofrmdir = js.native
  
  def rmdirSync(path: PathLike): Unit = js.native
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
  
  val stat: Typeofstat = js.native
  
  def statSync(path: PathLike): js.UndefOr[Stats] = js.native
  def statSync(path: PathLike, options: Unit): Stats = js.native
  def statSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
  def statSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
  def statSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
  def statSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
  def statSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
  def statSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
  @JSName("statSync")
  val statSync_Original: StatSyncFn = js.native
  @JSName("statSync")
  def statSync_Stats(path: PathLike): Stats = js.native
  
  val symlink: Typeofsymlink = js.native
  
  def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  
  val truncate: Typeoftruncate = js.native
  
  def truncateSync(path: PathLike): Unit = js.native
  def truncateSync(path: PathLike, len: Double): Unit = js.native
  
  val unlink: Typeofunlink = js.native
  
  def unlinkSync(path: PathLike): Unit = js.native
  
  def unwatchFile(filename: PathLike): Unit = js.native
  def unwatchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): Unit = js.native
  
  val utimes: Typeofutimes = js.native
  
  def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = js.native
  
  def watch(filename: PathLike): FSWatcher = js.native
  def watch(filename: PathLike, listener: WatchListener[String]): FSWatcher = js.native
  def watch(filename: PathLike, options: String): FSWatcher = js.native
  def watch(filename: PathLike, options: String, listener: WatchListener[String | Buffer]): FSWatcher = js.native
  def watch(filename: PathLike, options: Null, listener: WatchListener[String]): FSWatcher = js.native
  def watch(filename: PathLike, options: Unit, listener: WatchListener[String]): FSWatcher = js.native
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = js.native
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def watch(filename: PathLike, options: BufferEncoding, listener: WatchListener[String]): FSWatcher = js.native
  def watch(filename: PathLike, options: WatchOptions): FSWatcher = js.native
  def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | String]): FSWatcher = js.native
  
  def watchFile(filename: PathLike, listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]): StatWatcher = js.native
  def watchFile(
    filename: PathLike,
    options: Unit,
    listener: js.Function2[
      (/* curr */ BigIntStats) | (/* curr */ Stats), 
      (/* prev */ BigIntStats) | (/* prev */ Stats), 
      Unit
    ]
  ): StatWatcher = js.native
  def watchFile(
    filename: PathLike,
    options: WatchFileOptionsbigintfal,
    listener: js.Function2[/* curr */ Stats, /* prev */ Stats, Unit]
  ): StatWatcher = js.native
  def watchFile(
    filename: PathLike,
    options: WatchFileOptionsbiginttru,
    listener: js.Function2[/* curr */ BigIntStats, /* prev */ BigIntStats, Unit]
  ): StatWatcher = js.native
  
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
  @JSName("watch")
  def watch_buffer(filename: PathLike, options: buffer, listener: WatchListener[Buffer]): FSWatcher = js.native
  
  val write: Typeofwrite = js.native
  
  val writeFile: TypeofwriteFile = js.native
  
  def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = js.native
  def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
  def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = js.native
  def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = js.native
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = js.native
  def writeSync(fd: Double, string: String): Double = js.native
  def writeSync(fd: Double, string: String, position: Double): Double = js.native
  def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = js.native
  
  val writev: Typeofwritev = js.native
  
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = js.native
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = js.native
}
