package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.irawstylebaseMod.IRawStyleBase
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleMod._IStyleBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object irawstyleMod {
  
  @js.native
  trait IRawStyle
    extends IRawStyleBase
       with /**
    * Allow css variables, strings, objects. While we should have more strict typing
    * here, partners are broken in many unpredictable cases where typescript can't infer
    * the right typing. Loosening the typing to both allow for css variables and other things.
    */
  /* key */ StringDictionary[js.Any]
       with _IStyleBase {
    
    /**
      * Display name for the style.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * @deprecated - The selectors wrapper is no longer required. You may add selectors as siblings to other
      * style properties, like most css-in-js libraries support.
      */
    var selectors: js.UndefOr[StringDictionary[IStyle]] = js.native
  }
  object IRawStyle {
    
    @scala.inline
    def apply(): IRawStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawStyle]
    }
    
    @scala.inline
    implicit class IRawStyleMutableBuilder[Self <: IRawStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setSelectors(value: StringDictionary[IStyle]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    }
  }
}
