package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskOptionsCore extends StObject {
  
  def getPageDescription(jobPageNumber: Double): PrintPageDescription
}
object IPrintTaskOptionsCore {
  
  @scala.inline
  def apply(getPageDescription: Double => PrintPageDescription): IPrintTaskOptionsCore = {
    val __obj = js.Dynamic.literal(getPageDescription = js.Any.fromFunction1(getPageDescription))
    __obj.asInstanceOf[IPrintTaskOptionsCore]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionsCoreMutableBuilder[Self <: IPrintTaskOptionsCore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPageDescription(value: Double => PrintPageDescription): Self = StObject.set(x, "getPageDescription", js.Any.fromFunction1(value))
  }
}
