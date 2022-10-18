package typings.xadesjs

import typings.xadesjs.buildTypesXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesXmlGenericTimeStampMod.XMLTimeStampCollection
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlXadesTimeStampMod {
  
  @JSImport("xadesjs/build/types/xml/xades_time_stamp", "XAdESTimeStamp")
  @js.native
  open class XAdESTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var Include: typings.xadesjs.buildTypesXmlGenericTimeStampMod.Include = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
