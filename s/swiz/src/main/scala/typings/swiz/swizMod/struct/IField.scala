package typings.swiz.swizMod.struct

import typings.swiz.swizMod.IChain
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
    val __obj = js.Dynamic.literal(attribute = attribute, coerceTo = coerceTo, enumerated = enumerated, filterFrom = filterFrom, ignorePublic = ignorePublic, name = name, options = options, plural = plural, singular = singular, src = src)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (`val` != null) __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[IField]
  }
}

