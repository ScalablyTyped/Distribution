package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildIndexDisplayed extends StObject {
  
  var childIndexDisplayed: Double
}
object ChildIndexDisplayed {
  
  inline def apply(childIndexDisplayed: Double): ChildIndexDisplayed = {
    val __obj = js.Dynamic.literal(childIndexDisplayed = childIndexDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildIndexDisplayed]
  }
  
  extension [Self <: ChildIndexDisplayed](x: Self) {
    
    inline def setChildIndexDisplayed(value: Double): Self = StObject.set(x, "childIndexDisplayed", value.asInstanceOf[js.Any])
  }
}
