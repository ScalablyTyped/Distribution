package typings.tuyaPanelKit.stackTypesMod

import typings.tuyaPanelKit.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scene[T] extends StObject {
  
  /**
    * Descriptor object for the route containing options and navigation object.
    */
  var descriptor: StackDescriptor
  
  /**
    * Animated nodes representing the progress of the animation.
    */
  var progress: Current
  
  /**
    * Current route object,
    */
  var route: T
}
object Scene {
  
  @scala.inline
  def apply[T](descriptor: StackDescriptor, progress: Current, route: T): Scene[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene[T]]
  }
  
  @scala.inline
  implicit class SceneMutableBuilder[Self <: Scene[?], T] (val x: Self & Scene[T]) extends AnyVal {
    
    @scala.inline
    def setDescriptor(value: StackDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Current): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
