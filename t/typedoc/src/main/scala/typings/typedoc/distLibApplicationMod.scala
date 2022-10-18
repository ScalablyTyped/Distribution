package typings.typedoc

import typings.typedoc.anon.PartialTypeDocOptions
import typings.typedoc.distLibConverterMod.Converter
import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibOutputRendererMod.Renderer
import typings.typedoc.distLibSerializationMod.Serializer
import typings.typedoc.distLibUtilsComponentMod.AbstractComponent
import typings.typedoc.distLibUtilsComponentMod.ChildableComponent
import typings.typedoc.distLibUtilsEntryPointMod.DocumentationEntryPoint
import typings.typedoc.distLibUtilsMod.Logger
import typings.typedoc.distLibUtilsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibApplicationMod {
  
  @JSImport("typedoc/dist/lib/application", "Application")
  @js.native
  /**
    * Create a new TypeDoc application instance.
    *
    * @param options An object containing the options that should be used.
    */
  open class Application () extends ChildableComponent[Application, AbstractComponent[Application]] {
    
    /**
      * Initialize TypeDoc with the given options object.
      *
      * @param options  The desired options to set.
      */
    def bootstrap(): Unit = js.native
    def bootstrap(options: PartialTypeDocOptions): Unit = js.native
    
    /**
      * Run the converter for the given set of files and return the generated reflections.
      *
      * @returns An instance of ProjectReflection on success, undefined otherwise.
      */
    def convert(): js.UndefOr[ProjectReflection] = js.native
    
    def convertAndWatch(success: js.Function1[/* project */ ProjectReflection, js.Promise[Unit]]): Unit = js.native
    
    /**
      * The converter used to create the declaration reflections.
      */
    var converter: Converter = js.native
    
    /**
      * Render HTML for the given project
      */
    def generateDocs(project: ProjectReflection, out: String): js.Promise[Unit] = js.native
    
    /**
      * Run the converter for the given set of files and write the reflections to a json file.
      *
      * @param out The path and file name of the target file.
      * @returns Whether the JSON file could be written successfully.
      */
    def generateJson(project: ProjectReflection, out: String): js.Promise[Unit] = js.native
    
    /**
      * Gets the entry points to be documented according to the current `entryPoints` and `entryPointStrategy` options.
      * May return undefined if entry points fail to be expanded.
      */
    def getEntryPoints(): js.UndefOr[js.Array[DocumentationEntryPoint]] = js.native
    
    /**
      * Return the path to the TypeScript compiler.
      */
    def getTypeScriptPath(): String = js.native
    
    def getTypeScriptVersion(): String = js.native
    
    /**
      * The logger that should be used to output messages.
      */
    var logger: Logger = js.native
    
    /** @internal */
    val loggerType: String | js.Function = js.native
    
    var options: Options = js.native
    
    /**
      * The renderer used to generate the documentation output.
      */
    var renderer: Renderer = js.native
    
    /**
      * The serializer used to generate JSON output.
      */
    var serializer: Serializer = js.native
    
    /** @internal */
    val skipErrorChecking: Boolean = js.native
    
    def validate(project: ProjectReflection): Unit = js.native
  }
  /* static members */
  object Application {
    
    @JSImport("typedoc/dist/lib/application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted after plugins have been loaded and options have been read, but before they have been frozen.
      * The listener will be given an instance of {@link Application} and the {@link TypeDocOptions | Partial<TypeDocOptions>}
      * passed to `bootstrap`.
      */
    @JSImport("typedoc/dist/lib/application", "Application.EVENT_BOOTSTRAP_END")
    @js.native
    val EVENT_BOOTSTRAP_END: String = js.native
    
    /**
      * The version number of TypeDoc.
      */
    @JSImport("typedoc/dist/lib/application", "Application.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
