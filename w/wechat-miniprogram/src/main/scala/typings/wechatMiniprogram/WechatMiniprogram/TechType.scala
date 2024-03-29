package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 标签类型枚举 */
trait TechType extends StObject {
  
  /** 对应IsoDep实例，实例支持ISO-DEP (ISO 14443-4)标准的读写 */
  var isoDep: String
  
  /** 对应MifareClassic实例，实例支持MIFARE Classic标签的读写 */
  var mifareClassic: String
  
  /** 对应MifareUltralight实例，实例支持MIFARE Ultralight标签的读写 */
  var mifareUltralight: String
  
  /** 对应Ndef实例，实例支持对NDEF格式的NFC标签上的NDEF数据的读写 */
  var ndef: String
  
  /** 对应NfcA实例，实例支持NFC-A (ISO 14443-3A)标准的读写 */
  var nfcA: String
  
  /** 对应NfcB实例，实例支持NFC-B (ISO 14443-3B)标准的读写 */
  var nfcB: String
  
  /** 对应NfcF实例，实例支持NFC-F (JIS 6319-4)标准的读写 */
  var nfcF: String
  
  /** 对应NfcV实例，实例支持NFC-V (ISO 15693)标准的读写 */
  var nfcV: String
}
object TechType {
  
  inline def apply(
    isoDep: String,
    mifareClassic: String,
    mifareUltralight: String,
    ndef: String,
    nfcA: String,
    nfcB: String,
    nfcF: String,
    nfcV: String
  ): TechType = {
    val __obj = js.Dynamic.literal(isoDep = isoDep.asInstanceOf[js.Any], mifareClassic = mifareClassic.asInstanceOf[js.Any], mifareUltralight = mifareUltralight.asInstanceOf[js.Any], ndef = ndef.asInstanceOf[js.Any], nfcA = nfcA.asInstanceOf[js.Any], nfcB = nfcB.asInstanceOf[js.Any], nfcF = nfcF.asInstanceOf[js.Any], nfcV = nfcV.asInstanceOf[js.Any])
    __obj.asInstanceOf[TechType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TechType] (val x: Self) extends AnyVal {
    
    inline def setIsoDep(value: String): Self = StObject.set(x, "isoDep", value.asInstanceOf[js.Any])
    
    inline def setMifareClassic(value: String): Self = StObject.set(x, "mifareClassic", value.asInstanceOf[js.Any])
    
    inline def setMifareUltralight(value: String): Self = StObject.set(x, "mifareUltralight", value.asInstanceOf[js.Any])
    
    inline def setNdef(value: String): Self = StObject.set(x, "ndef", value.asInstanceOf[js.Any])
    
    inline def setNfcA(value: String): Self = StObject.set(x, "nfcA", value.asInstanceOf[js.Any])
    
    inline def setNfcB(value: String): Self = StObject.set(x, "nfcB", value.asInstanceOf[js.Any])
    
    inline def setNfcF(value: String): Self = StObject.set(x, "nfcF", value.asInstanceOf[js.Any])
    
    inline def setNfcV(value: String): Self = StObject.set(x, "nfcV", value.asInstanceOf[js.Any])
  }
}
