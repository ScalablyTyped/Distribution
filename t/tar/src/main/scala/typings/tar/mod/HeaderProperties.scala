package typings.tar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProperties extends StObject {
  
  var devmaj: js.UndefOr[Double] = js.undefined
  
  var devmin: js.UndefOr[Double] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var gname: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
  
  var mtime: js.UndefOr[Double] = js.undefined
  
  var noProprietary: js.UndefOr[Boolean] = js.undefined
  
  var path: String
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
  
  var uname: js.UndefOr[String] = js.undefined
}
object HeaderProperties {
  
  inline def apply(path: String): HeaderProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProperties]
  }
  
  extension [Self <: HeaderProperties](x: Self) {
    
    inline def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
    
    inline def setDevmajUndefined: Self = StObject.set(x, "devmaj", js.undefined)
    
    inline def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
    
    inline def setDevminUndefined: Self = StObject.set(x, "devmin", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
    
    inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setNoProprietary(value: Boolean): Self = StObject.set(x, "noProprietary", value.asInstanceOf[js.Any])
    
    inline def setNoProprietaryUndefined: Self = StObject.set(x, "noProprietary", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
    
    inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
  }
}
