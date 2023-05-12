package typings.tufjsModels

import typings.std.Record
import typings.tufjsModels.distSignatureMod.Signature
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseMod {
  
  @JSImport("@tufjs/models/dist/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait MetadataKind extends StObject
  @JSImport("@tufjs/models/dist/base", "MetadataKind")
  @js.native
  object MetadataKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MetadataKind & String] = js.native
    
    @js.native
    sealed trait Root
      extends StObject
         with MetadataKind
    /* "root" */ val Root: typings.tufjsModels.distBaseMod.MetadataKind.Root & String = js.native
    
    @js.native
    sealed trait Snapshot
      extends StObject
         with MetadataKind
    /* "snapshot" */ val Snapshot: typings.tufjsModels.distBaseMod.MetadataKind.Snapshot & String = js.native
    
    @js.native
    sealed trait Targets
      extends StObject
         with MetadataKind
    /* "targets" */ val Targets: typings.tufjsModels.distBaseMod.MetadataKind.Targets & String = js.native
    
    @js.native
    sealed trait Timestamp
      extends StObject
         with MetadataKind
    /* "timestamp" */ val Timestamp: typings.tufjsModels.distBaseMod.MetadataKind.Timestamp & String = js.native
  }
  
  /* note: abstract class */ @JSImport("@tufjs/models/dist/base", "Signed")
  @js.native
  open class Signed protected () extends StObject {
    def this(options: SignedOptions) = this()
    
    def equals(other: Signed): Boolean = js.native
    
    val expires: String = js.native
    
    def isExpired(): Boolean = js.native
    def isExpired(referenceTime: js.Date): Boolean = js.native
    
    val specVersion: String = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: Record[String, JSONValue] = js.native
    
    val version: Double = js.native
  }
  /* static members */
  object Signed {
    
    @JSImport("@tufjs/models/dist/base", "Signed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def commonFieldsFromJSON(data: JSONObject): SignedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("commonFieldsFromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[SignedOptions]
  }
  
  inline def isMetadataKind(value: Any): /* is @tufjs/models.@tufjs/models/dist/base.MetadataKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetadataKind")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @tufjs/models.@tufjs/models/dist/base.MetadataKind */ Boolean]
  
  trait Signable extends StObject {
    
    var signatures: Record[String, Signature]
    
    var signed: Signed
  }
  object Signable {
    
    inline def apply(signatures: Record[String, Signature], signed: Signed): Signable = {
      val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Signable] (val x: Self) extends AnyVal {
      
      inline def setSignatures(value: Record[String, Signature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSigned(value: Signed): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignedOptions extends StObject {
    
    var expires: js.UndefOr[String] = js.undefined
    
    var specVersion: js.UndefOr[String] = js.undefined
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object SignedOptions {
    
    inline def apply(): SignedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignedOptions] (val x: Self) extends AnyVal {
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setSpecVersion(value: String): Self = StObject.set(x, "specVersion", value.asInstanceOf[js.Any])
      
      inline def setSpecVersionUndefined: Self = StObject.set(x, "specVersion", js.undefined)
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
