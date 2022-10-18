package typings.tsMockito

import typings.tsMockito.libMethodToStubMod.MethodToStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMethodStubSetterMod {
  
  @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter")
  @js.native
  open class MethodStubSetter[T, ResolveType, RejectType] protected () extends StObject {
    def this(methodToStub: MethodToStub) = this()
    
    /* private */ var convertToPropertyIfIsNotAFunction: Any = js.native
    
    /* private */ var groupIndex: Any = js.native
    
    /* private */ var methodToStub: Any = js.native
    
    def thenCall(func: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    
    /* private */ var thenDoNothing: Any = js.native
    
    def thenReject(rest: js.Error*): this.type = js.native
    
    def thenResolve(rest: ResolveType*): this.type = js.native
    
    def thenReturn(rest: T*): this.type = js.native
    
    def thenThrow(rest: js.Error*): this.type = js.native
  }
  /* static members */
  object MethodStubSetter {
    
    @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts-mockito/lib/MethodStubSetter", "MethodStubSetter.globalGroupIndex")
    @js.native
    def globalGroupIndex: Any = js.native
    inline def globalGroupIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalGroupIndex")(x.asInstanceOf[js.Any])
  }
}
