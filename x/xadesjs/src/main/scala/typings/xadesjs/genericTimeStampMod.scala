package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.xmlBaseMod.XadesCollection
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericTimeStampMod {
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "EncapsulatedTimeStamp")
  @js.native
  open class EncapsulatedTimeStamp () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "EncapsulatedTimeStampCollection")
  @js.native
  open class EncapsulatedTimeStampCollection () extends XadesCollection[EncapsulatedTimeStamp] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "GenericTimeStamp")
  @js.native
  open class GenericTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var Include: typings.xadesjs.genericTimeStampMod.Include = js.native
    
    var ReferenceInfo: ReferenceInfos = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "Include")
  @js.native
  open class Include () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var ReferencedData: Boolean = js.native
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "ReferenceInfo")
  @js.native
  open class ReferenceInfo () extends XadesObject {
    def this(properties: js.Object) = this()
    
    /**
      * Gets or sets the digest method Uniform Resource Identifier (URI) of the current
      */
    var DigestMethod: typings.xmldsigjs.mod.DigestMethod = js.native
    
    /**
      * Gets or sets the digest value of the current Reference.
      */
    var DigestValue: js.typedarray.Uint8Array = js.native
    
    var Id: String = js.native
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "ReferenceInfos")
  @js.native
  open class ReferenceInfos () extends XadesCollection[ReferenceInfo] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "XMLTimeStamp")
  @js.native
  open class XMLTimeStamp () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/generic_time_stamp", "XMLTimeStampCollection")
  @js.native
  open class XMLTimeStampCollection () extends XadesCollection[XMLTimeStamp] {
    def this(properties: js.Object) = this()
  }
}
