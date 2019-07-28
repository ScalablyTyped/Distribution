package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Url extends js.Object {
  var url: String | SignalRef
}

object Anon_Url {
  @scala.inline
  def apply(url: String | SignalRef): Anon_Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Url]
  }
}

