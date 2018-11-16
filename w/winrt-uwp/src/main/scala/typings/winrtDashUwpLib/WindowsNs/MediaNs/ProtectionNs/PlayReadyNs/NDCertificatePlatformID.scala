package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

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
  sealed trait androidOnARM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Apple iOS operating system running on an ARM processor. */
  @js.native
  sealed trait iOSOnARM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Apple OSX operating system. */
  @js.native
  sealed trait osx
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is Microsoft Windows. */
  @js.native
  sealed trait windows
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system. */
  @js.native
  sealed trait windowsMobile7
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsOnARM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone81OnARM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone81OnX86
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone8OnARM
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone8OnX86
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system running on a Power PC processor. */
  @js.native
  sealed trait xboxOnPPC
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system. */
  @js.native
  sealed trait xboxOne
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID
  
  val androidOnARM: androidOnARM with java.lang.String = js.native
  val iOSOnARM: iOSOnARM with java.lang.String = js.native
  val osx: osx with java.lang.String = js.native
  val windows: windows with java.lang.String = js.native
  val windowsMobile7: windowsMobile7 with java.lang.String = js.native
  val windowsOnARM: windowsOnARM with java.lang.String = js.native
  val windowsPhone81OnARM: windowsPhone81OnARM with java.lang.String = js.native
  val windowsPhone81OnX86: windowsPhone81OnX86 with java.lang.String = js.native
  val windowsPhone8OnARM: windowsPhone8OnARM with java.lang.String = js.native
  val windowsPhone8OnX86: windowsPhone8OnX86 with java.lang.String = js.native
  val xboxOnPPC: xboxOnPPC with java.lang.String = js.native
  val xboxOne: xboxOne with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificatePlatformID with java.lang.String
  ] = js.native
}

