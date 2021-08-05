package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  var folder: scala.Double
  
  var invalid: scala.Double
  
  var ref: scala.Double
}
object Folder {
  
  inline def apply(folder: scala.Double, invalid: scala.Double, ref: scala.Double): Folder = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setFolder(value: scala.Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: scala.Double): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setRef(value: scala.Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
