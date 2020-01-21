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
  def apply(attr: StringDictionary[IAttrValue] = null, name: String = null): INameAttrList = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INameAttrList]
  }
}

