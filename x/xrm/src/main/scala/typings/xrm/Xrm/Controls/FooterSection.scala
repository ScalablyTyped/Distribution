package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterSection extends StObject {
  
  /**
    * Returns the footer section visibility.
    * @remarks Available only for Unified Interface.  Footers aren't supported after 2021 wave 2 release.
    * @see {@link https://learn.microsoft.com/en-us/power-platform/important-changes-coming#form-footers-in-model-driven-apps-wont-be-supported-with-the-2021-release-wave-2 External Link: Important notices}
    */
  def getVisible(): Boolean
  
  /**
    * Sets the visibility of the footer section.
    * @param bool Specify true to show the footer section; false to hide the footer section.
    * @remarks Available only for Unified Interface.  Footers aren't supported after 2021 wave 2 release.
    * @see {@link https://learn.microsoft.com/en-us/power-platform/important-changes-coming#form-footers-in-model-driven-apps-wont-be-supported-with-the-2021-release-wave-2 External Link: Important notices}
    */
  def setVisible(bool: Boolean): Unit
}
object FooterSection {
  
  inline def apply(getVisible: () => Boolean, setVisible: Boolean => Unit): FooterSection = {
    val __obj = js.Dynamic.literal(getVisible = js.Any.fromFunction0(getVisible), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[FooterSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FooterSection] (val x: Self) extends AnyVal {
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
