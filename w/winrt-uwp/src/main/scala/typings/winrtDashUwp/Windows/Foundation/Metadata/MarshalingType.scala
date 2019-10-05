package typings.winrtDashUwp.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalingType extends js.Object

/** Specifies the marshaling type for the class. */
@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends js.Object {
  /** The class marshals and unmarshals to the same pointer value on all interfaces. */
  @js.native
  sealed trait agile extends MarshalingType
  
  /** The class can't be marshaled. */
  @js.native
  sealed trait invalidMarshaling extends MarshalingType
  
  /** The class prevents marshaling on all interfaces. */
  @js.native
  sealed trait none extends MarshalingType
  
  /** The class does not implement IMarshal or forwards to CoGetStandardMarshal on all interfaces. */
  @js.native
  sealed trait standard extends MarshalingType
  
  /* 1 */ val agile: typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.agile with Double = js.native
  /* 3 */ val invalidMarshaling: typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.invalidMarshaling with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.none with Double = js.native
  /* 2 */ val standard: typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarshalingType with Double] = js.native
}

