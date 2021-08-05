package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TField extends StObject {
  
  var fid: Double
  
  var fname: String
  
  var ftype: Type
}
object TField {
  
  inline def apply(fid: Double, fname: String, ftype: Type): TField = {
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftype = ftype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TField]
  }
  
  extension [Self <: TField](x: Self) {
    
    inline def setFid(value: Double): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    inline def setFtype(value: Type): Self = StObject.set(x, "ftype", value.asInstanceOf[js.Any])
  }
}
