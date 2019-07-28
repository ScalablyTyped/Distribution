package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Responsible for formatting HTML content that you want to share or add to the Clipboard. Also allows you to get HTML fragments from the content. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
@js.native
abstract class HtmlFormatHelper () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper")
@js.native
object HtmlFormatHelper extends js.Object {
  /**
    * Takes a string that represents HTML content and adds the necessary headers to ensure it is formatted correctly for share and Clipboard operations.
    * @param htmlFragment A string representing the HTML content.
    * @return A string representing the formatted HTML.
    */
  def createHtmlFormat(htmlFragment: String): String = js.native
  /**
    * Gets a string that represents an HTML fragment.
    * @param htmlFormat The formatted HTML.
    * @return An HTML fragment based on the formatted HTML.
    */
  def getStaticFragment(htmlFormat: String): String = js.native
}

