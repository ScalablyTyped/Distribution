package typings.xelib

import typings.xelib.mod.Handle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: String
    
    var form_id: Double
    
    var group: Double
    
    var handle: Handle
    
    var path: String
    
    var signature: String
  }
  object Data {
    
    @scala.inline
    def apply(data: String, form_id: Double, group: Double, handle: Handle, path: String, signature: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], form_id = form_id.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm_id(value: Double): Self = StObject.set(x, "form_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandle(value: Handle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
