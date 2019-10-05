package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

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
  
  /* 9 */ val androidOnARM: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.androidOnARM with Double = js.native
  /* 4 */ val iOSOnARM: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.iOSOnARM with Double = js.native
  /* 1 */ val osx: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.osx with Double = js.native
  /* 0 */ val windows: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windows with Double = js.native
  /* 3 */ val windowsMobile7: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsMobile7 with Double = js.native
  /* 2 */ val windowsOnARM: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsOnARM with Double = js.native
  /* 10 */ val windowsPhone81OnARM: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone81OnARM with Double = js.native
  /* 11 */ val windowsPhone81OnX86: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone81OnX86 with Double = js.native
  /* 6 */ val windowsPhone8OnARM: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone8OnARM with Double = js.native
  /* 7 */ val windowsPhone8OnX86: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.windowsPhone8OnX86 with Double = js.native
  /* 5 */ val xboxOnPPC: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.xboxOnPPC with Double = js.native
  /* 8 */ val xboxOne: typings.winrtDashUwp.Windows.Media.Protection.PlayReady.NDCertificatePlatformID.xboxOne with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NDCertificatePlatformID with Double] = js.native
}

