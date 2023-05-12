package typings.wdioProtocols.buildTypesMod

import typings.wdioProtocols.anon.PartialRecordEnvironments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@wdio/protocols.@wdio/protocols/build/types.Platform, std.Partial<std.Record<@wdio/protocols.@wdio/protocols/build/types.Environments, string>>>> */
trait SupportedEnvironments extends StObject {
  
  var android: js.UndefOr[PartialRecordEnvironments] = js.undefined
  
  var ios: js.UndefOr[PartialRecordEnvironments] = js.undefined
}
object SupportedEnvironments {
  
  inline def apply(): SupportedEnvironments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedEnvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportedEnvironments] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: PartialRecordEnvironments): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setIos(value: PartialRecordEnvironments): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
