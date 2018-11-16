package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ethAbiMod {
  type ABIDataTypes = web3Lib.web3LibStrings.uint256 | web3Lib.web3LibStrings.boolean | web3Lib.web3LibStrings.string | web3Lib.web3LibStrings.bytes | java.lang.String
  type EthAbiDecodeParametersResultObject = EthAbiDecodeParametersResultArray with ScalablyTyped.runtime.StringDictionary[js.Any]
}
