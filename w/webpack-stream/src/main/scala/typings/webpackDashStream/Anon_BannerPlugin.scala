package typings.webpackDashStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Compiler.Handler
import typings.webpack.webpackMod.Compiler.Watching
import typings.webpack.webpackMod.Configuration
import typings.webpack.webpackMod.ConfigurationFactory
import typings.webpack.webpackMod.MultiCompiler
import typings.webpack.webpackMod.MultiConfigurationFactory
import typings.webpack.webpackMod.MultiWatching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BannerPlugin extends js.Object {
  /**
    * Plugins
    */
  var BannerPlugin: Instantiable1[/* options */ String, typings.webpack.webpackMod.BannerPlugin] = js.native
  var Compiler: Instantiable0[typings.webpack.webpackMod.Compiler] with TypeofCompiler = js.native
  var ContextReplacementPlugin: Instantiable1[/* resourceRegExp */ js.Any, typings.webpack.webpackMod.ContextReplacementPlugin] = js.native
  var DefinePlugin: Instantiable1[
    /* definitions */ StringDictionary[js.Any], 
    typings.webpack.webpackMod.DefinePlugin
  ] = js.native
  var DllPlugin: Instantiable1[
    /* options */ typings.webpack.webpackMod.DllPlugin.Options, 
    typings.webpack.webpackMod.DllPlugin
  ] = js.native
  var DllReferencePlugin: Instantiable1[
    /* options */ typings.webpack.webpackMod.DllReferencePlugin.Options, 
    typings.webpack.webpackMod.DllReferencePlugin
  ] = js.native
  var EnvironmentPlugin: Instantiable1[/* envs */ js.Array[String], typings.webpack.webpackMod.EnvironmentPlugin] = js.native
  var EvalSourceMapDevToolPlugin: Instantiable0[typings.webpack.webpackMod.EvalSourceMapDevToolPlugin] = js.native
  var ExtendedAPIPlugin: Instantiable0[typings.webpack.webpackMod.ExtendedAPIPlugin] = js.native
  var HashedModuleIdsPlugin: Instantiable0[typings.webpack.webpackMod.HashedModuleIdsPlugin] = js.native
  var HotModuleReplacementPlugin: Instantiable0[typings.webpack.webpackMod.HotModuleReplacementPlugin] = js.native
  val ICompiler: js.Any = js.native
  var IgnorePlugin: Instantiable1[/* requestRegExp */ js.Any, typings.webpack.webpackMod.IgnorePlugin] = js.native
  var LoaderOptionsPlugin: Instantiable1[/* options */ js.Any, typings.webpack.webpackMod.LoaderOptionsPlugin] = js.native
  var MultiCompiler: Instantiable0[typings.webpack.webpackMod.MultiCompiler] = js.native
  var MultiWatching: Instantiable0[typings.webpack.webpackMod.MultiWatching] = js.native
  var NamedChunksPlugin: Instantiable0[typings.webpack.webpackMod.NamedChunksPlugin] = js.native
  /** @deprecated use config.optimization.namedModules */
  var NamedModulesPlugin: Instantiable0[typings.webpack.webpackMod.NamedModulesPlugin] = js.native
  /** @deprecated use config.optimization.noEmitOnErrors */
  var NoEmitOnErrorsPlugin: Instantiable0[typings.webpack.webpackMod.NoEmitOnErrorsPlugin] = js.native
  var NormalModuleReplacementPlugin: Instantiable2[
    /* resourceRegExp */ js.Any, 
    /* newResource */ js.Any, 
    typings.webpack.webpackMod.NormalModuleReplacementPlugin
  ] = js.native
  val Options: js.Any = js.native
  var Plugin: Instantiable0[typings.webpack.webpackMod.Plugin] = js.native
  var PrefetchPlugin: Instantiable2[
    /* context */ js.Any, 
    /* request */ js.Any, 
    typings.webpack.webpackMod.PrefetchPlugin
  ] = js.native
  var ProgressPlugin: Instantiable0[typings.webpack.webpackMod.ProgressPlugin] = js.native
  var ProvidePlugin: Instantiable1[
    /* definitions */ StringDictionary[js.Any], 
    typings.webpack.webpackMod.ProvidePlugin
  ] = js.native
  var ResolvePlugin: Instantiable0[typings.webpack.webpackMod.ResolvePlugin] = js.native
  var SingleEntryPlugin: Instantiable3[
    /* context */ String, 
    /* entry */ String, 
    /* name */ String, 
    typings.webpack.webpackMod.SingleEntryPlugin
  ] = js.native
  var SourceMapDevToolPlugin: Instantiable0[typings.webpack.webpackMod.SourceMapDevToolPlugin] = js.native
  var SplitChunksPlugin: Instantiable0[typings.webpack.webpackMod.SplitChunksPlugin] = js.native
  var Stats: TypeofClassStats = js.native
  val Template: TypeofTemplate = js.native
  var WatchIgnorePlugin: Instantiable1[
    /* paths */ js.Array[String | RegExp], 
    typings.webpack.webpackMod.WatchIgnorePlugin
  ] = js.native
  val compilation: Typeofcompilation = js.native
  /** @deprecated */
  val compiler: js.Any = js.native
  val debug: Typeofdebug = js.native
  val dependencies: js.Any = js.native
  val loader: js.Any = js.native
  val optimize: Typeofoptimize = js.native
  /** Webpack package version. */
  val version: js.UndefOr[String] = js.native
  def apply(): Compiler = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typings.webpack.webpackMod.MultiCompiler.Handler
  ): MultiWatching | MultiCompiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: typings.webpack.webpackMod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: Handler): Watching | Compiler = js.native
}

