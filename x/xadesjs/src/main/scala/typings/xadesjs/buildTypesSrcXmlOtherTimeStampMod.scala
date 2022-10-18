package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.ReferenceInfos
import typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.XMLTimeStampCollection
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlOtherTimeStampMod {
  
  @JSImport("xadesjs/build/types/src/xml/other_time_stamp", "OtherTimeStamp")
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
