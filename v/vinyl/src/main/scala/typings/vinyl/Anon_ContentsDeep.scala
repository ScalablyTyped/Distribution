package typings.vinyl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsDeep extends js.Object {
  var contents: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
}

object Anon_ContentsDeep {
  @scala.inline
  def apply(contents: js.UndefOr[Boolean] = js.undefined, deep: js.UndefOr[Boolean] = js.undefined): Anon_ContentsDeep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contents)) __obj.updateDynamic("contents")(contents)
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[Anon_ContentsDeep]
  }
}

