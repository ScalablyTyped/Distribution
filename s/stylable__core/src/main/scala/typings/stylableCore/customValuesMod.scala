package typings.stylableCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.stylableCore.anon.Delimiter
import typings.stylableCore.stylableCoreStrings.CustomValue
import typings.stylableCore.stylableMetaMod.StylableMeta
import typings.stylableCore.stylableResolverMod.StylableResolver
import typings.stylableCore.typesMod.ParsedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customValuesMod {
  
  @JSImport("@stylable/core/cjs/custom-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CustomValueStrategy {
    
    @JSImport("@stylable/core/cjs/custom-values", "CustomValueStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, js.Any])] = (^.asInstanceOf[js.Dynamic].applyDynamic("args")(fnNode.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | (Box_[String, js.Any])]]
    
    inline def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = (^.asInstanceOf[js.Dynamic].applyDynamic("named")(fnNode.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[BoxedValueMap]
  }
  
  inline def box[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Box_[Type, Value]]
  
  inline def createCustomValue[Value, Args](hasProcessArgsCreateValueFlattenValueGetValue: ExtensionApi[Value, Args]): JSValueExtension[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomValue")(hasProcessArgsCreateValueFlattenValueGetValue.asInstanceOf[js.Any]).asInstanceOf[JSValueExtension[Value]]
  
  inline def getBoxValue(path: js.Array[String], value: String, node: ParsedValue, customTypes: CustomTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getBoxValue(path: js.Array[String], value: Box_[String, js.Any], node: ParsedValue, customTypes: CustomTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoxValue")(path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], node.asInstanceOf[js.Any], customTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isCustomValue(symbol: js.Any): /* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomValue")(symbol.asInstanceOf[js.Any]).asInstanceOf[/* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean]
  
  inline def resolveCustomValues(meta: StylableMeta, resolver: StylableResolver): StringDictionary[CustomValueExtension[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCustomValues")(meta.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[CustomValueExtension[js.Any]]]
  
  @JSImport("@stylable/core/cjs/custom-values", "stTypes")
  @js.native
  val stTypes: CustomTypes = js.native
  
  inline def unbox[B /* <: Box_[String, js.Any] */](boxed: B): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbox")(boxed.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def unbox[B /* <: Box_[String, js.Any] */](boxed: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbox")(boxed.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait Box_[Type /* <: String */, Value /* <: js.Any */] extends StObject {
    
    var `type`: Type
    
    var value: Value
  }
  object Box_ {
    
    inline def apply[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box_[Type, Value]]
    }
    
    extension [Self <: Box_[?, ?], Type /* <: String */, Value /* <: js.Any */](x: Self & (Box_[Type, Value])) {
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxedValueArray = js.Array[String | (Box_[String, js.Any])]
  
  type BoxedValueMap = StringDictionary[String | (Box_[String, js.Any])]
  
  type CustomTypes = Record[String, CustomValueExtension[js.Any]]
  
  trait CustomValueExtension[T] extends StObject {
    
    def evalVarAst(valueAst: ParsedValue, customTypes: StringDictionary[CustomValueExtension[js.Any]]): Box_[String, T]
    
    def getValue(path: js.Array[String], value: Box_[String, T], node: ParsedValue, customTypes: CustomTypes): String
  }
  object CustomValueExtension {
    
    inline def apply[T](
      evalVarAst: (ParsedValue, StringDictionary[CustomValueExtension[js.Any]]) => Box_[String, T],
      getValue: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String
    ): CustomValueExtension[T] = {
      val __obj = js.Dynamic.literal(evalVarAst = js.Any.fromFunction2(evalVarAst), getValue = js.Any.fromFunction4(getValue))
      __obj.asInstanceOf[CustomValueExtension[T]]
    }
    
    extension [Self <: CustomValueExtension[?], T](x: Self & CustomValueExtension[T]) {
      
      inline def setEvalVarAst(value: (ParsedValue, StringDictionary[CustomValueExtension[js.Any]]) => Box_[String, T]): Self = StObject.set(x, "evalVarAst", js.Any.fromFunction2(value))
      
      inline def setGetValue(value: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String): Self = StObject.set(x, "getValue", js.Any.fromFunction4(value))
    }
  }
  
  trait ExtensionApi[Value, Args] extends StObject {
    
    def createValue(args: Args): Value
    
    var flattenValue: js.UndefOr[js.Function1[/* v */ Box_[String, Value], Delimiter]] = js.undefined
    
    def getValue(v: Value, key: String): String | (Box_[String, js.Any])
    
    def processArgs(fnNode: ParsedValue, customTypes: CustomTypes): Args
  }
  object ExtensionApi {
    
    inline def apply[Value, Args](
      createValue: Args => Value,
      getValue: (Value, String) => String | (Box_[String, js.Any]),
      processArgs: (ParsedValue, CustomTypes) => Args
    ): ExtensionApi[Value, Args] = {
      val __obj = js.Dynamic.literal(createValue = js.Any.fromFunction1(createValue), getValue = js.Any.fromFunction2(getValue), processArgs = js.Any.fromFunction2(processArgs))
      __obj.asInstanceOf[ExtensionApi[Value, Args]]
    }
    
    extension [Self <: ExtensionApi[?, ?], Value, Args](x: Self & (ExtensionApi[Value, Args])) {
      
      inline def setCreateValue(value: Args => Value): Self = StObject.set(x, "createValue", js.Any.fromFunction1(value))
      
      inline def setFlattenValue(value: /* v */ Box_[String, Value] => Delimiter): Self = StObject.set(x, "flattenValue", js.Any.fromFunction1(value))
      
      inline def setFlattenValueUndefined: Self = StObject.set(x, "flattenValue", js.undefined)
      
      inline def setGetValue(value: (Value, String) => String | (Box_[String, js.Any])): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
      
      inline def setProcessArgs(value: (ParsedValue, CustomTypes) => Args): Self = StObject.set(x, "processArgs", js.Any.fromFunction2(value))
    }
  }
  
  trait JSValueExtension[Value] extends StObject {
    
    var _kind: CustomValue
    
    def register(localTypeSymbol: String): CustomValueExtension[Value]
  }
  object JSValueExtension {
    
    inline def apply[Value](register: String => CustomValueExtension[Value]): JSValueExtension[Value] = {
      val __obj = js.Dynamic.literal(_kind = "CustomValue", register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[JSValueExtension[Value]]
    }
    
    extension [Self <: JSValueExtension[?], Value](x: Self & JSValueExtension[Value]) {
      
      inline def setRegister(value: String => CustomValueExtension[Value]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def set_kind(value: CustomValue): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
}
