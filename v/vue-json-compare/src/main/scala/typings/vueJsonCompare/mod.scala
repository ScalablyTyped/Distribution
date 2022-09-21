package typings.vueJsonCompare

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-json-compare", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VueJsonCompare {
    
    /* CompleteClass */
    var newData: JsonObject = js.native
    
    /* CompleteClass */
    var oldData: JsonObject = js.native
  }
  
  type JsonObject = (Record[String, Any]) | (js.Array[Record[String, Any]])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue * / any */ trait VueJsonCompare extends StObject {
    
    var newData: JsonObject
    
    var oldData: JsonObject
  }
  object VueJsonCompare {
    
    inline def apply(newData: JsonObject, oldData: JsonObject): VueJsonCompare = {
      val __obj = js.Dynamic.literal(newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueJsonCompare]
    }
    
    extension [Self <: VueJsonCompare](x: Self) {
      
      inline def setNewData(value: JsonObject): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setNewDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "newData", js.Array(value*))
      
      inline def setOldData(value: JsonObject): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
      
      inline def setOldDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "oldData", js.Array(value*))
    }
  }
}
