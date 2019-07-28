package typings.web3

import typings.web3.ethAbiMod._ABIDataTypes
import typings.web3.ethTypesMod._BlockType
import typings.web3.promiEventMod.PromiEventType
import typings.web3.utilsMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object web3Strings {
  @js.native
  sealed trait Gwei extends Unit
  
  @js.native
  sealed trait Kwei extends Unit
  
  @js.native
  sealed trait Mwei extends Unit
  
  @js.native
  sealed trait babbage extends Unit
  
  @js.native
  sealed trait boolean extends _ABIDataTypes
  
  @js.native
  sealed trait bytes extends _ABIDataTypes
  
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait confirmation extends PromiEventType
  
  @js.native
  sealed trait constructor extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait error extends PromiEventType
  
  @js.native
  sealed trait ether extends Unit
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait fallback extends js.Object
  
  @js.native
  sealed trait femtoether extends Unit
  
  @js.native
  sealed trait finney extends Unit
  
  @js.native
  sealed trait function extends js.Object
  
  @js.native
  sealed trait genesis extends _BlockType
  
  @js.native
  sealed trait gether extends Unit
  
  @js.native
  sealed trait grand extends Unit
  
  @js.native
  sealed trait gwei extends Unit
  
  @js.native
  sealed trait kether extends Unit
  
  @js.native
  sealed trait kwei extends Unit
  
  @js.native
  sealed trait latest extends _BlockType
  
  @js.native
  sealed trait logs extends js.Object
  
  @js.native
  sealed trait lovelace extends Unit
  
  @js.native
  sealed trait mether extends Unit
  
  @js.native
  sealed trait micro extends Unit
  
  @js.native
  sealed trait microether extends Unit
  
  @js.native
  sealed trait milli extends Unit
  
  @js.native
  sealed trait milliether extends Unit
  
  @js.native
  sealed trait mwei extends Unit
  
  @js.native
  sealed trait nano extends Unit
  
  @js.native
  sealed trait nanoether extends Unit
  
  @js.native
  sealed trait newBlockHeaders extends js.Object
  
  @js.native
  sealed trait noether extends Unit
  
  @js.native
  sealed trait nonpayable extends js.Object
  
  @js.native
  sealed trait payable extends js.Object
  
  @js.native
  sealed trait pending extends _BlockType
  
  @js.native
  sealed trait pendingTransactions extends js.Object
  
  @js.native
  sealed trait picoether extends Unit
  
  @js.native
  sealed trait pure extends js.Object
  
  @js.native
  sealed trait receipt extends PromiEventType
  
  @js.native
  sealed trait shannon extends Unit
  
  @js.native
  sealed trait string extends _ABIDataTypes
  
  @js.native
  sealed trait syncing extends js.Object
  
  @js.native
  sealed trait szabo extends Unit
  
  @js.native
  sealed trait tether extends Unit
  
  @js.native
  sealed trait transactionHash extends PromiEventType
  
  @js.native
  sealed trait uint256 extends _ABIDataTypes
  
  @js.native
  sealed trait view extends js.Object
  
  @js.native
  sealed trait wei extends Unit
  
  @scala.inline
  def Gwei: Gwei = "Gwei".asInstanceOf[Gwei]
  @scala.inline
  def Kwei: Kwei = "Kwei".asInstanceOf[Kwei]
  @scala.inline
  def Mwei: Mwei = "Mwei".asInstanceOf[Mwei]
  @scala.inline
  def babbage: babbage = "babbage".asInstanceOf[babbage]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def bytes: bytes = "bytes".asInstanceOf[bytes]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def confirmation: confirmation = "confirmation".asInstanceOf[confirmation]
  @scala.inline
  def constructor: constructor = "constructor".asInstanceOf[constructor]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def ether: ether = "ether".asInstanceOf[ether]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  @scala.inline
  def femtoether: femtoether = "femtoether".asInstanceOf[femtoether]
  @scala.inline
  def finney: finney = "finney".asInstanceOf[finney]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def genesis: genesis = "genesis".asInstanceOf[genesis]
  @scala.inline
  def gether: gether = "gether".asInstanceOf[gether]
  @scala.inline
  def grand: grand = "grand".asInstanceOf[grand]
  @scala.inline
  def gwei: gwei = "gwei".asInstanceOf[gwei]
  @scala.inline
  def kether: kether = "kether".asInstanceOf[kether]
  @scala.inline
  def kwei: kwei = "kwei".asInstanceOf[kwei]
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def logs: logs = "logs".asInstanceOf[logs]
  @scala.inline
  def lovelace: lovelace = "lovelace".asInstanceOf[lovelace]
  @scala.inline
  def mether: mether = "mether".asInstanceOf[mether]
  @scala.inline
  def micro: micro = "micro".asInstanceOf[micro]
  @scala.inline
  def microether: microether = "microether".asInstanceOf[microether]
  @scala.inline
  def milli: milli = "milli".asInstanceOf[milli]
  @scala.inline
  def milliether: milliether = "milliether".asInstanceOf[milliether]
  @scala.inline
  def mwei: mwei = "mwei".asInstanceOf[mwei]
  @scala.inline
  def nano: nano = "nano".asInstanceOf[nano]
  @scala.inline
  def nanoether: nanoether = "nanoether".asInstanceOf[nanoether]
  @scala.inline
  def newBlockHeaders: newBlockHeaders = "newBlockHeaders".asInstanceOf[newBlockHeaders]
  @scala.inline
  def noether: noether = "noether".asInstanceOf[noether]
  @scala.inline
  def nonpayable: nonpayable = "nonpayable".asInstanceOf[nonpayable]
  @scala.inline
  def payable: payable = "payable".asInstanceOf[payable]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def pendingTransactions: pendingTransactions = "pendingTransactions".asInstanceOf[pendingTransactions]
  @scala.inline
  def picoether: picoether = "picoether".asInstanceOf[picoether]
  @scala.inline
  def pure: pure = "pure".asInstanceOf[pure]
  @scala.inline
  def receipt: receipt = "receipt".asInstanceOf[receipt]
  @scala.inline
  def shannon: shannon = "shannon".asInstanceOf[shannon]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def syncing: syncing = "syncing".asInstanceOf[syncing]
  @scala.inline
  def szabo: szabo = "szabo".asInstanceOf[szabo]
  @scala.inline
  def tether: tether = "tether".asInstanceOf[tether]
  @scala.inline
  def transactionHash: transactionHash = "transactionHash".asInstanceOf[transactionHash]
  @scala.inline
  def uint256: uint256 = "uint256".asInstanceOf[uint256]
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  @scala.inline
  def wei: wei = "wei".asInstanceOf[wei]
}

