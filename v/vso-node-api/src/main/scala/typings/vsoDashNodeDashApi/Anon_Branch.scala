package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branch extends js.Object {
  var branch: Double
  var commit: Double
  var tag: Double
}

object Anon_Branch {
  @scala.inline
  def apply(branch: Double, commit: Double, tag: Double): Anon_Branch = {
    val __obj = js.Dynamic.literal(branch = branch, commit = commit, tag = tag)
  
    __obj.asInstanceOf[Anon_Branch]
  }
}

