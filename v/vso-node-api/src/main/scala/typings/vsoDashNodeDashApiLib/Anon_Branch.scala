package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branch extends js.Object {
  var branch: scala.Double
  var commit: scala.Double
  var tag: scala.Double
}

object Anon_Branch {
  @scala.inline
  def apply(branch: scala.Double, commit: scala.Double, tag: scala.Double): Anon_Branch = {
    val __obj = js.Dynamic.literal(branch = branch, commit = commit, tag = tag)
  
    __obj.asInstanceOf[Anon_Branch]
  }
}

