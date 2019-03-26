package typings
package uaDashParserDashJsLib.uaDashParserDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
/**
  * Create a new parser with UA prepopulated and extensions extended
  */
class namespaced () extends UAParser {
  def this(uastring: java.lang.String) = this()
  def this(uastring: java.lang.String, extensions: js.Any) = this()
  /**
    *  Returns browser information
    */
  /* CompleteClass */
  override def getBrowser(): uaDashParserDashJsLib.IUAParserNs.IBrowser = js.native
  /**
    *  Returns parsed CPU information
    */
  /* CompleteClass */
  override def getCPU(): uaDashParserDashJsLib.IUAParserNs.ICPU = js.native
  /**
    *  Returns device information
    */
  /* CompleteClass */
  override def getDevice(): uaDashParserDashJsLib.IUAParserNs.IDevice = js.native
  /**
    *  Returns browsers engine information
    */
  /* CompleteClass */
  override def getEngine(): uaDashParserDashJsLib.IUAParserNs.IEngine = js.native
  /**
    *  Returns OS information
    */
  /* CompleteClass */
  override def getOS(): uaDashParserDashJsLib.IUAParserNs.IOS = js.native
  /**
    *  Returns parse result
    */
  /* CompleteClass */
  override def getResult(): uaDashParserDashJsLib.IUAParserNs.IResult = js.native
  /**
    *  Returns UA string of current instance
    */
  /* CompleteClass */
  override def getUA(): java.lang.String = js.native
  /**
    *  Set & parse UA string
    */
  /* CompleteClass */
  override def setUA(uastring: java.lang.String): UAParser = js.native
}

