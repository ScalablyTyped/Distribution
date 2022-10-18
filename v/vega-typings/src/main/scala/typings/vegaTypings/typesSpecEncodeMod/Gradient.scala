package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.typesSpecEncodeMod.LinearGradient
  - typings.vegaTypings.typesSpecEncodeMod.RadialGradient
*/
trait Gradient extends StObject
object Gradient {
  
  inline def LinearGradient(stops: js.Array[GradientStop]): typings.vegaTypings.typesSpecEncodeMod.LinearGradient = {
    val __obj = js.Dynamic.literal(gradient = "linear", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecEncodeMod.LinearGradient]
  }
  
  inline def RadialGradient(stops: js.Array[GradientStop]): typings.vegaTypings.typesSpecEncodeMod.RadialGradient = {
    val __obj = js.Dynamic.literal(gradient = "radial", stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.typesSpecEncodeMod.RadialGradient]
  }
}
