package typings.xmldsigjs

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/pki", JSImport.Namespace)
@js.native
object pkiMod extends js.Object {
  
  @js.native
  class X509Certificate ()
    extends typings.xmldsigjs.x509Mod.X509Certificate {
    def this(rawData: BufferSource) = this()
  }
}
