package typings.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.bnJs.mod.^
    - typings.bignumberJs.mod.default
    - typings.web3Core.web3CoreStrings.latest
    - typings.web3Core.web3CoreStrings.pending
    - typings.web3Core.web3CoreStrings.earliest
    - typings.web3Core.web3CoreStrings.genesis
  */
  type BlockNumber = typings.web3Core.mod._BlockNumber | java.lang.String | scala.Double | typings.bnJs.mod.^  | typings.bignumberJs.mod.default
  /* Rewritten from type alias, can be one of: 
    - typings.web3Core.mod.HttpProvider
    - typings.web3Core.mod.IpcProvider
    - typings.web3Core.mod.WebsocketProvider
    - typings.web3Core.mod.AbstractProvider
    - java.lang.String
    - scala.Null
  */
  type provider = typings.web3Core.mod._provider | java.lang.String | scala.Null
}
