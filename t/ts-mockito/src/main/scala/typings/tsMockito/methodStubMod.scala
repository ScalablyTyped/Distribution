package typings.tsMockito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodStubMod {
  
  @js.native
  trait MethodStub extends StObject {
    
    def execute(args: js.Array[_]): Unit = js.native
    
    def getGroupIndex(): Double = js.native
    
    def getValue(): js.Any = js.native
    
    def isApplicable(args: js.Array[_]): Boolean = js.native
  }
  object MethodStub {
    
    @scala.inline
    def apply(
      execute: js.Array[_] => Unit,
      getGroupIndex: () => Double,
      getValue: () => js.Any,
      isApplicable: js.Array[_] => Boolean
    ): MethodStub = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getGroupIndex = js.Any.fromFunction0(getGroupIndex), getValue = js.Any.fromFunction0(getValue), isApplicable = js.Any.fromFunction1(isApplicable))
      __obj.asInstanceOf[MethodStub]
    }
    
    @scala.inline
    implicit class MethodStubMutableBuilder[Self <: MethodStub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: js.Array[_] => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetGroupIndex(value: () => Double): Self = StObject.set(x, "getGroupIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsApplicable(value: js.Array[_] => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction1(value))
    }
  }
}
