package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryLanguageTitle extends StObject {
  
  /**
    * The language for which the title is applicable
    */
  var lang: String = js.native
  
  /**
    * The language culture id of the lang parameter
    */
  var lcid: Double = js.native
  
  /**
    * Actual title to be shown on the UI
    */
  var title: String = js.native
}
object CategoryLanguageTitle {
  
  @scala.inline
  def apply(lang: String, lcid: Double, title: String): CategoryLanguageTitle = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLanguageTitle]
  }
  
  @scala.inline
  implicit class CategoryLanguageTitleMutableBuilder[Self <: CategoryLanguageTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
