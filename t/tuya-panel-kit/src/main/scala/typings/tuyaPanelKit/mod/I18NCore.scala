package typings.tuyaPanelKit.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// i18n core
@js.native
trait I18NCore[LanMap /* <: I18NLanMap */, Lan /* <: /* import warning: importer.ImportType#apply Failed type conversion: LanMap[keyof LanMap] */ js.Any */] extends StObject {
  
  /**
    * @param strings
    * @param force false
    */
  def applyStrings(strings: Lan): Unit = js.native
  def applyStrings(strings: Lan, force: Boolean): Unit = js.native
  
  def buildLanguage(language: String): Unit = js.native
  
  def forceUpdateNetworkLang(productId: String): Unit = js.native
  
  def formatString(str: String, values: String*): String = js.native
  
  def formatValue(key: /* keyof Lan */ String, values: String*): String = js.native
  
  def getDpLang(code: String): String = js.native
  def getDpLang(code: String, value: DpValue): String = js.native
  
  def getDpName(code: String): String = js.native
  def getDpName(code: String, defaultName: String): String = js.native
  
  def getDpsLang(key: /* keyof Lan */ String): js.Object = js.native
  
  def getLang(key: /* keyof Lan */ String): String = js.native
  def getLang(key: /* keyof Lan */ String, defaultString: String): String = js.native
  
  /**
    * 获取 picker 标题
    * @param dpCode
    */
  def getRangeStrings(dpCode: String): Record[String, String] = js.native
  
  def mergeLanguage(L1: LanMap, L2: LanMap): LanMap = js.native
  
  /**
    *  开关倒计时转换为文案 time => 设备将在xxx后 关闭／开启
    *  精确到分钟
    * @param t 倒计时剩余(秒)
    * @param power 设备当前的开关状态 (如果当前设备为开启状态， 则倒计时显示为关闭)
    */
  def parseCountdown(t: Double, power: Boolean): String = js.native
  
  def setLanguage(language: String): Unit = js.native
  
  var strings: LanMap = js.native
}
