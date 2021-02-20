package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowFlyoutFactory extends StObject {
  
  def create(position: Point): CoreWindowFlyout = js.native
  
  def createWithTitle(position: Point, title: String): CoreWindowFlyout = js.native
}
object ICoreWindowFlyoutFactory {
  
  @scala.inline
  def apply(create: Point => CoreWindowFlyout, createWithTitle: (Point, String) => CoreWindowFlyout): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
  
  @scala.inline
  implicit class ICoreWindowFlyoutFactoryMutableBuilder[Self <: ICoreWindowFlyoutFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Point => CoreWindowFlyout): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithTitle(value: (Point, String) => CoreWindowFlyout): Self = StObject.set(x, "createWithTitle", js.Any.fromFunction2(value))
  }
}
