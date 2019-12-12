package typings.winrtDashUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.agile
import typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.invalidMarshaling
import typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.none
import typings.winrtDashUwp.Windows.Foundation.Metadata.MarshalingType.standard
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarshalingType with Double] = js.native
  /* 1 */ @js.native
  object agile extends TopLevel[agile with Double]
  
  /* 3 */ @js.native
  object invalidMarshaling extends TopLevel[invalidMarshaling with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object standard extends TopLevel[standard with Double]
  
}

