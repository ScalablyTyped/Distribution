package typings.tsToolbelt

import org.scalablytyped.runtime.StringDictionary
import typings.tsToolbelt.outMiscJsonValueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outMiscJsonObjectMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Object = {[k: string] : ts-toolbelt.ts-toolbelt/out/Misc/JSON/Value.Value}
  }}}
  to avoid circular code involving: 
  - ts-toolbelt.ts-toolbelt/out/Misc/JSON/Array.List
  - ts-toolbelt.ts-toolbelt/out/Misc/JSON/Object.Object
  - ts-toolbelt.ts-toolbelt/out/Misc/JSON/Value.Value
  */
  trait Object
    extends StObject
       with /* k */ StringDictionary[Value]
  object Object {
    
    inline def apply(): Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Object]
    }
  }
}
