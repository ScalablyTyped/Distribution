package typings.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicalMod {
  
  @JSImport("vega-lite/build/src/logical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def forEachLeaf[T](op: LogicalComposition[T], fn: js.Function1[/* op */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLeaf")(op.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isLogicalAnd(op: LogicalComposition[js.Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalAnd")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ Boolean]
  
  @scala.inline
  def isLogicalNot(op: LogicalComposition[js.Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalNot")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ Boolean]
  
  @scala.inline
  def isLogicalOr(op: LogicalComposition[js.Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalOr")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ Boolean]
  
  @scala.inline
  def normalizeLogicalComposition[T](op: LogicalComposition[T], normalizer: js.Function1[/* o */ T, T]): LogicalComposition[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLogicalComposition")(op.asInstanceOf[js.Any], normalizer.asInstanceOf[js.Any])).asInstanceOf[LogicalComposition[T]]
  
  trait LogicalAnd[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var and: js.Array[LogicalComposition[T]]
  }
  object LogicalAnd {
    
    @scala.inline
    def apply[T](and: js.Array[LogicalComposition[T]]): LogicalAnd[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalAnd[T]]
    }
    
    @scala.inline
    implicit class LogicalAndMutableBuilder[Self <: LogicalAnd[?], T] (val x: Self & LogicalAnd[T]) extends AnyVal {
      
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
  
  trait LogicalNot[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var not: LogicalComposition[T]
  }
  object LogicalNot {
    
    @scala.inline
    def apply[T](not: LogicalComposition[T]): LogicalNot[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalNot[T]]
    }
    
    @scala.inline
    implicit class LogicalNotMutableBuilder[Self <: LogicalNot[?], T] (val x: Self & LogicalNot[T]) extends AnyVal {
      
      @scala.inline
      def setNot(value: LogicalComposition[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogicalOr[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var or: js.Array[LogicalComposition[T]]
  }
  object LogicalOr {
    
    @scala.inline
    def apply[T](or: js.Array[LogicalComposition[T]]): LogicalOr[T] = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalOr[T]]
    }
    
    @scala.inline
    implicit class LogicalOrMutableBuilder[Self <: LogicalOr[?], T] (val x: Self & LogicalOr[T]) extends AnyVal {
      
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
