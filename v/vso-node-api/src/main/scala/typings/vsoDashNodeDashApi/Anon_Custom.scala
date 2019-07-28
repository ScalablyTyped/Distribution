package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: Double
  var latestOnBuild: Double
  var latestOnQueue: Double
}

object Anon_Custom {
  @scala.inline
  def apply(custom: Double, latestOnBuild: Double, latestOnQueue: Double): Anon_Custom = {
    val __obj = js.Dynamic.literal(custom = custom, latestOnBuild = latestOnBuild, latestOnQueue = latestOnQueue)
  
    __obj.asInstanceOf[Anon_Custom]
  }
}

