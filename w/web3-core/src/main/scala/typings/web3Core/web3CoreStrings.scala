package typings.web3Core

import typings.web3Core.mod._BlockNumber
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object web3CoreStrings {
  
  @js.native
  sealed trait byzantium extends hardfork
  @scala.inline
  def byzantium: byzantium = "byzantium".asInstanceOf[byzantium]
  
  @js.native
  sealed trait chainstart extends hardfork
  @scala.inline
  def chainstart: chainstart = "chainstart".asInstanceOf[chainstart]
  
  @js.native
  sealed trait confirmation extends StObject
  @scala.inline
  def confirmation: confirmation = "confirmation".asInstanceOf[confirmation]
  
  @js.native
  sealed trait constantinople extends hardfork
  @scala.inline
  def constantinople: constantinople = "constantinople".asInstanceOf[constantinople]
  
  @js.native
  sealed trait dao extends hardfork
  @scala.inline
  def dao: dao = "dao".asInstanceOf[dao]
  
  @js.native
  sealed trait earliest extends _BlockNumber
  @scala.inline
  def earliest: earliest = "earliest".asInstanceOf[earliest]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait genesis extends _BlockNumber
  @scala.inline
  def genesis: genesis = "genesis".asInstanceOf[genesis]
  
  @js.native
  sealed trait goerli extends chain
  @scala.inline
  def goerli: goerli = "goerli".asInstanceOf[goerli]
  
  @js.native
  sealed trait homestead extends hardfork
  @scala.inline
  def homestead: homestead = "homestead".asInstanceOf[homestead]
  
  @js.native
  sealed trait istanbul extends hardfork
  @scala.inline
  def istanbul: istanbul = "istanbul".asInstanceOf[istanbul]
  
  @js.native
  sealed trait kovan extends chain
  @scala.inline
  def kovan: kovan = "kovan".asInstanceOf[kovan]
  
  @js.native
  sealed trait latest extends _BlockNumber
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  
  @js.native
  sealed trait mainnet extends chain
  @scala.inline
  def mainnet: mainnet = "mainnet".asInstanceOf[mainnet]
  
  @js.native
  sealed trait pending extends _BlockNumber
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait petersburg extends hardfork
  @scala.inline
  def petersburg: petersburg = "petersburg".asInstanceOf[petersburg]
  
  @js.native
  sealed trait receipt extends StObject
  @scala.inline
  def receipt: receipt = "receipt".asInstanceOf[receipt]
  
  @js.native
  sealed trait rinkeby extends chain
  @scala.inline
  def rinkeby: rinkeby = "rinkeby".asInstanceOf[rinkeby]
  
  @js.native
  sealed trait ropsten extends chain
  @scala.inline
  def ropsten: ropsten = "ropsten".asInstanceOf[ropsten]
  
  @js.native
  sealed trait sending extends StObject
  @scala.inline
  def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent extends StObject
  @scala.inline
  def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait spuriousDragon extends hardfork
  @scala.inline
  def spuriousDragon: spuriousDragon = "spuriousDragon".asInstanceOf[spuriousDragon]
  
  @js.native
  sealed trait tangerineWhistle extends hardfork
  @scala.inline
  def tangerineWhistle: tangerineWhistle = "tangerineWhistle".asInstanceOf[tangerineWhistle]
  
  @js.native
  sealed trait transactionHash extends StObject
  @scala.inline
  def transactionHash: transactionHash = "transactionHash".asInstanceOf[transactionHash]
}
