package typings.typedoc.anon

import typings.typedoc.typedocStrings.both
import typings.typedoc.typedocStrings.docs
import typings.typedoc.typedocStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Both extends StObject {
  
  val both: typings.typedoc.typedocStrings.both
  
  val docs: typings.typedoc.typedocStrings.docs
  
  val none: typings.typedoc.typedocStrings.none
}
object Both {
  
  inline def apply(): Both = {
    val __obj = js.Dynamic.literal(both = "both", docs = "docs", none = "none")
    __obj.asInstanceOf[Both]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Both] (val x: Self) extends AnyVal {
    
    inline def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: docs): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
