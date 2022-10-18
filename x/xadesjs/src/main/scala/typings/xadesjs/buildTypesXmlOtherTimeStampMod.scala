package typings.xadesjs

import typings.xadesjs.buildTypesXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesXmlGenericTimeStampMod.ReferenceInfos
import typings.xadesjs.buildTypesXmlGenericTimeStampMod.XMLTimeStampCollection
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlOtherTimeStampMod {
  
  @JSImport("xadesjs/build/types/xml/other_time_stamp", "OtherTimeStamp")
  @js.native
  open class OtherTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var ReferenceInfo: ReferenceInfos = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
