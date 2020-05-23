package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INameAttrList extends js.Object {
  /** NameAttrList attr */
  var attr: js.UndefOr[StringDictionary[IAttrValue] | Null] = js.undefined
  /** NameAttrList name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object INameAttrList {
  @scala.inline
  def apply(
    attr: js.UndefOr[Null | StringDictionary[IAttrValue]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): INameAttrList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attr)) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INameAttrList]
  }
}

