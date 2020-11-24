package typings.typedoc

import typings.std.Partial
import typings.typedoc.anon.HasErrors
import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.componentMod.ChildableComponent
import typings.typedoc.converterMod.Converter
import typings.typedoc.libUtilsMod.Logger
import typings.typedoc.libUtilsMod.Options
import typings.typedoc.libUtilsMod.PluginHost
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.optionsDeclarationMod.TypeDocAndTSOptions
import typings.typedoc.rendererMod.Renderer
import typings.typedoc.serializationMod.Serializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/application", JSImport.Namespace)
@js.native
object applicationMod extends js.Object {
  
  @js.native
  class Application () extends ChildableComponent[Application, AbstractComponent[Application]] {
    
    @JSName("application")
    def application_MApplication: Application = js.native
    
    def bootstrap(): HasErrors = js.native
    def bootstrap(options: Partial[TypeDocAndTSOptions]): HasErrors = js.native
    
    def convert(src: js.Array[String]): js.UndefOr[ProjectReflection] = js.native
    
    var converter: Converter = js.native
    
    var exclude: js.Array[String] = js.native
    
    def expandInputFiles(): js.Array[String] = js.native
    def expandInputFiles(inputFiles: js.Array[String]): js.Array[String] = js.native
    
    def generateDocs(project: ProjectReflection, out: String): Boolean = js.native
    def generateDocs(src: js.Array[String], out: String): Boolean = js.native
    
    def generateJson(project: ProjectReflection, out: String): Boolean = js.native
    def generateJson(src: js.Array[String], out: String): Boolean = js.native
    
    def getTypeScriptPath(): String = js.native
    
    def getTypeScriptVersion(): String = js.native
    
    var ignoreCompilerErrors: Boolean = js.native
    
    var inputFiles: js.Array[String] = js.native
    
    var logger: Logger = js.native
    
    var loggerType: String | js.Function = js.native
    
    var options: Options = js.native
    
    var optionsFile: String = js.native
    
    var plugins: PluginHost = js.native
    
    var project: String = js.native
    
    var renderer: Renderer = js.native
    
    var serializer: Serializer = js.native
  }
  /* static members */
  @js.native
  object Application extends js.Object {
    
    var SUPPORTED_TS_VERSION: String = js.native
    
    var VERSION: String = js.native
  }
}
