package typings.winrt.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageState")
@js.native
object PackageState extends js.Object {
  @js.native
  sealed trait licenseInvalid extends PackageState
  
  @js.native
  sealed trait modified extends PackageState
  
  @js.native
  sealed trait normal extends PackageState
  
  @js.native
  sealed trait tampered extends PackageState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageState with Double] = js.native
  /* 1 */ @js.native
  object licenseInvalid extends TopLevel[licenseInvalid with Double]
  
  /* 2 */ @js.native
  object modified extends TopLevel[modified with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 3 */ @js.native
  object tampered extends TopLevel[tampered with Double]
  
}

