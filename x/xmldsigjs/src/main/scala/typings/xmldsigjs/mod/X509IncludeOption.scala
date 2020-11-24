package typings.xmldsigjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "X509IncludeOption")
@js.native
object X509IncludeOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.xmldsigjs.x509DataMod.X509IncludeOption with Double] = js.native
  
  /* 1 */ val EndCertOnly: typings.xmldsigjs.x509DataMod.X509IncludeOption.EndCertOnly with Double = js.native
  
  /* 2 */ val ExcludeRoot: typings.xmldsigjs.x509DataMod.X509IncludeOption.ExcludeRoot with Double = js.native
  
  /* 0 */ val None: typings.xmldsigjs.x509DataMod.X509IncludeOption.None with Double = js.native
  
  /* 3 */ val WholeChain: typings.xmldsigjs.x509DataMod.X509IncludeOption.WholeChain with Double = js.native
}
