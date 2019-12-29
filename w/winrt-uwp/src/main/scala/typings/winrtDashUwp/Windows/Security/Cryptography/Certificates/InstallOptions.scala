package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallOptions extends js.Object

/** Specifies certificate installation options. This enumeration type is used by the InstallCertificateAsync and ImportPfxDataAsync methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
@js.native
object InstallOptions extends js.Object {
  /** Delete expired certificates. */
  @js.native
  sealed trait deleteExpired extends InstallOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none extends InstallOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InstallOptions with Double] = js.native
  /* 1 */ @js.native
  object deleteExpired extends TopLevel[deleteExpired with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

