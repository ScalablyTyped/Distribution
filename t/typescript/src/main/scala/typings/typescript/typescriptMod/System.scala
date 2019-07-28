package typings.typescript.typescriptMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends js.Object {
  var args: js.Array[String] = js.native
  var base64decode: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  var base64encode: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  var clearScreen: js.UndefOr[js.Function0[Unit]] = js.native
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ js.Any, Unit]] = js.native
  /**
    * A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
    */
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  /** This must be cryptographically secure. Only implement this method using `crypto.createHash("sha256")`. */
  var createSHA256Hash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  var deleteFile: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.native
  var getFileSize: js.UndefOr[js.Function1[/* path */ String, Double]] = js.native
  var getMemoryUsage: js.UndefOr[js.Function0[Double]] = js.native
  var getModifiedTime: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[Date]]] = js.native
  var newLine: String = js.native
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  var setModifiedTime: js.UndefOr[js.Function2[/* path */ String, /* time */ Date, Unit]] = js.native
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.native
  var useCaseSensitiveFileNames: Boolean = js.native
  var watchDirectory: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* callback */ DirectoryWatcherCallback, 
      /* recursive */ js.UndefOr[Boolean], 
      FileWatcher
    ]
  ] = js.native
  /**
    * @pollingInterval - this parameter is used in polling-based watchers and ignored in watchers that
    * use native OS file watching
    */
  var watchFile: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* callback */ FileWatcherCallback, 
      /* pollingInterval */ js.UndefOr[Double], 
      FileWatcher
    ]
  ] = js.native
  var writeOutputIsTTY: js.UndefOr[js.Function0[Boolean]] = js.native
  def createDirectory(path: String): Unit = js.native
  def directoryExists(path: String): Boolean = js.native
  def exit(): Unit = js.native
  def exit(exitCode: Double): Unit = js.native
  def fileExists(path: String): Boolean = js.native
  def getCurrentDirectory(): String = js.native
  def getDirectories(path: String): js.Array[String] = js.native
  def getExecutingFilePath(): String = js.native
  def readDirectory(path: String): js.Array[String] = js.native
  def readDirectory(path: String, extensions: js.Array[String]): js.Array[String] = js.native
  def readDirectory(path: String, extensions: js.Array[String], exclude: js.Array[String]): js.Array[String] = js.native
  def readDirectory(path: String, extensions: js.Array[String], exclude: js.Array[String], include: js.Array[String]): js.Array[String] = js.native
  def readDirectory(
    path: String,
    extensions: js.Array[String],
    exclude: js.Array[String],
    include: js.Array[String],
    depth: Double
  ): js.Array[String] = js.native
  def readFile(path: String): js.UndefOr[String] = js.native
  def readFile(path: String, encoding: String): js.UndefOr[String] = js.native
  def resolvePath(path: String): String = js.native
  def write(s: String): Unit = js.native
  def writeFile(path: String, data: String): Unit = js.native
  def writeFile(path: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
}

