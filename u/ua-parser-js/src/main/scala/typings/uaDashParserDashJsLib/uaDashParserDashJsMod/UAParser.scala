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

