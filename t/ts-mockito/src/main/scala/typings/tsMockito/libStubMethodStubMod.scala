package typings.tsMockito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStubMethodStubMod {
  
  trait MethodStub extends StObject {
    
    def execute(args: js.Array[Any]): Unit
    
    def getGroupIndex(): Double
    
    def getValue(): Any
    
    def isApplicable(args: js.Array[Any]): Boolean
  }
  object MethodStub {
    
    inline def apply(
      execute: js.Array[Any] => Unit,
      getGroupIndex: () => Double,
      getValue: () => Any,
      isApplicable: js.Array[Any] => Boolean
    ): MethodStub = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getGroupIndex = js.Any.fromFunction0(getGroupIndex), getValue = js.Any.fromFunction0(getValue), isApplicable = js.Any.fromFunction1(isApplicable))
      __obj.asInstanceOf[MethodStub]
    }
    
    extension [Self <: MethodStub](x: Self) {
      
      inline def setExecute(value: js.Array[Any] => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setGetGroupIndex(value: () => Double): Self = StObject.set(x, "getGroupIndex", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIsApplicable(value: js.Array[Any] => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction1(value))
    }
  }
}
