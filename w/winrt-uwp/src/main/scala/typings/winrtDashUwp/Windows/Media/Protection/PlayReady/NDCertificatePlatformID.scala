package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.androidOnARM
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.iOSOnARM
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.osx
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windows
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsMobile7
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsOnARM
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone81OnARM
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone81OnX86
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone8OnARM
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone8OnX86
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.xboxOnPPC
import typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.xboxOne
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDCertificatePlatformID extends js.Object

/** Indicates the client platforms with which a PlayReady-ND certificate can be associated. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificatePlatformID")
@js.native
object NDCertificatePlatformID extends js.Object {
  /** Client platform is the Google Android operating system running on an ARM processor. */
  @js.native
  sealed trait androidOnARM extends NDCertificatePlatformID
  
  /** Client platform is the Apple iOS operating system running on an ARM processor. */
  @js.native
  sealed trait iOSOnARM extends NDCertificatePlatformID
  
  /** Client platform is the Apple OSX operating system. */
  @js.native
  sealed trait osx extends NDCertificatePlatformID
  
  /** Client platform is Microsoft Windows. */
  @js.native
  sealed trait windows extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system. */
  @js.native
  sealed trait windowsMobile7 extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsOnARM extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone81OnARM extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone81OnX86 extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone8OnARM extends NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone8OnX86 extends NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system running on a Power PC processor. */
  @js.native
  sealed trait xboxOnPPC extends NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system. */
  @js.native
  sealed trait xboxOne extends NDCertificatePlatformID
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificatePlatformID with Double] = js.native
  /* 9 */ @js.native
  object androidOnARM extends TopLevel[androidOnARM with Double]
  
  /* 4 */ @js.native
  object iOSOnARM extends TopLevel[iOSOnARM with Double]
  
  /* 1 */ @js.native
  object osx extends TopLevel[osx with Double]
  
  /* 0 */ @js.native
  object windows extends TopLevel[windows with Double]
  
  /* 3 */ @js.native
  object windowsMobile7 extends TopLevel[windowsMobile7 with Double]
  
  /* 2 */ @js.native
  object windowsOnARM extends TopLevel[windowsOnARM with Double]
  
  /* 10 */ @js.native
  object windowsPhone81OnARM extends TopLevel[windowsPhone81OnARM with Double]
  
  /* 11 */ @js.native
  object windowsPhone81OnX86 extends TopLevel[windowsPhone81OnX86 with Double]
  
  /* 6 */ @js.native
  object windowsPhone8OnARM extends TopLevel[windowsPhone8OnARM with Double]
  
  /* 7 */ @js.native
  object windowsPhone8OnX86 extends TopLevel[windowsPhone8OnX86 with Double]
  
  /* 5 */ @js.native
  object xboxOnPPC extends TopLevel[xboxOnPPC with Double]
  
  /* 8 */ @js.native
  object xboxOne extends TopLevel[xboxOne with Double]
  
}

