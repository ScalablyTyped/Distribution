package typings.web3Utils

import typings.bnJs.mod.^
import typings.std.Uint8Array
import typings.web3Utils.anon.R
import typings.web3Utils.web3UtilsStrings.gwei_
import typings.web3Utils.web3UtilsStrings.kwei_
import typings.web3Utils.web3UtilsStrings.mwei_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-utils", "asciiToHex")
  @js.native
  def asciiToHex(string: String): String = js.native
  @JSImport("web3-utils", "asciiToHex")
  @js.native
  def asciiToHex(string: String, length: Double): String = js.native
  
  @JSImport("web3-utils", "bytesToHex")
  @js.native
  def bytesToHex(bytes: js.Array[Double]): String = js.native
  
  @JSImport("web3-utils", "checkAddressChecksum")
  @js.native
  def checkAddressChecksum(address: String): Boolean = js.native
  @JSImport("web3-utils", "checkAddressChecksum")
  @js.native
  def checkAddressChecksum(address: String, chainId: Double): Boolean = js.native
  
  @JSImport("web3-utils", "encodePacked")
  @js.native
  def encodePacked(`val`: Mixed*): String | Null = js.native
  
  @JSImport("web3-utils", "fromAscii")
  @js.native
  def fromAscii(string: String): String = js.native
  
  @JSImport("web3-utils", "fromDecimal")
  @js.native
  def fromDecimal(value: String): String = js.native
  @JSImport("web3-utils", "fromDecimal")
  @js.native
  def fromDecimal(value: Double): String = js.native
  
  @JSImport("web3-utils", "fromUtf8")
  @js.native
  def fromUtf8(string: String): String = js.native
  
  @JSImport("web3-utils", "fromWei")
  @js.native
  def fromWei(value: String): String = js.native
  @JSImport("web3-utils", "fromWei")
  @js.native
  def fromWei(value: String, unit: Unit): String = js.native
  @JSImport("web3-utils", "fromWei")
  @js.native
  def fromWei(value: ^): String = js.native
  @JSImport("web3-utils", "fromWei")
  @js.native
  def fromWei(value: ^, unit: Unit): String = js.native
  
  @JSImport("web3-utils", "getSignatureParameters")
  @js.native
  def getSignatureParameters(signature: String): R = js.native
  
  @JSImport("web3-utils", "getUnitValue")
  @js.native
  def getUnitValue(unit: Unit): String = js.native
  
  @JSImport("web3-utils", "hexToAscii")
  @js.native
  def hexToAscii(string: String): String = js.native
  
  @JSImport("web3-utils", "hexToBytes")
  @js.native
  def hexToBytes(hex: Hex): js.Array[Double] = js.native
  
  @JSImport("web3-utils", "hexToNumber")
  @js.native
  def hexToNumber(hex: Hex): Double = js.native
  
  @JSImport("web3-utils", "hexToNumberString")
  @js.native
  def hexToNumberString(hex: Hex): String = js.native
  
  @JSImport("web3-utils", "hexToString")
  @js.native
  def hexToString(hex: Hex): String = js.native
  
  @JSImport("web3-utils", "hexToUtf8")
  @js.native
  def hexToUtf8(string: String): String = js.native
  
  @JSImport("web3-utils", "isAddress")
  @js.native
  def isAddress(address: String): Boolean = js.native
  @JSImport("web3-utils", "isAddress")
  @js.native
  def isAddress(address: String, chainId: Double): Boolean = js.native
  
  @JSImport("web3-utils", "isBN")
  @js.native
  def isBN(value: String): Boolean = js.native
  @JSImport("web3-utils", "isBN")
  @js.native
  def isBN(value: Double): Boolean = js.native
  
  @JSImport("web3-utils", "isBigNumber")
  @js.native
  def isBigNumber(value: ^): Boolean = js.native
  
  @JSImport("web3-utils", "isBloom")
  @js.native
  def isBloom(bloom: String): Boolean = js.native
  
  @JSImport("web3-utils", "isContractAddressInBloom")
  @js.native
  def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = js.native
  
  @JSImport("web3-utils", "isHex")
  @js.native
  def isHex(hex: Hex): Boolean = js.native
  
  @JSImport("web3-utils", "isHexStrict")
  @js.native
  def isHexStrict(hex: Hex): Boolean = js.native
  
  @JSImport("web3-utils", "isInBloom")
  @js.native
  def isInBloom(bloom: String, value: String): Boolean = js.native
  @JSImport("web3-utils", "isInBloom")
  @js.native
  def isInBloom(bloom: String, value: Uint8Array): Boolean = js.native
  
  @JSImport("web3-utils", "isTopic")
  @js.native
  def isTopic(topic: String): Boolean = js.native
  
  @JSImport("web3-utils", "isTopicInBloom")
  @js.native
  def isTopicInBloom(bloom: String, topic: String): Boolean = js.native
  
  @JSImport("web3-utils", "isUserEthereumAddressInBloom")
  @js.native
  def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = js.native
  
  @JSImport("web3-utils", "jsonInterfaceMethodToString")
  @js.native
  def jsonInterfaceMethodToString(abiItem: AbiItem): String = js.native
  
  @JSImport("web3-utils", "keccak256")
  @js.native
  def keccak256(value: String): String = js.native
  @JSImport("web3-utils", "keccak256")
  @js.native
  def keccak256(value: ^): String = js.native
  
  @JSImport("web3-utils", "leftPad")
  @js.native
  def leftPad(string: String, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "leftPad")
  @js.native
  def leftPad(string: String, characterAmount: Double, sign: String): String = js.native
  @JSImport("web3-utils", "leftPad")
  @js.native
  def leftPad(string: Double, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "leftPad")
  @js.native
  def leftPad(string: Double, characterAmount: Double, sign: String): String = js.native
  
  @JSImport("web3-utils", "numberToHex")
  @js.native
  def numberToHex(value: String): String = js.native
  @JSImport("web3-utils", "numberToHex")
  @js.native
  def numberToHex(value: Double): String = js.native
  @JSImport("web3-utils", "numberToHex")
  @js.native
  def numberToHex(value: ^): String = js.native
  
  @JSImport("web3-utils", "padLeft")
  @js.native
  def padLeft(value: String, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "padLeft")
  @js.native
  def padLeft(value: String, characterAmount: Double, sign: String): String = js.native
  @JSImport("web3-utils", "padLeft")
  @js.native
  def padLeft(value: Double, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "padLeft")
  @js.native
  def padLeft(value: Double, characterAmount: Double, sign: String): String = js.native
  
  @JSImport("web3-utils", "padRight")
  @js.native
  def padRight(string: String, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "padRight")
  @js.native
  def padRight(string: String, characterAmount: Double, sign: String): String = js.native
  @JSImport("web3-utils", "padRight")
  @js.native
  def padRight(string: Double, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "padRight")
  @js.native
  def padRight(string: Double, characterAmount: Double, sign: String): String = js.native
  
  @JSImport("web3-utils", "randomHex")
  @js.native
  def randomHex(bytesSize: Double): String = js.native
  
  @JSImport("web3-utils", "rightPad")
  @js.native
  def rightPad(string: String, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "rightPad")
  @js.native
  def rightPad(string: String, characterAmount: Double, sign: String): String = js.native
  @JSImport("web3-utils", "rightPad")
  @js.native
  def rightPad(string: Double, characterAmount: Double): String = js.native
  @JSImport("web3-utils", "rightPad")
  @js.native
  def rightPad(string: Double, characterAmount: Double, sign: String): String = js.native
  
  @JSImport("web3-utils", "sha3")
  @js.native
  def sha3(value: String): String | Null = js.native
  @JSImport("web3-utils", "sha3")
  @js.native
  def sha3(value: ^): String | Null = js.native
  
  @JSImport("web3-utils", "sha3Raw")
  @js.native
  def sha3Raw(value: String): String = js.native
  @JSImport("web3-utils", "sha3Raw")
  @js.native
  def sha3Raw(value: ^): String = js.native
  
  @JSImport("web3-utils", "soliditySha3")
  @js.native
  def soliditySha3(`val`: Mixed*): String | Null = js.native
  
  @JSImport("web3-utils", "soliditySha3Raw")
  @js.native
  def soliditySha3Raw(`val`: Mixed*): String = js.native
  
  @JSImport("web3-utils", "stringToHex")
  @js.native
  def stringToHex(string: String): String = js.native
  
  @JSImport("web3-utils", "stripHexPrefix")
  @js.native
  def stripHexPrefix(str: String): String = js.native
  
  @JSImport("web3-utils", "testAddress")
  @js.native
  def testAddress(bloom: String, address: String): Boolean = js.native
  
  @JSImport("web3-utils", "testTopic")
  @js.native
  def testTopic(bloom: String, topic: String): Boolean = js.native
  
  @JSImport("web3-utils", "toAscii")
  @js.native
  def toAscii(string: String): String = js.native
  
  @JSImport("web3-utils", "toBN")
  @js.native
  def toBN(value: String): ^ = js.native
  @JSImport("web3-utils", "toBN")
  @js.native
  def toBN(value: Double): ^ = js.native
  
  @JSImport("web3-utils", "toChecksumAddress")
  @js.native
  def toChecksumAddress(address: String): String = js.native
  @JSImport("web3-utils", "toChecksumAddress")
  @js.native
  def toChecksumAddress(address: String, chainId: Double): String = js.native
  
  @JSImport("web3-utils", "toDecimal")
  @js.native
  def toDecimal(hex: Hex): Double = js.native
  
  @JSImport("web3-utils", "toHex")
  @js.native
  def toHex(value: String): String = js.native
  @JSImport("web3-utils", "toHex")
  @js.native
  def toHex(value: Double): String = js.native
  @JSImport("web3-utils", "toHex")
  @js.native
  def toHex(value: ^): String = js.native
  
  @JSImport("web3-utils", "toTwosComplement")
  @js.native
  def toTwosComplement(value: String): String = js.native
  @JSImport("web3-utils", "toTwosComplement")
  @js.native
  def toTwosComplement(value: Double): String = js.native
  @JSImport("web3-utils", "toTwosComplement")
  @js.native
  def toTwosComplement(value: ^): String = js.native
  
  @JSImport("web3-utils", "toUtf8")
  @js.native
  def toUtf8(string: String): String = js.native
  
  @JSImport("web3-utils", "toWei")
  @js.native
  def toWei(`val`: String): String = js.native
  @JSImport("web3-utils", "toWei")
  @js.native
  def toWei(`val`: String, unit: Unit): String = js.native
  @JSImport("web3-utils", "toWei")
  @js.native
  def toWei(`val`: ^): ^ = js.native
  @JSImport("web3-utils", "toWei")
  @js.native
  def toWei(`val`: ^, unit: Unit): ^ = js.native
  
  @JSImport("web3-utils", "unitMap")
  @js.native
  def unitMap(): Units = js.native
  
  @JSImport("web3-utils", "utf8ToHex")
  @js.native
  def utf8ToHex(string: String): String = js.native
  
  @js.native
  trait AbiInput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiInput]] = js.native
    
    var indexed: js.UndefOr[Boolean] = js.native
    
    var internalType: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object AbiInput {
    
    @scala.inline
    def apply(name: String, `type`: String): AbiInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiInput]
    }
    
    @scala.inline
    implicit class AbiInputMutableBuilder[Self <: AbiInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Array[AbiInput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: AbiInput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      @scala.inline
      def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AbiItem extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.native
    
    var constant: js.UndefOr[Boolean] = js.native
    
    var gas: js.UndefOr[Double] = js.native
    
    var inputs: js.UndefOr[js.Array[AbiInput]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var outputs: js.UndefOr[js.Array[AbiOutput]] = js.native
    
    var payable: js.UndefOr[Boolean] = js.native
    
    var stateMutability: js.UndefOr[StateMutabilityType] = js.native
    
    var `type`: AbiType = js.native
  }
  object AbiItem {
    
    @scala.inline
    def apply(`type`: AbiType): AbiItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiItem]
    }
    
    @scala.inline
    implicit class AbiItemMutableBuilder[Self <: AbiItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[AbiInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: AbiInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputs(value: js.Array[AbiOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: AbiOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      @scala.inline
      def setStateMutability(value: StateMutabilityType): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      @scala.inline
      def setType(value: AbiType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AbiOutput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiOutput]] = js.native
    
    var internalType: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object AbiOutput {
    
    @scala.inline
    def apply(name: String, `type`: String): AbiOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiOutput]
    }
    
    @scala.inline
    implicit class AbiOutputMutableBuilder[Self <: AbiOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Array[AbiOutput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: AbiOutput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.web3Utils.web3UtilsStrings.function
    - typings.web3Utils.web3UtilsStrings.constructor
    - typings.web3Utils.web3UtilsStrings.event
    - typings.web3Utils.web3UtilsStrings.fallback
  */
  trait AbiType extends StObject
  object AbiType {
    
    @scala.inline
    def constructor: typings.web3Utils.web3UtilsStrings.constructor = "constructor".asInstanceOf[typings.web3Utils.web3UtilsStrings.constructor]
    
    @scala.inline
    def event: typings.web3Utils.web3UtilsStrings.event = "event".asInstanceOf[typings.web3Utils.web3UtilsStrings.event]
    
    @scala.inline
    def fallback: typings.web3Utils.web3UtilsStrings.fallback = "fallback".asInstanceOf[typings.web3Utils.web3UtilsStrings.fallback]
    
    @scala.inline
    def function: typings.web3Utils.web3UtilsStrings.function = "function".asInstanceOf[typings.web3Utils.web3UtilsStrings.function]
  }
  
  type Hex = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.bnJs.mod.^
    - typings.web3Utils.anon.Type
    - typings.web3Utils.anon.T
    - scala.Boolean
  */
  type Mixed = _Mixed | String | Double | ^ | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.web3Utils.web3UtilsStrings.pure
    - typings.web3Utils.web3UtilsStrings.view
    - typings.web3Utils.web3UtilsStrings.nonpayable
    - typings.web3Utils.web3UtilsStrings.payable
  */
  trait StateMutabilityType extends StObject
  object StateMutabilityType {
    
    @scala.inline
    def nonpayable: typings.web3Utils.web3UtilsStrings.nonpayable = "nonpayable".asInstanceOf[typings.web3Utils.web3UtilsStrings.nonpayable]
    
    @scala.inline
    def payable: typings.web3Utils.web3UtilsStrings.payable = "payable".asInstanceOf[typings.web3Utils.web3UtilsStrings.payable]
    
    @scala.inline
    def pure: typings.web3Utils.web3UtilsStrings.pure = "pure".asInstanceOf[typings.web3Utils.web3UtilsStrings.pure]
    
    @scala.inline
    def view: typings.web3Utils.web3UtilsStrings.view = "view".asInstanceOf[typings.web3Utils.web3UtilsStrings.view]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.web3Utils.web3UtilsStrings.noether
    - typings.web3Utils.web3UtilsStrings.wei
    - typings.web3Utils.web3UtilsStrings.kwei_
    - typings.web3Utils.web3UtilsStrings.Kwei
    - typings.web3Utils.web3UtilsStrings.babbage
    - typings.web3Utils.web3UtilsStrings.femtoether
    - typings.web3Utils.web3UtilsStrings.mwei_
    - typings.web3Utils.web3UtilsStrings.Mwei
    - typings.web3Utils.web3UtilsStrings.lovelace
    - typings.web3Utils.web3UtilsStrings.picoether
    - typings.web3Utils.web3UtilsStrings.gwei_
    - typings.web3Utils.web3UtilsStrings.Gwei
    - typings.web3Utils.web3UtilsStrings.shannon
    - typings.web3Utils.web3UtilsStrings.nanoether
    - typings.web3Utils.web3UtilsStrings.nano
    - typings.web3Utils.web3UtilsStrings.szabo
    - typings.web3Utils.web3UtilsStrings.microether
    - typings.web3Utils.web3UtilsStrings.micro
    - typings.web3Utils.web3UtilsStrings.finney
    - typings.web3Utils.web3UtilsStrings.milliether
    - typings.web3Utils.web3UtilsStrings.milli
    - typings.web3Utils.web3UtilsStrings.ether
    - typings.web3Utils.web3UtilsStrings.kether
    - typings.web3Utils.web3UtilsStrings.grand
    - typings.web3Utils.web3UtilsStrings.mether
    - typings.web3Utils.web3UtilsStrings.gether
    - typings.web3Utils.web3UtilsStrings.tether
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def Gwei: typings.web3Utils.web3UtilsStrings.Gwei = "Gwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Gwei]
    
    @scala.inline
    def Kwei: typings.web3Utils.web3UtilsStrings.Kwei = "Kwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Kwei]
    
    @scala.inline
    def Mwei: typings.web3Utils.web3UtilsStrings.Mwei = "Mwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Mwei]
    
    @scala.inline
    def babbage: typings.web3Utils.web3UtilsStrings.babbage = "babbage".asInstanceOf[typings.web3Utils.web3UtilsStrings.babbage]
    
    @scala.inline
    def ether: typings.web3Utils.web3UtilsStrings.ether = "ether".asInstanceOf[typings.web3Utils.web3UtilsStrings.ether]
    
    @scala.inline
    def femtoether: typings.web3Utils.web3UtilsStrings.femtoether = "femtoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.femtoether]
    
    @scala.inline
    def finney: typings.web3Utils.web3UtilsStrings.finney = "finney".asInstanceOf[typings.web3Utils.web3UtilsStrings.finney]
    
    @scala.inline
    def gether: typings.web3Utils.web3UtilsStrings.gether = "gether".asInstanceOf[typings.web3Utils.web3UtilsStrings.gether]
    
    @scala.inline
    def grand: typings.web3Utils.web3UtilsStrings.grand = "grand".asInstanceOf[typings.web3Utils.web3UtilsStrings.grand]
    
    @scala.inline
    def gwei: gwei_ = "gwei".asInstanceOf[gwei_]
    
    @scala.inline
    def kether: typings.web3Utils.web3UtilsStrings.kether = "kether".asInstanceOf[typings.web3Utils.web3UtilsStrings.kether]
    
    @scala.inline
    def kwei: kwei_ = "kwei".asInstanceOf[kwei_]
    
    @scala.inline
    def lovelace: typings.web3Utils.web3UtilsStrings.lovelace = "lovelace".asInstanceOf[typings.web3Utils.web3UtilsStrings.lovelace]
    
    @scala.inline
    def mether: typings.web3Utils.web3UtilsStrings.mether = "mether".asInstanceOf[typings.web3Utils.web3UtilsStrings.mether]
    
    @scala.inline
    def micro: typings.web3Utils.web3UtilsStrings.micro = "micro".asInstanceOf[typings.web3Utils.web3UtilsStrings.micro]
    
    @scala.inline
    def microether: typings.web3Utils.web3UtilsStrings.microether = "microether".asInstanceOf[typings.web3Utils.web3UtilsStrings.microether]
    
    @scala.inline
    def milli: typings.web3Utils.web3UtilsStrings.milli = "milli".asInstanceOf[typings.web3Utils.web3UtilsStrings.milli]
    
    @scala.inline
    def milliether: typings.web3Utils.web3UtilsStrings.milliether = "milliether".asInstanceOf[typings.web3Utils.web3UtilsStrings.milliether]
    
    @scala.inline
    def mwei: mwei_ = "mwei".asInstanceOf[mwei_]
    
    @scala.inline
    def nano: typings.web3Utils.web3UtilsStrings.nano = "nano".asInstanceOf[typings.web3Utils.web3UtilsStrings.nano]
    
    @scala.inline
    def nanoether: typings.web3Utils.web3UtilsStrings.nanoether = "nanoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.nanoether]
    
    @scala.inline
    def noether: typings.web3Utils.web3UtilsStrings.noether = "noether".asInstanceOf[typings.web3Utils.web3UtilsStrings.noether]
    
    @scala.inline
    def picoether: typings.web3Utils.web3UtilsStrings.picoether = "picoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.picoether]
    
    @scala.inline
    def shannon: typings.web3Utils.web3UtilsStrings.shannon = "shannon".asInstanceOf[typings.web3Utils.web3UtilsStrings.shannon]
    
    @scala.inline
    def szabo: typings.web3Utils.web3UtilsStrings.szabo = "szabo".asInstanceOf[typings.web3Utils.web3UtilsStrings.szabo]
    
    @scala.inline
    def tether: typings.web3Utils.web3UtilsStrings.tether = "tether".asInstanceOf[typings.web3Utils.web3UtilsStrings.tether]
    
    @scala.inline
    def wei: typings.web3Utils.web3UtilsStrings.wei = "wei".asInstanceOf[typings.web3Utils.web3UtilsStrings.wei]
  }
  
  @js.native
  trait Units extends StObject {
    
    var Gwei: String = js.native
    
    var Kwei: String = js.native
    
    var Mwei: String = js.native
    
    var babbage: String = js.native
    
    var ether: String = js.native
    
    var femtoether: String = js.native
    
    var finney: String = js.native
    
    var gether: String = js.native
    
    var grand: String = js.native
    
    var gwei: String = js.native
    
    var kether: String = js.native
    
    var kwei: String = js.native
    
    var lovelace: String = js.native
    
    var mether: String = js.native
    
    var micro: String = js.native
    
    var microether: String = js.native
    
    var milli: String = js.native
    
    var milliether: String = js.native
    
    var mwei: String = js.native
    
    var nano: String = js.native
    
    var nanoether: String = js.native
    
    var noether: String = js.native
    
    var picoether: String = js.native
    
    var shannon: String = js.native
    
    var szabo: String = js.native
    
    var tether: String = js.native
    
    var wei: String = js.native
  }
  object Units {
    
    @scala.inline
    def apply(
      Gwei: String,
      Kwei: String,
      Mwei: String,
      babbage: String,
      ether: String,
      femtoether: String,
      finney: String,
      gether: String,
      grand: String,
      gwei: String,
      kether: String,
      kwei: String,
      lovelace: String,
      mether: String,
      micro: String,
      microether: String,
      milli: String,
      milliether: String,
      mwei: String,
      nano: String,
      nanoether: String,
      noether: String,
      picoether: String,
      shannon: String,
      szabo: String,
      tether: String,
      wei: String
    ): Units = {
      val __obj = js.Dynamic.literal(Gwei = Gwei.asInstanceOf[js.Any], Kwei = Kwei.asInstanceOf[js.Any], Mwei = Mwei.asInstanceOf[js.Any], babbage = babbage.asInstanceOf[js.Any], ether = ether.asInstanceOf[js.Any], femtoether = femtoether.asInstanceOf[js.Any], finney = finney.asInstanceOf[js.Any], gether = gether.asInstanceOf[js.Any], grand = grand.asInstanceOf[js.Any], gwei = gwei.asInstanceOf[js.Any], kether = kether.asInstanceOf[js.Any], kwei = kwei.asInstanceOf[js.Any], lovelace = lovelace.asInstanceOf[js.Any], mether = mether.asInstanceOf[js.Any], micro = micro.asInstanceOf[js.Any], microether = microether.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], milliether = milliether.asInstanceOf[js.Any], mwei = mwei.asInstanceOf[js.Any], nano = nano.asInstanceOf[js.Any], nanoether = nanoether.asInstanceOf[js.Any], noether = noether.asInstanceOf[js.Any], picoether = picoether.asInstanceOf[js.Any], shannon = shannon.asInstanceOf[js.Any], szabo = szabo.asInstanceOf[js.Any], tether = tether.asInstanceOf[js.Any], wei = wei.asInstanceOf[js.Any])
      __obj.asInstanceOf[Units]
    }
    
    @scala.inline
    implicit class UnitsMutableBuilder[Self <: Units] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabbage(value: String): Self = StObject.set(x, "babbage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEther(value: String): Self = StObject.set(x, "ether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFemtoether(value: String): Self = StObject.set(x, "femtoether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinney(value: String): Self = StObject.set(x, "finney", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGether(value: String): Self = StObject.set(x, "gether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrand(value: String): Self = StObject.set(x, "grand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGwei(value: String): Self = StObject.set(x, "Gwei", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKether(value: String): Self = StObject.set(x, "kether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKwei(value: String): Self = StObject.set(x, "Kwei", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLovelace(value: String): Self = StObject.set(x, "lovelace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMether(value: String): Self = StObject.set(x, "mether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicro(value: String): Self = StObject.set(x, "micro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMicroether(value: String): Self = StObject.set(x, "microether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilli(value: String): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilliether(value: String): Self = StObject.set(x, "milliether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMwei(value: String): Self = StObject.set(x, "Mwei", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNano(value: String): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNanoether(value: String): Self = StObject.set(x, "nanoether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoether(value: String): Self = StObject.set(x, "noether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicoether(value: String): Self = StObject.set(x, "picoether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShannon(value: String): Self = StObject.set(x, "shannon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSzabo(value: String): Self = StObject.set(x, "szabo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTether(value: String): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWei(value: String): Self = StObject.set(x, "wei", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Utils extends StObject {
    
    def asciiToHex(string: String): String = js.native
    def asciiToHex(string: String, length: Double): String = js.native
    
    def bytesToHex(bytes: js.Array[Double]): String = js.native
    
    def checkAddressChecksum(address: String): Boolean = js.native
    def checkAddressChecksum(address: String, chainId: Double): Boolean = js.native
    
    def encodePacked(`val`: Mixed*): String | Null = js.native
    
    def fromAscii(string: String): String = js.native
    
    def fromDecimal(value: String): String = js.native
    def fromDecimal(value: Double): String = js.native
    
    def fromUtf8(string: String): String = js.native
    
    def fromWei(value: String): String = js.native
    def fromWei(value: String, unit: Unit): String = js.native
    def fromWei(value: ^): String = js.native
    def fromWei(value: ^, unit: Unit): String = js.native
    
    def getSignatureParameters(signature: String): R = js.native
    
    def getUnitValue(unit: Unit): String = js.native
    
    def hexToAscii(string: String): String = js.native
    
    def hexToBytes(hex: Hex): js.Array[Double] = js.native
    
    def hexToNumber(hex: Hex): Double = js.native
    
    def hexToNumberString(hex: Hex): String = js.native
    
    def hexToString(hex: Hex): String = js.native
    
    def hexToUtf8(string: String): String = js.native
    
    def isAddress(address: String): Boolean = js.native
    def isAddress(address: String, chainId: Double): Boolean = js.native
    
    def isBN(value: String): Boolean = js.native
    def isBN(value: Double): Boolean = js.native
    
    def isBigNumber(value: ^): Boolean = js.native
    
    def isBloom(bloom: String): Boolean = js.native
    
    def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = js.native
    
    def isHex(hex: Hex): Boolean = js.native
    
    def isHexStrict(hex: Hex): Boolean = js.native
    
    def isInBloom(bloom: String, value: String): Boolean = js.native
    def isInBloom(bloom: String, value: Uint8Array): Boolean = js.native
    
    def isTopic(topic: String): Boolean = js.native
    
    def isTopicInBloom(bloom: String, topic: String): Boolean = js.native
    
    def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = js.native
    
    def jsonInterfaceMethodToString(abiItem: AbiItem): String = js.native
    
    def keccak256(value: String): String = js.native
    def keccak256(value: ^): String = js.native
    
    def leftPad(string: String, characterAmount: Double): String = js.native
    def leftPad(string: String, characterAmount: Double, sign: String): String = js.native
    def leftPad(string: Double, characterAmount: Double): String = js.native
    def leftPad(string: Double, characterAmount: Double, sign: String): String = js.native
    
    def numberToHex(value: String): String = js.native
    def numberToHex(value: Double): String = js.native
    def numberToHex(value: ^): String = js.native
    
    def padLeft(value: String, characterAmount: Double): String = js.native
    def padLeft(value: String, characterAmount: Double, sign: String): String = js.native
    def padLeft(value: Double, characterAmount: Double): String = js.native
    def padLeft(value: Double, characterAmount: Double, sign: String): String = js.native
    
    def padRight(string: String, characterAmount: Double): String = js.native
    def padRight(string: String, characterAmount: Double, sign: String): String = js.native
    def padRight(string: Double, characterAmount: Double): String = js.native
    def padRight(string: Double, characterAmount: Double, sign: String): String = js.native
    
    def randomHex(bytesSize: Double): String = js.native
    
    def rightPad(string: String, characterAmount: Double): String = js.native
    def rightPad(string: String, characterAmount: Double, sign: String): String = js.native
    def rightPad(string: Double, characterAmount: Double): String = js.native
    def rightPad(string: Double, characterAmount: Double, sign: String): String = js.native
    
    def sha3(value: String): String | Null = js.native
    def sha3(value: ^): String | Null = js.native
    
    def soliditySha3(`val`: Mixed*): String | Null = js.native
    
    def soliditySha3Raw(`val`: Mixed*): String = js.native
    
    def stringToHex(string: String): String = js.native
    
    def stripHexPrefix(str: String): String = js.native
    
    def testAddress(bloom: String, address: String): Boolean = js.native
    
    def testTopic(bloom: String, topic: String): Boolean = js.native
    
    def toAscii(string: String): String = js.native
    
    def toBN(value: String): ^ = js.native
    def toBN(value: Double): ^ = js.native
    
    def toChecksumAddress(address: String): String = js.native
    def toChecksumAddress(address: String, chainId: Double): String = js.native
    
    def toDecimal(hex: Hex): Double = js.native
    
    def toHex(value: String): String = js.native
    def toHex(value: Double): String = js.native
    def toHex(value: ^): String = js.native
    
    def toTwosComplement(value: String): String = js.native
    def toTwosComplement(value: Double): String = js.native
    def toTwosComplement(value: ^): String = js.native
    
    def toUtf8(string: String): String = js.native
    
    def toWei(`val`: String): String = js.native
    def toWei(`val`: String, unit: Unit): String = js.native
    def toWei(`val`: ^): ^ = js.native
    def toWei(`val`: ^, unit: Unit): ^ = js.native
    
    def unitMap(): Units = js.native
    
    def utf8ToHex(string: String): String = js.native
  }
  
  trait _Mixed extends StObject
  object _Mixed {
    
    @scala.inline
    def T(t: String, v: String | ^ | Double): typings.web3Utils.anon.T = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.web3Utils.anon.T]
    }
    
    @scala.inline
    def Type(`type`: String, value: String): typings.web3Utils.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.web3Utils.anon.Type]
    }
  }
}
