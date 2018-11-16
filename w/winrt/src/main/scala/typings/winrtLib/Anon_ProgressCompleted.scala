package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ProgressCompleted[TResult, TProgress] extends js.Object {
  var completed: winrtLib.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler[TResult, TProgress]
  var progress: winrtLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[TResult, TProgress]
  def getResults(): TResult
}

