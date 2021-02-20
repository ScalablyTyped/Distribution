package typings.yawnYaml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMod {
  
  @JSImport("yawn-yaml/cjs", JSImport.Default)
  @js.native
  class default protected () extends YAWN {
    def this(content: String) = this()
  }
  
  @js.native
  trait YAWN extends StObject {
    
    def getRemark(path: String): String = js.native
    
    var json: js.Any = js.native
    
    def setRemark(path: String, remark: String): Boolean = js.native
    
    var yaml: String = js.native
  }
  object YAWN {
    
    @scala.inline
    def apply(getRemark: String => String, json: js.Any, setRemark: (String, String) => Boolean, yaml: String): YAWN = {
      val __obj = js.Dynamic.literal(getRemark = js.Any.fromFunction1(getRemark), json = json.asInstanceOf[js.Any], setRemark = js.Any.fromFunction2(setRemark), yaml = yaml.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAWN]
    }
    
    @scala.inline
    implicit class YAWNMutableBuilder[Self <: YAWN] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRemark(value: String => String): Self = StObject.set(x, "getRemark", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRemark(value: (String, String) => Boolean): Self = StObject.set(x, "setRemark", js.Any.fromFunction2(value))
      
      @scala.inline
      def setYaml(value: String): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
    }
  }
}
