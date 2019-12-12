package typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.localMachine
import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifierPersistence.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResourceQualifierPersistence with Double] = js.native
  /* 1 */ @js.native
  object localMachine extends TopLevel[localMachine with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

