package typings.tsMockito

import typings.tsMockito.methodActionMod.MethodAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argCaptorMod {
  
  @JSImport("ts-mockito/lib/capture/ArgCaptor", "ArgCaptor")
  @js.native
  class ArgCaptor protected () extends StObject {
    def this(actions: js.Array[MethodAction]) = this()
    
    /* private */ var actions: js.Any = js.native
    
    def beforeLast(): js.Any = js.native
    
    def byCallIndex(index: Double): js.Any = js.native
    
    def first(): js.Any = js.native
    
    def last(): js.Any = js.native
    
    def second(): js.Any = js.native
    
    def third(): js.Any = js.native
  }
  
  trait ArgCaptor1[T] extends StObject {
    
    def beforeLast(): js.Array[T]
    
    def byCallIndex(index: Double): js.Array[T]
    
    def first(): js.Array[T]
    
    def last(): js.Array[T]
    
    def second(): js.Array[T]
    
    def third(): js.Array[T]
  }
  object ArgCaptor1 {
    
    inline def apply[T](
      beforeLast: () => js.Array[T],
      byCallIndex: Double => js.Array[T],
      first: () => js.Array[T],
      last: () => js.Array[T],
      second: () => js.Array[T],
      third: () => js.Array[T]
    ): ArgCaptor1[T] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor1[T]]
    }
    
    extension [Self <: ArgCaptor1[?], T](x: Self & ArgCaptor1[T]) {
      
      inline def setBeforeLast(value: () => js.Array[T]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Array[T]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Array[T]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Array[T]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Array[T]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Array[T]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends StObject {
    
    def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
    def byCallIndex(index: Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
    def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
    def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
    def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    
    def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  }
  object ArgCaptor10 {
    
    inline def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
      beforeLast: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      byCallIndex: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      first: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      last: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      second: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9],
      third: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
    ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    }
    
    extension [Self <: ArgCaptor10[?, ?, ?, ?, ?, ?, ?, ?, ?, ?], T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](x: Self & (ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9])) {
      
      inline def setBeforeLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor2[T0, T1] extends StObject {
    
    def beforeLast(): js.Tuple2[T0, T1]
    
    def byCallIndex(index: Double): js.Tuple2[T0, T1]
    
    def first(): js.Tuple2[T0, T1]
    
    def last(): js.Tuple2[T0, T1]
    
    def second(): js.Tuple2[T0, T1]
    
    def third(): js.Tuple2[T0, T1]
  }
  object ArgCaptor2 {
    
    inline def apply[T0, T1](
      beforeLast: () => js.Tuple2[T0, T1],
      byCallIndex: Double => js.Tuple2[T0, T1],
      first: () => js.Tuple2[T0, T1],
      last: () => js.Tuple2[T0, T1],
      second: () => js.Tuple2[T0, T1],
      third: () => js.Tuple2[T0, T1]
    ): ArgCaptor2[T0, T1] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor2[T0, T1]]
    }
    
    extension [Self <: ArgCaptor2[?, ?], T0, T1](x: Self & (ArgCaptor2[T0, T1])) {
      
      inline def setBeforeLast(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple2[T0, T1]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple2[T0, T1]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor3[T0, T1, T2] extends StObject {
    
    def beforeLast(): js.Tuple3[T0, T1, T2]
    
    def byCallIndex(index: Double): js.Tuple3[T0, T1, T2]
    
    def first(): js.Tuple3[T0, T1, T2]
    
    def last(): js.Tuple3[T0, T1, T2]
    
    def second(): js.Tuple3[T0, T1, T2]
    
    def third(): js.Tuple3[T0, T1, T2]
  }
  object ArgCaptor3 {
    
    inline def apply[T0, T1, T2](
      beforeLast: () => js.Tuple3[T0, T1, T2],
      byCallIndex: Double => js.Tuple3[T0, T1, T2],
      first: () => js.Tuple3[T0, T1, T2],
      last: () => js.Tuple3[T0, T1, T2],
      second: () => js.Tuple3[T0, T1, T2],
      third: () => js.Tuple3[T0, T1, T2]
    ): ArgCaptor3[T0, T1, T2] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor3[T0, T1, T2]]
    }
    
    extension [Self <: ArgCaptor3[?, ?, ?], T0, T1, T2](x: Self & (ArgCaptor3[T0, T1, T2])) {
      
      inline def setBeforeLast(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple3[T0, T1, T2]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor4[T0, T1, T2, T3] extends StObject {
    
    def beforeLast(): js.Tuple4[T0, T1, T2, T3]
    
    def byCallIndex(index: Double): js.Tuple4[T0, T1, T2, T3]
    
    def first(): js.Tuple4[T0, T1, T2, T3]
    
    def last(): js.Tuple4[T0, T1, T2, T3]
    
    def second(): js.Tuple4[T0, T1, T2, T3]
    
    def third(): js.Tuple4[T0, T1, T2, T3]
  }
  object ArgCaptor4 {
    
    inline def apply[T0, T1, T2, T3](
      beforeLast: () => js.Tuple4[T0, T1, T2, T3],
      byCallIndex: Double => js.Tuple4[T0, T1, T2, T3],
      first: () => js.Tuple4[T0, T1, T2, T3],
      last: () => js.Tuple4[T0, T1, T2, T3],
      second: () => js.Tuple4[T0, T1, T2, T3],
      third: () => js.Tuple4[T0, T1, T2, T3]
    ): ArgCaptor4[T0, T1, T2, T3] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
    }
    
    extension [Self <: ArgCaptor4[?, ?, ?, ?], T0, T1, T2, T3](x: Self & (ArgCaptor4[T0, T1, T2, T3])) {
      
      inline def setBeforeLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple4[T0, T1, T2, T3]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor5[T0, T1, T2, T3, T4] extends StObject {
    
    def beforeLast(): js.Tuple5[T0, T1, T2, T3, T4]
    
    def byCallIndex(index: Double): js.Tuple5[T0, T1, T2, T3, T4]
    
    def first(): js.Tuple5[T0, T1, T2, T3, T4]
    
    def last(): js.Tuple5[T0, T1, T2, T3, T4]
    
    def second(): js.Tuple5[T0, T1, T2, T3, T4]
    
    def third(): js.Tuple5[T0, T1, T2, T3, T4]
  }
  object ArgCaptor5 {
    
    inline def apply[T0, T1, T2, T3, T4](
      beforeLast: () => js.Tuple5[T0, T1, T2, T3, T4],
      byCallIndex: Double => js.Tuple5[T0, T1, T2, T3, T4],
      first: () => js.Tuple5[T0, T1, T2, T3, T4],
      last: () => js.Tuple5[T0, T1, T2, T3, T4],
      second: () => js.Tuple5[T0, T1, T2, T3, T4],
      third: () => js.Tuple5[T0, T1, T2, T3, T4]
    ): ArgCaptor5[T0, T1, T2, T3, T4] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
    }
    
    extension [Self <: ArgCaptor5[?, ?, ?, ?, ?], T0, T1, T2, T3, T4](x: Self & (ArgCaptor5[T0, T1, T2, T3, T4])) {
      
      inline def setBeforeLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple5[T0, T1, T2, T3, T4]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor6[T0, T1, T2, T3, T4, T5] extends StObject {
    
    def beforeLast(): js.Tuple6[T0, T1, T2, T3, T4, T5]
    
    def byCallIndex(index: Double): js.Tuple6[T0, T1, T2, T3, T4, T5]
    
    def first(): js.Tuple6[T0, T1, T2, T3, T4, T5]
    
    def last(): js.Tuple6[T0, T1, T2, T3, T4, T5]
    
    def second(): js.Tuple6[T0, T1, T2, T3, T4, T5]
    
    def third(): js.Tuple6[T0, T1, T2, T3, T4, T5]
  }
  object ArgCaptor6 {
    
    inline def apply[T0, T1, T2, T3, T4, T5](
      beforeLast: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      byCallIndex: Double => js.Tuple6[T0, T1, T2, T3, T4, T5],
      first: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      last: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      second: () => js.Tuple6[T0, T1, T2, T3, T4, T5],
      third: () => js.Tuple6[T0, T1, T2, T3, T4, T5]
    ): ArgCaptor6[T0, T1, T2, T3, T4, T5] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
    }
    
    extension [Self <: ArgCaptor6[?, ?, ?, ?, ?, ?], T0, T1, T2, T3, T4, T5](x: Self & (ArgCaptor6[T0, T1, T2, T3, T4, T5])) {
      
      inline def setBeforeLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple6[T0, T1, T2, T3, T4, T5]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] extends StObject {
    
    def beforeLast(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    
    def byCallIndex(index: Double): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    
    def first(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    
    def last(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    
    def second(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    
    def third(): js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
  }
  object ArgCaptor7 {
    
    inline def apply[T0, T1, T2, T3, T4, T5, T6](
      beforeLast: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      byCallIndex: Double => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      first: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      last: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      second: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6],
      third: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
    }
    
    extension [Self <: ArgCaptor7[?, ?, ?, ?, ?, ?, ?], T0, T1, T2, T3, T4, T5, T6](x: Self & (ArgCaptor7[T0, T1, T2, T3, T4, T5, T6])) {
      
      inline def setBeforeLast(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple7[T0, T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] extends StObject {
    
    def beforeLast(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    
    def byCallIndex(index: Double): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    
    def first(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    
    def last(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    
    def second(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    
    def third(): js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
  }
  object ArgCaptor8 {
    
    inline def apply[T0, T1, T2, T3, T4, T5, T6, T7](
      beforeLast: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      byCallIndex: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      first: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      last: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      second: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7],
      third: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]
    ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
    }
    
    extension [Self <: ArgCaptor8[?, ?, ?, ?, ?, ?, ?, ?], T0, T1, T2, T3, T4, T5, T6, T7](x: Self & (ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7])) {
      
      inline def setBeforeLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple8[T0, T1, T2, T3, T4, T5, T6, T7]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
  
  trait ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] extends StObject {
    
    def beforeLast(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    
    def byCallIndex(index: Double): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    
    def first(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    
    def last(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    
    def second(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    
    def third(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  }
  object ArgCaptor9 {
    
    inline def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
      beforeLast: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      byCallIndex: Double => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      first: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      last: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      second: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8],
      third: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
    ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = {
      val __obj = js.Dynamic.literal(beforeLast = js.Any.fromFunction0(beforeLast), byCallIndex = js.Any.fromFunction1(byCallIndex), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), second = js.Any.fromFunction0(second), third = js.Any.fromFunction0(third))
      __obj.asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
    }
    
    extension [Self <: ArgCaptor9[?, ?, ?, ?, ?, ?, ?, ?, ?], T0, T1, T2, T3, T4, T5, T6, T7, T8](x: Self & (ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8])) {
      
      inline def setBeforeLast(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "beforeLast", js.Any.fromFunction0(value))
      
      inline def setByCallIndex(value: Double => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "byCallIndex", js.Any.fromFunction1(value))
      
      inline def setFirst(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setLast(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setSecond(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "second", js.Any.fromFunction0(value))
      
      inline def setThird(value: () => js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]): Self = StObject.set(x, "third", js.Any.fromFunction0(value))
    }
  }
}
