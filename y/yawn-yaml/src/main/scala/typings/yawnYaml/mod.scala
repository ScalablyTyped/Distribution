package typings.yawnYaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yawn-yaml", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with YAWN {
    def this(content: String) = this()
    
    /* CompleteClass */
    override def getRemark(path: String): String = js.native
    
    /* CompleteClass */
    var json: Any = js.native
    
    /* CompleteClass */
    override def setRemark(path: String, remark: String): Boolean = js.native
    
    /* CompleteClass */
    var yaml: String = js.native
  }
  
  trait YAWN extends StObject {
    
    def getRemark(path: String): String
    
    var json: Any
    
    def setRemark(path: String, remark: String): Boolean
    
    var yaml: String
  }
  object YAWN {
    
    inline def apply(getRemark: String => String, json: Any, setRemark: (String, String) => Boolean, yaml: String): YAWN = {
      val __obj = js.Dynamic.literal(getRemark = js.Any.fromFunction1(getRemark), json = json.asInstanceOf[js.Any], setRemark = js.Any.fromFunction2(setRemark), yaml = yaml.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAWN]
    }
    
    extension [Self <: YAWN](x: Self) {
      
      inline def setGetRemark(value: String => String): Self = StObject.set(x, "getRemark", js.Any.fromFunction1(value))
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setSetRemark(value: (String, String) => Boolean): Self = StObject.set(x, "setRemark", js.Any.fromFunction2(value))
      
      inline def setYaml(value: String): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
    }
  }
}
