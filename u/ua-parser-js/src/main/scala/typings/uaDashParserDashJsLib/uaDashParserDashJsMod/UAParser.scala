package typings
package uaDashParserDashJsLib.uaDashParserDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UAParser extends js.Object {
  /**
    *  Returns browser information
    */
  def getBrowser(): uaDashParserDashJsLib.IUAParserNs.IBrowser
  /**
    *  Returns parsed CPU information
    */
  def getCPU(): uaDashParserDashJsLib.IUAParserNs.ICPU
  /**
    *  Returns device information
    */
  def getDevice(): uaDashParserDashJsLib.IUAParserNs.IDevice
  /**
    *  Returns browsers engine information
    */
  def getEngine(): uaDashParserDashJsLib.IUAParserNs.IEngine
  /**
    *  Returns OS information
    */
  def getOS(): uaDashParserDashJsLib.IUAParserNs.IOS
  /**
    *  Returns parse result
    */
  def getResult(): uaDashParserDashJsLib.IUAParserNs.IResult
  /**
    *  Returns UA string of current instance
    */
  def getUA(): java.lang.String
  /**
    *  Set & parse UA string
    */
  def setUA(uastring: java.lang.String): UAParser
}

object UAParser {
  @scala.inline
  def apply(
    getBrowser: js.Function0[uaDashParserDashJsLib.IUAParserNs.IBrowser],
    getCPU: js.Function0[uaDashParserDashJsLib.IUAParserNs.ICPU],
    getDevice: js.Function0[uaDashParserDashJsLib.IUAParserNs.IDevice],
    getEngine: js.Function0[uaDashParserDashJsLib.IUAParserNs.IEngine],
    getOS: js.Function0[uaDashParserDashJsLib.IUAParserNs.IOS],
    getResult: js.Function0[uaDashParserDashJsLib.IUAParserNs.IResult],
    getUA: js.Function0[java.lang.String],
    setUA: js.Function1[java.lang.String, UAParser]
  ): UAParser = {
    val __obj = js.Dynamic.literal(getBrowser = getBrowser, getCPU = getCPU, getDevice = getDevice, getEngine = getEngine, getOS = getOS, getResult = getResult, getUA = getUA, setUA = setUA)
  
    __obj.asInstanceOf[UAParser]
  }
}

