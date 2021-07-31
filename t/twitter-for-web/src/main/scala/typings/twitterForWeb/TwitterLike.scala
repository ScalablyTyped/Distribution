package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitterLike extends StObject {
  
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ Twitter, Unit]): Unit
}
object TwitterLike {
  
  @scala.inline
  def apply(ready: js.Function1[/* twttr */ Twitter, Unit] => Unit): TwitterLike = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1(ready))
    __obj.asInstanceOf[TwitterLike]
  }
  
  @scala.inline
  implicit class TwitterLikeMutableBuilder[Self <: TwitterLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReady(value: js.Function1[/* twttr */ Twitter, Unit] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
  }
}
