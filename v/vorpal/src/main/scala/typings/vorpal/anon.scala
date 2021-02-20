package typings.vorpal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(text: java.lang.String, texts: java.lang.String*): Unit = js.native
    
    def clear(): Unit = js.native
    
    def done(): Unit = js.native
  }
  
  @js.native
  trait Data extends StObject {
    
    def data(): js.Promise[js.Array[java.lang.String]] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: () => js.Promise[js.Array[java.lang.String]]): Data = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data))
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: () => js.Promise[js.Array[java.lang.String]]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait String extends StObject {
    
    var string: js.UndefOr[js.Array[java.lang.String]] = js.native
  }
  object String {
    
    @scala.inline
    def apply(): String = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: js.Array[java.lang.String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: java.lang.String*): Self = StObject.set(x, "string", js.Array(value :_*))
    }
  }
}
