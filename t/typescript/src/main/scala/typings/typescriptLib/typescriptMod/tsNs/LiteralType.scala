package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralType extends Type {
  var freshType: LiteralType
  var regularType: LiteralType
  var value: java.lang.String | scala.Double | PseudoBigInt
}

