package typings.typeFest.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictn
  extends StObject
     with /* n */ NumberDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: infer Item */ js.Any
    ] {
  
  var length: Double
}
object Dictn {
  
  inline def apply(length: Double): Dictn = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictn]
  }
  
  extension [Self <: Dictn](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
