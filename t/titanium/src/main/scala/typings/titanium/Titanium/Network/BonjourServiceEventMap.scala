package typings.titanium.Titanium.Network

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BonjourServiceEventMap extends ProxyEventMap {
  
  var publish: BonjourServicePublishEvent = js.native
  
  var resolve: BonjourServiceResolveEvent = js.native
  
  var stop: BonjourServiceStopEvent = js.native
}
object BonjourServiceEventMap {
  
  @scala.inline
  def apply(
    publish: BonjourServicePublishEvent,
    resolve: BonjourServiceResolveEvent,
    stop: BonjourServiceStopEvent
  ): BonjourServiceEventMap = {
    val __obj = js.Dynamic.literal(publish = publish.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceEventMap]
  }
  
  @scala.inline
  implicit class BonjourServiceEventMapOps[Self <: BonjourServiceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublish(value: BonjourServicePublishEvent): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: BonjourServiceResolveEvent): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: BonjourServiceStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
}
