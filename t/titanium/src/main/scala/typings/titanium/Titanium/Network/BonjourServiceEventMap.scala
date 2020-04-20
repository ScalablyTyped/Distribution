package typings.titanium.Titanium.Network

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BonjourServiceEventMap extends ProxyEventMap {
  var publish: BonjourServicePublishEvent
  var resolve: BonjourServiceResolveEvent
  var stop: BonjourServiceStopEvent
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
}

