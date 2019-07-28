package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

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
  sealed trait localMachine extends ResourceQualifierPersistence
  
  /** The override value is not persistent. */
  @js.native
  sealed trait none extends ResourceQualifierPersistence
  
  /* 1 */ val localMachine: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence.localMachine with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifierPersistence.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResourceQualifierPersistence with Double] = js.native
}

