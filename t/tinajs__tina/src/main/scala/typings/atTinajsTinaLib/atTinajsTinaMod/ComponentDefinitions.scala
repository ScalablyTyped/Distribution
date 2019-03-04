package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDefinitions extends ComponentLifecycles {
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction0[/* this */ Component, _]]
  var mixins: js.Array[stdLib.Partial[ComponentDefinitions]]
  var properties: ComponentProperties
  def compute(data: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: js.Function0[scala.Unit],
    compute: js.Function1[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ],
    created: js.Function0[scala.Unit],
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    detached: js.Function0[scala.Unit],
    methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction0[/* this */ Component, _]],
    mixins: js.Array[stdLib.Partial[ComponentDefinitions]],
    moved: js.Function0[scala.Unit],
    properties: ComponentProperties,
    ready: js.Function0[scala.Unit]
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(attached = attached, compute = compute, created = created, data = data, detached = detached, methods = methods, mixins = mixins, moved = moved, properties = properties, ready = ready)
  
    __obj.asInstanceOf[ComponentDefinitions]
  }
}

