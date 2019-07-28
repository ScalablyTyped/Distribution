package typings.xmldsigjs.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait X509IncludeOption extends js.Object

@JSImport("xmldsigjs", "X509IncludeOption")
@js.native
object X509IncludeOption extends js.Object {
  @js.native
  sealed trait EndCertOnly extends X509IncludeOption
  
  @js.native
  sealed trait ExcludeRoot extends X509IncludeOption
  
  @js.native
  sealed trait None extends X509IncludeOption
  
  @js.native
  sealed trait WholeChain extends X509IncludeOption
  
  /* 1 */ val EndCertOnly: typings.xmldsigjs.xmldsigjsMod.X509IncludeOption.EndCertOnly with Double = js.native
  /* 2 */ val ExcludeRoot: typings.xmldsigjs.xmldsigjsMod.X509IncludeOption.ExcludeRoot with Double = js.native
  /* 0 */ val None: typings.xmldsigjs.xmldsigjsMod.X509IncludeOption.None with Double = js.native
  /* 3 */ val WholeChain: typings.xmldsigjs.xmldsigjsMod.X509IncludeOption.WholeChain with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[X509IncludeOption with Double] = js.native
}

