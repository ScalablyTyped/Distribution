package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Uri launch. */
@JSGlobal("Windows.System.LaunchUriResult")
@js.native
abstract class LaunchUriResult ()
  extends typings.winrtUwp.Windows.System.LaunchUriResult {
  /** Gets the result of the Uri launch. */
  /* CompleteClass */
  override var result: ValueSet = js.native
  /** Gets the status of the Uri launch. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.System.LaunchUriStatus = js.native
}

