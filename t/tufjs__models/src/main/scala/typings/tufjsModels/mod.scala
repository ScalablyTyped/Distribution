package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distFileMod.MetaFileOptions
import typings.tufjsModels.distFileMod.TargetFileOptions
import typings.tufjsModels.distKeyMod.KeyOptions
import typings.tufjsModels.distMetadataMod.MetadataType
import typings.tufjsModels.distRootMod.RootOptions
import typings.tufjsModels.distSignatureMod.SignatureOptions
import typings.tufjsModels.distSnapshotMod.SnapshotOptions
import typings.tufjsModels.distTargetsMod.TargetsOptions
import typings.tufjsModels.distTimestampMod.TimestampOptions
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tufjs/models", "Key")
  @js.native
  open class Key protected ()
    extends typings.tufjsModels.distKeyMod.Key {
    def this(options: KeyOptions) = this()
  }
  /* static members */
  object Key {
    
    @JSImport("@tufjs/models", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(keyID: String, data: JSONObject): typings.tufjsModels.distKeyMod.Key = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(keyID.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distKeyMod.Key]
  }
  
  @JSImport("@tufjs/models", "MetaFile")
  @js.native
  open class MetaFile protected ()
    extends typings.tufjsModels.distFileMod.MetaFile {
    def this(opts: MetaFileOptions) = this()
  }
  /* static members */
  object MetaFile {
    
    @JSImport("@tufjs/models", "MetaFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distFileMod.MetaFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distFileMod.MetaFile]
  }
  
  @JSImport("@tufjs/models", "Metadata")
  @js.native
  open class Metadata[T /* <: MetadataType */] protected ()
    extends typings.tufjsModels.distMetadataMod.Metadata[T] {
    def this(signed: T) = this()
    def this(signed: T, signatures: Record[String, typings.tufjsModels.distSignatureMod.Signature]) = this()
    def this(signed: T, signatures: Unit, unrecognizedFields: Record[String, JSONValue]) = this()
    def this(
      signed: T,
      signatures: Record[String, typings.tufjsModels.distSignatureMod.Signature],
      unrecognizedFields: Record[String, JSONValue]
    ) = this()
  }
  /* static members */
  object Metadata {
    
    @JSImport("@tufjs/models", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`type`: typings.tufjsModels.distBaseMod.MetadataKind.Root, data: JSONObject): typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distRootMod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distRootMod.Root]]
    inline def fromJSON(`type`: typings.tufjsModels.distBaseMod.MetadataKind.Snapshot, data: JSONObject): typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distSnapshotMod.Snapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distSnapshotMod.Snapshot]]
    inline def fromJSON(`type`: typings.tufjsModels.distBaseMod.MetadataKind.Targets, data: JSONObject): typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distTargetsMod.Targets] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distTargetsMod.Targets]]
    inline def fromJSON(`type`: typings.tufjsModels.distBaseMod.MetadataKind.Timestamp, data: JSONObject): typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distTimestampMod.Timestamp] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distMetadataMod.Metadata[typings.tufjsModels.distTimestampMod.Timestamp]]
  }
  
  @JSImport("@tufjs/models", "MetadataKind")
  @js.native
  object MetadataKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.tufjsModels.distBaseMod.MetadataKind & String] = js.native
    
    /* "root" */ val Root: typings.tufjsModels.distBaseMod.MetadataKind.Root & String = js.native
    
    /* "snapshot" */ val Snapshot: typings.tufjsModels.distBaseMod.MetadataKind.Snapshot & String = js.native
    
    /* "targets" */ val Targets: typings.tufjsModels.distBaseMod.MetadataKind.Targets & String = js.native
    
    /* "timestamp" */ val Timestamp: typings.tufjsModels.distBaseMod.MetadataKind.Timestamp & String = js.native
  }
  
  @JSImport("@tufjs/models", "Root")
  @js.native
  open class Root protected ()
    extends typings.tufjsModels.distRootMod.Root {
    def this(options: RootOptions) = this()
  }
  /* static members */
  object Root {
    
    @JSImport("@tufjs/models", "Root")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distRootMod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distRootMod.Root]
  }
  
  @JSImport("@tufjs/models", "Signature")
  @js.native
  open class Signature protected ()
    extends typings.tufjsModels.distSignatureMod.Signature {
    def this(options: SignatureOptions) = this()
  }
  /* static members */
  object Signature {
    
    @JSImport("@tufjs/models", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distSignatureMod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distSignatureMod.Signature]
  }
  
  @JSImport("@tufjs/models", "Snapshot")
  @js.native
  open class Snapshot protected ()
    extends typings.tufjsModels.distSnapshotMod.Snapshot {
    def this(opts: SnapshotOptions) = this()
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@tufjs/models", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distSnapshotMod.Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distSnapshotMod.Snapshot]
  }
  
  @JSImport("@tufjs/models", "TargetFile")
  @js.native
  open class TargetFile protected ()
    extends typings.tufjsModels.distFileMod.TargetFile {
    def this(opts: TargetFileOptions) = this()
  }
  /* static members */
  object TargetFile {
    
    @JSImport("@tufjs/models", "TargetFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(path: String, data: JSONObject): typings.tufjsModels.distFileMod.TargetFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.tufjsModels.distFileMod.TargetFile]
  }
  
  @JSImport("@tufjs/models", "Targets")
  @js.native
  open class Targets protected ()
    extends typings.tufjsModels.distTargetsMod.Targets {
    def this(options: TargetsOptions) = this()
  }
  /* static members */
  object Targets {
    
    @JSImport("@tufjs/models", "Targets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distTargetsMod.Targets = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distTargetsMod.Targets]
  }
  
  @JSImport("@tufjs/models", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.tufjsModels.distTimestampMod.Timestamp {
    def this(options: TimestampOptions) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@tufjs/models", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): typings.tufjsModels.distTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.tufjsModels.distTimestampMod.Timestamp]
  }
  
  @JSImport("@tufjs/models", "ValueError")
  @js.native
  open class ValueError ()
    extends typings.tufjsModels.distErrorMod.ValueError
}
