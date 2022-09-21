package typings.yargs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Choices extends StObject {
  
  var choices: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any
  ]
}
object Choices {
  
  inline def apply(
    choices: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any
    ]
  ): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  extension [Self <: Choices](x: Self) {
    
    inline def setChoices(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any
        ]
    ): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any)*): Self = StObject.set(x, "choices", js.Array(value*))
  }
}
