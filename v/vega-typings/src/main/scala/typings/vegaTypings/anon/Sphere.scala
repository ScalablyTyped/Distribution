package typings.vegaTypings.anon

import typings.vegaTypings.markMod._Clip
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sphere extends _Clip {
  var sphere: String | SignalRef
}

object Sphere {
  @scala.inline
  def apply(sphere: String | SignalRef): Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sphere]
  }
}

