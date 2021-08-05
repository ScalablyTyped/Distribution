package typings.stripe.anon

import typings.node.Buffer
import typings.stripe.stripeStrings.`applicationSlashoctet-stream`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: String | Buffer
  
  var name: String
  
  var `type`: String | `applicationSlashoctet-stream`
}
object Data {
  
  inline def apply(data: String | Buffer, name: String, `type`: String | `applicationSlashoctet-stream`): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String | `applicationSlashoctet-stream`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
