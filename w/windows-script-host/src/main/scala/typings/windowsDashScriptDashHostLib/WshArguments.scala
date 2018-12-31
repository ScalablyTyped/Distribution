package typings
package windowsDashScriptDashHostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the entire collection of command-line parameters, in the order in which they were originally entered. */
@js.native
trait WshArguments extends js.Object {
  var Length: scala.Double = js.native
  @JSName("Named")
  var Named_Original: WshNamed = js.native
  @JSName("Unnamed")
  var Unnamed_Original: WshUnnamed = js.native
  def apply(index: scala.Double): java.lang.String = js.native
  def Count(): scala.Double = js.native
  def Item(index: scala.Double): java.lang.String = js.native
  def Named(name: java.lang.String): java.lang.String = js.native
  /**
    * When you run the **ShowUsage** method, a help screen (referred to as the usage) appears and displays details about the script's command line options.
    * This information comes from the runtime section of the `*.WSF` file. Everything written between the `<runtime>` and `</runtime>` tags is pieced together
    * to produce what is called a "usage statement." The usage statement tells the user how to use the script.
    */
  def ShowUsage(): scala.Unit = js.native
  def Unnamed(index: scala.Double): java.lang.String = js.native
}

