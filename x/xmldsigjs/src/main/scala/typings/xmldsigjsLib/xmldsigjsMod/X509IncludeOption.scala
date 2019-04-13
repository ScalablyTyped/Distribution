package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait X509IncludeOption extends js.Object

@JSImport("xmldsigjs", "X509IncludeOption")
@js.native
object X509IncludeOption extends js.Object {
  @js.native
  sealed trait EndCertOnly
    extends xmldsigjsLib.xmldsigjsMod.X509IncludeOption
  
  @js.native
  sealed trait ExcludeRoot
    extends xmldsigjsLib.xmldsigjsMod.X509IncludeOption
  
  @js.native
  sealed trait None
    extends xmldsigjsLib.xmldsigjsMod.X509IncludeOption
  
  @js.native
  sealed trait WholeChain
    extends xmldsigjsLib.xmldsigjsMod.X509IncludeOption
  
  /* 1 */ val EndCertOnly: EndCertOnly with scala.Double = js.native
  /* 2 */ val ExcludeRoot: ExcludeRoot with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val WholeChain: WholeChain with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmldsigjsLib.xmldsigjsMod.X509IncludeOption with scala.Double] = js.native
}

