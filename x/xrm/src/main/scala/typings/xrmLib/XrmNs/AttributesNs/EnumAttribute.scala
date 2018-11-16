package typings
package xrmLib.XrmNs.AttributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Common interface for enumeration attributes (OptionSet and Boolean).
         * @see {@link Attribute}
         */

trait EnumAttribute extends Attribute {
  /**
               * Gets the initial value of the attribute.
               * @returns The initial value.
               * @remarks Valid for OptionSet and boolean attribute types
               */
  def getInitialValue(): scala.Double | scala.Boolean
}

