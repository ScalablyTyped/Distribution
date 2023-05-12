package typings.swellJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSettingsMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Settings = {[key: string] : string | number | boolean | object | swell-js.swell-js/types/settings.Settings | std.Array<swell-js.swell-js/types/settings.Settings> | null}
  }}}
  to avoid circular code involving: 
  - swell-js.swell-js/types/settings.Settings
  */
  trait Settings
    extends StObject
       with /* key */ StringDictionary[String | Double | Boolean | js.Object | Settings | js.Array[Settings] | Null]
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
  }
}
