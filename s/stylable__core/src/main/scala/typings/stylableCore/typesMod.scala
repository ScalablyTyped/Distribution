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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CSSObject = js.Any with js.Object
  
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
  
  @js.native
  trait IStylableNamespaceOptimizer extends StObject {
    
    def getNamespace(meta: StylableMeta, _env: js.Any*): String = js.native
    
    var index: Double = js.native
    
    var namespaceMapping: Record[String, String] = js.native
    
    var namespacePrefix: String = js.native
  }
  object IStylableNamespaceOptimizer {
    
    @scala.inline
    def apply(
      getNamespace: (StylableMeta, /* repeated */ js.Any) => String,
      index: Double,
      namespaceMapping: Record[String, String],
      namespacePrefix: String
    ): IStylableNamespaceOptimizer = {
      val __obj = js.Dynamic.literal(getNamespace = js.Any.fromFunction2(getNamespace), index = index.asInstanceOf[js.Any], namespaceMapping = namespaceMapping.asInstanceOf[js.Any], namespacePrefix = namespacePrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStylableNamespaceOptimizer]
    }
    
    @scala.inline
    implicit class IStylableNamespaceOptimizerMutableBuilder[Self <: IStylableNamespaceOptimizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNamespace(value: (StylableMeta, /* repeated */ js.Any) => String): Self = StObject.set(x, "getNamespace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceMapping(value: Record[String, String]): Self = StObject.set(x, "namespaceMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ParsedValue extends StObject {
    
    var nodes: js.UndefOr[js.Any] = js.native
    
    var resolvedValue: js.UndefOr[String | (Box_[String, _])] = js.native
    
    var `type`: String = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object ParsedValue {
    
    @scala.inline
    def apply(`type`: String, value: String): ParsedValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedValue]
    }
    
    @scala.inline
    implicit class ParsedValueMutableBuilder[Self <: ParsedValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setResolvedValue(value: String | (Box_[String, _])): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedValueUndefined: Self = StObject.set(x, "resolvedValue", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type PartialObject[T] = Partial[T] with js.Object
  
  type StateArguments = js.Array[StateTypeValidator | String]
  
  @js.native
  trait StateParsedValue extends StObject {
    
    var arguments: StateArguments = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object StateParsedValue {
    
    @scala.inline
    def apply(arguments: StateArguments, `type`: String): StateParsedValue = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateParsedValue]
    }
    
    @scala.inline
    implicit class StateParsedValueMutableBuilder[Self <: StateParsedValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: StateArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: (StateTypeValidator | String)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateTypeValidator extends StObject {
    
    var args: js.Array[String] = js.native
    
    var name: String = js.native
  }
  object StateTypeValidator {
    
    @scala.inline
    def apply(args: js.Array[String], name: String): StateTypeValidator = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateTypeValidator]
    }
    
    @scala.inline
    implicit class StateTypeValidatorMutableBuilder[Self <: StateTypeValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
