package typings.xadesjs

import typings.xadesjs.genericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.genericTimeStampMod.ReferenceInfos
import typings.xadesjs.genericTimeStampMod.XMLTimeStampCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/other_time_stamp", JSImport.Namespace)
@js.native
object otherTimeStampMod extends js.Object {
  
  @js.native
  class OtherTimeStamp () extends XmlObject {
    
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var ReferenceInfo: ReferenceInfos = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
