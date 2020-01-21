package typings.swiz.mod.struct

import typings.swiz.mod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends js.Object {
  var attribute: Boolean
  var coerceTo: js.Any
  var desc: js.UndefOr[String] = js.undefined
  var enumerated: Boolean
  var filterFrom: js.Array[String]
  var ignorePublic: Boolean
  var name: String
  var options: IFieldOptions
  var plural: String
  var singular: String
  var src: String
  var `val`: js.UndefOr[IChain] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    attribute: Boolean,
    coerceTo: js.Any,
    enumerated: Boolean,
    filterFrom: js.Array[String],
    ignorePublic: Boolean,
    name: String,
    options: IFieldOptions,
    plural: String,
    singular: String,
    src: String,
    desc: String = null,
    `val`: IChain = null
  ): IField = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], coerceTo = coerceTo.asInstanceOf[js.Any], enumerated = enumerated.asInstanceOf[js.Any], filterFrom = filterFrom.asInstanceOf[js.Any], ignorePublic = ignorePublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (`val` != null) __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

