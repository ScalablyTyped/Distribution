package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPrintTaskOptionDetails extends js.Object {
  var onbeginvalidation: js.Any
  var onoptionchanged: js.Any
  var options: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IPrintOptionDetails]
  def createItemListOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomItemListOptionDetails
  def createTextOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomTextOptionDetails
}

