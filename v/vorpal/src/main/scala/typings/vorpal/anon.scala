package typings.vorpal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(text: java.lang.String, texts: java.lang.String*): Unit = js.native
    
    def clear(): Unit = js.native
    
    def done(): Unit = js.native
  }
  
  trait Data extends StObject {
    
    def data(): js.Promise[js.Array[java.lang.String]]
  }
  object Data {
    
    inline def apply(data: () => js.Promise[js.Array[java.lang.String]]): Data = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data))
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: () => js.Promise[js.Array[java.lang.String]]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
    }
  }
  
  trait String extends StObject {
    
    var string: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  object String {
    
    inline def apply(): String = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[String]
    }
    
    extension [Self <: String](x: Self) {
      
      inline def setString(value: js.Array[java.lang.String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: java.lang.String*): Self = StObject.set(x, "string", js.Array(value*))
    }
  }
}
