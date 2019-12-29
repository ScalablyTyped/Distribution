package typings.xmldsigjs.buildTypesXmlKeyUnderscoreInfosX509UnderscoreDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait X509IncludeOption extends js.Object

@JSImport("xmldsigjs/build/types/xml/key_infos/x509_data", "X509IncludeOption")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[X509IncludeOption with Double] = js.native
  /* 1 */ @js.native
  object EndCertOnly extends TopLevel[EndCertOnly with Double]
  
  /* 2 */ @js.native
  object ExcludeRoot extends TopLevel[ExcludeRoot with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object WholeChain extends TopLevel[WholeChain with Double]
  
}

