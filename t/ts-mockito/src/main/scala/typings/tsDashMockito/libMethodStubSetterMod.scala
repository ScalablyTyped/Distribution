package typings.tsDashMockito

import typings.std.Error
import typings.tsDashMockito.libMethodToStubMod.MethodToStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubSetter", JSImport.Namespace)
@js.native
object libMethodStubSetterMod extends js.Object {
  @js.native
  class MethodStubSetter[T, ResolveType, RejectType] protected () extends js.Object {
    def this(methodToStub: MethodToStub) = this()
    var convertToPropertyIfIsNotAFunction: js.Any = js.native
    var groupIndex: js.Any = js.native
    var methodToStub: js.Any = js.native
    var thenDoNothing: js.Any = js.native
    def thenCall(func: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def thenReject(rest: Error*): this.type = js.native
    def thenResolve(rest: ResolveType*): this.type = js.native
    def thenReturn(rest: T*): this.type = js.native
    def thenThrow(rest: Error*): this.type = js.native
  }
  
  /* static members */
  @js.native
  object MethodStubSetter extends js.Object {
    var globalGroupIndex: js.Any = js.native
  }
  
}

