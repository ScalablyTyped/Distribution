package typings.tufjsModels

import typings.tufjsModels.distBaseMod.Signed
import typings.tufjsModels.distBaseMod.SignedOptions
import typings.tufjsModels.distFileMod.MetaFile
import typings.tufjsModels.distMetadataMod.MetadataType
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimestampMod {
  
  @JSImport("@tufjs/models/dist/timestamp", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends Signed
       with MetadataType {
    def this(options: TimestampOptions) = this()
    
    def equals(other: Timestamp): Boolean = js.native
    
    val snapshotMeta: MetaFile = js.native
    
    val `type`: String | Double = js.native
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@tufjs/models/dist/timestamp", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  }
  
  trait TimestampOptions
    extends StObject
       with SignedOptions {
    
    var snapshotMeta: js.UndefOr[MetaFile] = js.undefined
  }
  object TimestampOptions {
    
    inline def apply(): TimestampOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimestampOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimestampOptions] (val x: Self) extends AnyVal {
      
      inline def setSnapshotMeta(value: MetaFile): Self = StObject.set(x, "snapshotMeta", value.asInstanceOf[js.Any])
      
      inline def setSnapshotMetaUndefined: Self = StObject.set(x, "snapshotMeta", js.undefined)
    }
  }
}
