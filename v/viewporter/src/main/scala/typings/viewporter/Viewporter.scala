package typings.viewporter

import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewporter extends StObject {
  
  var ACTIVE: Boolean = js.native
  
  var READY: Boolean = js.native
  
  def change(callback: EventListener): Unit = js.native
  
  var forceDetection: Boolean = js.native
  
  def isLandscape(): Boolean = js.native
  
  var preventPageScroll: Boolean = js.native
  
  def ready(callback: EventListener): Unit = js.native
  
  def refresh(): Unit = js.native
}
object Viewporter {
  
  @scala.inline
  def apply(
    ACTIVE: Boolean,
    READY: Boolean,
    change: EventListener => Unit,
    forceDetection: Boolean,
    isLandscape: () => Boolean,
    preventPageScroll: Boolean,
    ready: EventListener => Unit,
    refresh: () => Unit
  ): Viewporter = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], change = js.Any.fromFunction1(change), forceDetection = forceDetection.asInstanceOf[js.Any], isLandscape = js.Any.fromFunction0(isLandscape), preventPageScroll = preventPageScroll.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Viewporter]
  }
  
  @scala.inline
  implicit class ViewporterMutableBuilder[Self <: Viewporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACTIVE(value: Boolean): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: EventListener => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceDetection(value: Boolean): Self = StObject.set(x, "forceDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLandscape(value: () => Boolean): Self = StObject.set(x, "isLandscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreventPageScroll(value: Boolean): Self = StObject.set(x, "preventPageScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADY(value: Boolean): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
