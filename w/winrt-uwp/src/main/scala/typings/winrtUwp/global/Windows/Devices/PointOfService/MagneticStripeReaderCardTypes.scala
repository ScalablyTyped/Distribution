package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the card type of the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes")
@js.native
abstract class MagneticStripeReaderCardTypes ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderCardTypes
object MagneticStripeReaderCardTypes {
  
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes")
  @js.native
  val ^ : js.Any = js.native
  
  /** Indicates the American Association of Motor Vehicle Administrators (AAMVA) card type. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes.aamva")
  @js.native
  def aamva: Double = js.native
  @scala.inline
  def aamva_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aamva")(x.asInstanceOf[js.Any])
  
  /** Indicates a bank card type. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes.bank")
  @js.native
  def bank: Double = js.native
  @scala.inline
  def bank_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bank")(x.asInstanceOf[js.Any])
  
  /** Indicates vendor-specific card type. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes.extendedBase")
  @js.native
  def extendedBase: Double = js.native
  @scala.inline
  def extendedBase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedBase")(x.asInstanceOf[js.Any])
  
  /** Indicates an unknown card type. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes.unknown")
  @js.native
  def unknown: Double = js.native
  @scala.inline
  def unknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknown")(x.asInstanceOf[js.Any])
}
