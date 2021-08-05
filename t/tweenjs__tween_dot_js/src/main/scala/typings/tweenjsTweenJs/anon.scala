package typings.tweenjsTweenJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Back extends StObject {
    
    var Back: In
    
    var Bounce: In
    
    var Circular: In
    
    var Cubic: In
    
    var Elastic: In
    
    var Exponential: In
    
    var Linear: None
    
    var Quadratic: In
    
    var Quartic: In
    
    var Quintic: In
    
    var Sinusoidal: In
  }
  object Back {
    
    inline def apply(
      Back: In,
      Bounce: In,
      Circular: In,
      Cubic: In,
      Elastic: In,
      Exponential: In,
      Linear: None,
      Quadratic: In,
      Quartic: In,
      Quintic: In,
      Sinusoidal: In
    ): Back = {
      val __obj = js.Dynamic.literal(Back = Back.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Circular = Circular.asInstanceOf[js.Any], Cubic = Cubic.asInstanceOf[js.Any], Elastic = Elastic.asInstanceOf[js.Any], Exponential = Exponential.asInstanceOf[js.Any], Linear = Linear.asInstanceOf[js.Any], Quadratic = Quadratic.asInstanceOf[js.Any], Quartic = Quartic.asInstanceOf[js.Any], Quintic = Quintic.asInstanceOf[js.Any], Sinusoidal = Sinusoidal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setBack(value: In): Self = StObject.set(x, "Back", value.asInstanceOf[js.Any])
      
      inline def setBounce(value: In): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
      
      inline def setCircular(value: In): Self = StObject.set(x, "Circular", value.asInstanceOf[js.Any])
      
      inline def setCubic(value: In): Self = StObject.set(x, "Cubic", value.asInstanceOf[js.Any])
      
      inline def setElastic(value: In): Self = StObject.set(x, "Elastic", value.asInstanceOf[js.Any])
      
      inline def setExponential(value: In): Self = StObject.set(x, "Exponential", value.asInstanceOf[js.Any])
      
      inline def setLinear(value: None): Self = StObject.set(x, "Linear", value.asInstanceOf[js.Any])
      
      inline def setQuadratic(value: In): Self = StObject.set(x, "Quadratic", value.asInstanceOf[js.Any])
      
      inline def setQuartic(value: In): Self = StObject.set(x, "Quartic", value.asInstanceOf[js.Any])
      
      inline def setQuintic(value: In): Self = StObject.set(x, "Quintic", value.asInstanceOf[js.Any])
      
      inline def setSinusoidal(value: In): Self = StObject.set(x, "Sinusoidal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bernstein extends StObject {
    
    def Bernstein(n: Double, i: Double): Double
    
    def CatmullRom(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double
    
    def Factorial(n: Double): Double
    
    def Linear(p0: Double, p1: Double, t: Double): Double
  }
  object Bernstein {
    
    inline def apply(
      Bernstein: (Double, Double) => Double,
      CatmullRom: (Double, Double, Double, Double, Double) => Double,
      Factorial: Double => Double,
      Linear: (Double, Double, Double) => Double
    ): Bernstein = {
      val __obj = js.Dynamic.literal(Bernstein = js.Any.fromFunction2(Bernstein), CatmullRom = js.Any.fromFunction5(CatmullRom), Factorial = js.Any.fromFunction1(Factorial), Linear = js.Any.fromFunction3(Linear))
      __obj.asInstanceOf[Bernstein]
    }
    
    extension [Self <: Bernstein](x: Self) {
      
      inline def setBernstein(value: (Double, Double) => Double): Self = StObject.set(x, "Bernstein", js.Any.fromFunction2(value))
      
      inline def setCatmullRom(value: (Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "CatmullRom", js.Any.fromFunction5(value))
      
      inline def setFactorial(value: Double => Double): Self = StObject.set(x, "Factorial", js.Any.fromFunction1(value))
      
      inline def setLinear(value: (Double, Double, Double) => Double): Self = StObject.set(x, "Linear", js.Any.fromFunction3(value))
    }
  }
  
  trait Bezier extends StObject {
    
    def Bezier(v: js.Array[Double], k: Double): Double
    
    def CatmullRom(v: js.Array[Double], k: Double): Double
    
    def Linear(v: js.Array[Double], k: Double): Double
    
    var Utils: Bernstein
  }
  object Bezier {
    
    inline def apply(
      Bezier: (js.Array[Double], Double) => Double,
      CatmullRom: (js.Array[Double], Double) => Double,
      Linear: (js.Array[Double], Double) => Double,
      Utils: Bernstein
    ): Bezier = {
      val __obj = js.Dynamic.literal(Bezier = js.Any.fromFunction2(Bezier), CatmullRom = js.Any.fromFunction2(CatmullRom), Linear = js.Any.fromFunction2(Linear), Utils = Utils.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bezier]
    }
    
    extension [Self <: Bezier](x: Self) {
      
      inline def setBezier(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Bezier", js.Any.fromFunction2(value))
      
      inline def setCatmullRom(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "CatmullRom", js.Any.fromFunction2(value))
      
      inline def setLinear(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Linear", js.Any.fromFunction2(value))
      
      inline def setUtils(value: Bernstein): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    def In(amount: Double): Double
    
    def InOut(amount: Double): Double
    
    def Out(amount: Double): Double
  }
  object In {
    
    inline def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): In = {
      val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
      __obj.asInstanceOf[In]
    }
    
    extension [Self <: In](x: Self) {
      
      inline def setIn(value: Double => Double): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
      
      inline def setInOut(value: Double => Double): Self = StObject.set(x, "InOut", js.Any.fromFunction1(value))
      
      inline def setOut(value: Double => Double): Self = StObject.set(x, "Out", js.Any.fromFunction1(value))
    }
  }
  
  trait None extends StObject {
    
    def None(amount: Double): Double
  }
  object None {
    
    inline def apply(None: Double => Double): None = {
      val __obj = js.Dynamic.literal(None = js.Any.fromFunction1(None))
      __obj.asInstanceOf[None]
    }
    
    extension [Self <: None](x: Self) {
      
      inline def setNone(value: Double => Double): Self = StObject.set(x, "None", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofSequence extends StObject {
    
    /* static member */
    var _nextId: js.Any
    
    /* static member */
    def nextId(): Double
  }
  object TypeofSequence {
    
    inline def apply(_nextId: js.Any, nextId: () => Double): TypeofSequence = {
      val __obj = js.Dynamic.literal(_nextId = _nextId.asInstanceOf[js.Any], nextId = js.Any.fromFunction0(nextId))
      __obj.asInstanceOf[TypeofSequence]
    }
    
    extension [Self <: TypeofSequence](x: Self) {
      
      inline def setNextId(value: () => Double): Self = StObject.set(x, "nextId", js.Any.fromFunction0(value))
      
      inline def set_nextId(value: js.Any): Self = StObject.set(x, "_nextId", value.asInstanceOf[js.Any])
    }
  }
}
