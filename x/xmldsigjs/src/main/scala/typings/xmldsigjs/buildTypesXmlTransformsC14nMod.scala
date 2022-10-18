package typings.xmldsigjs

import typings.xmldsigjs.buildTypesCanonicalizerMod.XmlCanonicalizer
import typings.xmldsigjs.buildTypesXmlTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlTransformsC14nMod {
  
  @JSImport("xmldsigjs/build/types/xml/transforms/c14n", "XmlDsigC14NTransform")
  @js.native
  open class XmlDsigC14NTransform () extends Transform {
    def this(properties: js.Object) = this()
    
    /* protected */ var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/transforms/c14n", "XmlDsigC14NWithCommentsTransform")
  @js.native
  open class XmlDsigC14NWithCommentsTransform () extends XmlDsigC14NTransform {
    def this(properties: js.Object) = this()
  }
}
