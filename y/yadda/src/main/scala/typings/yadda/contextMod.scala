package typings.yadda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("yadda/lib/Context", JSImport.Namespace)
  @js.native
  class ^ protected () extends Context {
    def this(properties: Properties) = this()
  }
  
  @js.native
  trait Context extends StObject {
    
    def merge(other: Properties): Context = js.native
    
    var properties: Properties = js.native
  }
  object Context {
    
    @scala.inline
    def apply(merge: Properties => Context, properties: Properties): Context = {
      val __obj = js.Dynamic.literal(merge = js.Any.fromFunction1(merge), properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: Properties => Context): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = StringDictionary[js.Any]
}
