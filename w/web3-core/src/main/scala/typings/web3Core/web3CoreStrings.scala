package typings.web3Core

import typings.web3Core.mod._BlockNumber
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object web3CoreStrings {
  @js.native
  sealed trait byzantium extends hardfork
  
  @js.native
  sealed trait chainstart extends hardfork
  
  @js.native
  sealed trait confirmation extends js.Object
  
  @js.native
  sealed trait constantinople extends hardfork
  
  @js.native
  sealed trait dao extends hardfork
  
  @js.native
  sealed trait earliest extends _BlockNumber
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait genesis extends _BlockNumber
  
  @js.native
  sealed trait goerli extends chain
  
  @js.native
  sealed trait homestead extends hardfork
  
  @js.native
  sealed trait istanbul extends hardfork
  
  @js.native
  sealed trait kovan extends chain
  
  @js.native
  sealed trait latest extends _BlockNumber
  
  @js.native
  sealed trait mainnet extends chain
  
  @js.native
  sealed trait pending extends _BlockNumber
  
  @js.native
  sealed trait petersburg extends hardfork
  
  @js.native
  sealed trait receipt extends js.Object
  
  @js.native
  sealed trait rinkeby extends chain
  
  @js.native
  sealed trait ropsten extends chain
  
  @js.native
  sealed trait sending extends js.Object
  
  @js.native
  sealed trait sent extends js.Object
  
  @js.native
  sealed trait spuriousDragon extends hardfork
  
  @js.native
  sealed trait tangerineWhistle extends hardfork
  
  @js.native
  sealed trait transactionHash extends js.Object
  
  @scala.inline
  def byzantium: byzantium = "byzantium".asInstanceOf[byzantium]
  @scala.inline
  def chainstart: chainstart = "chainstart".asInstanceOf[chainstart]
  @scala.inline
  def confirmation: confirmation = "confirmation".asInstanceOf[confirmation]
  @scala.inline
  def constantinople: constantinople = "constantinople".asInstanceOf[constantinople]
  @scala.inline
  def dao: dao = "dao".asInstanceOf[dao]
  @scala.inline
  def earliest: earliest = "earliest".asInstanceOf[earliest]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def genesis: genesis = "genesis".asInstanceOf[genesis]
  @scala.inline
  def goerli: goerli = "goerli".asInstanceOf[goerli]
  @scala.inline
  def homestead: homestead = "homestead".asInstanceOf[homestead]
  @scala.inline
  def istanbul: istanbul = "istanbul".asInstanceOf[istanbul]
  @scala.inline
  def kovan: kovan = "kovan".asInstanceOf[kovan]
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def mainnet: mainnet = "mainnet".asInstanceOf[mainnet]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def petersburg: petersburg = "petersburg".asInstanceOf[petersburg]
  @scala.inline
  def receipt: receipt = "receipt".asInstanceOf[receipt]
  @scala.inline
  def rinkeby: rinkeby = "rinkeby".asInstanceOf[rinkeby]
  @scala.inline
  def ropsten: ropsten = "ropsten".asInstanceOf[ropsten]
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  @scala.inline
  def spuriousDragon: spuriousDragon = "spuriousDragon".asInstanceOf[spuriousDragon]
  @scala.inline
  def tangerineWhistle: tangerineWhistle = "tangerineWhistle".asInstanceOf[tangerineWhistle]
  @scala.inline
  def transactionHash: transactionHash = "transactionHash".asInstanceOf[transactionHash]
}

