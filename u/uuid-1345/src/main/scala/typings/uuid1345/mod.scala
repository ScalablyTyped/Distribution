package typings.uuid1345

import typings.node.Buffer
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-1345", "check")
  @js.native
  def check(uuid: String): Format = js.native
  @JSImport("uuid-1345", "check")
  @js.native
  def check(uuid: Buffer): Format = js.native
  
  object namespace {
    
    @JSImport("uuid-1345", "namespace")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuid-1345", "namespace.dns")
    @js.native
    def dns: UUID = js.native
    @scala.inline
    def dns_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dns")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.oid")
    @js.native
    def oid: UUID = js.native
    @scala.inline
    def oid_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oid")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.url")
    @js.native
    def url: UUID = js.native
    @scala.inline
    def url_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("uuid-1345", "namespace.x500")
    @js.native
    def x500: UUID = js.native
    @scala.inline
    def x500_=(x: UUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x500")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("uuid-1345", "parse")
  @js.native
  def parse(uuid: String): Buffer = js.native
  
  @JSImport("uuid-1345", "stringify")
  @js.native
  def stringify(uuid: Buffer): String = js.native
  
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(): String = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: Encoding): String = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: EncodingMac): Buffer = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: EncodingMac, callback: BinaryCallback): Unit = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: Encoding, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: Mac): String = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: Mac, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: `0`): UUID = js.native
  @JSImport("uuid-1345", "v1")
  @js.native
  def v1(options: `0`, callback: ObjectCallback): Unit = js.native
  
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: EncodingName): Buffer = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: EncodingName, callback: BinaryCallback): Unit = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: Name): String = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: NameNamespace): UUID = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: NameNamespace, callback: ObjectCallback): Unit = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: Name, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: Namespace): String = js.native
  @JSImport("uuid-1345", "v3")
  @js.native
  def v3(options: Namespace, callback: ASCIICallback): Unit = js.native
  
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(): String = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `1`): String = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `1`, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `2`): Buffer = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `2`, callback: BinaryCallback): Unit = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `3`): UUID = js.native
  @JSImport("uuid-1345", "v4")
  @js.native
  def v4(options: `3`, callback: ObjectCallback): Unit = js.native
  
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(): String = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `1`): String = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `1`, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `2`): Buffer = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `2`, callback: BinaryCallback): Unit = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `3`): UUID = js.native
  @JSImport("uuid-1345", "v4fast")
  @js.native
  def v4fast(options: `3`, callback: ObjectCallback): Unit = js.native
  
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: EncodingName): Buffer = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: EncodingName, callback: BinaryCallback): Unit = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: Name): String = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: NameNamespace): UUID = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: NameNamespace, callback: ObjectCallback): Unit = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: Name, callback: ASCIICallback): Unit = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: Namespace): String = js.native
  @JSImport("uuid-1345", "v5")
  @js.native
  def v5(options: Namespace, callback: ASCIICallback): Unit = js.native
  
  type ASCIICallback = js.Function2[/* error */ String, /* result */ String, Unit]
  
  type BinaryCallback = js.Function2[/* error */ String, /* result */ Buffer, Unit]
  
  type ObjectCallback = js.Function2[/* error */ String, /* result */ UUID, Unit]
  
  @js.native
  trait UUID extends StObject {
    
    def toBuffer(): Buffer = js.native
    
    var variant: String = js.native
    
    var version: String = js.native
  }
  object UUID {
    
    @scala.inline
    def apply(toBuffer: () => Buffer, variant: String, version: String): UUID = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer), variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[UUID]
    }
    
    @scala.inline
    implicit class UUIDMutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type UuidTypes = String | Buffer | UUID
}
