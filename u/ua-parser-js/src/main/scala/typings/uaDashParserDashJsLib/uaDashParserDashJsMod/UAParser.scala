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
    getBrowser: () => uaDashParserDashJsLib.IUAParserNs.IBrowser,
    getCPU: () => uaDashParserDashJsLib.IUAParserNs.ICPU,
    getDevice: () => uaDashParserDashJsLib.IUAParserNs.IDevice,
    getEngine: () => uaDashParserDashJsLib.IUAParserNs.IEngine,
    getOS: () => uaDashParserDashJsLib.IUAParserNs.IOS,
    getResult: () => uaDashParserDashJsLib.IUAParserNs.IResult,
    getUA: () => java.lang.String,
    setUA: java.lang.String => UAParser
  ): UAParser = {
    val __obj = js.Dynamic.literal(getBrowser = js.Any.fromFunction0(getBrowser), getCPU = js.Any.fromFunction0(getCPU), getDevice = js.Any.fromFunction0(getDevice), getEngine = js.Any.fromFunction0(getEngine), getOS = js.Any.fromFunction0(getOS), getResult = js.Any.fromFunction0(getResult), getUA = js.Any.fromFunction0(getUA), setUA = js.Any.fromFunction1(setUA))
  
    __obj.asInstanceOf[UAParser]
  }
}

