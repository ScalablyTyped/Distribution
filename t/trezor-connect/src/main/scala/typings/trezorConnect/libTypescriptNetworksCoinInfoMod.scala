package typings.trezorConnect

import org.scalablytyped.runtime.NumberDictionary
import typings.trezorConnect.anon.FeeLimit
import typings.trezorConnect.anon.Private
import typings.trezorConnect.trezorConnectStrings.bitcoin
import typings.trezorConnect.trezorConnectStrings.ethereum
import typings.trezorConnect.trezorConnectStrings.misc
import typings.trezorConnect.trezorConnectStrings.nem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNetworksCoinInfoMod {
  
  /* Inlined {[ key in trezor-connect.trezor-connect/lib/typescript/networks/coinInfo.BitcoinDefaultFeesKeys ]: number} */
  trait BitcoinDefaultFees extends StObject {
    
    var Economy: Double
    
    var High: Double
    
    var Low: Double
    
    var Normal: Double
  }
  object BitcoinDefaultFees {
    
    inline def apply(Economy: Double, High: Double, Low: Double, Normal: Double): BitcoinDefaultFees = {
      val __obj = js.Dynamic.literal(Economy = Economy.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitcoinDefaultFees]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitcoinDefaultFees] (val x: Self) extends AnyVal {
      
      inline def setEconomy(value: Double): Self = StObject.set(x, "Economy", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Double): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trezorConnect.trezorConnectStrings.High
    - typings.trezorConnect.trezorConnectStrings.Normal
    - typings.trezorConnect.trezorConnectStrings.Economy
    - typings.trezorConnect.trezorConnectStrings.Low
  */
  trait BitcoinDefaultFeesKeys extends StObject
  object BitcoinDefaultFeesKeys {
    
    inline def Economy: typings.trezorConnect.trezorConnectStrings.Economy = "Economy".asInstanceOf[typings.trezorConnect.trezorConnectStrings.Economy]
    
    inline def High: typings.trezorConnect.trezorConnectStrings.High = "High".asInstanceOf[typings.trezorConnect.trezorConnectStrings.High]
    
    inline def Low: typings.trezorConnect.trezorConnectStrings.Low = "Low".asInstanceOf[typings.trezorConnect.trezorConnectStrings.Low]
    
    inline def Normal: typings.trezorConnect.trezorConnectStrings.Normal = "Normal".asInstanceOf[typings.trezorConnect.trezorConnectStrings.Normal]
  }
  
  trait BitcoinNetworkInfo
    extends StObject
       with Common
       with CoinInfo {
    
    // used in backend
    var blocks: js.UndefOr[Double] = js.undefined
    
    var cashAddrPrefix: js.UndefOr[String] = js.undefined
    
    var curveName: String
    
    var defaultFees: BitcoinDefaultFees
    
    var dustLimit: Double
    
    var forceBip143: Boolean
    
    var hasTimestamp: Boolean
    
    var hashGenesisBlock: String
    
    var isBitcoin: Boolean
    
    var maxAddressLength: Double
    
    var maxFeeSatoshiKb: Double
    
    var minAddressLength: Double
    
    var minFeeSatoshiKb: Double
    
    // custom
    var network: Network
    
    var segwit: Boolean
    
    var taproot: js.UndefOr[Boolean] = js.undefined
    
    var `type`: bitcoin
    
    var xPubMagic: Double
    
    var xPubMagicSegwit: js.UndefOr[Double] = js.undefined
    
    var xPubMagicSegwitNative: js.UndefOr[Double] = js.undefined
  }
  object BitcoinNetworkInfo {
    
    inline def apply(
      blocktime: Double,
      curveName: String,
      decimals: Double,
      defaultFees: BitcoinDefaultFees,
      dustLimit: Double,
      forceBip143: Boolean,
      hasTimestamp: Boolean,
      hashGenesisBlock: String,
      isBitcoin: Boolean,
      label: String,
      maxAddressLength: Double,
      maxFee: Double,
      maxFeeSatoshiKb: Double,
      minAddressLength: Double,
      minFee: Double,
      minFeeSatoshiKb: Double,
      name: String,
      network: Network,
      segwit: Boolean,
      shortcut: String,
      slip44: Double,
      support: CoinSupport,
      xPubMagic: Double
    ): BitcoinNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], curveName = curveName.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], dustLimit = dustLimit.asInstanceOf[js.Any], forceBip143 = forceBip143.asInstanceOf[js.Any], hasTimestamp = hasTimestamp.asInstanceOf[js.Any], hashGenesisBlock = hashGenesisBlock.asInstanceOf[js.Any], isBitcoin = isBitcoin.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxAddressLength = maxAddressLength.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], maxFeeSatoshiKb = maxFeeSatoshiKb.asInstanceOf[js.Any], minAddressLength = minAddressLength.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], minFeeSatoshiKb = minFeeSatoshiKb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], segwit = segwit.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], xPubMagic = xPubMagic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bitcoin")
      __obj.asInstanceOf[BitcoinNetworkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitcoinNetworkInfo] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setCashAddrPrefix(value: String): Self = StObject.set(x, "cashAddrPrefix", value.asInstanceOf[js.Any])
      
      inline def setCashAddrPrefixUndefined: Self = StObject.set(x, "cashAddrPrefix", js.undefined)
      
      inline def setCurveName(value: String): Self = StObject.set(x, "curveName", value.asInstanceOf[js.Any])
      
      inline def setDefaultFees(value: BitcoinDefaultFees): Self = StObject.set(x, "defaultFees", value.asInstanceOf[js.Any])
      
      inline def setDustLimit(value: Double): Self = StObject.set(x, "dustLimit", value.asInstanceOf[js.Any])
      
      inline def setForceBip143(value: Boolean): Self = StObject.set(x, "forceBip143", value.asInstanceOf[js.Any])
      
      inline def setHasTimestamp(value: Boolean): Self = StObject.set(x, "hasTimestamp", value.asInstanceOf[js.Any])
      
      inline def setHashGenesisBlock(value: String): Self = StObject.set(x, "hashGenesisBlock", value.asInstanceOf[js.Any])
      
      inline def setIsBitcoin(value: Boolean): Self = StObject.set(x, "isBitcoin", value.asInstanceOf[js.Any])
      
      inline def setMaxAddressLength(value: Double): Self = StObject.set(x, "maxAddressLength", value.asInstanceOf[js.Any])
      
      inline def setMaxFeeSatoshiKb(value: Double): Self = StObject.set(x, "maxFeeSatoshiKb", value.asInstanceOf[js.Any])
      
      inline def setMinAddressLength(value: Double): Self = StObject.set(x, "minAddressLength", value.asInstanceOf[js.Any])
      
      inline def setMinFeeSatoshiKb(value: Double): Self = StObject.set(x, "minFeeSatoshiKb", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setSegwit(value: Boolean): Self = StObject.set(x, "segwit", value.asInstanceOf[js.Any])
      
      inline def setTaproot(value: Boolean): Self = StObject.set(x, "taproot", value.asInstanceOf[js.Any])
      
      inline def setTaprootUndefined: Self = StObject.set(x, "taproot", js.undefined)
      
      inline def setType(value: bitcoin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setXPubMagic(value: Double): Self = StObject.set(x, "xPubMagic", value.asInstanceOf[js.Any])
      
      inline def setXPubMagicSegwit(value: Double): Self = StObject.set(x, "xPubMagicSegwit", value.asInstanceOf[js.Any])
      
      inline def setXPubMagicSegwitNative(value: Double): Self = StObject.set(x, "xPubMagicSegwitNative", value.asInstanceOf[js.Any])
      
      inline def setXPubMagicSegwitNativeUndefined: Self = StObject.set(x, "xPubMagicSegwitNative", js.undefined)
      
      inline def setXPubMagicSegwitUndefined: Self = StObject.set(x, "xPubMagicSegwit", js.undefined)
    }
  }
  
  trait BlockchainLink extends StObject {
    
    var `type`: String
    
    var url: js.Array[String]
  }
  object BlockchainLink {
    
    inline def apply(`type`: String, url: js.Array[String]): BlockchainLink = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockchainLink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockchainLink] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trezorConnect.libTypescriptNetworksCoinInfoMod.BitcoinNetworkInfo
    - typings.trezorConnect.libTypescriptNetworksCoinInfoMod.EthereumNetworkInfo
    - typings.trezorConnect.libTypescriptNetworksCoinInfoMod.MiscNetworkInfo
  */
  trait CoinInfo extends StObject
  object CoinInfo {
    
    inline def BitcoinNetworkInfo(
      blocktime: Double,
      curveName: String,
      decimals: Double,
      defaultFees: BitcoinDefaultFees,
      dustLimit: Double,
      forceBip143: Boolean,
      hasTimestamp: Boolean,
      hashGenesisBlock: String,
      isBitcoin: Boolean,
      label: String,
      maxAddressLength: Double,
      maxFee: Double,
      maxFeeSatoshiKb: Double,
      minAddressLength: Double,
      minFee: Double,
      minFeeSatoshiKb: Double,
      name: String,
      network: Network,
      segwit: Boolean,
      shortcut: String,
      slip44: Double,
      support: CoinSupport,
      xPubMagic: Double
    ): typings.trezorConnect.libTypescriptNetworksCoinInfoMod.BitcoinNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], curveName = curveName.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], dustLimit = dustLimit.asInstanceOf[js.Any], forceBip143 = forceBip143.asInstanceOf[js.Any], hasTimestamp = hasTimestamp.asInstanceOf[js.Any], hashGenesisBlock = hashGenesisBlock.asInstanceOf[js.Any], isBitcoin = isBitcoin.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxAddressLength = maxAddressLength.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], maxFeeSatoshiKb = maxFeeSatoshiKb.asInstanceOf[js.Any], minAddressLength = minAddressLength.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], minFeeSatoshiKb = minFeeSatoshiKb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], segwit = segwit.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], xPubMagic = xPubMagic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bitcoin")
      __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksCoinInfoMod.BitcoinNetworkInfo]
    }
    
    inline def EthereumNetworkInfo(
      blocktime: Double,
      chain: String,
      chainId: Double,
      decimals: Double,
      defaultFees: js.Array[FeeLimit],
      label: String,
      maxFee: Double,
      minFee: Double,
      name: String,
      network: Unit,
      rskip60: Boolean,
      shortcut: String,
      slip44: Double,
      support: CoinSupport
    ): typings.trezorConnect.libTypescriptNetworksCoinInfoMod.EthereumNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], chain = chain.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], rskip60 = rskip60.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ethereum")
      __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksCoinInfoMod.EthereumNetworkInfo]
    }
    
    inline def MiscNetworkInfo(
      blocktime: Double,
      curve: String,
      decimals: Double,
      defaultFees: BitcoinDefaultFees,
      label: String,
      maxFee: Double,
      minFee: Double,
      name: String,
      network: Unit,
      shortcut: String,
      slip44: Double,
      support: CoinSupport,
      `type`: misc | nem
    ): typings.trezorConnect.libTypescriptNetworksCoinInfoMod.MiscNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.trezorConnect.libTypescriptNetworksCoinInfoMod.MiscNetworkInfo]
    }
  }
  
  trait CoinSupport extends StObject {
    
    var connect: Boolean
    
    var trezor1: String
    
    var trezor2: String
  }
  object CoinSupport {
    
    inline def apply(connect: Boolean, trezor1: String, trezor2: String): CoinSupport = {
      val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], trezor1 = trezor1.asInstanceOf[js.Any], trezor2 = trezor2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoinSupport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoinSupport] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setTrezor1(value: String): Self = StObject.set(x, "trezor1", value.asInstanceOf[js.Any])
      
      inline def setTrezor2(value: String): Self = StObject.set(x, "trezor2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Common extends StObject {
    
    var blockchainLink: js.UndefOr[BlockchainLink] = js.undefined
    
    var blocktime: Double
    
    var decimals: Double
    
    var label: String
    
    var maxFee: Double
    
    var minFee: Double
    
    // Human readable format, label != name
    var name: String
    
    // Trezor readable format
    var shortcut: String
    
    var slip44: Double
    
    var support: CoinSupport
  }
  object Common {
    
    inline def apply(
      blocktime: Double,
      decimals: Double,
      label: String,
      maxFee: Double,
      minFee: Double,
      name: String,
      shortcut: String,
      slip44: Double,
      support: CoinSupport
    ): Common = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
      __obj.asInstanceOf[Common]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
      
      inline def setBlockchainLink(value: BlockchainLink): Self = StObject.set(x, "blockchainLink", value.asInstanceOf[js.Any])
      
      inline def setBlockchainLinkUndefined: Self = StObject.set(x, "blockchainLink", js.undefined)
      
      inline def setBlocktime(value: Double): Self = StObject.set(x, "blocktime", value.asInstanceOf[js.Any])
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMaxFee(value: Double): Self = StObject.set(x, "maxFee", value.asInstanceOf[js.Any])
      
      inline def setMinFee(value: Double): Self = StObject.set(x, "minFee", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setSlip44(value: Double): Self = StObject.set(x, "slip44", value.asInstanceOf[js.Any])
      
      inline def setSupport(value: CoinSupport): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    }
  }
  
  trait EthereumNetworkInfo
    extends StObject
       with Common
       with CoinInfo {
    
    var chain: String
    
    var chainId: Double
    
    var defaultFees: js.Array[FeeLimit]
    
    var network: Unit
    
    var rskip60: Boolean
    
    var `type`: ethereum
  }
  object EthereumNetworkInfo {
    
    inline def apply(
      blocktime: Double,
      chain: String,
      chainId: Double,
      decimals: Double,
      defaultFees: js.Array[FeeLimit],
      label: String,
      maxFee: Double,
      minFee: Double,
      name: String,
      network: Unit,
      rskip60: Boolean,
      shortcut: String,
      slip44: Double,
      support: CoinSupport
    ): EthereumNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], chain = chain.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], rskip60 = rskip60.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ethereum")
      __obj.asInstanceOf[EthereumNetworkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EthereumNetworkInfo] (val x: Self) extends AnyVal {
      
      inline def setChain(value: String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setDefaultFees(value: js.Array[FeeLimit]): Self = StObject.set(x, "defaultFees", value.asInstanceOf[js.Any])
      
      inline def setDefaultFeesVarargs(value: FeeLimit*): Self = StObject.set(x, "defaultFees", js.Array(value*))
      
      inline def setNetwork(value: Unit): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setRskip60(value: Boolean): Self = StObject.set(x, "rskip60", value.asInstanceOf[js.Any])
      
      inline def setType(value: ethereum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCoinInfo extends StObject {
    
    var coin: String
  }
  object GetCoinInfo {
    
    inline def apply(coin: String): GetCoinInfo = {
      val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCoinInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCoinInfo] (val x: Self) extends AnyVal {
      
      inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiscNetworkInfo
    extends StObject
       with Common
       with CoinInfo {
    
    var curve: String
    
    var defaultFees: BitcoinDefaultFees
    
    var network: Unit
    
    var `type`: misc | nem
  }
  object MiscNetworkInfo {
    
    inline def apply(
      blocktime: Double,
      curve: String,
      decimals: Double,
      defaultFees: BitcoinDefaultFees,
      label: String,
      maxFee: Double,
      minFee: Double,
      name: String,
      network: Unit,
      shortcut: String,
      slip44: Double,
      support: CoinSupport,
      `type`: misc | nem
    ): MiscNetworkInfo = {
      val __obj = js.Dynamic.literal(blocktime = blocktime.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], defaultFees = defaultFees.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxFee = maxFee.asInstanceOf[js.Any], minFee = minFee.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], slip44 = slip44.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiscNetworkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiscNetworkInfo] (val x: Self) extends AnyVal {
      
      inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setDefaultFees(value: BitcoinDefaultFees): Self = StObject.set(x, "defaultFees", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Unit): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setType(value: misc | nem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Network extends StObject {
    
    var bech32: String
    
    var bip32: Private
    
    var consensusBranchId: js.UndefOr[NumberDictionary[Double]] = js.undefined
    
    var forkId: js.UndefOr[Double] = js.undefined
    
    var messagePrefix: String
    
    var pubKeyHash: Double
    
    var scriptHash: Double
    
    var wif: Double
  }
  object Network {
    
    inline def apply(
      bech32: String,
      bip32: Private,
      messagePrefix: String,
      pubKeyHash: Double,
      scriptHash: Double,
      wif: Double
    ): Network = {
      val __obj = js.Dynamic.literal(bech32 = bech32.asInstanceOf[js.Any], bip32 = bip32.asInstanceOf[js.Any], messagePrefix = messagePrefix.asInstanceOf[js.Any], pubKeyHash = pubKeyHash.asInstanceOf[js.Any], scriptHash = scriptHash.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      inline def setBech32(value: String): Self = StObject.set(x, "bech32", value.asInstanceOf[js.Any])
      
      inline def setBip32(value: Private): Self = StObject.set(x, "bip32", value.asInstanceOf[js.Any])
      
      inline def setConsensusBranchId(value: NumberDictionary[Double]): Self = StObject.set(x, "consensusBranchId", value.asInstanceOf[js.Any])
      
      inline def setConsensusBranchIdUndefined: Self = StObject.set(x, "consensusBranchId", js.undefined)
      
      inline def setForkId(value: Double): Self = StObject.set(x, "forkId", value.asInstanceOf[js.Any])
      
      inline def setForkIdUndefined: Self = StObject.set(x, "forkId", js.undefined)
      
      inline def setMessagePrefix(value: String): Self = StObject.set(x, "messagePrefix", value.asInstanceOf[js.Any])
      
      inline def setPubKeyHash(value: Double): Self = StObject.set(x, "pubKeyHash", value.asInstanceOf[js.Any])
      
      inline def setScriptHash(value: Double): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
      
      inline def setWif(value: Double): Self = StObject.set(x, "wif", value.asInstanceOf[js.Any])
    }
  }
}
