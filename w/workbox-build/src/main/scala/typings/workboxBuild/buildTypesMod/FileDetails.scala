package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDetails extends StObject {
  
  var file: String
  
  var hash: String
  
  var size: Double
}
object FileDetails {
  
  inline def apply(file: String, hash: String, size: Double): FileDetails = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDetails] (val x: Self) extends AnyVal {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
