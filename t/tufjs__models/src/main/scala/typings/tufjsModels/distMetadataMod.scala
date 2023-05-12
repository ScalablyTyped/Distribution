package typings.tufjsModels

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.tufjsModels.distBaseMod.MetadataKind.Root
import typings.tufjsModels.distBaseMod.MetadataKind.Snapshot
import typings.tufjsModels.distBaseMod.MetadataKind.Targets
import typings.tufjsModels.distBaseMod.MetadataKind.Timestamp
import typings.tufjsModels.distBaseMod.Signable
import typings.tufjsModels.distBaseMod.Signed
import typings.tufjsModels.distSignatureMod.Signature
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMetadataMod {
  
  @JSImport("@tufjs/models/dist/metadata", "Metadata")
  @js.native
  open class Metadata[T /* <: MetadataType */] protected ()
    extends StObject
       with Signable {
    def this(signed: T) = this()
    def this(signed: T, signatures: Record[String, Signature]) = this()
    def this(signed: T, signatures: Unit, unrecognizedFields: Record[String, JSONValue]) = this()
    def this(signed: T, signatures: Record[String, Signature], unrecognizedFields: Record[String, JSONValue]) = this()
    
    def sign(signer: js.Function1[/* data */ Buffer, Signature]): Unit = js.native
    def sign(signer: js.Function1[/* data */ Buffer, Signature], append: Boolean): Unit = js.native
    
    /* CompleteClass */
    var signatures: Record[String, Signature] = js.native
    
    /* CompleteClass */
    var signed: Signed = js.native
    @JSName("signed")
    var signed_Metadata: T = js.native
    
    def toJSON(): JSONObject = js.native
    
    var unrecognizedFields: Record[String, JSONValue] = js.native
    
    def verifyDelegate(delegatedRole: String, delegatedMetadata: Metadata[MetadataType]): Unit = js.native
  }
  /* static members */
  object Metadata {
    
    @JSImport("@tufjs/models/dist/metadata", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`type`: Root, data: JSONObject): Metadata[typings.tufjsModels.distRootMod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Metadata[typings.tufjsModels.distRootMod.Root]]
    inline def fromJSON(`type`: Snapshot, data: JSONObject): Metadata[typings.tufjsModels.distSnapshotMod.Snapshot] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Metadata[typings.tufjsModels.distSnapshotMod.Snapshot]]
    inline def fromJSON(`type`: Targets, data: JSONObject): Metadata[typings.tufjsModels.distTargetsMod.Targets] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Metadata[typings.tufjsModels.distTargetsMod.Targets]]
    inline def fromJSON(`type`: Timestamp, data: JSONObject): Metadata[typings.tufjsModels.distTimestampMod.Timestamp] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Metadata[typings.tufjsModels.distTimestampMod.Timestamp]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tufjsModels.distRootMod.Root
    - typings.tufjsModels.distTimestampMod.Timestamp
    - typings.tufjsModels.distSnapshotMod.Snapshot
    - typings.tufjsModels.distTargetsMod.Targets
  */
  trait MetadataType extends StObject
}
