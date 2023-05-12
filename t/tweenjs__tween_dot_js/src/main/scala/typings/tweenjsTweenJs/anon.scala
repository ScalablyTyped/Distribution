package typings.tweenjsTweenJs

import typings.tweenjsTweenJs.mod.EasingFunctionGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bernstein] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bezier] (val x: Self) extends AnyVal {
      
      inline def setBezier(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Bezier", js.Any.fromFunction2(value))
      
      inline def setCatmullRom(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "CatmullRom", js.Any.fromFunction2(value))
      
      inline def setLinear(value: (js.Array[Double], Double) => Double): Self = StObject.set(x, "Linear", js.Any.fromFunction2(value))
      
      inline def setUtils(value: Bernstein): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup> */
  trait ReadonlyEasingFunctionGro extends StObject {
    
    def In(amount: Double): Double
    
    def InOut(amount: Double): Double
    
    def Out(amount: Double): Double
  }
  object ReadonlyEasingFunctionGro {
    
    inline def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): ReadonlyEasingFunctionGro = {
      val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
      __obj.asInstanceOf[ReadonlyEasingFunctionGro]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyEasingFunctionGro] (val x: Self) extends AnyVal {
      
      inline def setIn(value: Double => Double): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
      
      inline def setInOut(value: Double => Double): Self = StObject.set(x, "InOut", js.Any.fromFunction1(value))
      
      inline def setOut(value: Double => Double): Self = StObject.set(x, "Out", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup & {  None :@tweenjs/tween.js.@tweenjs/tween.js.EasingFunction}> */
  trait ReadonlyEasingFunctionGroIn extends StObject {
    
    def In(amount: Double): Double
    
    def InOut(amount: Double): Double
    
    def None(amount: Double): Double
    
    def Out(amount: Double): Double
  }
  object ReadonlyEasingFunctionGroIn {
    
    inline def apply(In: Double => Double, InOut: Double => Double, None: Double => Double, Out: Double => Double): ReadonlyEasingFunctionGroIn = {
      val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), None = js.Any.fromFunction1(None), Out = js.Any.fromFunction1(Out))
      __obj.asInstanceOf[ReadonlyEasingFunctionGroIn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyEasingFunctionGroIn] (val x: Self) extends AnyVal {
      
      inline def setIn(value: Double => Double): Self = StObject.set(x, "In", js.Any.fromFunction1(value))
      
      inline def setInOut(value: Double => Double): Self = StObject.set(x, "InOut", js.Any.fromFunction1(value))
      
      inline def setNone(value: Double => Double): Self = StObject.set(x, "None", js.Any.fromFunction1(value))
      
      inline def setOut(value: Double => Double): Self = StObject.set(x, "Out", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  Linear :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup & {  None :@tweenjs/tween.js.@tweenjs/tween.js.EasingFunction}>,   Quadratic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Cubic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quartic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Quintic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Sinusoidal :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Exponential :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Circular :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Elastic :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Back :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>,   Bounce :std.Readonly<@tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup>, generatePow (power : number | undefined): @tweenjs/tween.js.@tweenjs/tween.js.EasingFunctionGroup}> */
  @js.native
  trait ReadonlyLinearReadonlyEas extends StObject {
    
    val Back: ReadonlyEasingFunctionGro = js.native
    
    val Bounce: ReadonlyEasingFunctionGro = js.native
    
    val Circular: ReadonlyEasingFunctionGro = js.native
    
    val Cubic: ReadonlyEasingFunctionGro = js.native
    
    val Elastic: ReadonlyEasingFunctionGro = js.native
    
    val Exponential: ReadonlyEasingFunctionGro = js.native
    
    val Linear: ReadonlyEasingFunctionGroIn = js.native
    
    val Quadratic: ReadonlyEasingFunctionGro = js.native
    
    val Quartic: ReadonlyEasingFunctionGro = js.native
    
    val Quintic: ReadonlyEasingFunctionGro = js.native
    
    val Sinusoidal: ReadonlyEasingFunctionGro = js.native
    
    def generatePow(): EasingFunctionGroup = js.native
    def generatePow(power: Double): EasingFunctionGroup = js.native
  }
  
  trait TypeofSequence extends StObject {
    
    /* static member */
    var _nextId: Any
    
    /* static member */
    def nextId(): Double
  }
  object TypeofSequence {
    
    inline def apply(_nextId: Any, nextId: () => Double): TypeofSequence = {
      val __obj = js.Dynamic.literal(_nextId = _nextId.asInstanceOf[js.Any], nextId = js.Any.fromFunction0(nextId))
      __obj.asInstanceOf[TypeofSequence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofSequence] (val x: Self) extends AnyVal {
      
      inline def setNextId(value: () => Double): Self = StObject.set(x, "nextId", js.Any.fromFunction0(value))
      
      inline def set_nextId(value: Any): Self = StObject.set(x, "_nextId", value.asInstanceOf[js.Any])
    }
  }
}
