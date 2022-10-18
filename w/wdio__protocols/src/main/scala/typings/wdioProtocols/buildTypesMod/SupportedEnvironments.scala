package typings.wdioProtocols.buildTypesMod

import typings.wdioProtocols.anon.RecordEnvironmentsstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.@wdio/protocols/build/types.Platform, std.Record<@wdio/protocols.@wdio/protocols/build/types.Environments, string>> */
trait SupportedEnvironments extends StObject {
  
  var android: RecordEnvironmentsstring
  
  var ios: RecordEnvironmentsstring
}
object SupportedEnvironments {
  
  inline def apply(android: RecordEnvironmentsstring, ios: RecordEnvironmentsstring): SupportedEnvironments = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedEnvironments]
  }
  
  extension [Self <: SupportedEnvironments](x: Self) {
    
    inline def setAndroid(value: RecordEnvironmentsstring): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: RecordEnvironmentsstring): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
