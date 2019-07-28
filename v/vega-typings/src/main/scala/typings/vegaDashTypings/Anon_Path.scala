package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecMarkMod._Clip
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends _Clip {
  var path: String | SignalRef
}

object Anon_Path {
  @scala.inline
  def apply(path: String | SignalRef): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Path]
  }
}

