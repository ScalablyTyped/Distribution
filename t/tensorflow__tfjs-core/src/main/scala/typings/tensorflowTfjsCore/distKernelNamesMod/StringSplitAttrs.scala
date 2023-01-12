package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringSplitAttrs extends StObject {
  
  var skipEmpty: Boolean
}
object StringSplitAttrs {
  
  inline def apply(skipEmpty: Boolean): StringSplitAttrs = {
    val __obj = js.Dynamic.literal(skipEmpty = skipEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSplitAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringSplitAttrs] (val x: Self) extends AnyVal {
    
    inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
  }
}
