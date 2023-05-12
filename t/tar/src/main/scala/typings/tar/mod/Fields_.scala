package typings.tar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields_ extends StObject {
  
  var cksum: Double
  
  var devmaj: Double
  
  var devmin: Double
  
  var fill: Double
  
  var gid: Double
  
  var gname: Double
  
  var linkpath: Double
  
  var mode: Double
  
  var mtime: Double
  
  var path: Double
  
  var prefix: Double
  
  var size: Double
  
  var `type`: Double
  
  var uid: Double
  
  var uname: Double
  
  var ustar: Double
  
  var ustarvar: Double
}
object Fields_ {
  
  inline def apply(
    cksum: Double,
    devmaj: Double,
    devmin: Double,
    fill: Double,
    gid: Double,
    gname: Double,
    linkpath: Double,
    mode: Double,
    mtime: Double,
    path: Double,
    prefix: Double,
    size: Double,
    `type`: Double,
    uid: Double,
    uname: Double,
    ustar: Double,
    ustarvar: Double
  ): Fields_ = {
    val __obj = js.Dynamic.literal(cksum = cksum.asInstanceOf[js.Any], devmaj = devmaj.asInstanceOf[js.Any], devmin = devmin.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], gname = gname.asInstanceOf[js.Any], linkpath = linkpath.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any], ustar = ustar.asInstanceOf[js.Any], ustarvar = ustarvar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fields_] (val x: Self) extends AnyVal {
    
    inline def setCksum(value: Double): Self = StObject.set(x, "cksum", value.asInstanceOf[js.Any])
    
    inline def setDevmaj(value: Double): Self = StObject.set(x, "devmaj", value.asInstanceOf[js.Any])
    
    inline def setDevmin(value: Double): Self = StObject.set(x, "devmin", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGname(value: Double): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
    
    inline def setLinkpath(value: Double): Self = StObject.set(x, "linkpath", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Double): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUname(value: Double): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
    
    inline def setUstar(value: Double): Self = StObject.set(x, "ustar", value.asInstanceOf[js.Any])
    
    inline def setUstarvar(value: Double): Self = StObject.set(x, "ustarvar", value.asInstanceOf[js.Any])
  }
}
