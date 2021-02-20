package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISaverDef extends StObject {
  
  /** SaverDef filenameTensorName */
  var filenameTensorName: js.UndefOr[String | Null] = js.native
  
  /** SaverDef keepCheckpointEveryNHours */
  var keepCheckpointEveryNHours: js.UndefOr[Double | Null] = js.native
  
  /** SaverDef maxToKeep */
  var maxToKeep: js.UndefOr[Double | Null] = js.native
  
  /** SaverDef restoreOpName */
  var restoreOpName: js.UndefOr[String | Null] = js.native
  
  /** SaverDef saveTensorName */
  var saveTensorName: js.UndefOr[String | Null] = js.native
  
  /** SaverDef sharded */
  var sharded: js.UndefOr[Boolean | Null] = js.native
  
  /** SaverDef version */
  var version: js.UndefOr[CheckpointFormatVersion | Null] = js.native
}
object ISaverDef {
  
  @scala.inline
  def apply(): ISaverDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISaverDef]
  }
  
  @scala.inline
  implicit class ISaverDefMutableBuilder[Self <: ISaverDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilenameTensorName(value: String): Self = StObject.set(x, "filenameTensorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameTensorNameNull: Self = StObject.set(x, "filenameTensorName", null)
    
    @scala.inline
    def setFilenameTensorNameUndefined: Self = StObject.set(x, "filenameTensorName", js.undefined)
    
    @scala.inline
    def setKeepCheckpointEveryNHours(value: Double): Self = StObject.set(x, "keepCheckpointEveryNHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepCheckpointEveryNHoursNull: Self = StObject.set(x, "keepCheckpointEveryNHours", null)
    
    @scala.inline
    def setKeepCheckpointEveryNHoursUndefined: Self = StObject.set(x, "keepCheckpointEveryNHours", js.undefined)
    
    @scala.inline
    def setMaxToKeep(value: Double): Self = StObject.set(x, "maxToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxToKeepNull: Self = StObject.set(x, "maxToKeep", null)
    
    @scala.inline
    def setMaxToKeepUndefined: Self = StObject.set(x, "maxToKeep", js.undefined)
    
    @scala.inline
    def setRestoreOpName(value: String): Self = StObject.set(x, "restoreOpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreOpNameNull: Self = StObject.set(x, "restoreOpName", null)
    
    @scala.inline
    def setRestoreOpNameUndefined: Self = StObject.set(x, "restoreOpName", js.undefined)
    
    @scala.inline
    def setSaveTensorName(value: String): Self = StObject.set(x, "saveTensorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveTensorNameNull: Self = StObject.set(x, "saveTensorName", null)
    
    @scala.inline
    def setSaveTensorNameUndefined: Self = StObject.set(x, "saveTensorName", js.undefined)
    
    @scala.inline
    def setSharded(value: Boolean): Self = StObject.set(x, "sharded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardedNull: Self = StObject.set(x, "sharded", null)
    
    @scala.inline
    def setShardedUndefined: Self = StObject.set(x, "sharded", js.undefined)
    
    @scala.inline
    def setVersion(value: CheckpointFormatVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
