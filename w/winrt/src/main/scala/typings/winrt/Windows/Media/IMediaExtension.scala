package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaExtension extends StObject {
  
  def setProperties(configuration: IPropertySet): Unit
}
object IMediaExtension {
  
  inline def apply(setProperties: IPropertySet => Unit): IMediaExtension = {
    val __obj = js.Dynamic.literal(setProperties = js.Any.fromFunction1(setProperties))
    __obj.asInstanceOf[IMediaExtension]
  }
  
  extension [Self <: IMediaExtension](x: Self) {
    
    inline def setSetProperties(value: IPropertySet => Unit): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
  }
}
