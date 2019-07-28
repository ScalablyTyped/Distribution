package typings.atTinajsTina.atTinajsTinaMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDefinitions extends ComponentLifecycles {
  var data: StringDictionary[js.Any]
  var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  var mixins: js.Array[Partial[ComponentDefinitions]]
  var properties: ComponentProperties
  def compute(data: StringDictionary[js.Any]): StringDictionary[js.Any]
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: () => Unit,
    compute: StringDictionary[js.Any] => StringDictionary[js.Any],
    created: () => Unit,
    data: StringDictionary[js.Any],
    detached: () => Unit,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
    mixins: js.Array[Partial[ComponentDefinitions]],
    moved: () => Unit,
    properties: ComponentProperties,
    ready: () => Unit
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data, detached = js.Any.fromFunction0(detached), methods = methods, mixins = mixins, moved = js.Any.fromFunction0(moved), properties = properties, ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[ComponentDefinitions]
  }
}

