package typings.webpack.anon

import typings.webpack.mod.ResolveRequest
import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallContextRequestCallback extends StObject {
  
  def apply(context: String, request: String): js.Promise[String] = js.native
  def apply(
    context: String,
    request: String,
    callback: js.Function3[
      /* arg0 */ Null | js.Error, 
      /* arg1 */ js.UndefOr[String | `false`], 
      /* arg2 */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
}
