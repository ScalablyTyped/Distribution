package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that modify how specified output is handled. */
trait DialogNodeOutputModifiers extends StObject {
  
  /** Whether values in the output will overwrite output values in an array specified by previously executed dialog nodes. If this option is set to **false**, new values will be appended to previously specified values. */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object DialogNodeOutputModifiers {
  
  inline def apply(): DialogNodeOutputModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputModifiers]
  }
  
  extension [Self <: DialogNodeOutputModifiers](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
