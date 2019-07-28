package typings.tsDashMockito

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import typings.std.RegExp
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor1
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor10
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor2
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor3
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor4
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor5
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor6
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor7
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor8
import typings.tsDashMockito.libCaptureArgCaptorMod.ArgCaptor9
import typings.tsDashMockito.libMethodStubSetterMod.MethodStubSetter
import typings.tsDashMockito.libMethodStubVerificatorMod.MethodStubVerificator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito", JSImport.Namespace)
@js.native
object tsDashMockitoMod extends js.Object {
  def anyFunction(): js.Any = js.native
  def anyNumber(): js.Any = js.native
  def anyOfClass[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): js.Any = js.native
  def anyString(): js.Any = js.native
  def anything(): js.Any = js.native
  def between(min: Double, max: Double): js.Any = js.native
  def capture[T0](method: js.Function1[/* a */ T0, _]): ArgCaptor1[T0] = js.native
  def capture[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, _]): ArgCaptor2[T0, T1] = js.native
  def capture[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, _]): ArgCaptor3[T0, T1, T2] = js.native
  def capture[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, _]): ArgCaptor4[T0, T1, T2, T3] = js.native
  def capture[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, _]): ArgCaptor5[T0, T1, T2, T3, T4] = js.native
  def capture[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, _]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = js.native
  def capture[T0, T1, T2, T3, T4, T5, T6](
    method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, _]
  ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = js.native
  def capture[T0, T1, T2, T3, T4, T5, T6, T7](
    method: js.Function8[
      /* a */ T0, 
      /* b */ T1, 
      /* c */ T2, 
      /* d */ T3, 
      /* e */ T4, 
      /* f */ T5, 
      /* g */ T6, 
      /* h */ T7, 
      _
    ]
  ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
  def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8](
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
      _
    ]
  ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
  def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
      _
    ]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def deepEqual(expectedValue: js.Any): js.Any = js.native
  def instance[T](mockedValue: T): T = js.native
  def `match`(expectedValue: String): js.Any = js.native
  def `match`(expectedValue: RegExp): js.Any = js.native
  def mock[T](): T = js.native
  def mock[T](clazz: js.Function with js.Object): T = js.native
  def mock[T](clazz: js.Any): T = js.native
  def mock[T](clazz: Instantiable1[/* args (repeated) */ js.Any, T]): T = js.native
  def notNull(): js.Any = js.native
  def objectContaining(expectedValue: js.Object): js.Any = js.native
  def reset[T](mockedValue: T): Unit = js.native
  def resetCalls[T](mockedValue: T): Unit = js.native
  def spy[T](instanceToSpy: T): T = js.native
  def strictEqual(expectedValue: js.Any): js.Any = js.native
  def verify[T](method: T): MethodStubVerificator[T] = js.native
  def when[T](method: T): MethodStubSetter[T, Unit, Error] = js.native
  def when[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, Error] = js.native
  @js.native
  object default extends js.Object {
    @JSName("anyFunction")
    var anyFunction_Original: js.Function0[_] = js.native
    @JSName("anyNumber")
    var anyNumber_Original: js.Function0[_] = js.native
    @JSName("anyOfClass")
    var anyOfClass_Original: Fn_ArgsExpectedClass = js.native
    @JSName("anyString")
    var anyString_Original: js.Function0[_] = js.native
    @JSName("anything")
    var anything_Original: js.Function0[_] = js.native
    @JSName("between")
    var between_Original: js.Function2[/* min */ Double, /* max */ Double, _] = js.native
    @JSName("capture")
    var capture_Original: Fn_A = js.native
    @JSName("deepEqual")
    var deepEqual_Original: js.Function1[/* expectedValue */ js.Any, _] = js.native
    @JSName("instance")
    var instance_Original: Fn_MockedValue = js.native
    @JSName("match")
    var match_Original: js.Function1[/* expectedValue */ RegExp | String, _] = js.native
    @JSName("mock")
    var mock_Original: Fn_Args = js.native
    @JSName("notNull")
    var notNull_Original: js.Function0[_] = js.native
    @JSName("objectContaining")
    var objectContaining_Original: js.Function1[/* expectedValue */ js.Object, _] = js.native
    @JSName("resetCalls")
    var resetCalls_Original: Fn_MockedValueT = js.native
    @JSName("reset")
    var reset_Original: Fn_MockedValueT = js.native
    @JSName("spy")
    var spy_Original: Fn_InstanceToSpy = js.native
    @JSName("strictEqual")
    var strictEqual_Original: js.Function1[/* expectedValue */ js.Any, _] = js.native
    @JSName("verify")
    var verify_Original: Fn_Method = js.native
    @JSName("when")
    var when_Original: Fn_MethodError = js.native
    def anyFunction(): js.Any = js.native
    def anyNumber(): js.Any = js.native
    def anyOfClass[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): js.Any = js.native
    def anyString(): js.Any = js.native
    def anything(): js.Any = js.native
    def between(min: Double, max: Double): js.Any = js.native
    def capture[T0](method: js.Function1[/* a */ T0, _]): ArgCaptor1[T0] = js.native
    def capture[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, _]): ArgCaptor2[T0, T1] = js.native
    def capture[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, _]): ArgCaptor3[T0, T1, T2] = js.native
    def capture[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, _]): ArgCaptor4[T0, T1, T2, T3] = js.native
    def capture[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, _]): ArgCaptor5[T0, T1, T2, T3, T4] = js.native
    def capture[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, _]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = js.native
    def capture[T0, T1, T2, T3, T4, T5, T6](
      method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, _]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = js.native
    def capture[T0, T1, T2, T3, T4, T5, T6, T7](
      method: js.Function8[
          /* a */ T0, 
          /* b */ T1, 
          /* c */ T2, 
          /* d */ T3, 
          /* e */ T4, 
          /* f */ T5, 
          /* g */ T6, 
          /* h */ T7, 
          _
        ]
    ): ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
    def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8](
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
          _
        ]
    ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
    def capture[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
          _
        ]
    ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
    def deepEqual(expectedValue: js.Any): js.Any = js.native
    def instance[T](mockedValue: T): T = js.native
    def `match`(expectedValue: String): js.Any = js.native
    def `match`(expectedValue: RegExp): js.Any = js.native
    def mock[T](): T = js.native
    def mock[T](clazz: js.Function with js.Object): T = js.native
    def mock[T](clazz: js.Any): T = js.native
    def mock[T](clazz: Instantiable1[/* args (repeated) */ js.Any, T]): T = js.native
    def notNull(): js.Any = js.native
    def objectContaining(expectedValue: js.Object): js.Any = js.native
    def reset[T](mockedValue: T): Unit = js.native
    def resetCalls[T](mockedValue: T): Unit = js.native
    def spy[T](instanceToSpy: T): T = js.native
    def strictEqual(expectedValue: js.Any): js.Any = js.native
    def verify[T](method: T): MethodStubVerificator[T] = js.native
    def when[T](method: T): MethodStubSetter[T, Unit, Error] = js.native
    def when[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, Error] = js.native
  }
  
}

