package typings.three.fflateModuleMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncOptions extends StObject {
  
  /**
    * Whether or not to "consume" the source data. This will make the typed array/buffer you pass in
    * unusable but will increase performance and reduce memory usage.
    */
  var consume: js.UndefOr[Boolean] = js.undefined
}
object AsyncOptions {
  
  inline def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions]
  }
  
  extension [Self <: AsyncOptions](x: Self) {
    
    inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
  }
}
