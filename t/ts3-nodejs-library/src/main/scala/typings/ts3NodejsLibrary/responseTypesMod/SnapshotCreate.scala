package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreate
  extends StObject
     with ResponseEntry {
  
  /** only exists when a password has been set otherwise it will be undefined */
  var salt: js.UndefOr[String] = js.undefined
  
  var snapshot: String
  
  var version: Double
}
object SnapshotCreate {
  
  inline def apply(snapshot: String, version: Double): SnapshotCreate = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCreate]
  }
  
  extension [Self <: SnapshotCreate](x: Self) {
    
    inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
