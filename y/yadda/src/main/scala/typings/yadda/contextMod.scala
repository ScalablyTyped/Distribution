package typings.yadda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("yadda/lib/Context", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Context {
    def this(properties: Properties) = this()
    
    /* CompleteClass */
    override def merge(other: Properties): Context = js.native
    
    /* CompleteClass */
    var properties: Properties = js.native
  }
  
  trait Context extends StObject {
    
    def merge(other: Properties): Context
    
    var properties: Properties
  }
  object Context {
    
    inline def apply(merge: Properties => Context, properties: Properties): Context = {
      val __obj = js.Dynamic.literal(merge = js.Any.fromFunction1(merge), properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setMerge(value: Properties => Context): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = StringDictionary[Any]
}
