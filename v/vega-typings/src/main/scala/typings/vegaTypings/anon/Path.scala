package typings.vegaTypings.anon

import typings.vegaTypings.markMod._Clip
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends _Clip {
  var path: String | SignalRef
}

object Path {
  @scala.inline
  def apply(path: String | SignalRef): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

