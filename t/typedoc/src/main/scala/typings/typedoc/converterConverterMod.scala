package typings.typedoc

import typings.typedoc.applicationMod.Application
import typings.typedoc.componentMod.ChildableComponent
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterConverterMod {
  
  @JSImport("typedoc/dist/lib/converter/converter", "Converter")
  @js.native
  class Converter protected () extends ChildableComponent[Application, ConverterComponent] {
    def this(owner: js.Symbol) = this()
    def this(owner: Application) = this()
    
    var addNodeConverter: js.Any = js.native
    
    var addTypeConverter: js.Any = js.native
    
    var compile: js.Any = js.native
    
    def convert(fileNames: js.Array[String]): ConverterResult = js.native
    
    def convertNode(context: Context, node: Node): js.UndefOr[Reflection] = js.native
    
    def convertType(context: Context): js.UndefOr[Type] = js.native
    def convertType(context: Context, node: js.UndefOr[scala.Nothing], `type`: typings.typescript.mod.Type): js.UndefOr[Type] = js.native
    def convertType(context: Context, node: Node): js.UndefOr[Type] = js.native
    def convertType(context: Context, node: Node, `type`: typings.typescript.mod.Type): js.UndefOr[Type] = js.native
    
    def convertTypes(context: Context): js.Array[Type] = js.native
    def convertTypes(context: Context, nodes: js.UndefOr[scala.Nothing], types: js.Array[typings.typescript.mod.Type]): js.Array[Type] = js.native
    def convertTypes(context: Context, nodes: js.Array[Node]): js.Array[Type] = js.native
    def convertTypes(context: Context, nodes: js.Array[Node], types: js.Array[typings.typescript.mod.Type]): js.Array[Type] = js.native
    
    var excludeExternals: Boolean = js.native
    
    var excludeNotDocumented: Boolean = js.native
    
    var excludeNotExported: Boolean = js.native
    
    var excludePrivate: Boolean = js.native
    
    var excludeProtected: Boolean = js.native
    
    var externalPattern: js.Array[String] = js.native
    
    var getCompilerErrors: js.Any = js.native
    
    def getDefaultLib(): String = js.native
    
    var includeDeclarations: Boolean = js.native
    
    var name: String = js.native
    
    var nodeConverters: js.Any = js.native
    
    var removeNodeConverter: js.Any = js.native
    
    var removeTypeConverter: js.Any = js.native
    
    var resolve: js.Any = js.native
    
    var typeNodeConverters: js.Any = js.native
    
    var typeTypeConverters: js.Any = js.native
  }
  /* static members */
  object Converter {
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_BEGIN")
    @js.native
    def EVENT_BEGIN: String = js.native
    @scala.inline
    def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_CREATE_DECLARATION")
    @js.native
    def EVENT_CREATE_DECLARATION: String = js.native
    @scala.inline
    def EVENT_CREATE_DECLARATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_DECLARATION")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_CREATE_PARAMETER")
    @js.native
    def EVENT_CREATE_PARAMETER: String = js.native
    @scala.inline
    def EVENT_CREATE_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_CREATE_SIGNATURE")
    @js.native
    def EVENT_CREATE_SIGNATURE: String = js.native
    @scala.inline
    def EVENT_CREATE_SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_SIGNATURE")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_CREATE_TYPE_PARAMETER")
    @js.native
    def EVENT_CREATE_TYPE_PARAMETER: String = js.native
    @scala.inline
    def EVENT_CREATE_TYPE_PARAMETER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CREATE_TYPE_PARAMETER")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_END")
    @js.native
    def EVENT_END: String = js.native
    @scala.inline
    def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_FILE_BEGIN")
    @js.native
    def EVENT_FILE_BEGIN: String = js.native
    @scala.inline
    def EVENT_FILE_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILE_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_FUNCTION_IMPLEMENTATION")
    @js.native
    def EVENT_FUNCTION_IMPLEMENTATION: String = js.native
    @scala.inline
    def EVENT_FUNCTION_IMPLEMENTATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FUNCTION_IMPLEMENTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_RESOLVE")
    @js.native
    def EVENT_RESOLVE: String = js.native
    @scala.inline
    def EVENT_RESOLVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_RESOLVE_BEGIN")
    @js.native
    def EVENT_RESOLVE_BEGIN: String = js.native
    @scala.inline
    def EVENT_RESOLVE_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/converter/converter", "Converter.EVENT_RESOLVE_END")
    @js.native
    def EVENT_RESOLVE_END: String = js.native
    @scala.inline
    def EVENT_RESOLVE_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESOLVE_END")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ConverterResult extends StObject {
    
    var errors: js.Array[Diagnostic] = js.native
    
    var project: ProjectReflection = js.native
  }
  object ConverterResult {
    
    @scala.inline
    def apply(errors: js.Array[Diagnostic], project: ProjectReflection): ConverterResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConverterResult]
    }
    
    @scala.inline
    implicit class ConverterResultMutableBuilder[Self <: ConverterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setProject(value: ProjectReflection): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
