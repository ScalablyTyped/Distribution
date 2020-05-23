package typings.tannin.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tannin.mod.TanninDomainMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] {
  @JSName("")
  var _empty: TanninDomainMetadata | (js.Tuple2[String, String])
}

object Dictkey {
  @scala.inline
  def apply(
    _empty: TanninDomainMetadata | (js.Tuple2[String, String]),
    StringDictionary: /* key */ StringDictionary[TanninDomainMetadata | (js.Tuple2[String, String])] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

