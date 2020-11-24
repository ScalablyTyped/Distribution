package typings.vision.mod

import typings.hapi.mod.Request
import typings.vision.visionStrings.async
import typings.vision.visionStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler} > options for the list of attributes it can not have (isCached, partialsPath, helpersPath)
  */
@js.native
trait ViewHandlerOrReplyOptions extends js.Object {
  
  /** if set to true, allows absolute template paths passed to reply.view(). Defaults to false. */
  var allowAbsolutePaths: js.UndefOr[Boolean] = js.native
  
  /** if set to true, allows template paths passed to reply.view() to contain '../'. Defaults to false. */
  var allowInsecureAccess: js.UndefOr[Boolean] = js.native
  
  /** specify whether the engine compile() method is 'sync' or 'async'. Defaults to 'sync'. */
  var compileMode: js.UndefOr[sync | async] = js.native
  
  /** options object passed to the engine's compile function. Defaults to empty options {}. */
  var compileOptions: js.UndefOr[CompileOptions] = js.native
  
  /** the content type of the engine results. Defaults to 'text/html'. */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * A global context used with all templates.
    * The global context option can be either an object or a function that takes the request as its only argument and returns a context object.
    * The request object is only provided when using the view handler or reply.view().
    * When using server.render() or request.render(), the request argument will be null.
    * When rendering views, the global context will be merged with any context object specified on the handler or using reply.view().
    * When multiple context objects are used, values from the global context always have lowest precedence.
    */
  var context: js.UndefOr[js.Object | (js.Function1[/* request */ Request, js.Object])] = js.native
  
  /** the text encoding used by the templates when reading the files and outputting the result. Defaults to 'utf8'. */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * If set to true or a layout filename, layout support is enabled.
    * A layout is a single template file used as the parent template for other view templates in the same engine.
    * If true, the layout template name must be 'layout.ext' where 'ext' is the engine's extension.
    * Otherwise, the provided filename is suffixed with the engine's extension and loaded.
    * Disable layout when using Jade as it will handle including any layout files independently.
    * Defaults to false.
    */
  var layout: js.UndefOr[Boolean | String] = js.native
  
  /** the key used by the template engine to denote where primary template content should go. Defaults to 'content'. */
  var layoutKeyword: js.UndefOr[String] = js.native
  
  /** the root file path, or array of file paths, where layout templates are located (using the relativeTo prefix if present). Defaults to path. */
  var layoutPath: js.UndefOr[String | js.Array[String]] = js.native
  
  /** the root file path, or array of file paths, used to resolve and load the templates identified when calling reply.view(). Defaults to current working directory. */
  var path: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * a base path used as prefix for path and partialsPath. No default.
    */
  var relativeTo: js.UndefOr[String] = js.native
  
  /** options object passed to the returned function from the compile operation. Defaults to empty options {}. */
  var runtimeOptions: js.UndefOr[RuntimeOptions] = js.native
}
object ViewHandlerOrReplyOptions {
  
  @scala.inline
  def apply(): ViewHandlerOrReplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewHandlerOrReplyOptions]
  }
  
  @scala.inline
  implicit class ViewHandlerOrReplyOptionsOps[Self <: ViewHandlerOrReplyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAbsolutePaths(value: Boolean): Self = this.set("allowAbsolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAbsolutePaths: Self = this.set("allowAbsolutePaths", js.undefined)
    
    @scala.inline
    def setAllowInsecureAccess(value: Boolean): Self = this.set("allowInsecureAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsecureAccess: Self = this.set("allowInsecureAccess", js.undefined)
    
    @scala.inline
    def setCompileMode(value: sync | async): Self = this.set("compileMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompileMode: Self = this.set("compileMode", js.undefined)
    
    @scala.inline
    def setCompileOptions(value: CompileOptions): Self = this.set("compileOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompileOptions: Self = this.set("compileOptions", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContextFunction1(value: /* request */ Request => js.Object): Self = this.set("context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Object | (js.Function1[/* request */ Request, js.Object])): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setLayout(value: Boolean | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLayoutKeyword(value: String): Self = this.set("layoutKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutKeyword: Self = this.set("layoutKeyword", js.undefined)
    
    @scala.inline
    def setLayoutPathVarargs(value: String*): Self = this.set("layoutPath", js.Array(value :_*))
    
    @scala.inline
    def setLayoutPath(value: String | js.Array[String]): Self = this.set("layoutPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutPath: Self = this.set("layoutPath", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRelativeTo(value: String): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    
    @scala.inline
    def setRuntimeOptions(value: RuntimeOptions): Self = this.set("runtimeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeOptions: Self = this.set("runtimeOptions", js.undefined)
  }
}
