package typings.valdr

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object valdrNs {
  type ValdrConstraintFieldName = StringDictionary[ValdrConstraintValidator]
  type ValdrConstraintTypeName = StringDictionary[ValdrConstraintFieldName]
  type ValdrConstraints = StringDictionary[ValdrConstraintTypeName]
}
