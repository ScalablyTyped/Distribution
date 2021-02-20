package typings.sweetalert

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationsMod {
  
  @JSImport("sweetalert/typings/modules/options/deprecations", "DEPRECATED_OPTS")
  @js.native
  val DEPRECATED_OPTS: OptionReplacementsList = js.native
  
  @JSImport("sweetalert/typings/modules/options/deprecations", "logDeprecation")
  @js.native
  def logDeprecation(name: String): Unit = js.native
  
  @js.native
  trait OptionReplacement extends StObject {
    
    var link: js.UndefOr[String] = js.native
    
    var onlyRename: js.UndefOr[Boolean] = js.native
    
    var replacement: js.UndefOr[String] = js.native
    
    var subOption: js.UndefOr[String] = js.native
  }
  object OptionReplacement {
    
    @scala.inline
    def apply(): OptionReplacement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionReplacement]
    }
    
    @scala.inline
    implicit class OptionReplacementMutableBuilder[Self <: OptionReplacement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnlyRename(value: Boolean): Self = StObject.set(x, "onlyRename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyRenameUndefined: Self = StObject.set(x, "onlyRename", js.undefined)
      
      @scala.inline
      def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      @scala.inline
      def setSubOption(value: String): Self = StObject.set(x, "subOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubOptionUndefined: Self = StObject.set(x, "subOption", js.undefined)
    }
  }
  
  type OptionReplacementsList = StringDictionary[OptionReplacement]
}
