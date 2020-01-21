package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageStatus extends js.Object

/** Provides info about the status of a package. */
@JSGlobal("Windows.Management.Deployment.PackageStatus")
@js.native
object PackageStatus extends js.Object {
  /** The package is not available for use. It can still be serviced. */
  @js.native
  sealed trait disabled extends PackageStatus
  
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseIssue extends PackageStatus
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified extends PackageStatus
  
  /** The package is usable. */
  @js.native
  sealed trait ok extends PackageStatus
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered extends PackageStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageStatus with Double] = js.native
  /* 4 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object licenseIssue extends TopLevel[licenseIssue with Double]
  
  /* 2 */ @js.native
  object modified extends TopLevel[modified with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 3 */ @js.native
  object tampered extends TopLevel[tampered with Double]
  
}

