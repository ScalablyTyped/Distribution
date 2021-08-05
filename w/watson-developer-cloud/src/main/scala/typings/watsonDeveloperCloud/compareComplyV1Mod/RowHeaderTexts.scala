package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `text` value of a row header that is applicable to this body cell. */
trait RowHeaderTexts extends StObject {
  
  /** The `text` value of a row header. */
  var text: js.UndefOr[String] = js.undefined
}
object RowHeaderTexts {
  
  inline def apply(): RowHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTexts]
  }
  
  extension [Self <: RowHeaderTexts](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
