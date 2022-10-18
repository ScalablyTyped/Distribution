package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.EncapsulatedTimeStampCollection
import typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.XMLTimeStampCollection
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlXadesTimeStampMod {
  
  @JSImport("xadesjs/build/types/src/xml/xades_time_stamp", "XAdESTimeStamp")
  @js.native
  open class XAdESTimeStamp () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CanonicalizationMethod: typings.xmldsigjs.mod.CanonicalizationMethod = js.native
    
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    
    var Id: String = js.native
    
    var Include: typings.xadesjs.buildTypesSrcXmlGenericTimeStampMod.Include = js.native
    
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
}
