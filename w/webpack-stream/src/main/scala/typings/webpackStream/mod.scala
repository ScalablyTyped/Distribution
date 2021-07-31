package typings.webpackStream

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Run webpack with the specified configuration and webpack instance
    *
    * @param config - Webpack configuration
    * @param wp - A webpack object
    * @param callback - A callback with the webpack stats and error objects.
    */
  @scala.inline
  def apply(): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any
  ): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    wp: Unit,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: Unit,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: Unit,
    wp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webpack */ js.Any,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  @scala.inline
  def apply(
    config: Unit,
    wp: Unit,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ js.Any
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("webpack-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
