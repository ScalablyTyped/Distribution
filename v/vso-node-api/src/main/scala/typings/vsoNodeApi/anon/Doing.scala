package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Doing extends StObject {
  
  var doing: scala.Double
  
  var done: scala.Double
  
  var followed: scala.Double
}
object Doing {
  
  inline def apply(doing: scala.Double, done: scala.Double, followed: scala.Double): Doing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doing]
  }
  
  extension [Self <: Doing](x: Self) {
    
    inline def setDoing(value: scala.Double): Self = StObject.set(x, "doing", value.asInstanceOf[js.Any])
    
    inline def setDone(value: scala.Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setFollowed(value: scala.Double): Self = StObject.set(x, "followed", value.asInstanceOf[js.Any])
  }
}
