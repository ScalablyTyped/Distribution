package typings.stylableCore

import typings.postcss.mod.Root_
import typings.std.Partial
import typings.std.Record
import typings.stylableCore.anon.Names
import typings.stylableCore.customValuesMod.Box_
import typings.stylableCore.stylableMetaMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any
  - Dropped object */ trait CSSObject extends StObject
  
  @js.native
  trait IStylableClassNameOptimizer extends StObject {
    
    var context: Names = js.native
    
    def generateName(name: String): String = js.native
    
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.Array[String],
      usageMapping: Record[String, Boolean]
    ): Unit = js.native
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.Array[String],
      usageMapping: Record[String, Boolean],
      globals: Record[String, Boolean]
    ): Unit = js.native
    
    def rewriteSelector(selector: String, usageMapping: Record[String, Boolean], globals: Record[String, Boolean]): String = js.native
  }
  
  trait IStylableNamespaceOptimizer extends StObject {
    
    def getNamespace(meta: StylableMeta, _env: js.Any*): String
    
    var index: Double
    
    var namespaceMapping: Record[String, String]
    
    var namespacePrefix: String
  }
  object IStylableNamespaceOptimizer {
    
    inline def apply(
      getNamespace: (StylableMeta, /* repeated */ js.Any) => String,
      index: Double,
      namespaceMapping: Record[String, String],
      namespacePrefix: String
    ): IStylableNamespaceOptimizer = {
      val __obj = js.Dynamic.literal(getNamespace = js.Any.fromFunction2(getNamespace), index = index.asInstanceOf[js.Any], namespaceMapping = namespaceMapping.asInstanceOf[js.Any], namespacePrefix = namespacePrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStylableNamespaceOptimizer]
    }
    
    extension [Self <: IStylableNamespaceOptimizer](x: Self) {
      
      inline def setGetNamespace(value: (StylableMeta, /* repeated */ js.Any) => String): Self = StObject.set(x, "getNamespace", js.Any.fromFunction2(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNamespaceMapping(value: Record[String, String]): Self = StObject.set(x, "namespaceMapping", value.asInstanceOf[js.Any])
      
      inline def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStylableOptimizer extends StObject {
    
    var classNameOptimizer: IStylableClassNameOptimizer = js.native
    
    def minifyCSS(css: String): String = js.native
    
    var namespaceOptimizer: IStylableNamespaceOptimizer = js.native
    
    def optimize(config: js.Object, stylableResult: StylableResults, usageMapping: Record[String, Boolean]): Unit = js.native
    def optimize(
      config: js.Object,
      stylableResult: StylableResults,
      usageMapping: Record[String, Boolean],
      delimiter: String
    ): Unit = js.native
    
    def removeStylableDirectives(root: Root_, shouldComment: Boolean): Unit = js.native
  }
  
  type ModuleResolver = js.Function2[/* directoryPath */ String, /* request */ String, String]
  
  trait ParsedValue extends StObject {
    
    var nodes: js.UndefOr[js.Any] = js.undefined
    
    var resolvedValue: js.UndefOr[String | (Box_[String, js.Any])] = js.undefined
    
    var `type`: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object ParsedValue {
    
    inline def apply(`type`: String, value: String): ParsedValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedValue]
    }
    
    extension [Self <: ParsedValue](x: Self) {
      
      inline def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setResolvedValue(value: String | (Box_[String, js.Any])): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
      
      inline def setResolvedValueUndefined: Self = StObject.set(x, "resolvedValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type PartialObject[T] = Partial[T] & js.Object
  
  type StateArguments = js.Array[StateTypeValidator | String]
  
  trait StateParsedValue extends StObject {
    
    var arguments: StateArguments
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object StateParsedValue {
    
    inline def apply(arguments: StateArguments, `type`: String): StateParsedValue = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateParsedValue]
    }
    
    extension [Self <: StateParsedValue](x: Self) {
      
      inline def setArguments(value: StateArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: (StateTypeValidator | String)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateTypeValidator extends StObject {
    
    var args: js.Array[String]
    
    var name: String
  }
  object StateTypeValidator {
    
    inline def apply(args: js.Array[String], name: String): StateTypeValidator = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateTypeValidator]
    }
    
    extension [Self <: StateTypeValidator](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
