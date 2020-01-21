package typings.xadesjs

import typings.xadesjs.genericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.genericTimeStampMod.XMLTimeStampCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/xades_time_stamp", JSImport.Namespace)
@js.native
object xadesTimeStampMod extends js.Object {
  @js.native
  class XAdESTimeStamp () extends XmlObject {
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var Include: typings.xadesjs.genericTimeStampMod.Include = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
}

