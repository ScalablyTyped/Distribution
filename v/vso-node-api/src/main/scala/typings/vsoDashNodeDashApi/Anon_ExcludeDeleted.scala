package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeDeleted extends js.Object {
  var excludeDeleted: Double
  var includeDeleted: Double
  var onlyDeleted: Double
}

object Anon_ExcludeDeleted {
  @scala.inline
  def apply(excludeDeleted: Double, includeDeleted: Double, onlyDeleted: Double): Anon_ExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted, includeDeleted = includeDeleted, onlyDeleted = onlyDeleted)
  
    __obj.asInstanceOf[Anon_ExcludeDeleted]
  }
}

