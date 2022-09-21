package typings.styletronReact

import typings.react.mod.ElementType
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
  }
  object `0` {
    
    inline def apply(ref: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any): `0` = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setRef(value: /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    /** @deprecated */
    @JSName("$ref")
    var $ref: js.UndefOr[Any] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def set$ref(value: Any): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    }
  }
  
  trait `2` extends StObject {
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
      ] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setRef(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait As[C /* <: ElementType[Any] */] extends StObject {
    
    @JSName("$as")
    var $as: js.UndefOr[C] = js.undefined
  }
  object As {
    
    inline def apply[C /* <: ElementType[Any] */](): As[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[C]]
    }
    
    extension [Self <: As[?], C /* <: ElementType[Any] */](x: Self & As[C]) {
      
      inline def set$as(value: C): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
    }
  }
  
  trait Base extends StObject {
    
    var base: Any
    
    var getInitialStyle: Any
    
    var name: js.UndefOr[String | Null] = js.undefined
    
    var `with`: Any
  }
  object Base {
    
    inline def apply(base: Any, getInitialStyle: Any, `with`: Any): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], getInitialStyle = getInitialStyle.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setGetInitialStyle(value: Any): Self = StObject.set(x, "getInitialStyle", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWith(value: Any): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName[P /* <: js.Object */] extends StObject {
    
    @JSName("$style")
    var $style: js.UndefOr[StyleObject | (js.Function1[/* props */ P, StyleObject])] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    inline def apply[P /* <: js.Object */](): ClassName[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName[P]]
    }
    
    extension [Self <: ClassName[?], P /* <: js.Object */](x: Self & ClassName[P]) {
      
      inline def set$style(value: StyleObject | (js.Function1[/* props */ P, StyleObject])): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
      
      inline def set$styleFunction1(value: /* props */ P => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
      
      inline def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait Hydrating extends StObject {
    
    var hydrating: Boolean
  }
  object Hydrating {
    
    inline def apply(hydrating: Boolean): Hydrating = {
      val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hydrating]
    }
    
    extension [Self <: Hydrating](x: Self) {
      
      inline def setHydrating(value: Boolean): Self = StObject.set(x, "hydrating", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: Any
    
    var stack: Any
    
    var stacktrace: Any
  }
  object Message {
    
    inline def apply(message: Any, stack: Any, stacktrace: Any): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stacktrace = stacktrace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStacktrace(value: Any): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: Any
  }
  object Ref {
    
    inline def apply(ref: Any): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackIndex extends StObject {
    
    var stackIndex: Any
    
    var stackInfo: Any
  }
  object StackIndex {
    
    inline def apply(stackIndex: Any, stackInfo: Any): StackIndex = {
      val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackIndex]
    }
    
    extension [Self <: StackIndex](x: Self) {
      
      inline def setStackIndex(value: Any): Self = StObject.set(x, "stackIndex", value.asInstanceOf[js.Any])
      
      inline def setStackInfo(value: Any): Self = StObject.set(x, "stackInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackInfo extends StObject {
    
    var stackIndex: Double
    
    var stackInfo: Message
  }
  object StackInfo {
    
    inline def apply(stackIndex: Double, stackInfo: Message): StackInfo = {
      val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackInfo]
    }
    
    extension [Self <: StackInfo](x: Self) {
      
      inline def setStackIndex(value: Double): Self = StObject.set(x, "stackIndex", value.asInstanceOf[js.Any])
      
      inline def setStackInfo(value: Message): Self = StObject.set(x, "stackInfo", value.asInstanceOf[js.Any])
    }
  }
}
