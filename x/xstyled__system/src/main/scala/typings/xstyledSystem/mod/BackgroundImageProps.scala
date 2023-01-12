package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BackgroundImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageProps extends StObject {
  
  val backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImage]] = js.undefined
}
object BackgroundImageProps {
  
  inline def apply(): BackgroundImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImageProps] (val x: Self) extends AnyVal {
    
    inline def setBackgroundImage(value: ResponsiveValue[BackgroundImage]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundImageVarargs(value: BackgroundImage*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
  }
}
