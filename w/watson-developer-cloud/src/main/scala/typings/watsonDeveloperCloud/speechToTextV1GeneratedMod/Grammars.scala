package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Grammars. */
trait Grammars extends StObject {
  
  /** An array of `Grammar` objects that provides information about the grammars for the custom model. The array is empty if the custom model has no grammars. */
  var grammars: js.Array[Grammar]
}
object Grammars {
  
  inline def apply(grammars: js.Array[Grammar]): Grammars = {
    val __obj = js.Dynamic.literal(grammars = grammars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammars]
  }
  
  extension [Self <: Grammars](x: Self) {
    
    inline def setGrammars(value: js.Array[Grammar]): Self = StObject.set(x, "grammars", value.asInstanceOf[js.Any])
    
    inline def setGrammarsVarargs(value: Grammar*): Self = StObject.set(x, "grammars", js.Array(value :_*))
  }
}
