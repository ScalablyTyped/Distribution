package typings.webidl2.mod

import typings.webidl2.webidl2Strings.Infinity
import typings.webidl2.webidl2Strings.NaN
import typings.webidl2.webidl2Strings.`null`
import typings.webidl2.webidl2Strings.boolean
import typings.webidl2.webidl2Strings.dictionary
import typings.webidl2.webidl2Strings.number
import typings.webidl2.webidl2Strings.sequence
import typings.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.ValueDescriptionString
  - typings.webidl2.mod.ValueDescriptionNumber
  - typings.webidl2.mod.ValueDescriptionBoolean
  - typings.webidl2.mod.ValueDescriptionNull
  - typings.webidl2.mod.ValueDescriptionInfinity
  - typings.webidl2.mod.ValueDescriptionNaN
  - typings.webidl2.mod.ValueDescriptionSequence
  - typings.webidl2.mod.ValueDescriptionDictionary
*/
trait ValueDescription extends js.Object

object ValueDescription {
  @scala.inline
  def ValueDescriptionInfinity(negative: Boolean, `type`: Infinity): ValueDescription = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionNaN(`type`: NaN): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionBoolean(`type`: boolean, value: Boolean): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionDictionary(`type`: dictionary): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionNull(`type`: `null`): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionString(`type`: string, value: String): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionNumber(`type`: number, value: String): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  def ValueDescriptionSequence(`type`: sequence, value: js.Array[js.Any]): ValueDescription = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
}

