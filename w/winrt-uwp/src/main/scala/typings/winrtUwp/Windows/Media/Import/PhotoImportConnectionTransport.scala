package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportConnectionTransport extends js.Object

/** Specifies the connection transport used for photo import. */
@JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
@js.native
object PhotoImportConnectionTransport extends js.Object {
  /** The connection transport is Bluetooth. */
  @js.native
  sealed trait bluetooth extends PhotoImportConnectionTransport
  
  /** The connection transport is Internet Protocol. */
  @js.native
  sealed trait ip extends PhotoImportConnectionTransport
  
  /** The connection transport is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportConnectionTransport
  
  /** The connection transport is USB. */
  @js.native
  sealed trait usb extends PhotoImportConnectionTransport
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportConnectionTransport with Double] = js.native
  /* 3 */ @js.native
  object bluetooth extends TopLevel[bluetooth with Double]
  
  /* 2 */ @js.native
  object ip extends TopLevel[ip with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object usb extends TopLevel[usb with Double]
  
}

