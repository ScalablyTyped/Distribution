package typings.web3DashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object web3DashCoreMod {
  import typings.bignumberDotJs.bignumberDotJsMod.default
  import typings.bnDotJs.bnDotJsMod.^

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.bnDotJs.bnDotJsMod.^
    - typings.bignumberDotJs.bignumberDotJsMod.default
    - typings.web3DashCore.web3DashCoreStrings.latest
    - typings.web3DashCore.web3DashCoreStrings.pending
    - typings.web3DashCore.web3DashCoreStrings.earliest
  */
  type BlockNumber = _BlockNumber | String | Double | ^  | default
  /* Rewritten from type alias, can be one of: 
    - typings.web3DashCore.web3DashCoreMod.HttpProvider
    - typings.web3DashCore.web3DashCoreMod.IpcProvider
    - typings.web3DashCore.web3DashCoreMod.WebsocketProvider
    - java.lang.String
    - scala.Null
  */
  type provider = _provider | String | Null
}
