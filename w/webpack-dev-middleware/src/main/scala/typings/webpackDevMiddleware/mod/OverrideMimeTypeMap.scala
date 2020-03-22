package typings.webpackDevMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverrideMimeTypeMap extends js.Object {
  var force: Boolean
  var typeMap: MimeTypeMap
}

object OverrideMimeTypeMap {
  @scala.inline
  def apply(force: Boolean, typeMap: MimeTypeMap): OverrideMimeTypeMap = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverrideMimeTypeMap]
  }
}

