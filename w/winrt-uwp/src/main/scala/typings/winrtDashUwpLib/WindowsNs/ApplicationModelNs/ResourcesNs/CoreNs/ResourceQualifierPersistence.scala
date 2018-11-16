package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResourceQualifierPersistence extends js.Object

/** Possible values for the persistence of a global qualifier value override. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence")
@js.native
object ResourceQualifierPersistence extends js.Object {
  /** The override value persists on the local machine. */
  @js.native
  sealed trait localMachine
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence
  
  /** The override value is not persistent. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence
  
  val localMachine: localMachine with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence with java.lang.String
  ] = js.native
}

