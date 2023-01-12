package typings.twilioSync.mod

import org.scalablytyped.runtime.StringDictionary
import typings.twilioSync.twilioSyncStrings.debug
import typings.twilioSync.twilioSyncStrings.error
import typings.twilioSync.twilioSyncStrings.info
import typings.twilioSync.twilioSyncStrings.silent
import typings.twilioSync.twilioSyncStrings.trace
import typings.twilioSync.twilioSyncStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client options.
  */
trait SyncClientOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * The level of logging to enable.
    */
  var logLevel: js.UndefOr[silent | error | warn | info | debug | trace] = js.undefined
}
object SyncClientOptions {
  
  inline def apply(): SyncClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncClientOptions] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: silent | error | warn | info | debug | trace): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
  }
}
