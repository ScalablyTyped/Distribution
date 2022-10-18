package typings.tar

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.node.zlibMod.ZlibOptions
import typings.tar.anon.CreateOptionsFileOptionss
import typings.tar.anon.ExtractOptionsFileOptions
import typings.tar.anon.Sync
import typings.tar.tarBooleans.`false`
import typings.tar.tarStrings.close
import typings.tar.tarStrings.end
import typings.tar.tarStrings.entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Extract_(opts: String): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
  inline def Extract_(opts: ExtractOptions): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
  
  inline def Pack(): PackStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Pack")().asInstanceOf[PackStream]
  inline def Pack(props: HeaderProperties): PackStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Pack")(props.asInstanceOf[js.Any]).asInstanceOf[PackStream]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tar", "Parse")
  @js.native
  open class ParseCls ()
    extends StObject
       with Parse {
    def this(opt: ParseOptions) = this()
  }
  
  @JSImport("tar", "blockSize")
  @js.native
  val blockSize: Double = js.native
  
  inline def c(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def c(
    options: CreateOptions & FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def c(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def c_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def c_Readable(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def create(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def create(
    options: CreateOptions & FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def create_Readable(
    options: CreateOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def extract(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def extract(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def extract(
    options: ExtractOptions & FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def extract(
    options: ExtractOptions & FileOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def extract(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def extract(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extract_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def extract_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def extract_Writable(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def extract_Writable(
    options: ExtractOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  @JSImport("tar", "fieldEnds")
  @js.native
  val fieldEnds: js.Array[Double] = js.native
  
  @JSImport("tar", "fieldOffs")
  @js.native
  val fieldOffs: js.Array[Double] = js.native
  
  @JSImport("tar", "fieldSize")
  @js.native
  val fieldSize: js.Array[Double] = js.native
  
  @JSImport("tar", "headerSize")
  @js.native
  val headerSize: Double = js.native
  
  object knownExtended {
    
    @JSImport("tar", "knownExtended")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "knownExtended.atime")
    @js.native
    def atime: Boolean = js.native
    inline def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.charset")
    @js.native
    def charset: Boolean = js.native
    inline def charset_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charset")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.comment")
    @js.native
    def comment: Boolean = js.native
    inline def comment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.ctime")
    @js.native
    def ctime: Boolean = js.native
    inline def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.gid")
    @js.native
    def gid: Boolean = js.native
    inline def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.gname")
    @js.native
    def gname: Boolean = js.native
    inline def gname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gname")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.linkpat")
    @js.native
    def linkpat: Boolean = js.native
    inline def linkpat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkpat")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.mtime")
    @js.native
    def mtime: Boolean = js.native
    inline def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.path")
    @js.native
    def path: Boolean = js.native
    inline def path_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.realtime")
    @js.native
    def realtime: Boolean = js.native
    inline def realtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.security")
    @js.native
    def security: Boolean = js.native
    inline def security_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("security")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.size")
    @js.native
    def size: Boolean = js.native
    inline def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.uid")
    @js.native
    def uid: Boolean = js.native
    inline def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "knownExtended.uname")
    @js.native
    def uname: Boolean = js.native
    inline def uname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uname")(x.asInstanceOf[js.Any])
  }
  
  inline def list(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Parse]
  inline def list(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def list(optionsOrFileList: js.Array[String]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def list(optionsOrFileList: js.Array[String], callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def list(optionsOrFileList: ListOptions): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def list(optionsOrFileList: ListOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def list(options: ListOptions & RequiredFileOptions & Sync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(options: ListOptions & RequiredFileOptions & Sync, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(options: ListOptions, fileList: js.Array[String]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def list(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  
  inline def list_Promise(options: ListOptions & RequiredFileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def list_Promise(options: ListOptions & RequiredFileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  object modes {
    
    @JSImport("tar", "modes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "modes.gexec")
    @js.native
    def gexec: Double = js.native
    inline def gexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.gread")
    @js.native
    def gread: Double = js.native
    inline def gread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.gwrite")
    @js.native
    def gwrite: Double = js.native
    inline def gwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gwrite")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.oexec")
    @js.native
    def oexec: Double = js.native
    inline def oexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.oread")
    @js.native
    def oread: Double = js.native
    inline def oread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.owrite")
    @js.native
    def owrite: Double = js.native
    inline def owrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("owrite")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.sgid")
    @js.native
    def sgid: Double = js.native
    inline def sgid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sgid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.suid")
    @js.native
    def suid: Double = js.native
    inline def suid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.svtx")
    @js.native
    def svtx: Double = js.native
    inline def svtx_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svtx")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uexec")
    @js.native
    def uexec: Double = js.native
    inline def uexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uexec")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uread")
    @js.native
    def uread: Double = js.native
    inline def uread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uread")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "modes.uwrite")
    @js.native
    def uwrite: Double = js.native
    inline def uwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uwrite")(x.asInstanceOf[js.Any])
  }
  
  object numeric {
    
    @JSImport("tar", "numeric")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "numeric.atime")
    @js.native
    def atime: Boolean = js.native
    inline def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.cksum")
    @js.native
    def cksum: Boolean = js.native
    inline def cksum_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cksum")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.ctime")
    @js.native
    def ctime: Boolean = js.native
    inline def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.dev")
    @js.native
    def dev: Boolean = js.native
    inline def dev_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dev")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.devmaj")
    @js.native
    def devmaj: Boolean = js.native
    inline def devmaj_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmaj")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.devmin")
    @js.native
    def devmin: Boolean = js.native
    inline def devmin_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmin")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.gid")
    @js.native
    def gid: Boolean = js.native
    inline def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.ino")
    @js.native
    def ino: Boolean = js.native
    inline def ino_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ino")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.mode")
    @js.native
    def mode: Boolean = js.native
    inline def mode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.mtime")
    @js.native
    def mtime: Boolean = js.native
    inline def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.nlink")
    @js.native
    def nlink: Boolean = js.native
    inline def nlink_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nlink")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.size")
    @js.native
    def size: Boolean = js.native
    inline def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "numeric.uid")
    @js.native
    def uid: Boolean = js.native
    inline def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
  }
  
  inline def r(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def r(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def r(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def r(
    options: ReplaceOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def replace(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def replace(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def replace(
    options: ReplaceOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def t(): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")().asInstanceOf[Parse]
  inline def t(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(callback.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def t(optionsOrFileList: js.Array[String]): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def t(optionsOrFileList: js.Array[String], callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def t(optionsOrFileList: ListOptions): Parse = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any]).asInstanceOf[Parse]
  inline def t(optionsOrFileList: ListOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(optionsOrFileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def t(options: ListOptions & RequiredFileOptions & Sync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def t(options: ListOptions & RequiredFileOptions & Sync, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def t(options: ListOptions, fileList: js.Array[String]): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Parse]
  inline def t(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Parse = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parse]
  
  inline def t_Promise(options: ListOptions & RequiredFileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def t_Promise(options: ListOptions & RequiredFileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  object types {
    
    @JSImport("tar", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tar", "types.0")
    @js.native
    val `0`: String = js.native
    
    @JSImport("tar", "types.1")
    @js.native
    val `1`: String = js.native
    
    @JSImport("tar", "types.2")
    @js.native
    val `2`: String = js.native
    
    @JSImport("tar", "types.3")
    @js.native
    val `3`: String = js.native
    
    @JSImport("tar", "types.4")
    @js.native
    val `4`: String = js.native
    
    @JSImport("tar", "types.5")
    @js.native
    val `5`: String = js.native
    
    @JSImport("tar", "types.6")
    @js.native
    val `6`: String = js.native
    
    @JSImport("tar", "types.7")
    @js.native
    val `7`: String = js.native
    
    @JSImport("tar", "types.A")
    @js.native
    def A: String = js.native
    inline def A_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.BlockDevice")
    @js.native
    def BlockDevice: String = js.native
    inline def BlockDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockDevice")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.CharacterDevice")
    @js.native
    def CharacterDevice: String = js.native
    inline def CharacterDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CharacterDevice")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ContiguousFile")
    @js.native
    def ContiguousFile: String = js.native
    inline def ContiguousFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContiguousFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ContinuationFile")
    @js.native
    def ContinuationFile: String = js.native
    inline def ContinuationFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinuationFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.D")
    @js.native
    def D: String = js.native
    inline def D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("D")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.Directory")
    @js.native
    def Directory: String = js.native
    inline def Directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directory")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.ExtendedHeader")
    @js.native
    def ExtendedHeader: String = js.native
    inline def ExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.FIFO")
    @js.native
    def FIFO: String = js.native
    inline def FIFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIFO")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.File")
    @js.native
    def File: String = js.native
    inline def File_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.GNUDumpDir")
    @js.native
    def GNUDumpDir: String = js.native
    inline def GNUDumpDir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GNUDumpDir")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.GlobalExtendedHeader")
    @js.native
    def GlobalExtendedHeader: String = js.native
    inline def GlobalExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.I")
    @js.native
    def I: String = js.native
    
    @JSImport("tar", "types.INode")
    @js.native
    def INode: String = js.native
    inline def INode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INode")(x.asInstanceOf[js.Any])
    
    inline def I_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.K")
    @js.native
    def K: String = js.native
    inline def K_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("K")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.L")
    @js.native
    def L: String = js.native
    inline def L_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.Link")
    @js.native
    def Link: String = js.native
    inline def Link_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.M")
    @js.native
    def M: String = js.native
    inline def M_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.N")
    @js.native
    def N: String = js.native
    inline def N_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.NextFileHasLonLinkPath")
    @js.native
    def NextFileHasLonLinkPath: String = js.native
    inline def NextFileHasLonLinkPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLonLinkPath")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.NextFileHasLongPath")
    @js.native
    def NextFileHasLongPath: String = js.native
    inline def NextFileHasLongPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLongPath")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.\u0000")
    @js.native
    def Null: String = js.native
    
    inline def Null_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0000")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.OldExtendedHeader")
    @js.native
    def OldExtendedHeader: String = js.native
    inline def OldExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldExtendedHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.OldFile")
    @js.native
    def OldFile: String = js.native
    inline def OldFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldFile")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.S")
    @js.native
    def S: String = js.native
    inline def S_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.SolarisACL")
    @js.native
    def SolarisACL: String = js.native
    inline def SolarisACL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SolarisACL")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.SymbolicLick")
    @js.native
    def SymbolicLick: String = js.native
    inline def SymbolicLick_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolicLick")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.TapeVolumeHeader")
    @js.native
    def TapeVolumeHeader: String = js.native
    inline def TapeVolumeHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapeVolumeHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.V")
    @js.native
    def V: String = js.native
    inline def V_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.X")
    @js.native
    def X_ : String = js.native
    
    inline def X__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.")
    @js.native
    def _empty: String = js.native
    
    inline def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.g")
    @js.native
    def g: String = js.native
    inline def g_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
    
    @JSImport("tar", "types.x")
    @js.native
    def x: String = js.native
    inline def x_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
  }
  
  inline def u(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def u(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def u(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def u(
    options: ReplaceOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def update(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def update(
    options: ReplaceOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def update(
    options: ReplaceOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def x(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def x(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def x(
    options: ExtractOptions & FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def x(
    options: ExtractOptions & FileOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def x(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def x(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def x_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def x_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def x_Writable(
    options: ExtractOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def x_Writable(
    options: ExtractOptions,
    fileList: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  trait CreateOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for follow.
      */
    var L: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for presevePaths.
      */
    var P: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current working directory for creating the archive. Defaults to process.cwd().
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to add the entry to the archive, or false to omit it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
    
    /**
      * Set to true to pack the targets of symbolic links. Without this
      * option, symbolic links are archived as such.
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to any truthy value to create a gzipped archive,
      * or an object with settings for zlib.Gzip()
      */
    var gzip: js.UndefOr[Boolean | ZlibOptions] = js.undefined
    
    /**
      * Alias for follow.
      */
    var h: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mode to set on the created file archive.
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not recursively archive the contents of directories.
      */
    var noDirRecurse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress pax extended headers. Note that this means that long paths and
      * linkpaths will be truncated, and large or negative numeric values
      * may be interpreted incorrectly.
      */
    var noPax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
    
    /**
      * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
      * gname, dev, ino, and nlink. Note that mtime is still included,
      * because this is necessary other time-based operations.
      */
    var portable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A path portion to prefix onto the entries in the archive.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Allow absolute paths. By default, / is stripped from absolute paths.
      */
    var preservePaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for gzip.
      */
    var z: js.UndefOr[Boolean | ZlibOptions] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
      
      inline def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
      
      inline def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
      
      inline def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
      
      inline def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      inline def setP(value: Boolean): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "P", js.undefined)
      
      inline def setPortable(value: Boolean): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setZ(value: Boolean | ZlibOptions): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  trait ExtractOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.undefined
    
    var Directory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
    
    /**
      * Set to a number to force ownership of all extracted files and folders,
      * and all implicitly created directories, to be owned by the specified
      * group id, regardless of the gid field in the archive. Cannot be used
      * along with preserveOwner. Requires also setting a uid option
      */
    var gid: js.UndefOr[Double] = js.undefined
    
    /**
      * Alias for keep.
      */
    var k: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not overwrite existing files. In particular, if a file appears more
      * than once in an archive, later copies will not overwrite earlier copies
      */
    var keep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for keep.
      */
    var `keep-existing`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for newer.
      */
    var `keep-newer`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for newer.
      */
    var `keep-newer-files`: js.UndefOr[Boolean] = js.undefined
    
    var m: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum size of meta entries that is supported. Defaults to 1 MB.
      */
    var maxMetaEntrySize: js.UndefOr[Double] = js.undefined
    
    // The following options are mostly internal, but can be modified in some
    // advanced use cases, such as re-using caches between runs.
    /**
      * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to true to keep the existing file on disk if it's newer than
      * the file in the archive.
      */
    var newer: js.UndefOr[Boolean] = js.undefined
    
    var `no-mtime`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to omit calling `fs.chmod()` to ensure that the extracted file
      * matches the entry mode. This also suppresses the call to `process.umask()`
      * to determine the default umask value, since tar will extract with whatever
      * mode is provided, and let the process `umask` apply normally.
      */
    var noChmod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to omit writing mtime value for extracted entries.
      * [Alias: m, no-mtime]
      */
    var noMtime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that gets called with (entry) for each entry that passes the
      * filter.
      */
    var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.undefined
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
    
    /**
      * Alias for preserveOwner.
      */
    var p: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * If true, tar will set the uid and gid of extracted entries to the uid
      * and gid fields in the archive. This defaults to true when run as root,
      * and false otherwise. If false, then files and directories will be set
      * with the owner and group of the user running the process. This is
      * similar to -p in tar(1), but ACLs and other system-specific data is
      * never unpacked in this implementation, and modes
      * are set by default already.
      */
    var preserveOwner: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove the specified number of leading path elements. Pathnames with
      * fewer elements will be silently skipped. Note that the pathname
      * is edited after applying the filter, but before security checks.
      */
    var strip: js.UndefOr[Double] = js.undefined
    
    /**
      * Alias for strip.
      */
    var `strip-components`: js.UndefOr[Double] = js.undefined
    
    /**
      * Alias for strip.
      */
    var stripComponents: js.UndefOr[Double] = js.undefined
    
    /**
      * Provide a function that takes an entry object, and returns a stream,
      * or any falsey value. If a stream is provided, then that stream's data
      * will be written instead of the contents of the archive entry. If a
      * falsey value is provided, then the entry is written to disk as normal.
      * (To exclude items from extraction, use the filter option described above.)
      */
    var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Set to a number to force ownership of all extracted files and folders,
      * and all implicitly created directories, to be owned by the specified
      * user id, regardless of the uid field in the archive. Cannot be used
      * along with preserveOwner. Requires also setting a gid option.
      */
    var uid: js.UndefOr[Double] = js.undefined
    
    /**
      * Unlink files before creating them. Without this option, tar overwrites
      * existing files, which preserves existing hardlinks. With this option,
      * existing hardlinks will be broken, as will any symlink that would
      * affect the location of an extracted file.
      */
    var unlink: js.UndefOr[Boolean] = js.undefined
  }
  object ExtractOptions {
    
    inline def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    extension [Self <: ExtractOptions](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "Directory", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def `setKeep-existing`(value: Boolean): Self = StObject.set(x, "keep-existing", value.asInstanceOf[js.Any])
      
      inline def `setKeep-existingUndefined`: Self = StObject.set(x, "keep-existing", js.undefined)
      
      inline def `setKeep-newer`(value: Boolean): Self = StObject.set(x, "keep-newer", value.asInstanceOf[js.Any])
      
      inline def `setKeep-newer-files`(value: Boolean): Self = StObject.set(x, "keep-newer-files", value.asInstanceOf[js.Any])
      
      inline def `setKeep-newer-filesUndefined`: Self = StObject.set(x, "keep-newer-files", js.undefined)
      
      inline def `setKeep-newerUndefined`: Self = StObject.set(x, "keep-newer", js.undefined)
      
      inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
      
      inline def setM(value: Boolean): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setMaxMetaEntrySize(value: Double): Self = StObject.set(x, "maxMetaEntrySize", value.asInstanceOf[js.Any])
      
      inline def setMaxMetaEntrySizeUndefined: Self = StObject.set(x, "maxMetaEntrySize", js.undefined)
      
      inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      inline def setNewer(value: Boolean): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
      
      inline def setNewerUndefined: Self = StObject.set(x, "newer", js.undefined)
      
      inline def `setNo-mtime`(value: Boolean): Self = StObject.set(x, "no-mtime", value.asInstanceOf[js.Any])
      
      inline def `setNo-mtimeUndefined`: Self = StObject.set(x, "no-mtime", js.undefined)
      
      inline def setNoChmod(value: Boolean): Self = StObject.set(x, "noChmod", value.asInstanceOf[js.Any])
      
      inline def setNoChmodUndefined: Self = StObject.set(x, "noChmod", js.undefined)
      
      inline def setNoMtime(value: Boolean): Self = StObject.set(x, "noMtime", value.asInstanceOf[js.Any])
      
      inline def setNoMtimeUndefined: Self = StObject.set(x, "noMtime", js.undefined)
      
      inline def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      inline def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      inline def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      inline def setP(value: Boolean): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPreserveOwner(value: Boolean): Self = StObject.set(x, "preserveOwner", value.asInstanceOf[js.Any])
      
      inline def setPreserveOwnerUndefined: Self = StObject.set(x, "preserveOwner", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStrip(value: Double): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def `setStrip-components`(value: Double): Self = StObject.set(x, "strip-components", value.asInstanceOf[js.Any])
      
      inline def `setStrip-componentsUndefined`: Self = StObject.set(x, "strip-components", js.undefined)
      
      inline def setStripComponents(value: Double): Self = StObject.set(x, "stripComponents", value.asInstanceOf[js.Any])
      
      inline def setStripComponentsUndefined: Self = StObject.set(x, "stripComponents", js.undefined)
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUnlink(value: Boolean): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  trait Fields_ extends StObject {
    
    var cksum: Double
    
    var devmaj: Double
    
    var devmin: Double
    
    var fill: Double
    
    var gid: Double
    
    var gname: Double
    
    var linkpath: Double
    
    var mode: Double
    
    var mtime: Double
    
    var path: Double
    
    var prefix: Double
    
    var size: Double
    
    var `type`: Double
    
    var uid: Double
    
    var uname: Double
    
    var ustar: Double
    
    var ustarvar: Double
  }
  object Fields_ {
    
    inline def apply(
      cksum: Double,
      devmaj: Double,
      devmin: Double,
      fill: Double,
      gid: Double,
      gname: Double,
      linkpath: Double,
      mode: Double,
      mtime: Double,
      path: Double,
      prefix: Double,
      size: Double,
      `type`: Double,
      uid: Double,
      uname: Double,
      ustar: Double,
      ustarvar: Double
    ): Fields_ = {
      val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields_]
    }
    
    extension [Self <: Fields_](x: Self) {
      
      inline def setCksum(value: Double): Self = StObject.set(x, "cksum", value.asInstanceOf[js.Any])
      
      inline def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
      
      inline def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
      
      inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGname(value: Double): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setLinkpath(value: Double): Self = StObject.set(x, "linkpath", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Double): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUname(value: Double): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUstar(value: Double): Self = StObject.set(x, "ustar", value.asInstanceOf[js.Any])
      
      inline def setUstarvar(value: Double): Self = StObject.set(x, "ustarvar", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileOptions extends StObject {
    
    /**
      * Alias for file.
      */
    var f: js.UndefOr[String] = js.undefined
    
    /**
      * Uses the given file as the input or output of this function.
      */
    var file: js.UndefOr[String] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    }
  }
  
  @js.native
  trait FileStat
    extends Readable
       with Fields_ {
    
    var blockRemain: Double = js.native
    
    var header: HeaderProperties = js.native
    
    var ignore: Boolean = js.native
    
    var meta: Boolean = js.native
    
    var remain: Double = js.native
    
    var startBlockSize: Double = js.native
  }
  
  trait HeaderProperties extends StObject {
    
    var devmaj: js.UndefOr[Double] = js.undefined
    
    var devmin: js.UndefOr[Double] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var gname: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Double] = js.undefined
    
    var noProprietary: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    var uname: js.UndefOr[String] = js.undefined
  }
  object HeaderProperties {
    
    inline def apply(path: String): HeaderProperties = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderProperties]
    }
    
    extension [Self <: HeaderProperties](x: Self) {
      
      inline def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
      
      inline def setDevmajUndefined: Self = StObject.set(x, "devmaj", js.undefined)
      
      inline def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
      
      inline def setDevminUndefined: Self = StObject.set(x, "devmin", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setNoProprietary(value: Boolean): Self = StObject.set(x, "noProprietary", value.asInstanceOf[js.Any])
      
      inline def setNoProprietaryUndefined: Self = StObject.set(x, "noProprietary", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
  
  trait ListOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.undefined
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.undefined
    
    /**
      * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, entry streams are resumed immediately after the call to
      * onentry. Set noResume: true to suppress this behavior. Note that by
      * opting into this, the stream will never complete until the entry
      * data is consumed.
      */
    var noResume: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that gets called with (entry) for each entry that passes the
      * filter. This is important for when both file and sync are set, because
      * it will be called synchronously.
      */
    var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.undefined
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* entry */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      inline def setNoResume(value: Boolean): Self = StObject.set(x, "noResume", value.asInstanceOf[js.Any])
      
      inline def setNoResumeUndefined: Self = StObject.set(x, "noResume", js.undefined)
      
      inline def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      inline def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait PackStream
    extends StObject
       with ReadWriteStream {
    
    var _buffer: js.Array[Stream] = js.native
    
    var _currentEntry: Any = js.native
    
    var _global: HeaderProperties = js.native
    
    var _needDrain: Boolean = js.native
    
    var _noProprietary: Boolean = js.native
    
    var _paused: Boolean = js.native
    
    var _pipeRoot: Stream = js.native
    
    def _process(): Unit = js.native
    
    var _processing: Boolean = js.native
    
    def add(stream: Stream): Boolean = js.native
    
    def addGlobal(props: HeaderProperties): Unit = js.native
    
    def destroy(): Unit = js.native
  }
  
  @js.native
  trait Parse
    extends StObject
       with ParseStream {
    
    def on(event: end | close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_entry(event: entry, listener: js.Function1[/* entry */ ReadEntry, Unit]): this.type = js.native
  }
  
  trait ParseOptions extends StObject {
    
    var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ ReadEntry, Boolean]] = js.undefined
    
    var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.undefined
    
    var onwarn: js.UndefOr[js.Function3[/* code */ String, /* message */ String, /* data */ Buffer, Unit]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setFilter(value: (/* path */ String, /* entry */ ReadEntry) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnentry(value: /* entry */ ReadEntry => Unit): Self = StObject.set(x, "onentry", js.Any.fromFunction1(value))
      
      inline def setOnentryUndefined: Self = StObject.set(x, "onentry", js.undefined)
      
      inline def setOnwarn(value: (/* code */ String, /* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction3(value))
      
      inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait ParseStream
    extends StObject
       with ReadWriteStream {
    
    var _ended: Boolean = js.native
    
    def _process(c: Buffer): Unit = js.native
    
    def _startEntry(c: Buffer): Unit = js.native
    
    var _stream: Stream = js.native
    
    def _streamEnd(): Unit = js.native
    
    var position: Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MiniPass * / any */ trait ReadEntry
    extends StObject
       with HeaderProperties {
    
    /** The number of 512-byte blocks remaining to be written into the stream. */
    var blockRemain: Double
    
    /** The extended metadata object provided to the constructor. */
    var extended: Any
    
    /** The global extended metadata object provided to the constructor. */
    var globalExtended: Any
    
    /** Whether this entry should be ignored. */
    var ignore: Boolean
    
    /**
      * True if this represents metadata about the next entry, false if it
      * represents a filesystem object.
      */
    var meta: Boolean
    
    /** The number of bytes remaining to be written into the stream. */
    var remain: Double
  }
  object ReadEntry {
    
    inline def apply(
      blockRemain: Double,
      extended: Any,
      globalExtended: Any,
      ignore: Boolean,
      meta: Boolean,
      path: String,
      remain: Double
    ): ReadEntry = {
      val __obj = js.Dynamic.literal(blockRemain = blockRemain.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], globalExtended = globalExtended.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadEntry]
    }
    
    extension [Self <: ReadEntry](x: Self) {
      
      inline def setBlockRemain(value: Double): Self = StObject.set(x, "blockRemain", value.asInstanceOf[js.Any])
      
      inline def setExtended(value: Any): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setGlobalExtended(value: Any): Self = StObject.set(x, "globalExtended", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setRemain(value: Double): Self = StObject.set(x, "remain", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOptions extends StObject {
    
    /**
      * Alias for cwd.
      */
    var C: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for follow.
      */
    var L: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extract files relative to the specified directory. Defaults to
      * process.cwd(). If provided, this must exist and must be a directory.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Required. Write the tarball archive to the specified filename.
      */
    var file: String
    
    /**
      * A function that gets called with (path, stat) for each entry being
      * added. Return true to emit the entry from the archive, or false to skip it.
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.undefined
    
    /**
      * Set to true to pack the targets of symbolic links. Without this
      * option, symbolic links are archived as such.
      */
    var follow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to any truthy value to create a gzipped archive,
      * or an object with settings for zlib.Gzip()
      */
    var gzip: js.UndefOr[Boolean | ZlibOptions] = js.undefined
    
    /**
      * Alias for follow.
      */
    var h: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
      */
    var maxReadSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not recursively archive the contents of directories.
      */
    var noDirRecurse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * uppress pax extended headers. Note that this means that long paths and
      * linkpaths will be truncated, and large or negative numeric values
      * may be interpreted incorrectly.
      */
    var noPax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will get called with (message, data)
      * for any warnings encountered.
      */
    var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.undefined
    
    /**
      * A path portion to prefix onto the entries in the archive.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Allow absolute paths. By default, / is stripped from absolute paths.
      */
    var preservePaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Treat warnings as crash-worthy errors. Default false.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Act synchronously. If this is set, then any provided file will be
      * fully written after the call to tar.c.
      */
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object ReplaceOptions {
    
    inline def apply(file: String): ReplaceOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOptions]
    }
    
    extension [Self <: ReplaceOptions](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setGzip(value: Boolean | ZlibOptions): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Boolean): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setMaxReadSize(value: Double): Self = StObject.set(x, "maxReadSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReadSizeUndefined: Self = StObject.set(x, "maxReadSize", js.undefined)
      
      inline def setNoDirRecurse(value: Boolean): Self = StObject.set(x, "noDirRecurse", value.asInstanceOf[js.Any])
      
      inline def setNoDirRecurseUndefined: Self = StObject.set(x, "noDirRecurse", js.undefined)
      
      inline def setNoPax(value: Boolean): Self = StObject.set(x, "noPax", value.asInstanceOf[js.Any])
      
      inline def setNoPaxUndefined: Self = StObject.set(x, "noPax", js.undefined)
      
      inline def setOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = StObject.set(x, "onwarn", js.Any.fromFunction2(value))
      
      inline def setOnwarnUndefined: Self = StObject.set(x, "onwarn", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreservePaths(value: Boolean): Self = StObject.set(x, "preservePaths", value.asInstanceOf[js.Any])
      
      inline def setPreservePathsUndefined: Self = StObject.set(x, "preservePaths", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tar.anon.File
    - typings.tar.anon.F
  */
  trait RequiredFileOptions extends StObject
  object RequiredFileOptions {
    
    inline def F(f: String): typings.tar.anon.F = {
      val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tar.anon.F]
    }
    
    inline def File(file: String): typings.tar.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tar.anon.File]
    }
  }
  
  type fields = Fields_
}
