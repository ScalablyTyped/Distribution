package typings.uuid1345

import typings.node.bufferMod.global.Buffer
import typings.uuid1345.anon.Encoding
import typings.uuid1345.anon.EncodingMac
import typings.uuid1345.anon.EncodingName
import typings.uuid1345.anon.Format
import typings.uuid1345.anon.Mac
import typings.uuid1345.anon.Name
import typings.uuid1345.anon.NameNamespace
import typings.uuid1345.anon.Namespace
import typings.uuid1345.anon.`0`
import typings.uuid1345.anon.`1`
import typings.uuid1345.anon.`2`
import typings.uuid1345.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-1345", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(uuid: String): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[Format]
  inline def check(uuid: Buffer): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(uuid.asInstanceOf[js.Any]).asInstanceOf[Format]
  
  object namespace {
    
    @JSImport("uuid-1345", "namespace")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuid-1345", "namespace.dns")
    @js.native
    def dns: UUID = js.native
    inline def dns_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dns")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.oid")
    @js.native
    def oid: UUID = js.native
    inline def oid_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oid")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.url")
    @js.native
    def url: UUID = js.native
    inline def url_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.x500")
    @js.native
    def x500: UUID = js.native
    inline def x500_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x500")(x.asInstanceOf[js.Any])
  }
  
  inline def parse(uuid: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uuid.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def stringify(uuid: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(uuid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def v1(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[String]
  inline def v1(callback: ASCIICallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def v1(options: Encoding): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v1(options: EncodingMac): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v1(options: EncodingMac, callback: BinaryCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v1(options: Encoding, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v1(options: Mac): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v1(options: Mac, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v1(options: `0`): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
  inline def v1(options: `0`, callback: ObjectCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def v3(options: EncodingName): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v3(options: EncodingName, callback: BinaryCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v3(options: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v3(options: NameNamespace): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
  inline def v3(options: NameNamespace, callback: ObjectCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v3(options: Name, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v3(options: Namespace): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v3(options: Namespace, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def v4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[String]
  inline def v4(callback: ASCIICallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def v4(options: `1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v4(options: `1`, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v4(options: `2`): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v4(options: `2`, callback: BinaryCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v4(options: `3`): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
  inline def v4(options: `3`, callback: ObjectCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def v4fast(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")().asInstanceOf[String]
  inline def v4fast(callback: ASCIICallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def v4fast(options: `1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v4fast(options: `1`, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v4fast(options: `2`): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v4fast(options: `2`, callback: BinaryCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v4fast(options: `3`): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
  inline def v4fast(options: `3`, callback: ObjectCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v4fast")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def v5(options: EncodingName): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v5(options: EncodingName, callback: BinaryCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v5(options: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v5(options: NameNamespace): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
  inline def v5(options: NameNamespace, callback: ObjectCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v5(options: Name, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def v5(options: Namespace): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v5(options: Namespace, callback: ASCIICallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ASCIICallback = js.Function2[/* error */ String, /* result */ String, Unit]
  
  type BinaryCallback = js.Function2[/* error */ String, /* result */ Buffer, Unit]
  
  type ObjectCallback = js.Function2[/* error */ String, /* result */ UUID, Unit]
  
  trait UUID extends StObject {
    
    def toBuffer(): Buffer
    
    var variant: String
    
    var version: String
  }
  object UUID {
    
    inline def apply(toBuffer: () => Buffer, variant: String, version: String): UUID = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UUID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
      
      inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type UuidTypes = String | Buffer | UUID
}
