package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.encodeMod.LinearGradient
  - typings.vegaTypings.encodeMod.RadialGradient
*/
trait Gradient extends StObject
object Gradient {
  
  @scala.inline
  def LinearGradient(stops: js.Array[GradientStop]): typings.vegaTypings.encodeMod.LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = "linear", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.encodeMod.LinearGradient]
  }
  
  @scala.inline
  def RadialGradient(stops: js.Array[GradientStop]): typings.vegaTypings.encodeMod.RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = "radial", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.encodeMod.RadialGradient]
  }
}
