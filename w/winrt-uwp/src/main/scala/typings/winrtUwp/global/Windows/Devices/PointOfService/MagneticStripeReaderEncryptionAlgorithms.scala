package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the encryption algorithm supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
@js.native
abstract class MagneticStripeReaderEncryptionAlgorithms ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms
object MagneticStripeReaderEncryptionAlgorithms {
  
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms")
  @js.native
  val ^ : js.Any = js.native
  
  /** Indicates vendor specific encryption algorithm. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms.extendedBase")
  @js.native
  def extendedBase: Double = js.native
  inline def extendedBase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedBase")(x.asInstanceOf[js.Any])
  
  /** Indicates no encryption algorithm. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms.none")
  @js.native
  def none: Double = js.native
  inline def none_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  
  /** Indicates Triple DES DUKPT (Derived Unique Key Per Transaction) encryption algorithm supported by the device. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms.tripleDesDukpt")
  @js.native
  def tripleDesDukpt: Double = js.native
  inline def tripleDesDukpt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tripleDesDukpt")(x.asInstanceOf[js.Any])
}
