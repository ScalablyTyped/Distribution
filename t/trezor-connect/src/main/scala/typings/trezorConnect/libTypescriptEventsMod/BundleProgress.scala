package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleProgress[R] extends StObject {
  
  var payload: Progress[R]
  
  var `type`: /* "ui-bundle_progress" */ String
}
object BundleProgress {
  
  inline def apply[R](payload: Progress[R], `type`: /* "ui-bundle_progress" */ String): BundleProgress[R] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleProgress[R]]
  }
  
  extension [Self <: BundleProgress[?], R](x: Self & BundleProgress[R]) {
    
    inline def setPayload(value: Progress[R]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-bundle_progress" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
