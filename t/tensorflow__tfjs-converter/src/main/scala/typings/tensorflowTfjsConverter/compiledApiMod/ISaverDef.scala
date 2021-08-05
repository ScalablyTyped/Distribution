package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISaverDef extends StObject {
  
  /** SaverDef filenameTensorName */
  var filenameTensorName: js.UndefOr[String | Null] = js.undefined
  
  /** SaverDef keepCheckpointEveryNHours */
  var keepCheckpointEveryNHours: js.UndefOr[Double | Null] = js.undefined
  
  /** SaverDef maxToKeep */
  var maxToKeep: js.UndefOr[Double | Null] = js.undefined
  
  /** SaverDef restoreOpName */
  var restoreOpName: js.UndefOr[String | Null] = js.undefined
  
  /** SaverDef saveTensorName */
  var saveTensorName: js.UndefOr[String | Null] = js.undefined
  
  /** SaverDef sharded */
  var sharded: js.UndefOr[Boolean | Null] = js.undefined
  
  /** SaverDef version */
  var version: js.UndefOr[CheckpointFormatVersion | Null] = js.undefined
}
object ISaverDef {
  
  inline def apply(): ISaverDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISaverDef]
  }
  
  extension [Self <: ISaverDef](x: Self) {
    
    inline def setFilenameTensorName(value: String): Self = StObject.set(x, "filenameTensorName", value.asInstanceOf[js.Any])
    
    inline def setFilenameTensorNameNull: Self = StObject.set(x, "filenameTensorName", null)
    
    inline def setFilenameTensorNameUndefined: Self = StObject.set(x, "filenameTensorName", js.undefined)
    
    inline def setKeepCheckpointEveryNHours(value: Double): Self = StObject.set(x, "keepCheckpointEveryNHours", value.asInstanceOf[js.Any])
    
    inline def setKeepCheckpointEveryNHoursNull: Self = StObject.set(x, "keepCheckpointEveryNHours", null)
    
    inline def setKeepCheckpointEveryNHoursUndefined: Self = StObject.set(x, "keepCheckpointEveryNHours", js.undefined)
    
    inline def setMaxToKeep(value: Double): Self = StObject.set(x, "maxToKeep", value.asInstanceOf[js.Any])
    
    inline def setMaxToKeepNull: Self = StObject.set(x, "maxToKeep", null)
    
    inline def setMaxToKeepUndefined: Self = StObject.set(x, "maxToKeep", js.undefined)
    
    inline def setRestoreOpName(value: String): Self = StObject.set(x, "restoreOpName", value.asInstanceOf[js.Any])
    
    inline def setRestoreOpNameNull: Self = StObject.set(x, "restoreOpName", null)
    
    inline def setRestoreOpNameUndefined: Self = StObject.set(x, "restoreOpName", js.undefined)
    
    inline def setSaveTensorName(value: String): Self = StObject.set(x, "saveTensorName", value.asInstanceOf[js.Any])
    
    inline def setSaveTensorNameNull: Self = StObject.set(x, "saveTensorName", null)
    
    inline def setSaveTensorNameUndefined: Self = StObject.set(x, "saveTensorName", js.undefined)
    
    inline def setSharded(value: Boolean): Self = StObject.set(x, "sharded", value.asInstanceOf[js.Any])
    
    inline def setShardedNull: Self = StObject.set(x, "sharded", null)
    
    inline def setShardedUndefined: Self = StObject.set(x, "sharded", js.undefined)
    
    inline def setVersion(value: CheckpointFormatVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
