package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethAbiMod {
  /* Rewritten from type alias, can be one of: 
    - web3Lib.web3LibStrings.uint256
    - web3Lib.web3LibStrings.boolean
    - web3Lib.web3LibStrings.string
    - web3Lib.web3LibStrings.bytes
    - java.lang.String
  */
  type ABIDataTypes = _ABIDataTypes | java.lang.String
  type EthAbiDecodeParametersResultArray = org.scalablytyped.runtime.NumberDictionary[js.Any]
  type EthAbiDecodeParametersResultObject = EthAbiDecodeParametersResultArray with org.scalablytyped.runtime.StringDictionary[js.Any]
}
