package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System extends js.Object {
  var args: js.Array[java.lang.String] = js.native
  var base64decode: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.native
  var base64encode: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.native
  var clearScreen: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ js.Any, scala.Unit]] = js.native
  /**
           * A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
           */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  /** This must be cryptographically secure. Only implement this method using `crypto.createHash("sha256")`. */
  var createSHA256Hash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  var deleteFile: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Unit]] = js.native
  var getFileSize: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Double]] = js.native
  var getMemoryUsage: js.UndefOr[js.Function0[scala.Double]] = js.native
  var getModifiedTime: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[stdLib.Date]]] = js.native
  var newLine: java.lang.String = js.native
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  var setModifiedTime: js.UndefOr[js.Function2[/* path */ java.lang.String, /* time */ stdLib.Date, scala.Unit]] = js.native
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */js.Any, scala.Unit], 
      /* ms */ scala.Double, 
      /* repeated */js.Any, 
      _
    ]
  ] = js.native
  var useCaseSensitiveFileNames: scala.Boolean = js.native
  var watchDirectory: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String, 
      /* callback */ DirectoryWatcherCallback, 
      /* recursive */ js.UndefOr[scala.Boolean], 
      FileWatcher
    ]
  ] = js.native
  /**
           * @pollingInterval - this parameter is used in polling-based watchers and ignored in watchers that
           * use native OS file watching
           */
  var watchFile: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String, 
      /* callback */ FileWatcherCallback, 
      /* pollingInterval */ js.UndefOr[scala.Double], 
      FileWatcher
    ]
  ] = js.native
  var writeOutputIsTTY: js.UndefOr[js.Function0[scala.Boolean]] = js.native
  def createDirectory(path: java.lang.String): scala.Unit = js.native
  def directoryExists(path: java.lang.String): scala.Boolean = js.native
  def exit(): scala.Unit = js.native
  def exit(exitCode: scala.Double): scala.Unit = js.native
  def fileExists(path: java.lang.String): scala.Boolean = js.native
  def getCurrentDirectory(): java.lang.String = js.native
  def getDirectories(path: java.lang.String): js.Array[java.lang.String] = js.native
  def getExecutingFilePath(): java.lang.String = js.native
  def readDirectory(path: java.lang.String): js.Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: js.Array[java.lang.String],
    exclude: js.Array[java.lang.String],
    include: js.Array[java.lang.String],
    depth: scala.Double
  ): js.Array[java.lang.String] = js.native
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def readFile(path: java.lang.String, encoding: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def resolvePath(path: java.lang.String): java.lang.String = js.native
  def write(s: java.lang.String): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: java.lang.String): scala.Unit = js.native
  def writeFile(path: java.lang.String, data: java.lang.String, writeByteOrderMark: scala.Boolean): scala.Unit = js.native
}

