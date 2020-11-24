package typings.webpackDevMiddleware.mod

import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-dev-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any
  ): WebpackDevMiddleware with NextHandleFunction = js.native
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.ICompiler */ js.Any,
    options: Options
  ): WebpackDevMiddleware with NextHandleFunction = js.native
}
