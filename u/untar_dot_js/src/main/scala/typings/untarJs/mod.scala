package typings.untarJs

import typings.untarJs.untarJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("untar.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def untar(buffer: js.typedarray.ArrayBuffer): js.Array[TarLocalFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("untar")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[TarLocalFile]]
  
  trait TarLocalFile extends StObject {
    
    val chksum: String
    
    val devmajor: js.UndefOr[String] = js.undefined
    
    val devminor: js.UndefOr[String] = js.undefined
    
    val fileData: js.typedarray.Uint8Array
    
    val filename: String
    
    val gid: String
    
    val gname: js.UndefOr[String] = js.undefined
    
    val isValid: `true`
    
    val linkname: String
    
    val maybeMagic: String
    
    val mode: String
    
    val mtime: String
    
    val name: String
    
    val prefix: js.UndefOr[String] = js.undefined
    
    val size: Double
    
    val typeflag: String
    
    val uid: String
    
    val uname: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object TarLocalFile {
    
    inline def apply(
      chksum: String,
      fileData: js.typedarray.Uint8Array,
      filename: String,
      gid: String,
      linkname: String,
      maybeMagic: String,
      mode: String,
      mtime: String,
      name: String,
      size: Double,
      typeflag: String,
      uid: String
    ): TarLocalFile = {
      val __obj = js.Dynamic.literal(chksum = chksum.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isValid = true, linkname = linkname.asInstanceOf[js.Any], maybeMagic = maybeMagic.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], typeflag = typeflag.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TarLocalFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TarLocalFile] (val x: Self) extends AnyVal {
      
      inline def setChksum(value: String): Self = StObject.set(x, "chksum", value.asInstanceOf[js.Any])
      
      inline def setDevmajor(value: String): Self = StObject.set(x, "devmajor", value.asInstanceOf[js.Any])
      
      inline def setDevmajorUndefined: Self = StObject.set(x, "devmajor", js.undefined)
      
      inline def setDevminor(value: String): Self = StObject.set(x, "devminor", value.asInstanceOf[js.Any])
      
      inline def setDevminorUndefined: Self = StObject.set(x, "devminor", js.undefined)
      
      inline def setFileData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      inline def setIsValid(value: `true`): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setLinkname(value: String): Self = StObject.set(x, "linkname", value.asInstanceOf[js.Any])
      
      inline def setMaybeMagic(value: String): Self = StObject.set(x, "maybeMagic", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTypeflag(value: String): Self = StObject.set(x, "typeflag", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
