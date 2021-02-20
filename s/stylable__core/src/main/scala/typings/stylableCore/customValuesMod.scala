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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customValuesMod {
  
  object CustomValueStrategy {
    
    @JSImport("@stylable/core/cjs/custom-values", "CustomValueStrategy.args")
    @js.native
    def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, _])] = js.native
    
    @JSImport("@stylable/core/cjs/custom-values", "CustomValueStrategy.named")
    @js.native
    def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = js.native
  }
  
  @JSImport("@stylable/core/cjs/custom-values", "box")
  @js.native
  def box[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "createCustomValue")
  @js.native
  def createCustomValue[Value, Args](hasProcessArgsCreateValueFlattenValueGetValue: ExtensionApi[Value, Args]): JSValueExtension[Value] = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "getBoxValue")
  @js.native
  def getBoxValue(path: js.Array[String], value: String, node: ParsedValue, customTypes: CustomTypes): String = js.native
  @JSImport("@stylable/core/cjs/custom-values", "getBoxValue")
  @js.native
  def getBoxValue(path: js.Array[String], value: Box_[String, _], node: ParsedValue, customTypes: CustomTypes): String = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "isCustomValue")
  @js.native
  def isCustomValue(symbol: js.Any): /* is @stylable/core.@stylable/core/cjs/custom-values.JSValueExtension<unknown> */ Boolean = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "resolveCustomValues")
  @js.native
  def resolveCustomValues(meta: StylableMeta, resolver: StylableResolver): StringDictionary[CustomValueExtension[_]] = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "stTypes")
  @js.native
  val stTypes: CustomTypes = js.native
  
  @JSImport("@stylable/core/cjs/custom-values", "unbox")
  @js.native
  def unbox[B /* <: Box_[String, _] */](boxed: B): js.Any = js.native
  @JSImport("@stylable/core/cjs/custom-values", "unbox")
  @js.native
  def unbox[B /* <: Box_[String, _] */](boxed: String): js.Any = js.native
  
  @js.native
  trait Box_[Type /* <: String */, Value /* <: js.Any */] extends StObject {
    
    var `type`: Type = js.native
    
    var value: Value = js.native
  }
  object Box_ {
    
    @scala.inline
    def apply[Type /* <: String */, Value /* <: js.Any */](`type`: Type, value: Value): Box_[Type, Value] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box_[Type, Value]]
    }
    
    @scala.inline
    implicit class Box_MutableBuilder[Self <: Box_[_, _], Type /* <: String */, Value /* <: js.Any */] (val x: Self with (Box_[Type, Value])) extends AnyVal {
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type BoxedValueArray = js.Array[String | (Box_[String, js.Any])]
  
  type BoxedValueMap = StringDictionary[String | (Box_[String, js.Any])]
  
  type CustomTypes = Record[String, CustomValueExtension[js.Any]]
  
  @js.native
  trait CustomValueExtension[T] extends StObject {
    
    def evalVarAst(valueAst: ParsedValue, customTypes: StringDictionary[CustomValueExtension[_]]): Box_[String, T] = js.native
    
    def getValue(path: js.Array[String], value: Box_[String, T], node: ParsedValue, customTypes: CustomTypes): String = js.native
  }
  object CustomValueExtension {
    
    @scala.inline
    def apply[T](
      evalVarAst: (ParsedValue, StringDictionary[CustomValueExtension[_]]) => Box_[String, T],
      getValue: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String
    ): CustomValueExtension[T] = {
      val __obj = js.Dynamic.literal(evalVarAst = js.Any.fromFunction2(evalVarAst), getValue = js.Any.fromFunction4(getValue))
      __obj.asInstanceOf[CustomValueExtension[T]]
    }
    
    @scala.inline
    implicit class CustomValueExtensionMutableBuilder[Self <: CustomValueExtension[_], T] (val x: Self with CustomValueExtension[T]) extends AnyVal {
      
      @scala.inline
      def setEvalVarAst(value: (ParsedValue, StringDictionary[CustomValueExtension[_]]) => Box_[String, T]): Self = StObject.set(x, "evalVarAst", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetValue(value: (js.Array[String], Box_[String, T], ParsedValue, CustomTypes) => String): Self = StObject.set(x, "getValue", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait ExtensionApi[Value, Args] extends StObject {
    
    def createValue(args: Args): Value = js.native
    
    var flattenValue: js.UndefOr[js.Function1[/* v */ Box_[String, Value], Delimiter]] = js.native
    
    def getValue(v: Value, key: String): String | (Box_[String, _]) = js.native
    
    def processArgs(fnNode: ParsedValue, customTypes: CustomTypes): Args = js.native
  }
  object ExtensionApi {
    
    @scala.inline
    def apply[Value, Args](
      createValue: Args => Value,
      getValue: (Value, String) => String | (Box_[String, _]),
      processArgs: (ParsedValue, CustomTypes) => Args
    ): ExtensionApi[Value, Args] = {
      val __obj = js.Dynamic.literal(createValue = js.Any.fromFunction1(createValue), getValue = js.Any.fromFunction2(getValue), processArgs = js.Any.fromFunction2(processArgs))
      __obj.asInstanceOf[ExtensionApi[Value, Args]]
    }
    
    @scala.inline
    implicit class ExtensionApiMutableBuilder[Self <: ExtensionApi[_, _], Value, Args] (val x: Self with (ExtensionApi[Value, Args])) extends AnyVal {
      
      @scala.inline
      def setCreateValue(value: Args => Value): Self = StObject.set(x, "createValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlattenValue(value: /* v */ Box_[String, Value] => Delimiter): Self = StObject.set(x, "flattenValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlattenValueUndefined: Self = StObject.set(x, "flattenValue", js.undefined)
      
      @scala.inline
      def setGetValue(value: (Value, String) => String | (Box_[String, _])): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProcessArgs(value: (ParsedValue, CustomTypes) => Args): Self = StObject.set(x, "processArgs", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait JSValueExtension[Value] extends StObject {
    
    var _kind: CustomValue = js.native
    
    def register(localTypeSymbol: String): CustomValueExtension[Value] = js.native
  }
  object JSValueExtension {
    
    @scala.inline
    def apply[Value](_kind: CustomValue, register: String => CustomValueExtension[Value]): JSValueExtension[Value] = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[JSValueExtension[Value]]
    }
    
    @scala.inline
    implicit class JSValueExtensionMutableBuilder[Self <: JSValueExtension[_], Value] (val x: Self with JSValueExtension[Value]) extends AnyVal {
      
      @scala.inline
      def setRegister(value: String => CustomValueExtension[Value]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_kind(value: CustomValue): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
}
