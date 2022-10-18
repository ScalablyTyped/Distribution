package typings.webpack.mod

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFileSystem extends StObject {
  
  var dirname: js.UndefOr[js.Function1[/* arg0 */ String, String]] = js.native
  
  var join: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.native
  
  var lstat: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit], 
      Unit
    ]
  ] = js.native
  
  def mkdir(arg0: String, arg1: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
  
  def readFile(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[Null | ErrnoException], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit = js.native
  
  var readdir: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[Null | ErrnoException], 
        /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  
  var relative: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.native
  
  var rmdir: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit], 
      Unit
    ]
  ] = js.native
  
  def stat(
    arg0: String,
    arg1: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[IStats], Unit]
  ): Unit = js.native
  
  var unlink: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit], 
      Unit
    ]
  ] = js.native
  
  def writeFile(arg0: String, arg1: String, arg2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
  def writeFile(arg0: String, arg1: Buffer, arg2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
}
