package typings.webpack.mod

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Fn0
import typings.webpack.anon.FnCallArg0Arg1Arg2
import typings.webpack.webpackStrings.`ucs-2`
import typings.webpack.webpackStrings.`utf-8`
import typings.webpack.webpackStrings.ascii
import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.binary
import typings.webpack.webpackStrings.buffer
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import typings.webpack.webpackStrings.ucs2
import typings.webpack.webpackStrings.utf16le
import typings.webpack.webpackStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends StObject {
  
  var lstat: js.UndefOr[Fn0] = js.native
  
  def readFile(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readFile(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  var readJson: js.UndefOr[FnCallArg0Arg1Arg2] = js.native
  
  def readdir(arg0: String): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ascii | utf8 | utf16le | ucs2 | latin1 | binary | `utf-8` | `ucs-2` | base64 | hex | buffer
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ascii | utf8 | utf16le | ucs2 | latin1 | binary | `utf-8` | `ucs-2` | base64 | hex | buffer,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ],
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: Null,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(
    arg0: String,
    arg1: Unit,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  def readdir(arg0: String, arg1: ReaddirOptions): Unit = js.native
  def readdir(
    arg0: String,
    arg1: ReaddirOptions,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[js.Array[Any | Buffer | String]], 
      Unit
    ]
  ): Unit = js.native
  
  def readlink(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def readlink(arg0: String, arg1: FileSystemCallback[String | Buffer]): Unit = js.native
  
  def stat(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
  def stat(arg0: String, arg1: FileSystemCallback[FileSystemStats]): Unit = js.native
}
