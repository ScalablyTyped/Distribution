package typings.web3

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethAbiMod {
  /* Rewritten from type alias, can be one of: 
    - typings.web3.web3Strings.uint256
    - typings.web3.web3Strings.boolean
    - typings.web3.web3Strings.string
    - typings.web3.web3Strings.bytes
    - java.lang.String
  */
  type ABIDataTypes = _ABIDataTypes | String
  type EthAbiDecodeParametersResultArray = NumberDictionary[js.Any]
  type EthAbiDecodeParametersResultObject = EthAbiDecodeParametersResultArray with StringDictionary[js.Any]
}
