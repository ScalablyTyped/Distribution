package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AttributesNs {
  /**
           * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
           * @see {@link XrmEnum.DateAttributeFormat}
           * @see {@link XrmEnum.IntegerAttributeFormat}
           * @see {@link XrmEnum.OptionSetAttributeFormat}
           * @see {@link XrmEnum.StringAttributeFormat}
           */
  type AttributeFormat = DateAttributeFormat | IntegerAttributeFormat | OptionSetAttributeFormat | StringAttributeFormat
  /**
           * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
           * @see {@link XrmEnum.AttributeType}
           */
  type AttributeType = xrmLib.xrmLibStrings.boolean | xrmLib.xrmLibStrings.datetime | xrmLib.xrmLibStrings.decimal | xrmLib.xrmLibStrings.double | xrmLib.xrmLibStrings.integer | xrmLib.xrmLibStrings.lookup | xrmLib.xrmLibStrings.memo | xrmLib.xrmLibStrings.money | xrmLib.xrmLibStrings.multioptionset | xrmLib.xrmLibStrings.optionset | xrmLib.xrmLibStrings.string
  /**
           * Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
           * @see {@link XrmEnum.DateAttributeFormat}
           */
  type DateAttributeFormat = xrmLib.xrmLibStrings.date | xrmLib.xrmLibStrings.datetime
  /**
           * Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
           * @see {@link XrmEnum.IntegerAttributeFormat}
           */
  type IntegerAttributeFormat = xrmLib.xrmLibStrings.duration | xrmLib.xrmLibStrings.none
  /**
           * OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
           * @see {@link XrmEnum.OptionSetAttributeFormat}
           */
  type OptionSetAttributeFormat = xrmLib.xrmLibStrings.language | xrmLib.xrmLibStrings.timezone
  /**
           * Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
           * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
           * @see {@link XrmEnum.AttributeRequirementLevel}
           */
  type RequirementLevel = xrmLib.xrmLibStrings.none | xrmLib.xrmLibStrings.recommended | xrmLib.xrmLibStrings.required
  /**
           * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
           * @see {@link XrmEnum.StringAttributeFormat}
           */
  type StringAttributeFormat = xrmLib.xrmLibStrings.email | xrmLib.xrmLibStrings.phone | xrmLib.xrmLibStrings.text | xrmLib.xrmLibStrings.textarea | xrmLib.xrmLibStrings.tickersymbol | xrmLib.xrmLibStrings.url
}
