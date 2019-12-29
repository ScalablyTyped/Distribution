package typings.xmldsigjs

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/pki", JSImport.Namespace)
@js.native
object buildTypesPkiMod extends js.Object {
  @js.native
  class X509Certificate ()
    extends typings.xmldsigjs.buildTypesPkiX509Mod.X509Certificate {
    def this(rawData: BufferSource) = this()
  }
  
}

