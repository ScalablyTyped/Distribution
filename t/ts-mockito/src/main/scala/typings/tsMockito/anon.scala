package typings.tsMockito

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](method: T): MethodStubSetter[T, Unit, Error] = js.native
    def apply[T](method: js.Promise[T]): MethodStubSetter[js.Promise[T], T, Error] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T0](method: js.Function1[/* a */ T0, _]): ArgCaptor1[T0] = js.native
    def apply[T0, T1](method: js.Function2[/* a */ T0, /* b */ T1, _]): ArgCaptor2[T0, T1] = js.native
    def apply[T0, T1, T2](method: js.Function3[/* a */ T0, /* b */ T1, /* c */ T2, _]): ArgCaptor3[T0, T1, T2] = js.native
    def apply[T0, T1, T2, T3](method: js.Function4[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, _]): ArgCaptor4[T0, T1, T2, T3] = js.native
    def apply[T0, T1, T2, T3, T4](method: js.Function5[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, _]): ArgCaptor5[T0, T1, T2, T3, T4] = js.native
    def apply[T0, T1, T2, T3, T4, T5](method: js.Function6[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, _]): ArgCaptor6[T0, T1, T2, T3, T4, T5] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6](
      method: js.Function7[/* a */ T0, /* b */ T1, /* c */ T2, /* d */ T3, /* e */ T4, /* f */ T5, /* g */ T6, _]
    ): ArgCaptor7[T0, T1, T2, T3, T4, T5, T6] = js.native
    def apply[T0, T1, T2, T3, T4, T5, T6, T7](
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
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
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
    def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
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
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](expectedValue: T): T = js.native
  }
  
  @js.native
  trait FnCallClazz extends StObject {
    
    def apply[T](): T = js.native
    def apply[T](clazz: js.Function with js.Object): T = js.native
    def apply[T](clazz: js.Any): T = js.native
    def apply[T](clazz: Instantiable1[/* args (repeated) */ js.Any, T]): T = js.native
  }
  
  @js.native
  trait FnCallExpectedClass extends StObject {
    
    def apply[T](expectedClass: Instantiable1[/* args (repeated) */ js.Any, T]): js.Any = js.native
  }
  
  @js.native
  trait FnCallMethod extends StObject {
    
    def apply[T](method: T): MethodStubVerificator[T] = js.native
  }
  
  @js.native
  trait FnCallMockedValues extends StObject {
    
    def apply[T](mockedValues: T*): Unit = js.native
  }
}
