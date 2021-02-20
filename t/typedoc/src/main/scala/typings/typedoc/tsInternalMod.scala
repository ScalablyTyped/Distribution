package typings.typedoc

import typings.std.Map
import typings.typedoc.typedocStrings.`object`
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import typings.typescript.mod.DiagnosticMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsInternalMod {
  
  @JSImport("typedoc/dist/lib/ts-internal", "optionDeclarations")
  @js.native
  val optionDeclarations: js.Array[CommandLineOption] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType
    - typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType
    - typings.typedoc.tsInternalMod.TsConfigOnlyOption
    - typings.typedoc.tsInternalMod.CommandLineOptionOfListType
  */
  trait CommandLineOption extends StObject
  object CommandLineOption {
    
    @scala.inline
    def CommandLineOptionOfCustomType(name: String, `type`: Map[Double | String, _]): typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType]
    }
    
    @scala.inline
    def CommandLineOptionOfListType(
      element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
      name: String,
      `type`: list
    ): typings.typedoc.tsInternalMod.CommandLineOptionOfListType = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfListType]
    }
    
    @scala.inline
    def CommandLineOptionOfPrimitiveType(name: String, `type`: string | number | boolean): typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType]
    }
    
    @scala.inline
    def TsConfigOnlyOption(name: String, `type`: `object`): typings.typedoc.tsInternalMod.TsConfigOnlyOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.typedoc.tsInternalMod.TsConfigOnlyOption]
    }
  }
  
  @js.native
  trait CommandLineOptionBase extends StObject {
    
    var description: js.UndefOr[DiagnosticMessage] = js.native
    
    var experimental: js.UndefOr[Boolean] = js.native
    
    var isFilePath: js.UndefOr[Boolean] = js.native
    
    var isTSConfigOnly: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var paramType: js.UndefOr[DiagnosticMessage] = js.native
    
    var shortName: js.UndefOr[String] = js.native
    
    var `type`: string | number | boolean | `object` | list | (Map[Double | String, _]) = js.native
  }
  object CommandLineOptionBase {
    
    @scala.inline
    def apply(name: String, `type`: string | number | boolean | `object` | list | (Map[Double | String, _])): CommandLineOptionBase = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionBase]
    }
    
    @scala.inline
    implicit class CommandLineOptionBaseMutableBuilder[Self <: CommandLineOptionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: DiagnosticMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      @scala.inline
      def setIsFilePath(value: Boolean): Self = StObject.set(x, "isFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFilePathUndefined: Self = StObject.set(x, "isFilePath", js.undefined)
      
      @scala.inline
      def setIsTSConfigOnly(value: Boolean): Self = StObject.set(x, "isTSConfigOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTSConfigOnlyUndefined: Self = StObject.set(x, "isTSConfigOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamType(value: DiagnosticMessage): Self = StObject.set(x, "paramType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamTypeUndefined: Self = StObject.set(x, "paramType", js.undefined)
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      @scala.inline
      def setType(value: string | number | boolean | `object` | list | (Map[Double | String, _])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandLineOptionOfCustomType
    extends CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_CommandLineOptionOfCustomType: Map[Double | String, _] = js.native
  }
  object CommandLineOptionOfCustomType {
    
    @scala.inline
    def apply(name: String, `type`: Map[Double | String, _]): CommandLineOptionOfCustomType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionOfCustomType]
    }
    
    @scala.inline
    implicit class CommandLineOptionOfCustomTypeMutableBuilder[Self <: CommandLineOptionOfCustomType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Map[Double | String, _]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandLineOptionOfListType
    extends CommandLineOptionBase
       with CommandLineOption {
    
    var element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType = js.native
    
    @JSName("type")
    var type_CommandLineOptionOfListType: list = js.native
  }
  object CommandLineOptionOfListType {
    
    @scala.inline
    def apply(
      element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
      name: String,
      `type`: list
    ): CommandLineOptionOfListType = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionOfListType]
    }
    
    @scala.inline
    implicit class CommandLineOptionOfListTypeMutableBuilder[Self <: CommandLineOptionOfListType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandLineOptionOfPrimitiveType
    extends CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_CommandLineOptionOfPrimitiveType: string | number | boolean = js.native
  }
  object CommandLineOptionOfPrimitiveType {
    
    @scala.inline
    def apply(name: String, `type`: string | number | boolean): CommandLineOptionOfPrimitiveType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandLineOptionOfPrimitiveType]
    }
    
    @scala.inline
    implicit class CommandLineOptionOfPrimitiveTypeMutableBuilder[Self <: CommandLineOptionOfPrimitiveType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: string | number | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TsConfigOnlyOption
    extends CommandLineOptionBase
       with CommandLineOption {
    
    @JSName("type")
    var type_TsConfigOnlyOption: `object` = js.native
  }
  object TsConfigOnlyOption {
    
    @scala.inline
    def apply(name: String, `type`: `object`): TsConfigOnlyOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TsConfigOnlyOption]
    }
    
    @scala.inline
    implicit class TsConfigOnlyOptionMutableBuilder[Self <: TsConfigOnlyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object typescriptAugmentingMod {
    
    @js.native
    trait Node extends StObject {
      
      var localSymbol: js.UndefOr[typings.typescript.mod.Symbol] = js.native
      
      var symbol: js.UndefOr[typings.typescript.mod.Symbol] = js.native
    }
    object Node {
      
      @scala.inline
      def apply(): Node = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocalSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "localSymbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalSymbolUndefined: Self = StObject.set(x, "localSymbol", js.undefined)
        
        @scala.inline
        def setSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      }
    }
    
    @js.native
    trait Symbol extends StObject {
      
      var parent: js.UndefOr[typings.typescript.mod.Symbol] = js.native
    }
    object Symbol {
      
      @scala.inline
      def apply(): Symbol = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Symbol]
      }
      
      @scala.inline
      implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParent(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
  }
}
