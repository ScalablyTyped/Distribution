package typings.three.examplesJsmLibsFflateDotmoduleDotminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncInflateOptions
  extends StObject
     with AsyncOptions {
  
  /**
    * The original size of the data. Currently, the asynchronous API disallows
    * writing into a buffer you provide; the best you can do is provide the
    * size in bytes and be given back a new typed array.
    */
  var size: js.UndefOr[Double] = js.undefined
}
object AsyncInflateOptions {
  
  inline def apply(): AsyncInflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInflateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncInflateOptions] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
