package typings
package winrtLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompositionType extends js.Object

@JSGlobal("Windows.Foundation.Metadata.CompositionType")
@js.native
object CompositionType extends js.Object {
  @js.native
  sealed trait `protected`
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.CompositionType
  
  @js.native
  sealed trait public
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.CompositionType
  
  /* 0 */ val `protected`: `protected` with scala.Double = js.native
  /* 1 */ val public: public with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.CompositionType with scala.Double] = js.native
}

