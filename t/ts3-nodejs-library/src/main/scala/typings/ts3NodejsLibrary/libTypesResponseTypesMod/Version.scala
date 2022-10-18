package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version
  extends StObject
     with ResponseEntry {
  
  var build: Double
  
  var platform: String
  
  var version: String
}
object Version {
  
  inline def apply(build: Double, platform: String, version: String): Version = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
