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
  
  val `protected`: `protected` with java.lang.String = js.native
  val public: public with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.CompositionType with java.lang.String] = js.native
}

