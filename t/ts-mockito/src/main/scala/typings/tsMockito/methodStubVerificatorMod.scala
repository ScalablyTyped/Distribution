package typings.tsMockito

import typings.tsMockito.methodToStubMod.MethodToStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodStubVerificatorMod {
  
  @JSImport("ts-mockito/lib/MethodStubVerificator", "MethodStubVerificator")
  @js.native
  class MethodStubVerificator[T] protected () extends StObject {
    def this(methodToVerify: MethodToStub) = this()
    
    def atLeast(value: Double): Unit = js.native
    
    def atMost(value: Double): Unit = js.native
    
    def called(): Unit = js.native
    
    def calledAfter(method: js.Any): Unit = js.native
    
    def calledBefore(method: js.Any): Unit = js.native
    
    var methodCallToStringConverter: js.Any = js.native
    
    var methodToVerify: js.Any = js.native
    
    def never(): Unit = js.native
    
    def once(): Unit = js.native
    
    def thrice(): Unit = js.native
    
    def times(value: Double): Unit = js.native
    
    def twice(): Unit = js.native
  }
}
