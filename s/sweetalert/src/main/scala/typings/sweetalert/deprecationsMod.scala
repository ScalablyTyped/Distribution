package typings.sweetalert

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationsMod {
  
  @JSImport("sweetalert/typings/modules/options/deprecations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sweetalert/typings/modules/options/deprecations", "DEPRECATED_OPTS")
  @js.native
  val DEPRECATED_OPTS: OptionReplacementsList = js.native
  
  @scala.inline
  def logDeprecation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDeprecation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait OptionReplacement extends StObject {
    
    var link: js.UndefOr[String] = js.undefined
    
    var onlyRename: js.UndefOr[Boolean] = js.undefined
    
    var replacement: js.UndefOr[String] = js.undefined
    
    var subOption: js.UndefOr[String] = js.undefined
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
