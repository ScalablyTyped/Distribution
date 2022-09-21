package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties are added by https://github.com/webpack/loader-runner
  */
@js.native
trait LoaderRunnerLoaderContext[OptionsType] extends StObject {
  
  /**
  	 * Add a directory as dependency of the loader result.
  	 */
  def addContextDependency(context: String): Unit = js.native
  
  /**
  	 * Adds a file as dependency of the loader result in order to make them watchable.
  	 * For example, html-loader uses this technique as it finds src and src-set attributes.
  	 * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
  	 */
  def addDependency(file: String): Unit = js.native
  
  def addMissingDependency(context: String): Unit = js.native
  
  /**
  	 * Make this loader async.
  	 */
  def async(): js.Function4[
    /* err */ js.UndefOr[Null | js.Error], 
    /* content */ js.UndefOr[String | Buffer], 
    /* sourceMap */ js.UndefOr[String | SourceMap], 
    /* additionalData */ js.UndefOr[AdditionalData], 
    Unit
  ] = js.native
  
  /**
  	 * Make this loader result cacheable. By default it's cacheable.
  	 * A cacheable loader must have a deterministic result, when inputs and dependencies haven't changed.
  	 * This means the loader shouldn't have other dependencies than specified with this.addDependency.
  	 * Most loaders are deterministic and cacheable.
  	 */
  def cacheable(): Unit = js.native
  def cacheable(flag: Boolean): Unit = js.native
  
  def callback(
    err: js.UndefOr[Null | js.Error],
    content: js.UndefOr[String | Buffer],
    sourceMap: js.UndefOr[String | SourceMap],
    additionalData: js.UndefOr[AdditionalData]
  ): Unit = js.native
  
  /**
  	 * Remove all dependencies of the loader result. Even initial dependencies and these of other loaders.
  	 */
  def clearDependencies(): Unit = js.native
  
  /**
  	 * The directory of the module. Can be used as context for resolving other stuff.
  	 * eg '/workspaces/ts-loader/examples/vanilla/src'
  	 */
  var context: String = js.native
  
  val currentRequest: String = js.native
  
  val data: Any = js.native
  
  /**
  	 * alias of addDependency
  	 * Adds a file as dependency of the loader result in order to make them watchable.
  	 * For example, html-loader uses this technique as it finds src and src-set attributes.
  	 * Then, it sets the url's for those attributes as dependencies of the html file that is parsed.
  	 */
  def dependency(file: String): Unit = js.native
  
  def getContextDependencies(): js.Array[String] = js.native
  
  def getDependencies(): js.Array[String] = js.native
  
  def getMissingDependencies(): js.Array[String] = js.native
  
  /**
  	 * The index in the loaders array of the current loader.
  	 * In the example: in loader1: 0, in loader2: 1
  	 */
  var loaderIndex: Double = js.native
  
  /**
  	 * An array of all the loaders. It is writeable in the pitch phase.
  	 * loaders = [{request: string, path: string, query: string, module: function}]
  	 * In the example:
  	 * [
  	 *   { request: "/abc/loader1.js?xyz",
  	 *     path: "/abc/loader1.js",
  	 *     query: "?xyz",
  	 *     module: [Function]
  	 *   },
  	 *   { request: "/abc/node_modules/loader2/index.js",
  	 *     path: "/abc/node_modules/loader2/index.js",
  	 *     query: "",
  	 *     module: [Function]
  	 *   }
  	 * ]
  	 */
  var loaders: js.Array[Data] = js.native
  
  val previousRequest: String = js.native
  
  val query: String | OptionsType = js.native
  
  val remainingRequest: String = js.native
  
  val request: String = js.native
  
  /**
  	 * The resource inclusive query and fragment.
  	 * Example: "/abc/resource.js?query#frag"
  	 */
  var resource: String = js.native
  
  /**
  	 * The resource fragment.
  	 * Example: "#frag"
  	 */
  var resourceFragment: String = js.native
  
  /**
  	 * The resource path.
  	 * In the example: "/abc/resource.js"
  	 */
  var resourcePath: String = js.native
  
  /**
  	 * The resource query string.
  	 * Example: "?query"
  	 */
  var resourceQuery: String = js.native
}
