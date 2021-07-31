package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDCertificatePlatformID extends StObject
/** Indicates the client platforms with which a PlayReady-ND certificate can be associated. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificatePlatformID")
@js.native
object NDCertificatePlatformID extends StObject {
  
  /** Client platform is the Google Android operating system running on an ARM processor. */
  @js.native
  sealed trait androidOnARM
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Apple iOS operating system running on an ARM processor. */
  @js.native
  sealed trait iOSOnARM
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Apple OSX operating system. */
  @js.native
  sealed trait osx
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is Microsoft Windows. */
  @js.native
  sealed trait windows
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system. */
  @js.native
  sealed trait windowsMobile7
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 7 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsOnARM
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone81OnARM
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8.1 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone81OnX86
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an ARM processor. */
  @js.native
  sealed trait windowsPhone8OnARM
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Microsoft Windows Phone 8 operating system running on an x86 processor. */
  @js.native
  sealed trait windowsPhone8OnX86
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system running on a Power PC processor. */
  @js.native
  sealed trait xboxOnPPC
    extends StObject
       with NDCertificatePlatformID
  
  /** Client platform is the Xbox operating system. */
  @js.native
  sealed trait xboxOne
    extends StObject
       with NDCertificatePlatformID
}
