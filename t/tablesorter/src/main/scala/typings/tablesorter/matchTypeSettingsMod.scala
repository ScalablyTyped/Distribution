package typings.tablesorter

import typings.tablesorter.matchTypeMod.MatchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchTypeSettingsMod {
  
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
    
    @scala.inline
    def apply(): MatchTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchTypeSettings]
    }
    
    @scala.inline
    implicit class MatchTypeSettingsMutableBuilder[Self <: MatchTypeSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: MatchType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setSelect(value: MatchType): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}
