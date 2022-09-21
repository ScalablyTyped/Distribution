package typings.tx2

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tx2", JSImport.Namespace)
  @js.native
  val ^ : TX2 = js.native
  
  trait Counter extends StObject {
    
    def dec(amount: Double): Unit
    
    def inc(amount: Double): Unit
    
    def reset(): Unit
    
    def `val`(): Double
  }
  object Counter {
    
    inline def apply(dec: Double => Unit, inc: Double => Unit, reset: () => Unit, `val`: () => Double): Counter = {
      val __obj = js.Dynamic.literal(dec = js.Any.fromFunction1(dec), inc = js.Any.fromFunction1(inc), reset = js.Any.fromFunction0(reset))
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[Counter]
    }
    
    extension [Self <: Counter](x: Self) {
      
      inline def setDec(value: Double => Unit): Self = StObject.set(x, "dec", js.Any.fromFunction1(value))
      
      inline def setInc(value: Double => Unit): Self = StObject.set(x, "inc", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setVal(value: () => Double): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  trait CounterOptions extends StObject {
    
    var name: String
    
    var unit: String
  }
  object CounterOptions {
    
    inline def apply(name: String, unit: String): CounterOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CounterOptions]
    }
    
    extension [Self <: CounterOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorObject extends StObject {
    
    var message: String
    
    var name: String
  }
  object ErrorObject {
    
    inline def apply(message: String, name: String): ErrorObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObject]
    }
    
    extension [Self <: ErrorObject](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metric[T] extends StObject {
    
    def set(data: T): Unit
    
    def `val`(): T
  }
  object Metric {
    
    inline def apply[T](set: T => Unit, `val`: () => T): Metric[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[Metric[T]]
    }
    
    extension [Self <: Metric[?], T](x: Self & Metric[T]) {
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setVal(value: () => T): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  trait MetricOptions[T] extends StObject {
    
    var name: String
    
    var unit: js.UndefOr[String] = js.undefined
    
    var value: T
  }
  object MetricOptions {
    
    inline def apply[T](name: String, value: T): MetricOptions[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricOptions[T]]
    }
    
    extension [Self <: MetricOptions[?], T](x: Self & MetricOptions[T]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TX2
    extends typings.node.nodeEventsMod.^ {
    
    def action(action_name: String, callback: js.Function1[/* cb */ js.Function1[/* data */ Any, Unit], Unit]): Unit = js.native
    def action[T /* <: js.Object */](
      action_name: String,
      options: T,
      callback: js.Function2[/* options */ T, /* cb */ js.Function1[/* data */ Any, Unit], Unit]
    ): Unit = js.native
    
    def counter(name: String): Counter = js.native
    def counter(name: CounterOptions): Counter = js.native
    
    def event(name: String, data: js.Object): Unit = js.native
    
    def issue(err: String): String = js.native
    def issue(err: js.Error): ErrorObject = js.native
    
    def metric(name: String, cb: Double): Metric[Double] = js.native
    def metric(name: String, unit: String, cb: Double): Metric[Double] = js.native
    def metric[T](name: String, cb: js.Function0[T]): Metric[T] = js.native
    def metric[T](name: String, unit: String, cb: js.Function0[T]): Metric[T] = js.native
    def metric[T](options: MetricOptions[T]): Metric[T] = js.native
  }
  
  type _To = TX2
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TX2 = ^
}
