package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCaseSensitive extends StObject {
  
  val isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  val isReadonly: js.UndefOr[Boolean] = js.undefined
}
object IsCaseSensitive {
  
  @scala.inline
  def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  
  @scala.inline
  implicit class IsCaseSensitiveMutableBuilder[Self <: IsCaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    @scala.inline
    def setIsReadonly(value: Boolean): Self = StObject.set(x, "isReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadonlyUndefined: Self = StObject.set(x, "isReadonly", js.undefined)
  }
}
