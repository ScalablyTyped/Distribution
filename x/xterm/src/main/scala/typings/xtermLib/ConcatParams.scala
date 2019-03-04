package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatParams extends Algorithm {
  var algorithmId: stdLib.Uint8Array
  var hash: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  var partyUInfo: stdLib.Uint8Array
  var partyVInfo: stdLib.Uint8Array
  var privateInfo: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var publicInfo: js.UndefOr[stdLib.Uint8Array] = js.undefined
}

object ConcatParams {
  @scala.inline
  def apply(
    algorithmId: stdLib.Uint8Array,
    name: java.lang.String,
    partyUInfo: stdLib.Uint8Array,
    partyVInfo: stdLib.Uint8Array,
    hash: java.lang.String | Algorithm = null,
    privateInfo: stdLib.Uint8Array = null,
    publicInfo: stdLib.Uint8Array = null
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId, name = name, partyUInfo = partyUInfo, partyVInfo = partyVInfo)
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (privateInfo != null) __obj.updateDynamic("privateInfo")(privateInfo)
    if (publicInfo != null) __obj.updateDynamic("publicInfo")(publicInfo)
    __obj.asInstanceOf[ConcatParams]
  }
}

