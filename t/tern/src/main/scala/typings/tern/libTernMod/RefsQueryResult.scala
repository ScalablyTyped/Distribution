package typings.tern.libTernMod

import typings.tern.anon.End
import typings.tern.ternStrings.global
import typings.tern.ternStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefsQueryResult extends StObject {
  
  /** The name of the variable or property */
  var name: String
  
  var refs: js.Array[End]
  
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[global | local] = js.undefined
}
object RefsQueryResult {
  
  inline def apply(name: String, refs: js.Array[End]): RefsQueryResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
  
  extension [Self <: RefsQueryResult](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRefs(value: js.Array[End]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsVarargs(value: End*): Self = StObject.set(x, "refs", js.Array(value*))
    
    inline def setType(value: global | local): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
