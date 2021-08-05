package typings.web3Utils

import typings.std.Uint8Array
import typings.web3Utils.anon.R
import typings.web3Utils.web3UtilsStrings.gwei_
import typings.web3Utils.web3UtilsStrings.kwei_
import typings.web3Utils.web3UtilsStrings.mwei_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asciiToHex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asciiToHex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asciiToHex(string: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asciiToHex")(string.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def bytesToHex(bytes: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def checkAddressChecksum(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAddressChecksum")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def checkAddressChecksum(address: String, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAddressChecksum")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def encodePacked(`val`: Mixed*): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePacked")(`val`.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def fromAscii(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromDecimal(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromDecimal(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromUtf8(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromWei(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWei")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromWei(value: String, unit: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWei")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fromWei(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWei")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromWei(value: typings.bnJs.mod.^, unit: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWei")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSignatureParameters(signature: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureParameters")(signature.asInstanceOf[js.Any]).asInstanceOf[R]
  
  inline def getUnitValue(unit: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnitValue")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToAscii(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToAscii")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToBytes(hex: Hex): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def hexToNumber(hex: Hex): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToNumber")(hex.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToNumberString(hex: Hex): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToNumberString")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToString(hex: Hex): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToString")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToUtf8(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToUtf8")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAddress(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAddress(address: String, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAddress")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBN(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBN(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBigNumber(value: typings.bnJs.mod.^): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBloom(bloom: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBloom")(bloom.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContractAddressInBloom")(bloom.asInstanceOf[js.Any], contractAddress.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isHex(hex: Hex): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(hex.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHexStrict(hex: Hex): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexStrict")(hex.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInBloom(bloom: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInBloom")(bloom.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isInBloom(bloom: String, value: Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInBloom")(bloom.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTopic(topic: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopic")(topic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTopicInBloom(bloom: String, topic: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTopicInBloom")(bloom.asInstanceOf[js.Any], topic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUserEthereumAddressInBloom")(bloom.asInstanceOf[js.Any], ethereumAddress.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def jsonInterfaceMethodToString(abiItem: AbiItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonInterfaceMethodToString")(abiItem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keccak256(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def keccak256(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keccak256")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def leftPad(string: String, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def leftPad(string: String, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def leftPad(string: Double, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def leftPad(string: Double, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def numberToHex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def numberToHex(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def numberToHex(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def padLeft(value: String, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(value.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padLeft(value: String, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(value.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padLeft(value: Double, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(value.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padLeft(value: Double, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(value.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def padRight(string: String, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padRight(string: String, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padRight(string: Double, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padRight(string: Double, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def randomHex(bytesSize: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomHex")(bytesSize.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rightPad(string: String, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rightPad(string: String, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rightPad(string: Double, characterAmount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rightPad(string: Double, characterAmount: Double, sign: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(string.asInstanceOf[js.Any], characterAmount.asInstanceOf[js.Any], sign.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sha3(value: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def sha3(value: typings.bnJs.mod.^): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def sha3Raw(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3Raw")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sha3Raw(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha3Raw")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def soliditySha3(`val`: Mixed*): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("soliditySha3")(`val`.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def soliditySha3Raw(`val`: Mixed*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("soliditySha3Raw")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToHex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToHex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def testAddress(bloom: String, address: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testAddress")(bloom.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def testTopic(bloom: String, topic: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testTopic")(bloom.asInstanceOf[js.Any], topic.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toAscii(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBN(value: String): typings.bnJs.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("toBN")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bnJs.mod.^]
  inline def toBN(value: Double): typings.bnJs.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("toBN")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bnJs.mod.^]
  
  inline def toChecksumAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toChecksumAddress(address: String, chainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(address.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toDecimal(hex: Hex): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(hex.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toHex(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHex(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHex(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTwosComplement(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTwosComplement")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTwosComplement(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTwosComplement")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTwosComplement(value: typings.bnJs.mod.^): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTwosComplement")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toUtf8(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toWei(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWei")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toWei(`val`: String, unit: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toWei")(`val`.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toWei(`val`: typings.bnJs.mod.^): typings.bnJs.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("toWei")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bnJs.mod.^]
  inline def toWei(`val`: typings.bnJs.mod.^, unit: Unit): typings.bnJs.mod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("toWei")(`val`.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.^]
  
  inline def unitMap(): Units = ^.asInstanceOf[js.Dynamic].applyDynamic("unitMap")().asInstanceOf[Units]
  
  inline def utf8ToHex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToHex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AbiInput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiInput]] = js.undefined
    
    var indexed: js.UndefOr[Boolean] = js.undefined
    
    var internalType: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `type`: String
  }
  object AbiInput {
    
    inline def apply(name: String, `type`: String): AbiInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiInput]
    }
    
    extension [Self <: AbiInput](x: Self) {
      
      inline def setComponents(value: js.Array[AbiInput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: AbiInput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      inline def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbiItem extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.undefined
    
    var constant: js.UndefOr[Boolean] = js.undefined
    
    var gas: js.UndefOr[Double] = js.undefined
    
    var inputs: js.UndefOr[js.Array[AbiInput]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var outputs: js.UndefOr[js.Array[AbiOutput]] = js.undefined
    
    var payable: js.UndefOr[Boolean] = js.undefined
    
    var stateMutability: js.UndefOr[StateMutabilityType] = js.undefined
    
    var `type`: AbiType
  }
  object AbiItem {
    
    inline def apply(`type`: AbiType): AbiItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiItem]
    }
    
    extension [Self <: AbiItem](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setInputs(value: js.Array[AbiInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: AbiInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputs(value: js.Array[AbiOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: AbiOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      inline def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      inline def setStateMutability(value: StateMutabilityType): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      inline def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      inline def setType(value: AbiType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbiOutput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiOutput]] = js.undefined
    
    var internalType: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `type`: String
  }
  object AbiOutput {
    
    inline def apply(name: String, `type`: String): AbiOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiOutput]
    }
    
    extension [Self <: AbiOutput](x: Self) {
      
      inline def setComponents(value: js.Array[AbiOutput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: AbiOutput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      inline def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def constructor: typings.web3Utils.web3UtilsStrings.constructor = "constructor".asInstanceOf[typings.web3Utils.web3UtilsStrings.constructor]
    
    inline def event: typings.web3Utils.web3UtilsStrings.event = "event".asInstanceOf[typings.web3Utils.web3UtilsStrings.event]
    
    inline def fallback: typings.web3Utils.web3UtilsStrings.fallback = "fallback".asInstanceOf[typings.web3Utils.web3UtilsStrings.fallback]
    
    inline def function: typings.web3Utils.web3UtilsStrings.function = "function".asInstanceOf[typings.web3Utils.web3UtilsStrings.function]
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
  type Mixed = _Mixed | String | Double | typings.bnJs.mod.^ | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.web3Utils.web3UtilsStrings.pure
    - typings.web3Utils.web3UtilsStrings.view
    - typings.web3Utils.web3UtilsStrings.nonpayable
    - typings.web3Utils.web3UtilsStrings.payable
  */
  trait StateMutabilityType extends StObject
  object StateMutabilityType {
    
    inline def nonpayable: typings.web3Utils.web3UtilsStrings.nonpayable = "nonpayable".asInstanceOf[typings.web3Utils.web3UtilsStrings.nonpayable]
    
    inline def payable: typings.web3Utils.web3UtilsStrings.payable = "payable".asInstanceOf[typings.web3Utils.web3UtilsStrings.payable]
    
    inline def pure: typings.web3Utils.web3UtilsStrings.pure = "pure".asInstanceOf[typings.web3Utils.web3UtilsStrings.pure]
    
    inline def view: typings.web3Utils.web3UtilsStrings.view = "view".asInstanceOf[typings.web3Utils.web3UtilsStrings.view]
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
    
    inline def Gwei: typings.web3Utils.web3UtilsStrings.Gwei = "Gwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Gwei]
    
    inline def Kwei: typings.web3Utils.web3UtilsStrings.Kwei = "Kwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Kwei]
    
    inline def Mwei: typings.web3Utils.web3UtilsStrings.Mwei = "Mwei".asInstanceOf[typings.web3Utils.web3UtilsStrings.Mwei]
    
    inline def babbage: typings.web3Utils.web3UtilsStrings.babbage = "babbage".asInstanceOf[typings.web3Utils.web3UtilsStrings.babbage]
    
    inline def ether: typings.web3Utils.web3UtilsStrings.ether = "ether".asInstanceOf[typings.web3Utils.web3UtilsStrings.ether]
    
    inline def femtoether: typings.web3Utils.web3UtilsStrings.femtoether = "femtoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.femtoether]
    
    inline def finney: typings.web3Utils.web3UtilsStrings.finney = "finney".asInstanceOf[typings.web3Utils.web3UtilsStrings.finney]
    
    inline def gether: typings.web3Utils.web3UtilsStrings.gether = "gether".asInstanceOf[typings.web3Utils.web3UtilsStrings.gether]
    
    inline def grand: typings.web3Utils.web3UtilsStrings.grand = "grand".asInstanceOf[typings.web3Utils.web3UtilsStrings.grand]
    
    inline def gwei: gwei_ = "gwei".asInstanceOf[gwei_]
    
    inline def kether: typings.web3Utils.web3UtilsStrings.kether = "kether".asInstanceOf[typings.web3Utils.web3UtilsStrings.kether]
    
    inline def kwei: kwei_ = "kwei".asInstanceOf[kwei_]
    
    inline def lovelace: typings.web3Utils.web3UtilsStrings.lovelace = "lovelace".asInstanceOf[typings.web3Utils.web3UtilsStrings.lovelace]
    
    inline def mether: typings.web3Utils.web3UtilsStrings.mether = "mether".asInstanceOf[typings.web3Utils.web3UtilsStrings.mether]
    
    inline def micro: typings.web3Utils.web3UtilsStrings.micro = "micro".asInstanceOf[typings.web3Utils.web3UtilsStrings.micro]
    
    inline def microether: typings.web3Utils.web3UtilsStrings.microether = "microether".asInstanceOf[typings.web3Utils.web3UtilsStrings.microether]
    
    inline def milli: typings.web3Utils.web3UtilsStrings.milli = "milli".asInstanceOf[typings.web3Utils.web3UtilsStrings.milli]
    
    inline def milliether: typings.web3Utils.web3UtilsStrings.milliether = "milliether".asInstanceOf[typings.web3Utils.web3UtilsStrings.milliether]
    
    inline def mwei: mwei_ = "mwei".asInstanceOf[mwei_]
    
    inline def nano: typings.web3Utils.web3UtilsStrings.nano = "nano".asInstanceOf[typings.web3Utils.web3UtilsStrings.nano]
    
    inline def nanoether: typings.web3Utils.web3UtilsStrings.nanoether = "nanoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.nanoether]
    
    inline def noether: typings.web3Utils.web3UtilsStrings.noether = "noether".asInstanceOf[typings.web3Utils.web3UtilsStrings.noether]
    
    inline def picoether: typings.web3Utils.web3UtilsStrings.picoether = "picoether".asInstanceOf[typings.web3Utils.web3UtilsStrings.picoether]
    
    inline def shannon: typings.web3Utils.web3UtilsStrings.shannon = "shannon".asInstanceOf[typings.web3Utils.web3UtilsStrings.shannon]
    
    inline def szabo: typings.web3Utils.web3UtilsStrings.szabo = "szabo".asInstanceOf[typings.web3Utils.web3UtilsStrings.szabo]
    
    inline def tether: typings.web3Utils.web3UtilsStrings.tether = "tether".asInstanceOf[typings.web3Utils.web3UtilsStrings.tether]
    
    inline def wei: typings.web3Utils.web3UtilsStrings.wei = "wei".asInstanceOf[typings.web3Utils.web3UtilsStrings.wei]
  }
  
  trait Units extends StObject {
    
    var Gwei: String
    
    var Kwei: String
    
    var Mwei: String
    
    var babbage: String
    
    var ether: String
    
    var femtoether: String
    
    var finney: String
    
    var gether: String
    
    var grand: String
    
    var gwei: String
    
    var kether: String
    
    var kwei: String
    
    var lovelace: String
    
    var mether: String
    
    var micro: String
    
    var microether: String
    
    var milli: String
    
    var milliether: String
    
    var mwei: String
    
    var nano: String
    
    var nanoether: String
    
    var noether: String
    
    var picoether: String
    
    var shannon: String
    
    var szabo: String
    
    var tether: String
    
    var wei: String
  }
  object Units {
    
    inline def apply(
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
    
    extension [Self <: Units](x: Self) {
      
      inline def setBabbage(value: String): Self = StObject.set(x, "babbage", value.asInstanceOf[js.Any])
      
      inline def setEther(value: String): Self = StObject.set(x, "ether", value.asInstanceOf[js.Any])
      
      inline def setFemtoether(value: String): Self = StObject.set(x, "femtoether", value.asInstanceOf[js.Any])
      
      inline def setFinney(value: String): Self = StObject.set(x, "finney", value.asInstanceOf[js.Any])
      
      inline def setGether(value: String): Self = StObject.set(x, "gether", value.asInstanceOf[js.Any])
      
      inline def setGrand(value: String): Self = StObject.set(x, "grand", value.asInstanceOf[js.Any])
      
      inline def setGwei(value: String): Self = StObject.set(x, "Gwei", value.asInstanceOf[js.Any])
      
      inline def setKether(value: String): Self = StObject.set(x, "kether", value.asInstanceOf[js.Any])
      
      inline def setKwei(value: String): Self = StObject.set(x, "Kwei", value.asInstanceOf[js.Any])
      
      inline def setLovelace(value: String): Self = StObject.set(x, "lovelace", value.asInstanceOf[js.Any])
      
      inline def setMether(value: String): Self = StObject.set(x, "mether", value.asInstanceOf[js.Any])
      
      inline def setMicro(value: String): Self = StObject.set(x, "micro", value.asInstanceOf[js.Any])
      
      inline def setMicroether(value: String): Self = StObject.set(x, "microether", value.asInstanceOf[js.Any])
      
      inline def setMilli(value: String): Self = StObject.set(x, "milli", value.asInstanceOf[js.Any])
      
      inline def setMilliether(value: String): Self = StObject.set(x, "milliether", value.asInstanceOf[js.Any])
      
      inline def setMwei(value: String): Self = StObject.set(x, "Mwei", value.asInstanceOf[js.Any])
      
      inline def setNano(value: String): Self = StObject.set(x, "nano", value.asInstanceOf[js.Any])
      
      inline def setNanoether(value: String): Self = StObject.set(x, "nanoether", value.asInstanceOf[js.Any])
      
      inline def setNoether(value: String): Self = StObject.set(x, "noether", value.asInstanceOf[js.Any])
      
      inline def setPicoether(value: String): Self = StObject.set(x, "picoether", value.asInstanceOf[js.Any])
      
      inline def setShannon(value: String): Self = StObject.set(x, "shannon", value.asInstanceOf[js.Any])
      
      inline def setSzabo(value: String): Self = StObject.set(x, "szabo", value.asInstanceOf[js.Any])
      
      inline def setTether(value: String): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
      
      inline def setWei(value: String): Self = StObject.set(x, "wei", value.asInstanceOf[js.Any])
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
    def fromWei(value: typings.bnJs.mod.^): String = js.native
    def fromWei(value: typings.bnJs.mod.^, unit: Unit): String = js.native
    
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
    
    def isBigNumber(value: typings.bnJs.mod.^): Boolean = js.native
    
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
    def keccak256(value: typings.bnJs.mod.^): String = js.native
    
    def leftPad(string: String, characterAmount: Double): String = js.native
    def leftPad(string: String, characterAmount: Double, sign: String): String = js.native
    def leftPad(string: Double, characterAmount: Double): String = js.native
    def leftPad(string: Double, characterAmount: Double, sign: String): String = js.native
    
    def numberToHex(value: String): String = js.native
    def numberToHex(value: Double): String = js.native
    def numberToHex(value: typings.bnJs.mod.^): String = js.native
    
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
    def sha3(value: typings.bnJs.mod.^): String | Null = js.native
    
    def soliditySha3(`val`: Mixed*): String | Null = js.native
    
    def soliditySha3Raw(`val`: Mixed*): String = js.native
    
    def stringToHex(string: String): String = js.native
    
    def stripHexPrefix(str: String): String = js.native
    
    def testAddress(bloom: String, address: String): Boolean = js.native
    
    def testTopic(bloom: String, topic: String): Boolean = js.native
    
    def toAscii(string: String): String = js.native
    
    def toBN(value: String): typings.bnJs.mod.^ = js.native
    def toBN(value: Double): typings.bnJs.mod.^ = js.native
    
    def toChecksumAddress(address: String): String = js.native
    def toChecksumAddress(address: String, chainId: Double): String = js.native
    
    def toDecimal(hex: Hex): Double = js.native
    
    def toHex(value: String): String = js.native
    def toHex(value: Double): String = js.native
    def toHex(value: typings.bnJs.mod.^): String = js.native
    
    def toTwosComplement(value: String): String = js.native
    def toTwosComplement(value: Double): String = js.native
    def toTwosComplement(value: typings.bnJs.mod.^): String = js.native
    
    def toUtf8(string: String): String = js.native
    
    def toWei(`val`: String): String = js.native
    def toWei(`val`: String, unit: Unit): String = js.native
    def toWei(`val`: typings.bnJs.mod.^): typings.bnJs.mod.^ = js.native
    def toWei(`val`: typings.bnJs.mod.^, unit: Unit): typings.bnJs.mod.^ = js.native
    
    def unitMap(): Units = js.native
    
    def utf8ToHex(string: String): String = js.native
  }
  
  trait _Mixed extends StObject
  object _Mixed {
    
    inline def T(t: String, v: String | typings.bnJs.mod.^ | Double): typings.web3Utils.anon.T = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.web3Utils.anon.T]
    }
    
    inline def Type(`type`: String, value: String): typings.web3Utils.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.web3Utils.anon.Type]
    }
  }
}
