package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecMarkMod._Clip
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sphere extends _Clip {
  var sphere: String | SignalRef
}

object Anon_Sphere {
  @scala.inline
  def apply(sphere: String | SignalRef): Anon_Sphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Sphere]
  }
}

