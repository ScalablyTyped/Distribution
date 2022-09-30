package typings.tsToolbelt

import org.scalablytyped.runtime.StringDictionary
import typings.tsToolbelt.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
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
