package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type Hex = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber * / js.Any
    - web3Lib.Anon_Type
    - web3Lib.Anon_T
  */
  type Mixed = _Mixed | java.lang.String | scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any)
}
