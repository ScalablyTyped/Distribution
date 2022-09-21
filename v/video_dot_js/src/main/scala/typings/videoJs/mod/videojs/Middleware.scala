package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.Tech.SourceObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  /**
    *
    * @param src
    * @param next
    */
  def setSource(src: SourceObject, next: js.Function2[/* err */ Any, /* src */ SourceObject, Unit]): Unit
}
object Middleware {
  
  inline def apply(setSource: (SourceObject, js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => Unit): Middleware = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction2(setSource))
    __obj.asInstanceOf[Middleware]
  }
  
  extension [Self <: Middleware](x: Self) {
    
    inline def setSetSource(value: (SourceObject, js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction2(value))
  }
}
