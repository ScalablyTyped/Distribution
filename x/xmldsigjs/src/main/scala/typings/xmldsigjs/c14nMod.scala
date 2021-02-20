package typings.xmldsigjs

import typings.xmldsigjs.canonicalizerMod.XmlCanonicalizer
import typings.xmldsigjs.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object c14nMod {
  
  @JSImport("xmldsigjs/build/types/xml/transforms/c14n", "XmlDsigC14NTransform")
  @js.native
  class XmlDsigC14NTransform () extends Transform {
    def this(properties: js.Object) = this()
    
    var xmlCanonicalizer: XmlCanonicalizer = js.native
  }
  
  @JSImport("xmldsigjs/build/types/xml/transforms/c14n", "XmlDsigC14NWithCommentsTransform")
  @js.native
  class XmlDsigC14NWithCommentsTransform () extends XmlDsigC14NTransform {
    def this(properties: js.Object) = this()
  }
}
