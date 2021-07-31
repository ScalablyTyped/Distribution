package typings.wechatMiniprogram.ICloud

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: CDN ===
trait CDN extends StObject {
  
  var target: String | ArrayBuffer | ICDNFilePathSpec
}
object CDN {
  
  @scala.inline
  def apply(target: String | ArrayBuffer | ICDNFilePathSpec): CDN = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDN]
  }
  
  @scala.inline
  implicit class CDNMutableBuilder[Self <: CDN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String | ArrayBuffer | ICDNFilePathSpec): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
