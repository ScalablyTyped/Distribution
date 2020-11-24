package typings.tsNode.mod

import typings.typescript.mod.CustomTransformers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cache: js.UndefOr[Boolean | Null] = js.native
  
  var cacheDirectory: js.UndefOr[String] = js.native
  
  var compiler: js.UndefOr[String] = js.native
  
  var compilerOptions: js.UndefOr[js.Object] = js.native
  
  var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  
  var files: js.UndefOr[Boolean | Null] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var ignoreDiagnostics: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  
  var pretty: js.UndefOr[Boolean | Null] = js.native
  
  var project: js.UndefOr[String] = js.native
  
  var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.native
  
  var skipIgnore: js.UndefOr[Boolean | Null] = js.native
  
  var skipProject: js.UndefOr[Boolean | Null] = js.native
  
  var transformers: js.UndefOr[CustomTransformers] = js.native
  
  var transpileOnly: js.UndefOr[Boolean | Null] = js.native
  
  var typeCheck: js.UndefOr[Boolean | Null] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheNull: Self = this.set("cache", null)
    
    @scala.inline
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirectory: Self = this.set("cacheDirectory", js.undefined)
    
    @scala.inline
    def setCompiler(value: String): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setCompilerOptions(value: js.Object): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setFileExists(value: /* path */ String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFileExists: Self = this.set("fileExists", js.undefined)
    
    @scala.inline
    def setFiles(value: Boolean): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFilesNull: Self = this.set("files", null)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreDiagnosticsVarargs(value: (Double | String)*): Self = this.set("ignoreDiagnostics", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreDiagnostics(value: Double | String | (js.Array[Double | String])): Self = this.set("ignoreDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDiagnostics: Self = this.set("ignoreDiagnostics", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setPrettyNull: Self = this.set("pretty", null)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setReadFile(value: /* path */ String => js.UndefOr[String]): Self = this.set("readFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setSkipIgnore(value: Boolean): Self = this.set("skipIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipIgnore: Self = this.set("skipIgnore", js.undefined)
    
    @scala.inline
    def setSkipIgnoreNull: Self = this.set("skipIgnore", null)
    
    @scala.inline
    def setSkipProject(value: Boolean): Self = this.set("skipProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipProject: Self = this.set("skipProject", js.undefined)
    
    @scala.inline
    def setSkipProjectNull: Self = this.set("skipProject", null)
    
    @scala.inline
    def setTransformers(value: CustomTransformers): Self = this.set("transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformers: Self = this.set("transformers", js.undefined)
    
    @scala.inline
    def setTranspileOnly(value: Boolean): Self = this.set("transpileOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspileOnly: Self = this.set("transpileOnly", js.undefined)
    
    @scala.inline
    def setTranspileOnlyNull: Self = this.set("transpileOnly", null)
    
    @scala.inline
    def setTypeCheck(value: Boolean): Self = this.set("typeCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeCheck: Self = this.set("typeCheck", js.undefined)
    
    @scala.inline
    def setTypeCheckNull: Self = this.set("typeCheck", null)
  }
}
