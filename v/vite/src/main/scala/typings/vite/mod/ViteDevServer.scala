package typings.vite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonhttpMod.Server
import typings.node.nodeColonnetMod.Socket
import typings.rollup.mod.SourceMap
import typings.std.Record
import typings.vite.anon.FixStacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViteDevServer extends StObject {
  
  /**
    * Stop the server.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * The resolved vite config object
    */
  var config: ResolvedConfig = js.native
  
  /**
    * native Node http server instance
    * will be null in middleware mode
    */
  var httpServer: (Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) | Null = js.native
  
  /**
    * Start the server.
    */
  def listen(): js.Promise[ViteDevServer] = js.native
  def listen(port: Double): js.Promise[ViteDevServer] = js.native
  def listen(port: Double, isRestart: Boolean): js.Promise[ViteDevServer] = js.native
  def listen(port: Unit, isRestart: Boolean): js.Promise[ViteDevServer] = js.native
  
  /**
    * A connect app instance.
    * - Can be used to attach custom middlewares to the dev server.
    * - Can also be used as the handler function of a custom http server
    *   or as a middleware in any connect-style Node.js frameworks
    *
    * https://github.com/senchalabs/connect#use-middleware
    */
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
  ): Unit = js.native
  def middlewares(
    req: typings.node.nodeColonhttpMod.IncomingMessage,
    res: typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage],
    next: js.Function
  ): Unit = js.native
  /**
    * A connect app instance.
    * - Can be used to attach custom middlewares to the dev server.
    * - Can also be used as the handler function of a custom http server
    *   or as a middleware in any connect-style Node.js frameworks
    *
    * https://github.com/senchalabs/connect#use-middleware
    */
  @JSName("middlewares")
  var middlewares_Original: typings.vite.mod.Connect.Server = js.native
  
  /**
    * Module graph that tracks the import relationships, url to file mapping
    * and hmr state.
    */
  var moduleGraph: ModuleGraph = js.native
  
  /**
    * Rollup plugin container that can run plugin hooks on a given file
    */
  var pluginContainer: PluginContainer = js.native
  
  /**
    * Print server urls
    */
  def printUrls(): Unit = js.native
  
  /**
    * Triggers HMR for a module in the module graph. You can use the `server.moduleGraph`
    * API to retrieve the module to be reloaded. If `hmr` is false, this is a no-op.
    */
  def reloadModule(module: ModuleNode): js.Promise[Unit] = js.native
  
  /**
    * The resolved urls Vite prints on the CLI. null in middleware mode or
    * before `server.listen` is called.
    */
  var resolvedUrls: ResolvedServerUrls | Null = js.native
  
  /**
    * Restart the server.
    *
    * @param forceOptimize - force the optimizer to re-bundle, same as --force cli flag
    */
  def restart(): js.Promise[Unit] = js.native
  def restart(forceOptimize: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Mutates the given SSR error by rewriting the stacktrace
    */
  def ssrFixStacktrace(e: js.Error): Unit = js.native
  
  /**
    * Load a given URL as an instantiated module for SSR.
    */
  def ssrLoadModule(url: String): js.Promise[Record[String, Any]] = js.native
  def ssrLoadModule(url: String, opts: FixStacktrace): js.Promise[Record[String, Any]] = js.native
  
  /**
    * Returns a fixed version of the given stack
    */
  def ssrRewriteStacktrace(stack: String): String = js.native
  
  def ssrTransform(code: String, inMap: Null, url: String): js.Promise[TransformResult | Null] = js.native
  def ssrTransform(code: String, inMap: Null, url: String, originalCode: String): js.Promise[TransformResult | Null] = js.native
  /**
    * Transform module code into SSR format.
    */
  def ssrTransform(code: String, inMap: SourceMap, url: String): js.Promise[TransformResult | Null] = js.native
  def ssrTransform(code: String, inMap: SourceMap, url: String, originalCode: String): js.Promise[TransformResult | Null] = js.native
  
  /**
    * Apply vite built-in HTML transforms and any plugin HTML transforms.
    */
  def transformIndexHtml(url: String, html: String): js.Promise[String] = js.native
  def transformIndexHtml(url: String, html: String, originalUrl: String): js.Promise[String] = js.native
  
  /**
    * Programmatically resolve, load and transform a URL and get the result
    * without going through the http request pipeline.
    */
  def transformRequest(url: String): js.Promise[TransformResult | Null] = js.native
  def transformRequest(url: String, options: TransformOptions): js.Promise[TransformResult | Null] = js.native
  
  /**
    * chokidar watcher instance
    * https://github.com/paulmillr/chokidar#api
    */
  var watcher: FSWatcher = js.native
  
  /**
    * web socket server with `send(payload)` method
    */
  var ws: WebSocketServer = js.native
}
