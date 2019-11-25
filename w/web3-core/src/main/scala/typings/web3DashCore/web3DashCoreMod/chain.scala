package typings.web3DashCore.web3DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.web3DashCore.web3DashCoreStrings.mainnet
  - typings.web3DashCore.web3DashCoreStrings.goerli
  - typings.web3DashCore.web3DashCoreStrings.kovan
  - typings.web3DashCore.web3DashCoreStrings.rinkeby
  - typings.web3DashCore.web3DashCoreStrings.ropsten
*/
trait chain extends js.Object

object chain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def goerli: typings.web3DashCore.web3DashCoreStrings.goerli = this.cast("goerli")
  @scala.inline
  def kovan: typings.web3DashCore.web3DashCoreStrings.kovan = this.cast("kovan")
  @scala.inline
  def mainnet: typings.web3DashCore.web3DashCoreStrings.mainnet = this.cast("mainnet")
  @scala.inline
  def rinkeby: typings.web3DashCore.web3DashCoreStrings.rinkeby = this.cast("rinkeby")
  @scala.inline
  def ropsten: typings.web3DashCore.web3DashCoreStrings.ropsten = this.cast("ropsten")
}

