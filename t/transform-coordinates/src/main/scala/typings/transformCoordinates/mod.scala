package typings.transformCoordinates

import typings.proj4.mod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(from: String, to: String): Converter = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Converter]
  
  @JSImport("transform-coordinates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
