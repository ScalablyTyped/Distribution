package typings.web3Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Hex = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.bnJs.mod.^
    - typings.web3Utils.anon.Type
    - typings.web3Utils.anon.T
    - scala.Boolean
  */
  type Mixed = typings.web3Utils.mod._Mixed | java.lang.String | scala.Double | typings.bnJs.mod.^  | scala.Boolean
}
