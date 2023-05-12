package typings.webpack.anon

import typings.webpack.mod.ErrorWithDetail
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
      /* err */ Null | ErrorWithDetail, 
      /* res */ js.UndefOr[String | `false`], 
      /* req */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Unit = js.native
}
