package typings.three.fflateModuleMinMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipAttributes extends StObject {
  
  /**
    * The file's attributes. These are traditionally somewhat complicated
    * and platform-dependent, so using them is scarcely necessary. However,
    * here is a representation of what this is, bit by bit:
    *
    * `TTTTugtrwxrwxrwx0000000000ADVSHR`
    *
    * TTTT = file type (rarely useful)
    *
    * u = setuid, g = setgid, t = sticky
    *
    * rwx = user permissions, rwx = group permissions, rwx = other permissions
    *
    * 0000000000 = unused
    *
    * A = archive, D = directory, V = volume label, S = system file, H = hidden, R = read-only
    *
    * If you want to set the Unix permissions, for instance, just bit shift by 16, e.g. 0644 << 16
    */
  var attrs: js.UndefOr[Double] = js.undefined
  
  /**
    * The comment to attach to the file. This field is defined by PKZIP's APPNOTE.txt,
    * section 4.4.26. The comment must be at most 65,535 bytes long UTF-8 encoded. This
    * field is not read by consumer software.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Extra metadata to add to the file. This field is defined by PKZIP's APPNOTE.txt,
    * section 4.4.28. At most 65,535 bytes may be used in each ID. The ID must be an
    * integer between 0 and 65,535, inclusive.
    *
    * This field is incredibly rare and almost never needed except for compliance with
    * proprietary standards and software.
    */
  var extra: js.UndefOr[Record[Double, js.typedarray.Uint8Array]] = js.undefined
  
  /**
    * When the file was last modified. Defaults to the current time.
    */
  var mtime: js.UndefOr[js.Date | String | Double] = js.undefined
  
  /**
    * The operating system of origin for this file. The value is defined
    * by PKZIP's APPNOTE.txt, section 4.4.2.2. For example, 0 (the default)
    * is MS/DOS, 3 is UNIX, 19 is macOS.
    */
  var os: js.UndefOr[Double] = js.undefined
}
object ZipAttributes {
  
  inline def apply(): ZipAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipAttributes]
  }
  
  extension [Self <: ZipAttributes](x: Self) {
    
    inline def setAttrs(value: Double): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setExtra(value: Record[Double, js.typedarray.Uint8Array]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setMtime(value: js.Date | String | Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setOs(value: Double): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
  }
}
