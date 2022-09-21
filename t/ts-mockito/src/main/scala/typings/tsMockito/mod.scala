package typings.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typings.tsMockito.anon.Fn0
import typings.tsMockito.anon.Fn1
import typings.tsMockito.anon.FnCall
import typings.tsMockito.anon.FnCallClazz
import typings.tsMockito.anon.FnCallExpectedClass
import typings.tsMockito.anon.FnCallMethod
import typings.tsMockito.anon.FnCallMockedValues
import typings.tsMockito.argCaptorMod.ArgCaptor1
import typings.tsMockito.argCaptorMod.ArgCaptor10
import typings.tsMockito.argCaptorMod.ArgCaptor2
import typings.tsMockito.argCaptorMod.ArgCaptor3
import typings.tsMockito.argCaptorMod.ArgCaptor4
import typings.tsMockito.argCaptorMod.ArgCaptor5
import typings.tsMockito.argCaptorMod.ArgCaptor6
import typings.tsMockito.argCaptorMod.ArgCaptor7
import typings.tsMockito.argCaptorMod.ArgCaptor8
import typings.tsMockito.argCaptorMod.ArgCaptor9
import typings.tsMockito.methodStubSetterMod.MethodStubSetter
import typings.tsMockito.methodStubVerificatorMod.MethodStubVerificator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-mockito", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("ts-mockito", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def anyFunction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyFunction")().asInstanceOf[Any]
    @JSImport("ts-mockito", "default.anyFunction")
    @js.native
    def anyFunction_Fdefault: js.Function0[Any] = js.native
    
    inline def anyFunction_Fdefault_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anyFunction")(x.asInstanceOf[js.Any])
    
    inline def anyNumber(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyNumber")().asInstanceOf[Any]
    @JSImport("ts-mockito", "default.anyNumber")
    @js.native
    def anyNumber_Fdefault: js.Function0[Any] = js.native
    
    inline def anyNumber_Fdefault_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anyNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.anyOfClass")
    @js.native
    def anyOfClass: FnCallExpectedClass = js.native
    inline def anyOfClass[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOfClass")(expectedClass.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def anyOfClass_=(x: FnCallExpectedClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anyOfClass")(x.asInstanceOf[js.Any])
    
    inline def anyString(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyString")().asInstanceOf[Any]
    @JSImport("ts-mockito", "default.anyString")
    @js.native
    def anyString_Fdefault: js.Function0[Any] = js.native
    
    inline def anyString_Fdefault_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anyString")(x.asInstanceOf[js.Any])
    
    inline def anything(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[Any]
    @JSImport("ts-mockito", "default.anything")
    @js.native
    def anything_Fdefault: js.Function0[Any] = js.native
    
    inline def anything_Fdefault_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anything")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.between")
    @js.native
    def between: js.Function2[/* min */ Double, /* max */ Double, Any] = js.native
    inline def between(min: Double, max: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def between_=(x: js.Function2[/* min */ Double, /* max */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("between")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.capture")
    @js.native
    def capture: Fn1 = js.native
    inline def capture[T0](method: js.Function1[/* a */ T0, Any]): ArgCaptor1[T0] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor1[T0]]
    inline def capture[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, Any]): ArgCaptor2[T0, T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor2[T0, T1]]
    inline def capture[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, Any]): ArgCaptor3[T0, T1, T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor3[T0, T1, T2]]
    inline def capture[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, Any]): ArgCaptor4[T0, T1, T2, T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
    inline def capture[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, Any]): ArgCaptor5[T0, T1, T2, T3, T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
    inline def capture[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, Any]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
    inline def capture[T0, T1, T2, T3, T4, T5, T6](
      method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, Any]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
    inline def capture[T0, T1, T2, T3, T4, T5, T6, T7](
      method: js.Function8[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          Any
        ]
    ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
    inline def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8](
      method: js.Function9[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          /* i */ T8, 
          Any
        ]
    ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
    inline def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
      method: js.Function10[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          /* i */ T8, 
          /* j */ T9, 
          Any
        ]
    ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
    inline def capture_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capture")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.deepEqual")
    @js.native
    def deepEqual: FnCall = js.native
    inline def deepEqual[T](expectedValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def deepEqual_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.instance")
    @js.native
    def instance: FnCall = js.native
    inline def instance[T](expectedValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def instance_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.match")
    @js.native
    val `match`: js.Function1[/* expectedValue */ js.RegExp | String, Any] = js.native
    inline def `match`(expectedValue: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def `match`(expectedValue: js.RegExp): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def mock[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")().asInstanceOf[T]
    inline def mock[T](clazz: js.Function & js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def mock[T](clazz: Instantiable1[/* args (repeated) */ Any, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def mock[T](clazz: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
    @JSImport("ts-mockito", "default.mock")
    @js.native
    def mock_Fdefault: FnCallClazz = js.native
    
    inline def mock_Fdefault_=(x: FnCallClazz): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mock")(x.asInstanceOf[js.Any])
    
    inline def notNull(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("notNull")().asInstanceOf[Any]
    @JSImport("ts-mockito", "default.notNull")
    @js.native
    def notNull_Fdefault: js.Function0[Any] = js.native
    
    inline def notNull_Fdefault_=(x: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notNull")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.objectContaining")
    @js.native
    def objectContaining: js.Function1[/* expectedValue */ js.Object, Any] = js.native
    inline def objectContaining(expectedValue: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def objectContaining_=(x: js.Function1[/* expectedValue */ js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectContaining")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.reset")
    @js.native
    def reset: FnCallMockedValues = js.native
    inline def reset[T](mockedValues: T*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(mockedValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    @JSImport("ts-mockito", "default.resetCalls")
    @js.native
    def resetCalls: FnCallMockedValues = js.native
    inline def resetCalls[T](mockedValues: T*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCalls")(mockedValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def resetCalls_=(x: FnCallMockedValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetCalls")(x.asInstanceOf[js.Any])
    
    inline def reset_=(x: FnCallMockedValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.spy")
    @js.native
    def spy: FnCall = js.native
    inline def spy[T](expectedValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def spy_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spy")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.strictEqual")
    @js.native
    def strictEqual: js.Function1[/* expectedValue */ Any, Any] = js.native
    inline def strictEqual(expectedValue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def strictEqual_=(x: js.Function1[/* expectedValue */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.verify")
    @js.native
    def verify: FnCallMethod = js.native
    inline def verify[T](method: T): MethodStubVerificator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubVerificator[T]]
    inline def verify_=(x: FnCallMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verify")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-mockito", "default.when")
    @js.native
    def when: Fn0 = js.native
    inline def when[T](method: T): MethodStubSetter[T, Unit, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubSetter[T, Unit, js.Error]]
    inline def when[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubSetter[js.Promise[T], T, js.Error]]
    inline def when_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("when")(x.asInstanceOf[js.Any])
  }
  
  inline def anyFunction(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyFunction")().asInstanceOf[Any]
  
  inline def anyNumber(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyNumber")().asInstanceOf[Any]
  
  inline def anyOfClass[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOfClass")(expectedClass.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def anyString(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anyString")().asInstanceOf[Any]
  
  inline def anything(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[Any]
  
  inline def between(min: Double, max: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def capture[T0](method: js.Function1[/* a */ T0, Any]): ArgCaptor1[T0] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor1[T0]]
  inline def capture[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, Any]): ArgCaptor2[T0, T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor2[T0, T1]]
  inline def capture[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, Any]): ArgCaptor3[T0, T1, T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor3[T0, T1, T2]]
  inline def capture[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, Any]): ArgCaptor4[T0, T1, T2, T3] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor4[T0, T1, T2, T3]]
  inline def capture[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, Any]): ArgCaptor5[T0, T1, T2, T3, T4] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor5[T0, T1, T2, T3, T4]]
  inline def capture[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, Any]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor6[T0, T1, T2, T3, T4, T5]]
  inline def capture[T0, T1, T2, T3, T4, T5, T6](
    method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, Any]
  ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor7[T0, T1, T2, T3, T4, T5, T6]]
  inline def capture[T0, T1, T2, T3, T4, T5, T6, T7](
    method: js.Function8[
      /* a */ T0, 
      /* b */ T1, 
      /* c */ T2, 
      /* d */ T3, 
      /* e */ T4, 
      /* f */ T5, 
      /* g */ T6, 
      /* h */ T7, 
      Any
    ]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7]]
  inline def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8](
    method: js.Function9[
      /* a */ T0, 
      /* b */ T1, 
      /* c */ T2, 
      /* d */ T3, 
      /* e */ T4, 
      /* f */ T5, 
      /* g */ T6, 
      /* h */ T7, 
      /* i */ T8, 
      Any
    ]
  ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
  inline def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    method: js.Function10[
      /* a */ T0, 
      /* b */ T1, 
      /* c */ T2, 
      /* d */ T3, 
      /* e */ T4, 
      /* f */ T5, 
      /* g */ T6, 
      /* h */ T7, 
      /* i */ T8, 
      /* j */ T9, 
      Any
    ]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = ^.asInstanceOf[js.Dynamic].applyDynamic("capture")(method.asInstanceOf[js.Any]).asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  
  inline def deepEqual[T](expectedValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def instance[T](mockedValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(mockedValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def `match`(expectedValue: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def `match`(expectedValue: js.RegExp): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mock[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")().asInstanceOf[T]
  inline def mock[T](clazz: js.Function & js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def mock[T](clazz: Instantiable1[/* args (repeated) */ Any, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def mock[T](clazz: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(clazz.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def notNull(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("notNull")().asInstanceOf[Any]
  
  inline def objectContaining(expectedValue: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("objectContaining")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def reset[T](mockedValues: T*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(mockedValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def resetCalls[T](mockedValues: T*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCalls")(mockedValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def spy[T](instanceToSpy: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(instanceToSpy.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def strictEqual(expectedValue: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(expectedValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def verify[T](method: T): MethodStubVerificator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubVerificator[T]]
  
  inline def when[T](method: T): MethodStubSetter[T, Unit, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubSetter[T, Unit, js.Error]]
  inline def when[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(method.asInstanceOf[js.Any]).asInstanceOf[MethodStubSetter[js.Promise[T], T, js.Error]]
}
