package typings.web3Core

import typings.web3Core.mod._BlockNumber
import typings.web3Core.mod.chain
import typings.web3Core.mod.hardfork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object web3CoreStrings {
  
  @js.native
  sealed trait byzantium
    extends StObject
       with hardfork
  inline def byzantium: byzantium = "byzantium".asInstanceOf[byzantium]
  
  @js.native
  sealed trait chainstart
    extends StObject
       with hardfork
  inline def chainstart: chainstart = "chainstart".asInstanceOf[chainstart]
  
  @js.native
  sealed trait confirmation extends StObject
  inline def confirmation: confirmation = "confirmation".asInstanceOf[confirmation]
  
  @js.native
  sealed trait constantinople
    extends StObject
       with hardfork
  inline def constantinople: constantinople = "constantinople".asInstanceOf[constantinople]
  
  @js.native
  sealed trait dao
    extends StObject
       with hardfork
  inline def dao: dao = "dao".asInstanceOf[dao]
  
  @js.native
  sealed trait earliest
    extends StObject
       with _BlockNumber
  inline def earliest: earliest = "earliest".asInstanceOf[earliest]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait genesis
    extends StObject
       with _BlockNumber
  inline def genesis: genesis = "genesis".asInstanceOf[genesis]
  
  @js.native
  sealed trait goerli
    extends StObject
       with chain
  inline def goerli: goerli = "goerli".asInstanceOf[goerli]
  
  @js.native
  sealed trait homestead
    extends StObject
       with hardfork
  inline def homestead: homestead = "homestead".asInstanceOf[homestead]
  
  @js.native
  sealed trait istanbul
    extends StObject
       with hardfork
  inline def istanbul: istanbul = "istanbul".asInstanceOf[istanbul]
  
  @js.native
  sealed trait kovan
    extends StObject
       with chain
  inline def kovan: kovan = "kovan".asInstanceOf[kovan]
  
  @js.native
  sealed trait latest
    extends StObject
       with _BlockNumber
  inline def latest: latest = "latest".asInstanceOf[latest]
  
  @js.native
  sealed trait mainnet
    extends StObject
       with chain
  inline def mainnet: mainnet = "mainnet".asInstanceOf[mainnet]
  
  @js.native
  sealed trait pending
    extends StObject
       with _BlockNumber
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait petersburg
    extends StObject
       with hardfork
  inline def petersburg: petersburg = "petersburg".asInstanceOf[petersburg]
  
  @js.native
  sealed trait receipt extends StObject
  inline def receipt: receipt = "receipt".asInstanceOf[receipt]
  
  @js.native
  sealed trait rinkeby
    extends StObject
       with chain
  inline def rinkeby: rinkeby = "rinkeby".asInstanceOf[rinkeby]
  
  @js.native
  sealed trait ropsten
    extends StObject
       with chain
  inline def ropsten: ropsten = "ropsten".asInstanceOf[ropsten]
  
  @js.native
  sealed trait sending extends StObject
  inline def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent extends StObject
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait spuriousDragon
    extends StObject
       with hardfork
  inline def spuriousDragon: spuriousDragon = "spuriousDragon".asInstanceOf[spuriousDragon]
  
  @js.native
  sealed trait tangerineWhistle
    extends StObject
       with hardfork
  inline def tangerineWhistle: tangerineWhistle = "tangerineWhistle".asInstanceOf[tangerineWhistle]
  
  @js.native
  sealed trait transactionHash extends StObject
  inline def transactionHash: transactionHash = "transactionHash".asInstanceOf[transactionHash]
}
