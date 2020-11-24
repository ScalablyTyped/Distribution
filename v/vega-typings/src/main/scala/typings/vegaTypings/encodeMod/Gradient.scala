package typings.vegaTypings.encodeMod

import typings.vegaTypings.vegaTypingsStrings.linear
import typings.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.LinearGradient
  - typings.vegaTypings.encodeMod.RadialGradient
*/
trait Gradient extends js.Object
object Gradient {
  
  @scala.inline
  def LinearGradient(gradient: linear, stops: js.Array[GradientStop]): Gradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  def RadialGradient(gradient: radial, stops: js.Array[GradientStop]): Gradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}
