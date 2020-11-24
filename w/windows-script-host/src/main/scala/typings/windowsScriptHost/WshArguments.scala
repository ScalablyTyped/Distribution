package typings.windowsScriptHost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the entire collection of command-line parameters, in the order in which they were originally entered. */
@js.native
trait WshArguments extends js.Object {
  
  def apply(index: Double): String = js.native
  
  def Count(): Double = js.native
  
  def Item(index: Double): String = js.native
  
  var Length: Double = js.native
  
  def Named(name: String): String = js.native
  @JSName("Named")
  var Named_Original: WshNamed = js.native
  
  /**
    * When you run the **ShowUsage** method, a help screen (referred to as the usage) appears and displays details about the script's command line options.
    * This information comes from the runtime section of the `*.WSF` file. Everything written between the `<runtime>` and `</runtime>` tags is pieced together
    * to produce what is called a "usage statement." The usage statement tells the user how to use the script.
    */
  def ShowUsage(): Unit = js.native
  
  def Unnamed(index: Double): String = js.native
  @JSName("Unnamed")
  var Unnamed_Original: WshUnnamed = js.native
}
