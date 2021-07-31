package typings.tapable

import typings.tapable.mod.TapFunction
import typings.tapable.mod.TapType
import typings.tapable.tapableStrings.async
import typings.tapable.tapableStrings.promise
import typings.tapable.tapableStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends StObject {
    
    var fn: js.UndefOr[TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]] = js.undefined
    
    var `type`: js.UndefOr[TTapType] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult](): `0`[TTapType, TArg1, TArg2, TArg3, THookResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TTapType, TArg1, TArg2, TArg3, THookResult]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[?, ?, ?, ?, ?], TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] (val x: Self & (`0`[TTapType, TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
      
      @scala.inline
      def setFn(
        value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setType(value: TTapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Before extends StObject {
    
    var before: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var context: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var stage: js.UndefOr[Double] = js.undefined
  }
  object Before {
    
    @scala.inline
    def apply(name: String): Before = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Before]
    }
    
    @scala.inline
    implicit class BeforeMutableBuilder[Self <: Before] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
  
  trait Fn[TArg1, TArg2, TArg3, THookResult] extends StObject {
    
    var fn: js.UndefOr[TapFunction[sync, TArg1, TArg2, TArg3, THookResult]] = js.undefined
    
    var `type`: js.UndefOr[sync] = js.undefined
  }
  object Fn {
    
    @scala.inline
    def apply[TArg1, TArg2, TArg3, THookResult](): Fn[TArg1, TArg2, TArg3, THookResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fn[TArg1, TArg2, TArg3, THookResult]]
    }
    
    @scala.inline
    implicit class FnMutableBuilder[Self <: Fn[?, ?, ?, ?], TArg1, TArg2, TArg3, THookResult] (val x: Self & (Fn[TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
      
      @scala.inline
      def setFn(
        value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setType(value: sync): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FnType[TArg1, TArg2, TArg3, THookResult] extends StObject {
    
    var fn: js.UndefOr[TapFunction[promise, TArg1, TArg2, TArg3, THookResult]] = js.undefined
    
    var `type`: js.UndefOr[promise] = js.undefined
  }
  object FnType {
    
    @scala.inline
    def apply[TArg1, TArg2, TArg3, THookResult](): FnType[TArg1, TArg2, TArg3, THookResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FnType[TArg1, TArg2, TArg3, THookResult]]
    }
    
    @scala.inline
    implicit class FnTypeMutableBuilder[Self <: FnType[?, ?, ?, ?], TArg1, TArg2, TArg3, THookResult] (val x: Self & (FnType[TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
      
      @scala.inline
      def setFn(
        value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setType(value: promise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Type[TArg1, TArg2, TArg3, THookResult] extends StObject {
    
    var fn: js.UndefOr[TapFunction[async, TArg1, TArg2, TArg3, THookResult]] = js.undefined
    
    var `type`: js.UndefOr[async] = js.undefined
  }
  object Type {
    
    @scala.inline
    def apply[TArg1, TArg2, TArg3, THookResult](): Type[TArg1, TArg2, TArg3, THookResult] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type[TArg1, TArg2, TArg3, THookResult]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[?, ?, ?, ?], TArg1, TArg2, TArg3, THookResult] (val x: Self & (Type[TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
      
      @scala.inline
      def setFn(
        value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setType(value: async): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
