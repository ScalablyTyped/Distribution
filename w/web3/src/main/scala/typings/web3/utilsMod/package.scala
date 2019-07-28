package typings.web3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type Hex = String | Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber * / js.Any
    - typings.web3.Anon_Type
    - typings.web3.Anon_T
  */
  type Mixed = _Mixed | String | Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any)
}
