package typings.swig.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swig", "compileFile")
@js.native
object compileFile extends js.Object {
  
  def apply(pathname: String): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  def apply(pathname: String, options: SwigOptions): js.Function1[/* locals */ js.UndefOr[js.Any], String] = js.native
  def apply(
    pathname: String,
    options: SwigOptions,
    cb: js.Function2[
      /* err */ Error, 
      /* compiledRender */ js.Function1[/* locals */ js.UndefOr[js.Any], String], 
      Unit
    ]
  ): Unit = js.native
}
