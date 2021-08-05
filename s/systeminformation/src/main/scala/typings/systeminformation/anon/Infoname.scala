package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Infoname extends StObject {
  
  var info_name: java.lang.String
  
  var name: java.lang.String
  
  var protocol: java.lang.String
  
  var `type`: java.lang.String
}
object Infoname {
  
  inline def apply(
    info_name: java.lang.String,
    name: java.lang.String,
    protocol: java.lang.String,
    `type`: java.lang.String
  ): Infoname = {
    val __obj = js.Dynamic.literal(info_name = info_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infoname]
  }
  
  extension [Self <: Infoname](x: Self) {
    
    inline def setInfo_name(value: java.lang.String): Self = StObject.set(x, "info_name", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
