package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "Evented")
@js.native
open class Evented () extends StObject {
  
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, properties: StringDictionary[Any]): this.type = js.native
  
  def off(): this.type = js.native
  def off(`type`: String): this.type = js.native
  def off(`type`: String, listener: js.Function): this.type = js.native
  def off(`type`: Any): this.type = js.native
  def off(`type`: Any, listener: js.Function): this.type = js.native
  def off(`type`: Unit, listener: js.Function): this.type = js.native
  
  def on(`type`: String, listener: js.Function): this.type = js.native
  
  def once(`type`: String, listener: js.Function): this.type = js.native
}
