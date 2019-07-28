package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCoreUIConfiguration extends js.Object {
  var displayedOptions: IVector[String]
}

object IPrintTaskOptionsCoreUIConfiguration {
  @scala.inline
  def apply(displayedOptions: IVector[String]): IPrintTaskOptionsCoreUIConfiguration = {
    val __obj = js.Dynamic.literal(displayedOptions = displayedOptions)
  
    __obj.asInstanceOf[IPrintTaskOptionsCoreUIConfiguration]
  }
}

