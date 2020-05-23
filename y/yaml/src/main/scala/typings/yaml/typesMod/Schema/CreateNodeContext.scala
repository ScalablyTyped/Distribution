package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeContext
  extends /* key */ StringDictionary[js.Any] {
  var wrapScalars: js.UndefOr[Boolean] = js.undefined
}

object CreateNodeContext {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    wrapScalars: js.UndefOr[Boolean] = js.undefined
  ): CreateNodeContext = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(wrapScalars)) __obj.updateDynamic("wrapScalars")(wrapScalars.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeContext]
  }
}

