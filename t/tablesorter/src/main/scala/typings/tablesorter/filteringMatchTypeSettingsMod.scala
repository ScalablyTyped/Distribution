package typings.tablesorter

import typings.tablesorter.filteringMatchTypeMod.MatchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringMatchTypeSettingsMod {
  
  trait MatchTypeSettings extends StObject {
    
    /**
      * The match-type for `input`-controls.
      */
    var input: js.UndefOr[MatchType] = js.undefined
    
    /**
      * The match-type for `select`-controls.
      */
    var select: js.UndefOr[MatchType] = js.undefined
  }
  object MatchTypeSettings {
    
    inline def apply(): MatchTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchTypeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchTypeSettings] (val x: Self) extends AnyVal {
      
      inline def setInput(value: MatchType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setSelect(value: MatchType): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}
