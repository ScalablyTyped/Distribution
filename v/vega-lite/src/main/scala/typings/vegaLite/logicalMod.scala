package typings.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicalMod {
  
  @JSImport("vega-lite/build/src/logical", "forEachLeaf")
  @js.native
  def forEachLeaf[T](op: LogicalComposition[T], fn: js.Function1[/* op */ T, Unit]): Unit = js.native
  
  @JSImport("vega-lite/build/src/logical", "isLogicalAnd")
  @js.native
  def isLogicalAnd(op: LogicalComposition[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/logical", "isLogicalNot")
  @js.native
  def isLogicalNot(op: LogicalComposition[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/logical", "isLogicalOr")
  @js.native
  def isLogicalOr(op: LogicalComposition[_]): /* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/logical", "normalizeLogicalComposition")
  @js.native
  def normalizeLogicalComposition[T](op: LogicalComposition[T], normalizer: js.Function1[/* o */ T, T]): LogicalComposition[T] = js.native
  
  @js.native
  trait LogicalAnd[T] extends _LogicalComposition[T] {
    
    var and: js.Array[LogicalComposition[T]] = js.native
  }
  object LogicalAnd {
    
    @scala.inline
    def apply[T](and: js.Array[LogicalComposition[T]]): LogicalAnd[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalAnd[T]]
    }
    
    @scala.inline
    implicit class LogicalAndMutableBuilder[Self <: LogicalAnd[_], T] (val x: Self with LogicalAnd[T]) extends AnyVal {
      
      @scala.inline
      def setAnd(value: js.Array[LogicalComposition[T]]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndVarargs(value: LogicalComposition[T]*): Self = StObject.set(x, "and", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.logicalMod.LogicalNot[T]
    - typings.vegaLite.logicalMod.LogicalAnd[T]
    - typings.vegaLite.logicalMod.LogicalOr[T]
    - T
  */
  type LogicalComposition[T] = _LogicalComposition[T] | T
  
  @js.native
  trait LogicalNot[T] extends _LogicalComposition[T] {
    
    var not: LogicalComposition[T] = js.native
  }
  object LogicalNot {
    
    @scala.inline
    def apply[T](not: LogicalComposition[T]): LogicalNot[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalNot[T]]
    }
    
    @scala.inline
    implicit class LogicalNotMutableBuilder[Self <: LogicalNot[_], T] (val x: Self with LogicalNot[T]) extends AnyVal {
      
      @scala.inline
      def setNot(value: LogicalComposition[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogicalOr[T] extends _LogicalComposition[T] {
    
    var or: js.Array[LogicalComposition[T]] = js.native
  }
  object LogicalOr {
    
    @scala.inline
    def apply[T](or: js.Array[LogicalComposition[T]]): LogicalOr[T] = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalOr[T]]
    }
    
    @scala.inline
    implicit class LogicalOrMutableBuilder[Self <: LogicalOr[_], T] (val x: Self with LogicalOr[T]) extends AnyVal {
      
      @scala.inline
      def setOr(value: js.Array[LogicalComposition[T]]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrVarargs(value: LogicalComposition[T]*): Self = StObject.set(x, "or", js.Array(value :_*))
    }
  }
  
  trait _LogicalComposition[T] extends StObject
  object _LogicalComposition {
    
    @scala.inline
    def LogicalAnd[T](and: js.Array[LogicalComposition[T]]): typings.vegaLite.logicalMod.LogicalAnd[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.logicalMod.LogicalAnd[T]]
    }
    
    @scala.inline
    def LogicalNot[T](not: LogicalComposition[T]): typings.vegaLite.logicalMod.LogicalNot[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.logicalMod.LogicalNot[T]]
    }
    
    @scala.inline
    def LogicalOr[T](or: js.Array[LogicalComposition[T]]): typings.vegaLite.logicalMod.LogicalOr[T] = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.logicalMod.LogicalOr[T]]
    }
  }
}
