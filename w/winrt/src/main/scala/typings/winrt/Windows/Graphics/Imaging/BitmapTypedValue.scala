package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitmapTypedValue extends IBitmapTypedValue
object BitmapTypedValue {
  
  @scala.inline
  def apply(`type`: PropertyType, value: js.Any): BitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTypedValue]
  }
}
