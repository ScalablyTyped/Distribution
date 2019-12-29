package typings.xadesjs

import typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.XMLTimeStampCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/xades_time_stamp", JSImport.Namespace)
@js.native
object buildTypesXmlXadesUnderscoreTimeUnderscoreStampMod extends js.Object {
  @js.native
  class XAdESTimeStamp () extends XmlObject {
    var CanonicalizationMethod: typings.xmldsigjs.xmldsigjsMod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var Include: typings.xadesjs.buildTypesXmlGenericUnderscoreTimeUnderscoreStampMod.Include = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
}

