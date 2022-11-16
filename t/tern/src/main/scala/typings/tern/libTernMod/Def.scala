package typings.tern.libTernMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Def = {[key: string] : string | tern.tern/lib/tern.Def}
}}}
to avoid circular code involving: 
- tern.tern/lib/tern.Def
*/
trait Def
  extends StObject
     with /* key */ StringDictionary[String | Def]
object Def {
  
  inline def apply(): Def = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Def]
  }
}
