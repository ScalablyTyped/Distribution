package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDefinitions extends ComponentLifecycles {
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  var mixins: js.Array[stdLib.Partial[ComponentDefinitions]]
  var properties: ComponentProperties
  def compute(data: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: () => scala.Unit,
    compute: org.scalablytyped.runtime.StringDictionary[js.Any] => org.scalablytyped.runtime.StringDictionary[js.Any],
    created: () => scala.Unit,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    detached: () => scala.Unit,
    methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
    mixins: js.Array[stdLib.Partial[ComponentDefinitions]],
    moved: () => scala.Unit,
    properties: ComponentProperties,
    ready: () => scala.Unit
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data, detached = js.Any.fromFunction0(detached), methods = methods, mixins = mixins, moved = js.Any.fromFunction0(moved), properties = properties, ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[ComponentDefinitions]
  }
}

