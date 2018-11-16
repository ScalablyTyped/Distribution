package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintOptionDetails extends js.Object {
  var errorText: java.lang.String
  var optionId: java.lang.String
  var optionType: PrintOptionType
  var state: PrintOptionStates
  var value: js.Any
  def trySetValue(value: js.Any): scala.Boolean
}

