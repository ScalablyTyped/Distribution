package typings.xmldsigjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "KeyInfoX509Data")
@js.native
open class KeyInfoX509Data ()
  extends typings.xmldsigjs.buildTypesXmlKeyInfosMod.KeyInfoX509Data {
  def this(cert: typings.xmldsigjs.buildTypesPkiMod.X509Certificate) = this()
  def this(rgbCert: js.typedarray.Uint8Array) = this()
  def this(
    cert: typings.xmldsigjs.buildTypesPkiMod.X509Certificate,
    includeOptions: typings.xmldsigjs.buildTypesXmlKeyInfosX509DataMod.X509IncludeOption
  ) = this()
}
