package typings.xmldsigjs

import typings.xmldsigjs.buildTypesCanonicalizerMod.XmlCanonicalizer
import typings.xmldsigjs.buildTypesXmlTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlTransformsExcC14nMod {
  
  @JSImport("xmldsigjs/build/types/xml/transforms/exc_c14n", "XmlDsigExcC14NTransform")
  @js.native
  open class XmlDsigExcC14NTransform () extends Transform {
    def this(properties: js.Object) = this()
    
    /**
      * Gets or sets a string that contains namespace prefixes to canonicalize
      * using the standard canonicalization algorithm.
      */
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList_=(value: String): Unit = js.native
    
    /* private */ var setInclusiveNamespacesElement: Any = js.native
    
    /* protected */ var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/transforms/exc_c14n", "XmlDsigExcC14NWithCommentsTransform")
  @js.native
  open class XmlDsigExcC14NWithCommentsTransform () extends XmlDsigExcC14NTransform {
    def this(properties: js.Object) = this()
  }
}
