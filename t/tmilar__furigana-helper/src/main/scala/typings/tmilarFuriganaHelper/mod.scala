package typings.tmilarFuriganaHelper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tmilar/furigana-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineOriginalAndKana(aOriginal: String, aKana: String): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineOriginalAndKana")(aOriginal.asInstanceOf[js.Any], aKana.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
}
