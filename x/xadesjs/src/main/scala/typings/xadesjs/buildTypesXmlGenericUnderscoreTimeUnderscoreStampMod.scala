package typings.xadesjs

import typings.std.Uint8Array
import typings.xadesjs.buildTypesXmlAnyMod.Any
import typings.xadesjs.buildTypesXmlEncapsulatedUnderscorePkiUnderscoreDataMod.EncapsulatedPKIData
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/generic_time_stamp", JSImport.Namespace)
@js.native
object buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod extends js.Object {
  @js.native
  class EncapsulatedTimeStamp () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedTimeStampCollection () extends XmlCollection[EncapsulatedTimeStamp]
  
  @js.native
  class GenericTimeStamp () extends XmlObject {
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var Include: typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.Include = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
  @js.native
  class Include () extends XmlObject {
    var ReferencedData: Boolean = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class ReferenceInfo () extends XmlObject {
    var DigestMethod: String = js.native
    var DigestValue: Uint8Array = js.native
    var Id: String = js.native
    var Uri: String = js.native
  }
  
  @js.native
  class ReferenceInfos () extends XmlCollection[ReferenceInfo]
  
  @js.native
  class XMLTimeStamp () extends Any
  
  @js.native
  class XMLTimeStampCollection () extends XmlCollection[XMLTimeStamp]
  
}

