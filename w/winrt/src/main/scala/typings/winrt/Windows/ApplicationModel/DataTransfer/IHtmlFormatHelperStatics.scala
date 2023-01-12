package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHtmlFormatHelperStatics extends StObject {
  
  def createHtmlFormat(htmlFragment: String): String
  
  def getStaticFragment(htmlFormat: String): String
}
object IHtmlFormatHelperStatics {
  
  inline def apply(createHtmlFormat: String => String, getStaticFragment: String => String): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal(createHtmlFormat = js.Any.fromFunction1(createHtmlFormat), getStaticFragment = js.Any.fromFunction1(getStaticFragment))
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHtmlFormatHelperStatics] (val x: Self) extends AnyVal {
    
    inline def setCreateHtmlFormat(value: String => String): Self = StObject.set(x, "createHtmlFormat", js.Any.fromFunction1(value))
    
    inline def setGetStaticFragment(value: String => String): Self = StObject.set(x, "getStaticFragment", js.Any.fromFunction1(value))
  }
}
