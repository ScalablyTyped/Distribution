package typings.wkhtmltopdf.mod

import typings.node.NodeJS.ReadWriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wkhtmltopdf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Call wkhtmltopdf and write PDF directly to specified file
    *
    * @param html HTML to convert to PDF
    * @param [options] Options without the output parameter
    */
  def apply(html: String): ReadWriteStream = js.native
  def apply(html: String, options: Options): ReadWriteStream = js.native
  /**
    * Call wkhtmltopdf with a callback
    *
    * @param html HTML that needs to be compiled to PDF
    * @param options Options without the output parameter
    * @param callback Callback function to handle the incoming PDF
    */
  def apply(
    html: String,
    options: Options,
    callback: js.Function2[/* err */ Error, /* stream */ ReadWriteStream, Unit]
  ): Unit = js.native
  /**
    * Call wkhtmltopdf and write PDF directly to specified file
    *
    * @param url URL to convert to PDF
    * @param options Options with the output parameter
    */
  def apply(url: String, options: OptionsOutfile): Unit = js.native
  
  /**
    * Set the path to the wkhtmltopdf executable
    * Default: wkhtmltopdf
    */
  var command: String = js.native
  
  /**
    * Set the path to the shell where wkhtmltopdf gets executed in
    * Default: /bin/bash
    */
  var shell: String = js.native
}
