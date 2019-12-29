package typings.xadesjs

import typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.ReferenceInfos
import typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.XMLTimeStampCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/other_time_stamp", JSImport.Namespace)
@js.native
object buildTypesXmlOtherUnderscoreTimeUnderscoreStampMod extends js.Object {
  @js.native
  class OtherTimeStamp () extends XmlObject {
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
}

