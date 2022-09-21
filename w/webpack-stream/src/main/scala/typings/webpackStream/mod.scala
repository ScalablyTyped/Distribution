package typings.webpackStream

import typings.webpack.mod.Configuration
import typings.webpackStream.anon.FnCall
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
  inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
  inline def apply(
    config: Unit,
    wp: Unit,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(config: Unit, wp: FnCall): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    config: Unit,
    wp: FnCall,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(config: Configuration): Any = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(
    config: Configuration,
    wp: Unit,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(config: Configuration, wp: FnCall): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    config: Configuration,
    wp: FnCall,
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler.Handler */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], wp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("webpack-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
