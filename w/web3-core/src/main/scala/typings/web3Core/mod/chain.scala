package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.web3Core.web3CoreStrings.mainnet
  - typings.web3Core.web3CoreStrings.goerli
  - typings.web3Core.web3CoreStrings.kovan
  - typings.web3Core.web3CoreStrings.rinkeby
  - typings.web3Core.web3CoreStrings.ropsten
*/
trait chain extends js.Object

object chain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def goerli: typings.web3Core.web3CoreStrings.goerli = this.cast("goerli")
  @scala.inline
  def kovan: typings.web3Core.web3CoreStrings.kovan = this.cast("kovan")
  @scala.inline
  def mainnet: typings.web3Core.web3CoreStrings.mainnet = this.cast("mainnet")
  @scala.inline
  def rinkeby: typings.web3Core.web3CoreStrings.rinkeby = this.cast("rinkeby")
  @scala.inline
  def ropsten: typings.web3Core.web3CoreStrings.ropsten = this.cast("ropsten")
}

