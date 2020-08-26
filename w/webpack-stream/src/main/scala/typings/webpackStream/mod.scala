package typings.webpackStream

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Run webpack with the specified configuration and webpack instance
    *
    * @param config - Webpack configuration
    * @param wp - A webpack object
    * @param callback - A callback with the webpack stats and error objects.
    */
  def apply(): ReadWriteStream = js.native
  def apply(
    config: js.UndefOr[scala.Nothing],
    wp: js.UndefOr[scala.Nothing],
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: js.UndefOr[scala.Nothing],
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: js.UndefOr[scala.Nothing],
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: js.UndefOr[scala.Nothing],
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): ReadWriteStream = js.native
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = js.native
}

