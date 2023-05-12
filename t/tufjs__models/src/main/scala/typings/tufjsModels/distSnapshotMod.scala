package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distBaseMod.Signed
import typings.tufjsModels.distBaseMod.SignedOptions
import typings.tufjsModels.distFileMod.MetaFile
import typings.tufjsModels.distMetadataMod.MetadataType
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSnapshotMod {
  
  @JSImport("@tufjs/models/dist/snapshot", "Snapshot")
  @js.native
  open class Snapshot protected ()
    extends Signed
       with MetadataType {
    def this(opts: SnapshotOptions) = this()
    
    def equals(other: Snapshot): Boolean = js.native
    
    val meta: MetaFileMap = js.native
    
    val `type`: String | Double = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@tufjs/models/dist/snapshot", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Snapshot]
  }
  
  type MetaFileMap = Record[String, MetaFile]
  
  trait SnapshotOptions
    extends StObject
       with SignedOptions {
    
    var meta: js.UndefOr[MetaFileMap] = js.undefined
  }
  object SnapshotOptions {
    
    inline def apply(): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: MetaFileMap): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
