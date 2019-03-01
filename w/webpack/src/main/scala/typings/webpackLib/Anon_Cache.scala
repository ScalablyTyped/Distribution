package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: scala.Boolean
  var workers: scala.Boolean | scala.Double
}

object Anon_Cache {
  @scala.inline
  def apply(cache: scala.Boolean, workers: scala.Boolean | scala.Double): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cache]
  }
}

