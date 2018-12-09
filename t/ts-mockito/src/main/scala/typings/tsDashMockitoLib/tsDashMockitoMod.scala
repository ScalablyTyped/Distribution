package typings
package tsDashMockitoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito", JSImport.Namespace)
@js.native
object tsDashMockitoMod extends js.Object {
  val default: tsDashMockitoLib.Anon_Verify = js.native
  def anyFunction(): js.Any = js.native
  def anyNumber(): js.Any = js.native
  def anyOfClass[T](expectedClass: tsDashMockitoLib.Anon_Args[T]): js.Any = js.native
  def anyString(): js.Any = js.native
  def anything(): js.Any = js.native
  def between(min: scala.Double, max: scala.Double): js.Any = js.native
  def capture[T0](method: js.Function1[/* a */ T0, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor1[T0] = js.native
  def capture[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor2[T0, T1] = js.native
  def capture[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor3[T0, T1, T2] = js.native
  def capture[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor4[T0, T1, T2, T3] = js.native
  def capture[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor5[T0, T1, T2, T3, T4] = js.native
  def capture[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, _]): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor6[T0, T1, T2, T3, T4, T5] = js.native
  def capture[T0, T1, T2, T3, T4, T5, T6](
    method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, _]
  ): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = js.native
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
  ): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor8[T0, T1, T2, T3, T4, T5, T6, T7] = js.native
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
  ): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = js.native
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
  ): tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = js.native
  def deepEqual(expectedValue: js.Any): js.Any = js.native
  def instance[T](mockedValue: T): T = js.native
  def `match`(expectedValue: java.lang.String): js.Any = js.native
  def `match`(expectedValue: stdLib.RegExp): js.Any = js.native
  def mock[T](clazz: js.Function with js.Object): T = js.native
  def mock[T](clazz: tsDashMockitoLib.Anon_Args[T]): T = js.native
  def notNull(): js.Any = js.native
  def objectContaining(expectedValue: js.Object): js.Any = js.native
  def reset[T](mockedValue: T): scala.Unit = js.native
  def resetCalls[T](mockedValue: T): scala.Unit = js.native
  def spy[T](instanceToSpy: T): T = js.native
  def strictEqual(expectedValue: js.Any): js.Any = js.native
  def verify[T](method: T): tsDashMockitoLib.libMethodStubVerificatorMod.MethodStubVerificator[T] = js.native
  def when[T](method: T): tsDashMockitoLib.libMethodStubSetterMod.MethodStubSetter[T, scala.Unit, scala.Unit] = js.native
  def when[T](method: js.Promise[T]): tsDashMockitoLib.libMethodStubSetterMod.MethodStubSetter[js.Promise[T], T, _] = js.native
}

