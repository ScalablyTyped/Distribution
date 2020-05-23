package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyContext
  extends /* key */ StringDictionary[js.Any] {
  var forceBlockIndent: js.UndefOr[Boolean] = js.undefined
  var implicitKey: js.UndefOr[Boolean] = js.undefined
  var inFlow: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var indentAtStart: js.UndefOr[Double] = js.undefined
}

object StringifyContext {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    forceBlockIndent: js.UndefOr[Boolean] = js.undefined,
    implicitKey: js.UndefOr[Boolean] = js.undefined,
    inFlow: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    indentAtStart: js.UndefOr[Double] = js.undefined
  ): StringifyContext = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(forceBlockIndent)) __obj.updateDynamic("forceBlockIndent")(forceBlockIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitKey)) __obj.updateDynamic("implicitKey")(implicitKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inFlow)) __obj.updateDynamic("inFlow")(inFlow.get.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(indentAtStart)) __obj.updateDynamic("indentAtStart")(indentAtStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyContext]
  }
}

